package gram;

import gram.i.iAdaptor;
import gram.i.types.*;
import gram.i.types.instrucao.*;
import gram.i.types.expectedassert.*;
import gram.i.types.parametros.*;
import gram.i.types.argumentos.*;
import gram.i.types.argumentosassert.*;
import gram.i.types.expressao.*;
import gram.i.types.lcomentarios.*;
import gram.i.types.opcomp.*;
import gram.i.types.deftipo.*;
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
	%include{util/ArrayList.tom}
	%include{util/types/Collection.tom}
	%include{util/types/Set.tom}
	%include{../genI/gram/i/i.tom}


	private String actualFunctionName;
	HashMap<String, Argumentos> functionSignatures;
	private boolean callReturnNeeded;
	private int memAdress;
	StringBuilder functionsDeclarations;

	private int myAssertCount; //contador para o número de Asserts
    private List<String> reportList =  new ArrayList<String>();

	public static void main(String[] args) {
		try {			
			iLexer lexer = new iLexer(new ANTLRInputStream(System.in));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			iParser parser = new iParser(tokens);
			// Parse the input expression
			Tree b = (Tree) parser.prog().getTree();
			//System.out.println("Result = " + iAdaptor.getTerm(b)); // name of the Gom module + Adaptor
			Instrucao p = (Instrucao) iAdaptor.getTerm(b);


			Main main = new Main();

			try {
				ArrayList<Integer> numInstrucao = new ArrayList<Integer>();
				numInstrucao.add(1);
				`TopDown(CollectFuncsSignature(main.functionSignatures)).visit(p);
				//Instrucao p2 = `BottomUp(stratPrintAnnotations(numInstrucao)).visit(p);
				Instrucao p2 = p;
				int numInst = numInstrucao.get(0)-1;
				LComentarios c = `Vazio();
				//Expressao numInstExps = `Expressoes(Print(c,c,c,Int(numInst),c,c),Print(c,c,c,Char("#"),c,c));
				NumToInt n = new NumToInt(1);
				//String numInstString = main.compileAnnotExpressoes(numInstExps, n);
				String instrucoes = "";
				if (args.length > 0) {
					if (args[0].equals("-fi") && args.length > 1) {
						TreeSet<Integer> blocosMaisUsados = new TreeSet<Integer>();

						if(Main.parseFile(args[1],blocosMaisUsados)) {
							numInstrucao.clear();
							numInstrucao.add(1);
							Instrucao p3 = `BottomUp(stratFaultInjectionWithKnowledge(numInstrucao, blocosMaisUsados)).visit(p2);
							instrucoes = main.compileAnnot(p3);
						} else {
							//System.out.println("Failed to parse blocks");
						}
					}
                    else if(args[0].equals("-assert")){
                        main.prepareReport(p2);
                        //System.out.println("programa em modo assert");
                        //System.out.println("Inicio\n"+p2.toString()+"\nFim\n");
                        Instrucao p4 = main.recFix(p2);
                        //System.out.println("Inicio\n"+p4.toString()+"\nFim\n");
                        Instrucao p5 = main.createAssertMain(p4);
                        //System.out.println("Inicio\n"+p5.toString()+"\nFim\n");
                        instrucoes = main.compileAnnot(p5);
                    }
					else if (args[0].equals("-bs")) {
						Instrucao p3 = `TopDown(stratBadSmells()).visit(p);
						instrucoes = main.compileAnnot(p3);
					}
					else {					
						instrucoes = main.compileAnnot(p2);
					}
				}
				else {					
					//System.out.println("Inicio\n"+p2.toString()+"\nFim\n");
					instrucoes = main.compileAnnot(p2);
				}
				String functionDeclarationsAndArguments = main.functionsDeclarations.toString();
                //System.out.println("FunctionDecla ANTES");
				System.out.println(functionDeclarationsAndArguments + instrucoes);
                //System.out.println("FunctionDecla DEPOIS");
			} catch(VisitFailure e) {
				System.out.println("the strategy failed");
			}

			/* Export this representation to .dot file*/
			/*
			try{				
				FileWriter out=new FileWriter(args[1]);				
				Viewer.toDot(p,out);				
			}
			catch (IOException e){
				System.out.println("ERROR in dot file");
			}
			*/
			/*Export code generated to .txt file*/
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public Main() {
		actualFunctionName = "";
		functionSignatures = new HashMap<String, Argumentos>();
		callReturnNeeded = true;
		functionsDeclarations = new StringBuilder();
		memAdress = 0;
	}

    
    /*************************** ASSERT - BEGIN ******************************/
    
    
    private Instrucao recFix(Instrucao i){
        Instrucao instrucao = EmptySeqInstrucao.make();
        
        for(Instrucao aux : i.getCollectionSeqInstrucao()){
            if(aux.isFuncao()){
                if(aux.getDefTipo().isDBoolean() || aux.getDefTipo().isDChar()){
                    Instrucao instrucaoAux = recFix(aux.getInstrucao());
                    Instrucao elem = ConsSeqInstrucao.make((Instrucao)Funcao.make(aux.getc1(),(DefTipo)DInt.make(),aux.getc2(),aux.getNome(),aux.getc3(),aux.getc4(),aux.getArgumentos(),aux.getc5(),aux.getc6(),  instrucaoAux  ,aux.getc7()), EmptySeqInstrucao.make());
                    SeqInstrucao list = (SeqInstrucao) instrucao;
                    instrucao = list.append(elem);
                    //System.out.println("UPDATE:"+instrucao.toString());
                }
                else{
                    SeqInstrucao list = (SeqInstrucao) instrucao;
                    instrucao = list.append(aux);
                }
            }
            else if(aux.isIf()){
                Instrucao i1 = recFix(aux.getInstrucao1());
                Instrucao i2 = recFix(aux.getInstrucao2());

                Instrucao elem = ConsSeqInstrucao.make((Instrucao)If.make(aux.getc1(), aux.getc2(),aux.getc3(),aux.getCondicao(),aux.getc4(), aux.getc5(),i1,i2), EmptySeqInstrucao.make());
                SeqInstrucao list = (SeqInstrucao) instrucao;
                instrucao = list.append(elem);
                //System.out.println("UPDATE:"+instrucao.toString());

            }
            else if(aux.isReturn()){
                if(aux.getExpressao().isTrue()){
                    Instrucao elem = ConsSeqInstrucao.make((Instrucao)Return.make(aux.getc1(), aux.getc2(), (Expressao)Int.make(1), aux.getc3()), EmptySeqInstrucao.make());
                    SeqInstrucao list = (SeqInstrucao) instrucao;
                    instrucao = list.append(elem);
                    //System.out.println("UPDATE:"+instrucao.toString());
                }
                else if(aux.getExpressao().isFalse()){
                    Instrucao elem = ConsSeqInstrucao.make((Instrucao)Return.make(aux.getc1(), aux.getc2(), (Expressao)Int.make(0), aux.getc3()), EmptySeqInstrucao.make());
                    SeqInstrucao list = (SeqInstrucao) instrucao;
                    instrucao = list.append(elem);
                    //System.out.println("UPDATE:"+instrucao.toString());
                }
                else if(aux.getExpressao().isChar()){
                    Instrucao elem = ConsSeqInstrucao.make((Instrucao)Return.make(aux.getc1(), aux.getc2(), (Expressao)Int.make( Character.getNumericValue( aux.getExpressao().getChar().charAt(0) ) ), aux.getc3()), EmptySeqInstrucao.make());
                    SeqInstrucao list = (SeqInstrucao) instrucao;
                    instrucao = list.append(elem);
                    //System.out.println("UPDATE:"+instrucao.toString());
                }
            }
            else{
                SeqInstrucao list = (SeqInstrucao) instrucao;
                instrucao = list.append(aux);
            }
        }
        
        return instrucao;
    }

    
    
    public void prepareReport(Instrucao i){
    
        StringBuilder res = new StringBuilder();
        
        for(Instrucao aux : i.getCollectionSeqInstrucao()){
            if(aux.isAssert()){
                res.append(aux.getNome()+":");
                for(ArgumentosAssert arg: aux.getArgumentosAssert().getCollectionListaArgsAssert()){
                    res.append(arg.getInt()+":");
                }
                for( ExpectedAssert ea : aux.getExpectedAssert().getCollectionExpAssert()){
                    if(ea.isExpectedArgInt() ){
                        res.append("==:"+ea.getInt());
                    }
                    else if(ea.isExpectedArgBool()){
                        if(ea.getBoolAssert().equals("true"))
                            res.append("==:true" );
                        else
                            res.append("==:false" );
                    }
                    else if(ea.isExpectedArgChar()){
                        res.append("==:" +ea.getChar() );
                    }
                    else if(ea.isExpectedArgComp()){
                        res.append(ea.getCompAssert()+":" +ea.getInt() );
                    }

                }
                res.append("\n");
            }
        }
        
        try{
            PrintWriter writer = new PrintWriter("reportAssert.txt", "UTF-8");
            //for(String aux : this.reportList)
            writer.println(res.toString());
            writer.close();
        }
        catch(UnsupportedEncodingException f){}
        catch(FileNotFoundException f){}
    
    }
    
    
    /**
     * Recebe como argumento as intruções lidas e retorna as instruções adaptadas
     * para o modo Assert.
     */
    private Instrucao createAssertMain(Instrucao i){
        LComentarios lc = EmptyComentarios.make(); //lista de comentarios vazios
        myAssertCount=1;
        
        Instrucao instrucao = EmptySeqInstrucao.make();
        Instrucao res = EmptySeqInstrucao.make();
        Instrucao instrucoesMain = EmptySeqInstrucao.make(); //Seq de intruçoes que vao chamar as testes no main
        
        for(Instrucao aux : i.getCollectionSeqInstrucao()){
            if(aux.isAssert()){
                //Funcao que vai testar o assert
                Instrucao elem = createFuncaoAssert((Assert) aux);
                SeqInstrucao list = (SeqInstrucao) instrucao;
                instrucao = list.append(elem);
                
                //adicionar Call no main
                elem = (Instrucao) Exp.make(Call.make(lc, "myAssert"+myAssertCount, lc, lc, (Parametros) EmptyListaParametros.make(), lc, lc));
                list = (SeqInstrucao) instrucoesMain;
                instrucoesMain = list.append(elem);
                
                this.reportList.add(aux.getNome());
                this.myAssertCount++;
            }
            else if(aux.isFuncao() && aux.getNome().equals("main")){
                //"apagar" o main
            }
            else{
                SeqInstrucao list = (SeqInstrucao) res;
                res = list.append(aux);
            }
        }
        
        //main do modo assert
        Instrucao main = Funcao.make(lc, DVoid.make(), lc, "main", lc, lc, (Argumentos)EmptyListaArgumentos.make(), lc, lc, instrucoesMain, lc);
        Instrucao resNew = EmptySeqInstrucao.make();
        
        SeqInstrucao list = (SeqInstrucao) resNew;
        resNew = list.append(main);
        
        list = (SeqInstrucao) resNew;
        resNew = list.append(instrucao);
        
        list = (SeqInstrucao) resNew;
        resNew = list.append(res);
        
        return resNew;
    }
    
    /**
     * Recebe como argumento um Assert e retorna a intrução que será a função de 
     * teste do respetivo Assert
     */
    private Instrucao createFuncaoAssert(Assert a){
        String nome = a.getNome();
        ArgumentosAssert aa = a.getArgumentosAssert();
        ExpectedAssert ea = a.getExpectedAssert();
        LComentarios lc = EmptyComentarios.make(); //lista de comentarios vazios
        ListaParametros lp = convertArgumentosAssertToListaParametros(aa);
        Int expected = convertExpectedToInt(ea);
        Call call = Call.make(lc, nome, lc, lc, lp, lc, lc);
        Instrucao i1 = ConsSeqInstrucao.make((Instrucao)Exp.make(Print.make(lc, lc, lc, Char.make("T"), lc, lc)), EmptySeqInstrucao.make());
        Instrucao i2 = ConsSeqInstrucao.make((Instrucao)Exp.make(Print.make(lc, lc, lc, Char.make("F"), lc, lc)), EmptySeqInstrucao.make());
        
        for(ExpectedAssert aux : ea.getCollectionExpAssert()){
            if(aux.isExpectedArgInt() || aux.isExpectedArgChar() || aux.isExpectedArgBool()){
                Comp comp = Comp.make((Expressao)call, lc, Igual.make(), lc, (Expressao)expected);
                Instrucao instIf = If.make(lc, lc, lc, comp, lc, lc, i1, i2);
                
                Instrucao instIfSeq = EmptySeqInstrucao.make();
                SeqInstrucao list = (SeqInstrucao) instIfSeq;
                instIfSeq = list.append(instIf);
                
                Instrucao f = Funcao.make(lc, DVoid.make(), lc, "myAssert"+myAssertCount, lc, lc, (Argumentos)EmptyListaArgumentos.make(), lc, lc, instIfSeq, lc);
                return f;
            }
            else if(aux.isExpectedArgComp()){
                OpComp oc=null;
                switch(aux.getCompAssert()){
                    case "==" :
                        oc = Igual.make();
                        break;
                    case ">=" :
                        oc = MaiorQ.make();
                        break;
                    case "<=" :
                        oc = MenorQ.make();
                        break;
                    case ">" :
                        oc = Maior.make();
                        break;
                    case "<" :
                        oc = Menor.make();
                        break;
                }
                Comp comp = Comp.make((Expressao)call, lc, (OpComp)oc, lc, (Expressao)expected);
                Instrucao instIf = If.make(lc, lc, lc, comp, lc, lc, i1, i2);
                
                Instrucao instIfSeq = EmptySeqInstrucao.make();
                SeqInstrucao list = (SeqInstrucao) instIfSeq;
                instIfSeq = list.append(instIf);
                
                Instrucao f = Funcao.make(lc, DVoid.make(), lc, "myAssert"+myAssertCount, lc, lc, (Argumentos)EmptyListaArgumentos.make(), lc, lc, instIfSeq, lc);
                return f;
            }
        }
        return null;
    }
    
    
    private Int convertExpectedToInt(ExpectedAssert ea){
        for(ExpectedAssert aux : ea.getCollectionExpAssert()){
            if(aux.isExpectedArgInt() || aux.isExpectedArgComp()){
                return Int.make(aux.getInt());
            }
            else if(aux.isExpectedArgBool()){
                if(aux.getBoolAssert().equals("true"))
                   return Int.make(1);
                else
                   return Int.make(0);
            }
            else if(aux.isExpectedArgChar()){
                return Int.make( Character.getNumericValue( aux.getChar().charAt(0) ) );
            }

        }
        return null;
    }
    
    
    private ListaParametros convertArgumentosAssertToListaParametros( ArgumentosAssert args){
        Parametros lp = EmptyListaParametros.make();
        
        for(ArgumentosAssert aux : args.getCollectionListaArgsAssert()){
            if(aux.isArgumentoAssertInt()){
                Expressao exp = Int.make(aux.getInt());
                LComentarios lc = EmptyComentarios.make();
                Parametros elem = (Parametros)Parametro.make(lc, exp, lc);
                ListaParametros list = (ListaParametros) lp;
                lp = list.append(elem);
            }
            
        }
        return (ListaParametros)lp;
    }
    
    
    /*************************** ASSERT - END ******************************/
    
    
	public static Argumentos removeArgumentosNaoUtilizados(Argumentos args, TreeSet<String> idsUtilizados) {
		%match(args) {
			ListaArgumentos(arg1,tailArg*) -> {
				%match(arg1) {
					a@Argumento(_,_,_,idArg,_) -> {
						if (idsUtilizados.contains(`idArg))
							return `ListaArgumentos(a,removeArgumentosNaoUtilizados(tailArg*,idsUtilizados));
						else
							return removeArgumentosNaoUtilizados(`tailArg*,idsUtilizados);
					}
				}
			}
		}
		return args;
	}

    %strategy stratBadSmells() extends Identity() {
    	visit Instrucao {
    		If(c1,c2,c3,Nao(condicao),c4,c5,inst1,inst2) -> {
    			return `If(c1,c2,c3,condicao,c4,c5,inst2,inst1);
    		}
    		Funcao(c1,tipo,c2,nome,c3,c4,argumentos,c5,c6,inst,c7) -> {
    			TreeSet<String> idsUtilizados = new TreeSet<String>();
				`TopDown(stratCollectIds(idsUtilizados)).visit(`inst);
    			Argumentos args = removeArgumentosNaoUtilizados(`argumentos,idsUtilizados);
    			return `Funcao(c1,tipo,c2,nome,c3,c4,args,c5,c6,inst,c7);
    		}
    	}
    }

    %strategy stratCollectIds(Set idsUtilizados) extends Identity() {
    	visit Instrucao {
    		Atribuicao(_,id,_,opAtrib,_,exp,_) -> {
    			idsUtilizados.add(`id);
    		}
    	}
    	visit Expressao {
    		Id(id) -> {
    			idsUtilizados.add(`id);
    		}
    		IncAntes(opInc,id) -> {
    			idsUtilizados.add(`id);
    		}
    		IncDepois(opInc,id) -> {
    			idsUtilizados.add(`id);
    		}
    	}
    }

    %strategy CollectFuncsSignature(signatures:HashMap) extends Identity() {
      visit Instrucao {
		Funcao(_,tipo,_,nome,_,_,argumentos,_,_,inst,_) -> {
			signatures.put(`nome, `argumentos);
		}
      }
    }

    %strategy stratPrintAnnotations(ArrayList numInstrucao) extends Identity() {
      visit Instrucao {
			i@Atribuicao(_,_,_,_,_,_,_) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				LComentarios c = `Vazio();
				numInstrucao.add(num+1);
				if (num > 1)
					return `SeqInstrucao(i,Exp(Print(c,c,c,Char(","),c,c)),Exp(Print(c,c,c,Int(num),c,c)));
				else
					return `SeqInstrucao(i,Exp(Print(c,c,c,Int(num),c,c)));
			}
			i@If(_,_,_,condicao,_,_,inst1,inst2) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				LComentarios c = `Vazio();
				numInstrucao.add(num+1);
				if (num > 1)
					return `SeqInstrucao(i,Exp(Print(c,c,c,Char(","),c,c)),Exp(Print(c,c,c,Int(num),c,c)));
				else
					return `SeqInstrucao(i,Exp(Print(c,c,c,Int(num),c,c)));
			}
			i@While(_,_,_,condicao,_,_,inst,_) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				LComentarios c = `Vazio();
				numInstrucao.add(num+1);
				if (num > 1)
					return `SeqInstrucao(i,Exp(Print(c,c,c,Char(","),c,c)),Exp(Print(c,c,c,Int(num),c,c)));
				else
					return `SeqInstrucao(i,Exp(Print(c,c,c,Int(num),c,c)));
			}
			i@For(_,_,decl,_,condicao,_,_,exp,_,_,inst,_) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				LComentarios c = `Vazio();
				numInstrucao.add(num+1);
				if (num > 1)
					return `SeqInstrucao(i,Exp(Print(c,c,c,Char(","),c,c)),Exp(Print(c,c,c,Int(num),c,c)));
				else
					return `SeqInstrucao(i,Exp(Print(c,c,c,Int(num),c,c)));
			}
			i@Return(_,_,exp,_) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				LComentarios c = `Vazio();
				numInstrucao.add(num+1);
				if (num > 1)
					return `SeqInstrucao(i,Exp(Print(c,c,c,Char(","),c,c)),Exp(Print(c,c,c,Int(num),c,c)));
				else
					return `SeqInstrucao(i,Exp(Print(c,c,c,Int(num),c,c)));
			}
      }
      visit Expressao {
			e@ExpNum(exp1,_,op,_,exp2) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				LComentarios c = `Vazio();
				numInstrucao.add(num+1);
				if (num > 1)
					return `Expressoes(e,Print(c,c,c,Char(","),c,c),Print(c,c,c,Int(num),c,c));
				else
					return `Expressoes(e,Print(c,c,c,Int(num),c,c));
			}
			e@Ou(cond1,_,_,cond2) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				LComentarios c = `Vazio();
				numInstrucao.add(num+1);
				if (num > 1)
					return `Expressoes(e,Print(c,c,c,Char(","),c,c),Print(c,c,c,Int(num),c,c));
				else
					return `Expressoes(e,Print(c,c,c,Int(num),c,c));
			}
			e@E(cond1,_,_,cond2) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				LComentarios c = `Vazio();
				numInstrucao.add(num+1);
				if (num > 1)
					return `Expressoes(e,Print(c,c,c,Char(","),c,c),Print(c,c,c,Int(num),c,c));
				else
					return `Expressoes(e,Print(c,c,c,Int(num),c,c));
			}
			e@Comp(exp1,_,opComp,_,exp2) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				LComentarios c = `Vazio();
				numInstrucao.add(num+1);
				if (num > 1)
					return `Expressoes(e,Print(c,c,c,Char(","),c,c),Print(c,c,c,Int(num),c,c));
				else
					return `Expressoes(e,Print(c,c,c,Int(num),c,c));
			}
      }
    }

    %strategy stratFaultInjection() extends Identity() {
      visit Instrucao {
		If(c1,c2,c3,condicao,c4,c5,inst1,inst2) -> {
			return `If(c1,c2,c3,condicao,c4,c5,inst2,inst1);
		}
		While(c1,c2,c3,condicao,c4,c5,inst,c6) -> {
			return `While(c1,c2,c3,Nao(condicao),c4,c5,inst,c6);
		}
		For(c1,c2,decl,c3,condicao,c4,c5,exp,c6,c7,inst,c8) -> {
			return `For(c1,c2,decl,c3,Nao(condicao),c4,c5,exp,c6,c7,inst,c8);
		}
      }
    }

    %strategy stratFaultInjectionWithKnowledge(ArrayList numInstrucao,Set blocos) extends Identity() {
      visit Instrucao {
			i@Atribuicao(_,_,_,_,_,_,_) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				numInstrucao.add(num+1);
				if (blocos.contains((Integer) num))
					return `i;
			}
			If(c1,c2,c3,condicao,c4,c5,inst1,inst2) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				numInstrucao.add(num+1);
				if (blocos.contains((Integer) num))
					return `If(c1,c2,c3,condicao,c4,c5,inst2,inst1);
			}
			While(c1,c2,c3,condicao,c4,c5,inst,c6) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				numInstrucao.add(num+1);
				if (blocos.contains((Integer) num))
					return `While(c1,c2,c3,Nao(condicao),c4,c5,inst,c6);
			}
			For(c1,c2,decl,c3,condicao,c4,c5,exp,c6,c7,inst,c8) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				numInstrucao.add(num+1);
				if (blocos.contains((Integer) num))
					return `For(c1,c2,decl,c3,Nao(condicao),c4,c5,exp,c6,c7,inst,c8);
			}
			i@Return(_,_,exp,_) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				numInstrucao.add(num+1);
			}
      }
      visit Expressao {
			e@ExpNum(exp1,_,op,_,exp2) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				numInstrucao.add(num+1);
			}
			e@Ou(cond1,_,_,cond2) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				numInstrucao.add(num+1);
			}
			e@E(cond1,_,_,cond2) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				numInstrucao.add(num+1);
			}
			e@Comp(exp1,_,opComp,_,exp2) -> {
				int num = (Integer) numInstrucao.remove((int) 0);
				numInstrucao.add(num+1);
			}
      }
    }


	private String compileAnnot(Instrucao inst) {
		NumToInt numInstrucao = new NumToInt(1);
		String toReturn = compileAnnotInstrucao(inst, numInstrucao);
		//return toReturn.concat("Halt");
		return toReturn.substring(0,toReturn.length()-1);
	}

	private String compileAnnotInstrucao(Instrucao i, NumToInt numInstrucao) {
		%match(i) {
			Atribuicao(_,id,_,opAtrib,_,exp,_) -> {
				String genExp = `compileAnnotExpressoes(exp, numInstrucao);
				String prefix;
				if (actualFunctionName.equals(""))
					prefix = "";
				else
					prefix = actualFunctionName + "_";

				%match(opAtrib) {
					Atrib() -> { return "Pusha \"" + prefix + `id + "\"," + genExp + "Store,"; }
					Mult() -> { return "Pusha \"" + prefix + `id + "\",Pusha \"" + prefix + `id + "\",Load," + genExp + "Mul,Store,"; }
					Div() -> { return "Pusha \"" + prefix + `id + "\",Pusha \"" + prefix + `id + "\",Load," + genExp + "Div,Store,"; }
					Soma() -> { return "Pusha \"" + prefix + `id + "\",Pusha \"" + prefix + `id + "\",Load," + genExp + "Add,Store,"; }
					Sub() -> { return "Pusha \"" + prefix + `id + "\",Pusha \"" + prefix + `id + "\",Load," + genExp + "Sub,Store,"; }
				}
				return "";
			}

			Declaracao(_,tipo,_,decls,_,_) -> {
				String genDecl = `compileAnnotDeclaracoes(decls, tipo, numInstrucao);
				functionsDeclarations.append(genDecl);
				return "";
			}

			If(_,_,_,condicao,_,_,inst1,inst2) -> {
				String genCondicao = `compileAnnotExpressoes(condicao, numInstrucao);
				String genInst1 = `compileAnnotInstrucao(inst1, numInstrucao);
				String genInst2 = `compileAnnotInstrucao(inst2, numInstrucao);
				int num = numInstrucao.inc();

				return genCondicao + "Jumpf \"senao" + num + "\"," + genInst1 + "Jump \"fse" + num + "\",ALabel \"senao" + num + "\"," + genInst2 + "ALabel \"fse" + num + "\",";
			}

			While(_,_,_,condicao,_,_,inst,_) -> {
				String genCondicao = `compileAnnotExpressoes(condicao, numInstrucao);
				String genInst = `compileAnnotInstrucao(inst, numInstrucao);
				int num = numInstrucao.inc();

				return "ALabel \"enq" + num + "\"," + genCondicao + "Jumpf \"fenq" + num + "\"," + genInst + "Jump \"enq" + num +"\"," + "ALabel \"fenq" + num + "\",";
			}

			For(_,_,decl,_,condicao,_,_,exp,_,_,inst,_) -> {
				String genDecl = `compileAnnotInstrucao(decl, numInstrucao);
				String genCondicao = `compileAnnotExpressoes(condicao, numInstrucao);
				String genExp = `compileAnnotExpressoes(exp, numInstrucao);
				String genInst = `compileAnnotInstrucao(inst, numInstrucao);

				int num = numInstrucao.inc();
				String labelInit = "ALabel \"for" + num + "\",";
				String jump = "Jumpf \"ffor"+ num + "\",";
				String labelJump = "ALabel \"ffor" + num + "\",";
				String labelEnd = "Jump \"for" + num + "\",";

				functionsDeclarations.append(genDecl);

				return labelInit.concat(genCondicao).concat(jump).concat(genInst).concat(genExp).concat(labelEnd).concat(labelJump);
			}

			Return(_,_,exp,_) -> {
				String genExp = `compileAnnotExpressoes(exp, numInstrucao);
				String prefix = "f:";
				String ret = "Ret,";
				String storeVarFunct = "Pusha \"" + prefix + actualFunctionName + "\"," + genExp + "Store,";

				return storeVarFunct;
			}

			Funcao(_,tipo,_,nome,_,_,argumentos,_,_,inst,_) -> {
				int actualMemAddress = memAdress;
				memAdress++;
				int sizeAddress = 1;

				actualFunctionName = `nome;
				String prefix = "f:";
				String functionDeclaration = "Decl \"" + prefix + `nome + "\" " + actualMemAddress + " " +  sizeAddress + ",";
				String functionRet = "";
				%match(tipo) {
					DVoid() -> { if (!actualFunctionName.equals("main")) functionRet = "Ret,"; }
					_ -> { if(!actualFunctionName.equals("main")) functionRet = "Ret,"; }
				}
				String halt = actualFunctionName.equals("main") ? "Halt," : "";
				String genArgs = `compileArguments(nome, argumentos);

				functionsDeclarations.append(functionDeclaration);
				functionsDeclarations.append(genArgs);

				String genInst = `compileAnnotInstrucao(inst, numInstrucao);
				String function = "ALabel \"f:" + `nome + "\"," + genInst + functionRet + halt;

				return function;
			}

			Exp(exp) -> {
				callReturnNeeded = false;
				String exp = `compileAnnotExpressoes(exp, numInstrucao);
				callReturnNeeded = true;

				return exp;
			}

			SeqInstrucao(inst1, inst*) -> {
				String genInst = `compileAnnotInstrucao(inst1, numInstrucao);
				String seqInst = genInst.concat(`compileAnnotInstrucao(inst*, numInstrucao));

				return seqInst;
			}
		}
		return "";
	}

	private String compileArguments(String functionName, Argumentos args) {
		%match(args) {
			ListaArgumentos(arg1,tailArg*) -> {
				return compileArguments(functionName, `arg1) + compileArguments(functionName, `tailArg);
			}
			Argumento(_,_,_,idArg,_) -> {
				int actualMemAddress = memAdress;
				memAdress++;
				int sizeAddress = 1;

				String prefix = functionName + "_";
				String declaration = "Decl \"" + prefix + `idArg + "\" " + actualMemAddress + " " +  sizeAddress + ",";

				return declaration;
			}
		}
		return "";
	}

	public String compileAnnotDeclaracoes(Declaracoes decl, DefTipo tipo, NumToInt numInstrucao) {
		%match(decl) {
			ListaDecl(dec1,tail*) -> {
				String gen = `compileAnnotDeclaracoes(dec1, tipo, numInstrucao);
				String gen2 = `compileAnnotDeclaracoes(tail*, tipo, numInstrucao);

				return gen + gen2;
			}

			Decl(id,_,_,exp,_) -> {
				String genExp = `compileAnnotExpressoes(exp, numInstrucao);
				String prefix;
				if (actualFunctionName.equals(""))
					prefix = "";
				else
					prefix = actualFunctionName + "_";

				String storeValue;
				if (genExp.equals(""))
					storeValue = "";
				else
					storeValue = "Pusha \"" + prefix + `id + "\"," + genExp + "Store,";

				int actualMemAddress = memAdress;
				memAdress++;
				int sizeAddress = 1;

				%match(tipo) {
					DInt() -> { return "Decl \"" + prefix + `id + "\" " + actualMemAddress + " " +  sizeAddress + "," + storeValue; }
					DChar() -> { return "Decl \"" + prefix + `id + "\" " +  actualMemAddress + " " +  sizeAddress + "," + storeValue; }
					DBoolean() -> { return "Decl \"" + prefix + `id + "\" " +  actualMemAddress + " " +  sizeAddress + "," + storeValue; }
					DFloat() -> { return "Decl \"" + prefix + `id + "\" " +  actualMemAddress + " " +  sizeAddress + "," + storeValue; }
					DVoid() -> { return "Decl \"" + prefix + `id + "\" " +  actualMemAddress + " " +  sizeAddress + "," + storeValue; }
				}
				return "";
			}
		}
		return "";
	}

	private String compileAnnotExpressoes(Expressao e, NumToInt numInstrucao) {
		%match(e) {
			ExpNum(exp1,_,op,_,exp2) -> {
				String genExp1 = `compileAnnotExpressoes(exp1, numInstrucao);
				String genExp2 = `compileAnnotExpressoes(exp2, numInstrucao);

				%match(op) {
					Mais() -> { return genExp1 + genExp2 + "Add,"; }
					Vezes() -> { return genExp1 + genExp2 + "Mul,"; }
					Divide() -> { return genExp1 + genExp2 + "Div,"; }
					Menos() -> { return genExp1 + genExp2 + "Sub,"; }
					Mod() -> { return genExp1.concat(genExp2); }
				}
				return "";
			}

			Id(id) -> {
				String prefix;
				if (actualFunctionName.equals(""))
					prefix = "";
				else
					prefix = actualFunctionName + "_";

				return "Pusha \"" + prefix + `id + "\",Load,";
			}

			Pos(exp) -> { return `compileAnnotExpressoes(exp, numInstrucao); }

			Neg(exp) -> { return `compileAnnotExpressoes(exp, numInstrucao); }

			Nao(exp) -> {
				String genExp = `compileAnnotExpressoes(exp, numInstrucao);
				return genExp + "Not,";
			}

			Call(_,id,_,_,parametros,_,_) -> {
					Argumentos argumentos = functionSignatures.get(`id);
					String prefix = "f:";
					String loadReturn = callReturnNeeded ? "Pusha \"" + prefix + `id + "\",Load," : "";
					String genCallParameters = compileCallParameters(`id, argumentos, `parametros, numInstrucao);
					String call = "Call \"" + prefix + `id + "\",";
					return genCallParameters + call + loadReturn;
			 }

			IncAntes(opInc,id) -> {
				String prefix;
				if (actualFunctionName.equals(""))
					prefix = "";
				else
					prefix = actualFunctionName + "_";

				%match(opInc) {
					Inc() -> { return "Pusha \"" + prefix + `id + "\",Inc"; }
					Dec() -> { return "Pusha \"" + prefix + `id + "\",Dec"; }
				}
				return `id;
			}

			IncDepois(opInc,id) -> {
				String prefix;
				if (actualFunctionName.equals(""))
					prefix = "";
				else
					prefix = actualFunctionName + "_";

				%match(opInc) {
					Inc() -> { return "Pusha \"" + prefix + `id + "\",Inc,"; }
					Dec() -> { return "Pusha \"" + prefix + `id + "\",Dec,"; }
				}
				return `id;
			}

			Condicional(condicao,_,_,exp1,_,_,exp2) -> {
				String genCondicao = `compileAnnotExpressoes(condicao, numInstrucao);
				String genExp1 = `compileAnnotExpressoes(exp1, numInstrucao);
				String genExp2 = `compileAnnotExpressoes(exp2, numInstrucao);

				return genCondicao.concat(genExp1).concat(genExp2);
			}

			Int(i) -> { return "Pushi "+ `i + ","; }

			Char(c) -> { return "Pushc '" + `c.charAt(0) + "',"; }

			True() -> { return "Pushb true,"; }

			False() -> { return "Pushb false,"; }

			Float(f) -> { return "Pushf "+`f + ","; }

			Ou(cond1,_,_,cond2) -> {
				String genCond1 = `compileAnnotExpressoes(cond1, numInstrucao);
				String genCond2 = `compileAnnotExpressoes(cond2, numInstrucao);

				return genCond1 + genCond2 + "Or,";
			}

			E(cond1,_,_,cond2) -> {
				String genCond1 = `compileAnnotExpressoes(cond1, numInstrucao);
				String genCond2 = `compileAnnotExpressoes(cond2, numInstrucao);

				return genCond1 + genCond2 + "And,";
			}

			Comp(exp1,_,opComp,_,exp2) -> {
				String genExp1 = `compileAnnotExpressoes(exp1, numInstrucao);
				String genExp2 = `compileAnnotExpressoes(exp2, numInstrucao);

				%match(opComp) {
					Maior() -> { return genExp1 + genExp2 + "Gt,"; }
					Menor() -> { return genExp1 + genExp2 + "Lt,"; }
					MaiorQ() -> { return genExp1 + genExp2 + "GoEq,"; }
					MenorQ() -> { return genExp1 + genExp2 + "LoEq,"; }
					Dif() -> { return genExp1 + genExp2 + "Neq,"; }
					Igual() -> { return genExp1 + genExp2 + "Eq,"; }
				}
			}

			Input(_,_,_,tipo,_,_) -> {
				%match(tipo) {
					DInt() -> { return "IIn int,"; }
					DChar() -> { return "IIn char,"; }
					DBoolean() -> { return "IIn boolean,"; }
					DFloat() -> { return "IIn float,"; }
				}
			}

			Print(_,_,_,exp,_,_) -> {
				String genExp = `compileAnnotExpressoes(exp, numInstrucao);

				return genExp + "IOut,";
			}

			Expressoes(exp1, exp*) -> {
				String genExp = `compileAnnotExpressoes(exp1, numInstrucao);
				String exps = genExp.concat(`compileAnnotExpressoes(exp*, numInstrucao));

				return exps;
			}

			Empty() -> { return ""; }
		}
		return "";
	}

	private String compileCallParameters(String functionName, Argumentos argumentos, Parametros parametros, NumToInt numInstrucao) {
		%match (parametros, argumentos){
			ListaParametros(param1,tailParam*), ListaArgumentos(arg1,tailArg*) -> {
				return compileCallParameters(functionName, `arg1, `param1, numInstrucao) + compileCallParameters(functionName, `tailArg, `tailParam, numInstrucao);
			}
			Parametro(_,exp,_), Argumento(_,_,_,idArg,_) -> {
				String genExp = `compileAnnotExpressoes(exp, numInstrucao);
				String prefix = functionName + "_";
				return "Pusha \"" + prefix + `idArg + "\"," + genExp + "Store,";
			}
		}
		return "";
	}

	private String genAnnotation(int i) {
		if (i == 1) {
			return "Pushi "+i+",IOut,";
		}
		else {
			return "Pushc ',',IOut,Pushi "+i+",IOut,";
		}
	}

	private static boolean parseFile(String filename, TreeSet<Integer> blocos) {
		try {
			BufferedReader br = new BufferedReader( new FileReader(filename) );
			String line = "";
			StringTokenizer token = null;

			while((line = br.readLine()) != null) {
				token = new StringTokenizer(line, ",");

				while(token.hasMoreTokens()) {
					String tokenS = token.nextToken();
					blocos.add(Integer.parseInt(tokenS));
				}
			}

			return true;
		} catch(Exception e) {
			return false;
		}
	}
}

class NumToInt{
	private int num;

	public NumToInt(int num) {
		this.num = num;
	}

	public NumToInt(){
		num = 0;
	}

	public int inc(){
		return num++;
	}

	public int get() {
		return num;
	}
}
