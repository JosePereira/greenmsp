package maqv;
 
import maqv.msp.mspAdaptor;
import maqv.msp.types.*;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.tree.Tree;
import tom.library.utils.Viewer;
import tom.library.sl.*;
import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {
	%include{sl.tom}
	%include{util/HashMap.tom}
	%include{util/types/Collection.tom}
	%include{../genMaqV/maqv/msp/msp.tom}

	private Instrucoes programa;
	private Stackk stack;
	private Map<String,Integer> symbols;
	private ArrayList<Termo> heap;
	private int pc;
	private int numProg;
	private StringBuilder output;

	public static void main(String[] args) {
		try {
			mspLexer lexer = new mspLexer(new ANTLRInputStream(new FileInputStream(args[0])));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			mspParser parser = new mspParser(tokens);
			// Parse the input expression
			Tree b = (Tree) parser.programa().getTree();
			//System.out.println("Result = " + mspAdaptor.getTerm(b)); // name of the Gom module + Adaptor
			Instrucoes p = (Instrucoes) mspAdaptor.getTerm(b);

			Main main = new Main(p);

			main.run(p);

			/* Export this representation to .dot file*/
			/*
			try{
				FileWriter out=new FileWriter("gram.dot");
				Viewer.toDot(p,out);
			}
			catch (IOException e){
				System.out.println("ERROR in dot file"); 
			}
			*/
			if (args.length > 1) {
				try {
					PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(args[1], true)));
        			pw.print(main.getOutput());
        			pw.flush(); pw.close();
				}
				catch (IOException e){
					System.err.println("exception: " + e);
					return;
		    	} 
			}
			else {
				System.out.println(main.getOutput());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Main(Instrucoes insts) {
		programa = insts;
		stack = `Stackk();
		heap = new ArrayList<Termo>();
		symbols = new HashMap<String, Integer>();
		pc = 0;
		numProg = 0;
		output = new StringBuilder();
	}
	
	public String getOutput(){
		return output.toString();
	}

	private Instrucoes getNInstr(Instrucoes prog, int progc){
		%match (prog){
			i@Instrucoes(inst,insts*) -> { 
				if (progc == 0) {
					return `i;
				}
				else { return `getNInstr(insts*,progc-1); }
			}
		}
		return `Instrucoes();
	} 

	private Instrucoes jmp(Instrucoes prog, String label){
		%match (prog){
			Instrucoes(ALabel(l),insts*) -> { 
				if (label.equals(`l)) { return `insts*; }
				else { return `jmp(insts*,label); }
			}
			Instrucoes(_,insts*) -> { return `jmp(insts*,label); }
		}
		return `Instrucoes();
	} 

	private void pushStack(Termo termo){
		%match (stack){
			Stackk(termos*) -> { this.stack = `Stackk(termo,termos*); } 
		}
	}

	private void popStack(){
		%match (stack){
			Stackk(termo1,termos*) -> { this.stack = `Stackk(termos*); }
		}
	}

	private Termo topStack() {
		%match(stack){
			Stackk(termo,termos*) -> { return `termo; }
		}
		return `Vazio();
	}

	private void memAlloc(String symbol, int initMemAddress, int size) {
		Integer memAddress = symbols.get(symbol);
		if (memAddress == null) {
			symbols.put(symbol, initMemAddress);
			for (int i = 0; i < size; i++){
				heap.add(initMemAddress + i,`Vazio());
			}
		}
	}

	private int getMemAddress(String symbol) {
		return symbols.get(symbol);
	}

	private Termo getMem(int memAddress) {
		return heap.get(memAddress);
	}

	private void putMem(int memAddress, Termo value) {
		heap.set(memAddress,value);
	}

	public String run(Instrucoes prog) {
		pc++;
		%match (prog){
			Instrucoes(inst,instrs*) -> {
				%match(inst) {
					ALabel(id) -> { return `run(instrs*); }
					Call(id) -> {
						`pushStack(I(pc));
						prog = `jmp(prog,id);
						return `run(prog);
					}
					Ret() -> { 
						Termo progCount = `topStack(); 
						`popStack();
						%match(progCount) {
							I(valor) -> { 
								pc = `valor;
								prog = `getNInstr(programa,valor);
							}
						}
						return `run(prog);
					}
					Add() -> {
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								int resultado = `v1+`v2;
								`pushStack(I(resultado));
								return `run(instrs*);
							}
						}
					}
					Sub() -> {
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								int resultado = `v1 - `v2;
								`pushStack(I(resultado));
								return `run(instrs*);
							}
						}
					}
					Div() -> {
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								int resultado = `v1 / `v2;
								`pushStack(I(resultado));
								return `run(instrs*);
							}
						}
					}
					Mul() -> {
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								int resultado = `v1 * `v2;
								`pushStack(I(resultado));
								return `run(instrs*);
							}
						}
					}
					Mod() -> {
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								int resultado = `v1 % `v2;
								`pushStack(I(resultado));
								return `run(instrs*);
							}
						}
					}
					Inc() -> {
						Termo t = `topStack();
						`popStack();
						%match(t) {
							I(memAddress) -> { 
								Termo t2 = getMem(`memAddress);
								int valorToInc = 0;
								%match(t2) {
									I(v1) -> { valorToInc = `v1+1; }
								}
								putMem(`memAddress,`I(valorToInc));
								
								return `run(instrs*);
							}
						}
						return `run(instrs*);
					}
					Dec() -> {
						Termo t = `topStack();
						`popStack();
						%match(t) {
							I(memAddress) -> { 
								Termo t2 = getMem(`memAddress);
								int valorToDec = 0;
								%match(t2) {
									I(v1) -> { valorToDec = `v1-1; }
								}
								putMem(`memAddress,`I(valorToDec));
								
								return `run(instrs*);
							}
						}
						return `run(instrs*);
					}
					Eq() -> {
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								Boool resultado = (`v1 == `v2) ? `True() : `False();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					Neq() -> { 
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								Boool resultado = (`v1 == `v2) ? `False() : `True();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					Gt() -> {
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								Boool resultado = (`v1 > `v2) ? `True() : `False();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					GoEq() -> {
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								Boool resultado = (`v1 >= `v2) ? `True() : `False();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					Lt() -> {
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								Boool resultado = (`v1 < `v2) ? `True() : `False();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					LoEq() -> {
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								Boool resultado = (`v1 <=`v2) ? `True() : `False();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					Nott() -> {
						Termo t = `topStack();
						`popStack();
						%match(t) {
							i@I(v1) -> { `pushStack(i); }
							s@S(v1) -> { `pushStack(s); }
							f@F(v1) -> { `pushStack(f); }
							B(True()) -> { `pushStack(B(False())); }
							B(False()) -> { `pushStack(B(True())); }
						}
						return `run(instrs*);
					}
					Or() -> {
						%match (stack){
							Stackk(B(v2),B(v1),resto*) -> { 
								stack = `resto*;
								boolean valor1 = true, valor2 = true;
								%match (v1){
									True() -> { `valor1 = true; }
									False() -> { `valor1 = false; }
								}
								%match (v2){
									True() -> { `valor2 = true; }
									False() -> { `valor2 = false; }
								}
								Boool resultado = (valor1 || valor2) ? `True() : `False();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					And() -> {
						%match (stack){
							Stackk(B(v2),B(v1),resto*) -> { 
								stack = `resto*;
								boolean valor1 = true, valor2 = true;
								%match (v1){
									True() -> { `valor1 = true; }
									False() -> { `valor1 = false; }
								}
								%match (v2){
									True() -> { `valor2 = true; }
									False() -> { `valor2 = false; }
								}
								Boool resultado = (valor1 && valor2) ? `True() : `False();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					Halt() -> { return ""; }
					IIn(tipo) -> {
						BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
						try{
							String iin = br.readLine();
							%match(tipo) {
								DInt() -> {
									try{
										int v1 = Integer.parseInt(iin);
										`pushStack(I(v1));
									}catch(NumberFormatException nfe){
										System.err.println("Invalid Format!");
									}
								}
								DChar() -> {
									String s = ""+iin.charAt(0);
									`pushStack(S(s));
								}
								DBoolean() -> {
									if (iin.equalsIgnoreCase("true")) { `pushStack(B(True())); }
									else if (iin.equalsIgnoreCase("false")) { `pushStack(B(False())); }
									else { System.err.println("Invalid Format!"); }
								}
								DFloat() -> {
									try{
										int v1 = Integer.parseInt(iin);
										`pushStack(I(v1));
									}catch(NumberFormatException nfe){
										System.err.println("Invalid Format!");
									}
								}
							}
				       }
				       catch (IOException e){
				    	   System.err.println("exception: " + e);
				       } 
				       return `run(instrs*);
					}
					IOut() -> {
						Termo t = `topStack();
						`popStack();
						%match(t) {
							I(v1) -> { output.append(`v1); }
							S(v1) -> { output.append(`v1); }
							F(v1) -> { output.append(`v1); }
							B(True()) -> { output.append("True"); }
							B(False()) -> { output.append("False"); }
						}
						return `run(instrs*);
					}
					Jump(id) -> {
						prog = `jmp(prog,id);
						return `run(prog);
					}
					Jumpf(id) -> {
						Termo t = `topStack();
						`popStack();
						%match(t) {
							B(True()) -> { return `run(instrs*); }
							B(False()) -> { 
								prog = `jmp(prog,id);
								return `run(prog);
							}
						}
						return `run(instrs*);
					}
					Push(t) -> {
						`pushStack(t);
						return `run(instrs*);
					}
					Pusha(t) -> {
						%match(t) {
							S(id) -> { 
								int memAddress = getMemAddress(`id);
								`pushStack(I(memAddress));
								
								return `run(instrs*);
							}
						}
						return `run(instrs*);
					}
					Load() -> {
						Termo t = `topStack();
						`popStack();
						%match(t) {
							I(memAddress) -> { 
								Termo t2 = getMem(`memAddress);
								`pushStack(t2);
								
								return `run(instrs*);
							}
						}
						return `run(instrs*);
					}
					Store() -> {
						Termo t = `topStack();
						`popStack();
						Termo t2 = `topStack();
						`popStack();
						%match(t2) {
							I(memAddress) -> { 
								putMem(`memAddress,t);
								
								return `run(instrs*);
							}
						}
						return `run(instrs*);
					}
					Decl(id,initMemAddress,size) -> {
						memAlloc(`id,`initMemAddress,`size);
						return `run(instrs*);
					}
				}
			}
		}
		return "";
	}
}