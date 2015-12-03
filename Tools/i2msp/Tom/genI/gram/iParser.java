// $ANTLR 3.2 Sep 23, 2009 12:02:23 gram/i.g 2015-12-03 22:53:05
 package gram; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class iParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SeqInstrucao", "Exp", "Funcao", "Assert", "Return", "For", "While", "If", "Declaracao", "Atribuicao", "Dec", "Inc", "Mod", "Menos", "Divide", "Vezes", "Mais", "DVoid", "DFloat", "DBoolean", "DChar", "DInt", "IntWrap", "Argumento", "ListaArgumentos", "Decl", "ListaDecl", "Parametro", "ListaParametros", "Sub", "Soma", "Div", "Mult", "Atrib", "Empty", "Expressoes", "Print", "Input", "Comp", "E", "Ou", "Float", "False", "True", "Char", "Int", "Condicional", "IncDepois", "IncAntes", "Call", "Nao", "Neg", "Pos", "Id", "ExpNum", "ArgumentoAssertBool", "ArgumentoAssertChar", "ArgumentoAssertInt", "ListaArgsAssert", "Igual", "Dif", "MenorQ", "MaiorQ", "Menor", "Maior", "Vazio", "Comentario", "Comentarios", "ExpectedArgComp", "ExpectedArgBool", "ExpectedArgChar", "ExpectedArgInt", "ExpAssert", "INT", "FLOAT", "CHAR", "ID", "COMENTARIO_LINHA", "COMENTARIO_LINHAS", "DIGITO", "SufixoFloat", "LETRA", "IDASS", "WS", "'char'", "'int'", "'boolean'", "'float'", "'void'", "';'", "'assert'", "'('", "','", "')'", "'\"'", "'true'", "'false'", "'=='", "'>='", "'<='", "'>'", "'<'", "'='", "'if'", "'else'", "'for'", "'while'", "'return'", "'print'", "'input'", "'{'", "'}'", "'?'", "':'", "'||'", "'&&'", "'!='", "'*='", "'/='", "'+='", "'-='", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'!'"
    };
    public static final int Soma=40;
    public static final int Decl=35;
    public static final int CHAR=85;
    public static final int Empty=44;
    public static final int DChar=30;
    public static final int DVoid=27;
    public static final int ExpectedArgBool=79;
    public static final int Neg=61;
    public static final int EOF=-1;
    public static final int Int=55;
    public static final int T__94=94;
    public static final int Parametro=37;
    public static final int Char=54;
    public static final int Comentario=76;
    public static final int MaiorQ=72;
    public static final int ArgumentoAssertBool=65;
    public static final int MenorQ=71;
    public static final int Vazio=75;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__138=138;
    public static final int E=49;
    public static final int T__137=137;
    public static final int Mod=22;
    public static final int T__136=136;
    public static final int ListaDecl=36;
    public static final int IDASS=92;
    public static final int ListaArgsAssert=68;
    public static final int DFloat=28;
    public static final int Maior=74;
    public static final int ArgumentoAssertChar=66;
    public static final int Atribuicao=19;
    public static final int ListaArgumentos=34;
    public static final int INT=83;
    public static final int Dec=20;
    public static final int Menor=73;
    public static final int Menos=23;
    public static final int T__126=126;
    public static final int DBoolean=29;
    public static final int Float=51;
    public static final int T__125=125;
    public static final int Input=47;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int WS=93;
    public static final int T__129=129;
    public static final int Inc=21;
    public static final int SeqInstrucao=10;
    public static final int SufixoFloat=90;
    public static final int Condicional=56;
    public static final int Funcao=12;
    public static final int T__130=130;
    public static final int ExpNum=64;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int Comp=48;
    public static final int Nao=60;
    public static final int DIGITO=89;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int Assert=13;
    public static final int COMENTARIO_LINHAS=88;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int False=52;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int ExpectedArgInt=81;
    public static final int FLOAT=84;
    public static final int T__120=120;
    public static final int While=16;
    public static final int ID=86;
    public static final int Atrib=43;
    public static final int IncDepois=57;
    public static final int Expressoes=45;
    public static final int COMENTARIO_LINHA=87;
    public static final int Call=59;
    public static final int Argumento=33;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int ListaParametros=38;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int ExpectedArgComp=78;
    public static final int Print=46;
    public static final int Dif=70;
    public static final int T__105=105;
    public static final int DInt=31;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int Ou=50;
    public static final int T__112=112;
    public static final int Comentarios=77;
    public static final int True=53;
    public static final int Return=14;
    public static final int Id=63;
    public static final int If=17;
    public static final int Div=41;
    public static final int Igual=69;
    public static final int ExpAssert=82;
    public static final int Exp=11;
    public static final int T__102=102;
    public static final int Mais=26;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int For=15;
    public static final int ArgumentoAssertInt=67;
    public static final int Divide=24;
    public static final int Sub=39;
    public static final int Declaracao=18;
    public static final int Mult=42;
    public static final int Vezes=25;
    public static final int IntWrap=32;
    public static final int Pos=62;
    public static final int IncAntes=58;
    public static final int ExpectedArgChar=80;
    public static final int LETRA=91;

    // delegates
    // delegators


        public iParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public iParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return iParser.tokenNames; }
    public String getGrammarFileName() { return "gram/i.g"; }


    public static class idTipo_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idTipo"
    // gram/i.g:15:1: idTipo : ( 'char' -> ^( DChar ) | 'int' -> ^( DInt ) | 'boolean' -> ^( DBoolean ) | 'float' -> ^( DFloat ) | 'void' -> ^( DVoid ) ) ;
    public final iParser.idTipo_return idTipo() throws RecognitionException {
        iParser.idTipo_return retval = new iParser.idTipo_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal1=null;
        Token string_literal2=null;
        Token string_literal3=null;
        Token string_literal4=null;
        Token string_literal5=null;

        Tree string_literal1_tree=null;
        Tree string_literal2_tree=null;
        Tree string_literal3_tree=null;
        Tree string_literal4_tree=null;
        Tree string_literal5_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");

        try {
            // gram/i.g:15:8: ( ( 'char' -> ^( DChar ) | 'int' -> ^( DInt ) | 'boolean' -> ^( DBoolean ) | 'float' -> ^( DFloat ) | 'void' -> ^( DVoid ) ) )
            // gram/i.g:15:10: ( 'char' -> ^( DChar ) | 'int' -> ^( DInt ) | 'boolean' -> ^( DBoolean ) | 'float' -> ^( DFloat ) | 'void' -> ^( DVoid ) )
            {
            // gram/i.g:15:10: ( 'char' -> ^( DChar ) | 'int' -> ^( DInt ) | 'boolean' -> ^( DBoolean ) | 'float' -> ^( DFloat ) | 'void' -> ^( DVoid ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt1=1;
                }
                break;
            case 95:
                {
                alt1=2;
                }
                break;
            case 96:
                {
                alt1=3;
                }
                break;
            case 97:
                {
                alt1=4;
                }
                break;
            case 98:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // gram/i.g:15:11: 'char'
                    {
                    string_literal1=(Token)match(input,94,FOLLOW_94_in_idTipo54);  
                    stream_94.add(string_literal1);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 15:18: -> ^( DChar )
                    {
                        // gram/i.g:15:21: ^( DChar )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(DChar, "DChar"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:15:32: 'int'
                    {
                    string_literal2=(Token)match(input,95,FOLLOW_95_in_idTipo64);  
                    stream_95.add(string_literal2);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 15:38: -> ^( DInt )
                    {
                        // gram/i.g:15:41: ^( DInt )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(DInt, "DInt"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // gram/i.g:15:51: 'boolean'
                    {
                    string_literal3=(Token)match(input,96,FOLLOW_96_in_idTipo74);  
                    stream_96.add(string_literal3);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 15:61: -> ^( DBoolean )
                    {
                        // gram/i.g:15:64: ^( DBoolean )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(DBoolean, "DBoolean"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // gram/i.g:15:78: 'float'
                    {
                    string_literal4=(Token)match(input,97,FOLLOW_97_in_idTipo84);  
                    stream_97.add(string_literal4);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 15:86: -> ^( DFloat )
                    {
                        // gram/i.g:15:89: ^( DFloat )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(DFloat, "DFloat"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // gram/i.g:15:101: 'void'
                    {
                    string_literal5=(Token)match(input,98,FOLLOW_98_in_idTipo94);  
                    stream_98.add(string_literal5);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 15:108: -> ^( DVoid )
                    {
                        // gram/i.g:15:111: ^( DVoid )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(DVoid, "DVoid"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "idTipo"

    public static class tipo_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tipo"
    // gram/i.g:18:1: tipo : ( INT -> ^( Int INT ) | FLOAT -> ^( Float FLOAT ) | CHAR -> ^( Char CHAR ) | boolean_ -> boolean_ ) ;
    public final iParser.tipo_return tipo() throws RecognitionException {
        iParser.tipo_return retval = new iParser.tipo_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token INT6=null;
        Token FLOAT7=null;
        Token CHAR8=null;
        iParser.boolean__return boolean_9 = null;


        Tree INT6_tree=null;
        Tree FLOAT7_tree=null;
        Tree CHAR8_tree=null;
        RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleSubtreeStream stream_boolean_=new RewriteRuleSubtreeStream(adaptor,"rule boolean_");
        try {
            // gram/i.g:18:6: ( ( INT -> ^( Int INT ) | FLOAT -> ^( Float FLOAT ) | CHAR -> ^( Char CHAR ) | boolean_ -> boolean_ ) )
            // gram/i.g:18:8: ( INT -> ^( Int INT ) | FLOAT -> ^( Float FLOAT ) | CHAR -> ^( Char CHAR ) | boolean_ -> boolean_ )
            {
            // gram/i.g:18:8: ( INT -> ^( Int INT ) | FLOAT -> ^( Float FLOAT ) | CHAR -> ^( Char CHAR ) | boolean_ -> boolean_ )
            int alt2=4;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt2=1;
                }
                break;
            case FLOAT:
                {
                alt2=2;
                }
                break;
            case CHAR:
                {
                alt2=3;
                }
                break;
            case 105:
            case 106:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // gram/i.g:18:9: INT
                    {
                    INT6=(Token)match(input,INT,FOLLOW_INT_in_tipo114);  
                    stream_INT.add(INT6);



                    // AST REWRITE
                    // elements: INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 18:13: -> ^( Int INT )
                    {
                        // gram/i.g:18:16: ^( Int INT )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Int, "Int"), root_1);

                        adaptor.addChild(root_1, stream_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:18:29: FLOAT
                    {
                    FLOAT7=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_tipo126);  
                    stream_FLOAT.add(FLOAT7);



                    // AST REWRITE
                    // elements: FLOAT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 18:35: -> ^( Float FLOAT )
                    {
                        // gram/i.g:18:38: ^( Float FLOAT )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Float, "Float"), root_1);

                        adaptor.addChild(root_1, stream_FLOAT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // gram/i.g:18:55: CHAR
                    {
                    CHAR8=(Token)match(input,CHAR,FOLLOW_CHAR_in_tipo138);  
                    stream_CHAR.add(CHAR8);



                    // AST REWRITE
                    // elements: CHAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 18:60: -> ^( Char CHAR )
                    {
                        // gram/i.g:18:63: ^( Char CHAR )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Char, "Char"), root_1);

                        adaptor.addChild(root_1, stream_CHAR.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // gram/i.g:18:78: boolean_
                    {
                    pushFollow(FOLLOW_boolean__in_tipo150);
                    boolean_9=boolean_();

                    state._fsp--;

                    stream_boolean_.add(boolean_9.getTree());


                    // AST REWRITE
                    // elements: boolean_
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 18:87: -> boolean_
                    {
                        adaptor.addChild(root_0, stream_boolean_.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tipo"

    public static class prog_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // gram/i.g:23:1: prog : ( programa )* EOF -> ^( SeqInstrucao ( programa )* ) ;
    public final iParser.prog_return prog() throws RecognitionException {
        iParser.prog_return retval = new iParser.prog_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token EOF11=null;
        iParser.programa_return programa10 = null;


        Tree EOF11_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_programa=new RewriteRuleSubtreeStream(adaptor,"rule programa");
        try {
            // gram/i.g:23:6: ( ( programa )* EOF -> ^( SeqInstrucao ( programa )* ) )
            // gram/i.g:24:2: ( programa )* EOF
            {
            // gram/i.g:24:2: ( programa )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=COMENTARIO_LINHA && LA3_0<=COMENTARIO_LINHAS)||(LA3_0>=94 && LA3_0<=98)||LA3_0==100) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // gram/i.g:24:2: programa
            	    {
            	    pushFollow(FOLLOW_programa_in_prog169);
            	    programa10=programa();

            	    state._fsp--;

            	    stream_programa.add(programa10.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            EOF11=(Token)match(input,EOF,FOLLOW_EOF_in_prog172);  
            stream_EOF.add(EOF11);



            // AST REWRITE
            // elements: programa
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 24:16: -> ^( SeqInstrucao ( programa )* )
            {
                // gram/i.g:24:19: ^( SeqInstrucao ( programa )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(SeqInstrucao, "SeqInstrucao"), root_1);

                // gram/i.g:24:34: ( programa )*
                while ( stream_programa.hasNext() ) {
                    adaptor.addChild(root_1, stream_programa.nextTree());

                }
                stream_programa.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prog"

    public static class programa_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "programa"
    // gram/i.g:27:1: programa : ( declaracao ';' -> declaracao | funcao -> funcao | myassert -> myassert ) ;
    public final iParser.programa_return programa() throws RecognitionException {
        iParser.programa_return retval = new iParser.programa_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal13=null;
        iParser.declaracao_return declaracao12 = null;

        iParser.funcao_return funcao14 = null;

        iParser.myassert_return myassert15 = null;


        Tree char_literal13_tree=null;
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleSubtreeStream stream_funcao=new RewriteRuleSubtreeStream(adaptor,"rule funcao");
        RewriteRuleSubtreeStream stream_myassert=new RewriteRuleSubtreeStream(adaptor,"rule myassert");
        RewriteRuleSubtreeStream stream_declaracao=new RewriteRuleSubtreeStream(adaptor,"rule declaracao");
        try {
            // gram/i.g:27:10: ( ( declaracao ';' -> declaracao | funcao -> funcao | myassert -> myassert ) )
            // gram/i.g:28:2: ( declaracao ';' -> declaracao | funcao -> funcao | myassert -> myassert )
            {
            // gram/i.g:28:2: ( declaracao ';' -> declaracao | funcao -> funcao | myassert -> myassert )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // gram/i.g:28:4: declaracao ';'
                    {
                    pushFollow(FOLLOW_declaracao_in_programa194);
                    declaracao12=declaracao();

                    state._fsp--;

                    stream_declaracao.add(declaracao12.getTree());
                    char_literal13=(Token)match(input,99,FOLLOW_99_in_programa196);  
                    stream_99.add(char_literal13);



                    // AST REWRITE
                    // elements: declaracao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 28:19: -> declaracao
                    {
                        adaptor.addChild(root_0, stream_declaracao.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:29:4: funcao
                    {
                    pushFollow(FOLLOW_funcao_in_programa205);
                    funcao14=funcao();

                    state._fsp--;

                    stream_funcao.add(funcao14.getTree());


                    // AST REWRITE
                    // elements: funcao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 29:11: -> funcao
                    {
                        adaptor.addChild(root_0, stream_funcao.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // gram/i.g:30:5: myassert
                    {
                    pushFollow(FOLLOW_myassert_in_programa215);
                    myassert15=myassert();

                    state._fsp--;

                    stream_myassert.add(myassert15.getTree());


                    // AST REWRITE
                    // elements: myassert
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 30:14: -> myassert
                    {
                        adaptor.addChild(root_0, stream_myassert.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "programa"

    public static class myassert_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "myassert"
    // gram/i.g:35:1: myassert : comentarios 'assert' comentarios '(' comentarios ID comentarios '(' comentarios ( ( argsAssert ',' expected ) | expected ) comentarios ')' comentarios ')' comentarios ';' -> ^( Assert ID ^( ListaArgsAssert ( argsAssert )? ) ^( ExpAssert expected ) ) ;
    public final iParser.myassert_return myassert() throws RecognitionException {
        iParser.myassert_return retval = new iParser.myassert_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal17=null;
        Token char_literal19=null;
        Token ID21=null;
        Token char_literal23=null;
        Token char_literal26=null;
        Token char_literal30=null;
        Token char_literal32=null;
        Token char_literal34=null;
        iParser.comentarios_return comentarios16 = null;

        iParser.comentarios_return comentarios18 = null;

        iParser.comentarios_return comentarios20 = null;

        iParser.comentarios_return comentarios22 = null;

        iParser.comentarios_return comentarios24 = null;

        iParser.argsAssert_return argsAssert25 = null;

        iParser.expected_return expected27 = null;

        iParser.expected_return expected28 = null;

        iParser.comentarios_return comentarios29 = null;

        iParser.comentarios_return comentarios31 = null;

        iParser.comentarios_return comentarios33 = null;


        Tree string_literal17_tree=null;
        Tree char_literal19_tree=null;
        Tree ID21_tree=null;
        Tree char_literal23_tree=null;
        Tree char_literal26_tree=null;
        Tree char_literal30_tree=null;
        Tree char_literal32_tree=null;
        Tree char_literal34_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_expected=new RewriteRuleSubtreeStream(adaptor,"rule expected");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        RewriteRuleSubtreeStream stream_argsAssert=new RewriteRuleSubtreeStream(adaptor,"rule argsAssert");
        try {
            // gram/i.g:35:11: ( comentarios 'assert' comentarios '(' comentarios ID comentarios '(' comentarios ( ( argsAssert ',' expected ) | expected ) comentarios ')' comentarios ')' comentarios ';' -> ^( Assert ID ^( ListaArgsAssert ( argsAssert )? ) ^( ExpAssert expected ) ) )
            // gram/i.g:35:13: comentarios 'assert' comentarios '(' comentarios ID comentarios '(' comentarios ( ( argsAssert ',' expected ) | expected ) comentarios ')' comentarios ')' comentarios ';'
            {
            pushFollow(FOLLOW_comentarios_in_myassert234);
            comentarios16=comentarios();

            state._fsp--;

            stream_comentarios.add(comentarios16.getTree());
            string_literal17=(Token)match(input,100,FOLLOW_100_in_myassert236);  
            stream_100.add(string_literal17);

            pushFollow(FOLLOW_comentarios_in_myassert238);
            comentarios18=comentarios();

            state._fsp--;

            stream_comentarios.add(comentarios18.getTree());
            char_literal19=(Token)match(input,101,FOLLOW_101_in_myassert240);  
            stream_101.add(char_literal19);

            pushFollow(FOLLOW_comentarios_in_myassert242);
            comentarios20=comentarios();

            state._fsp--;

            stream_comentarios.add(comentarios20.getTree());
            ID21=(Token)match(input,ID,FOLLOW_ID_in_myassert244);  
            stream_ID.add(ID21);

            pushFollow(FOLLOW_comentarios_in_myassert246);
            comentarios22=comentarios();

            state._fsp--;

            stream_comentarios.add(comentarios22.getTree());
            char_literal23=(Token)match(input,101,FOLLOW_101_in_myassert248);  
            stream_101.add(char_literal23);

            pushFollow(FOLLOW_comentarios_in_myassert250);
            comentarios24=comentarios();

            state._fsp--;

            stream_comentarios.add(comentarios24.getTree());
            // gram/i.g:35:93: ( ( argsAssert ',' expected ) | expected )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // gram/i.g:35:94: ( argsAssert ',' expected )
                    {
                    // gram/i.g:35:94: ( argsAssert ',' expected )
                    // gram/i.g:35:95: argsAssert ',' expected
                    {
                    pushFollow(FOLLOW_argsAssert_in_myassert254);
                    argsAssert25=argsAssert();

                    state._fsp--;

                    stream_argsAssert.add(argsAssert25.getTree());
                    char_literal26=(Token)match(input,102,FOLLOW_102_in_myassert256);  
                    stream_102.add(char_literal26);

                    pushFollow(FOLLOW_expected_in_myassert258);
                    expected27=expected();

                    state._fsp--;

                    stream_expected.add(expected27.getTree());

                    }


                    }
                    break;
                case 2 :
                    // gram/i.g:35:122: expected
                    {
                    pushFollow(FOLLOW_expected_in_myassert263);
                    expected28=expected();

                    state._fsp--;

                    stream_expected.add(expected28.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_comentarios_in_myassert266);
            comentarios29=comentarios();

            state._fsp--;

            stream_comentarios.add(comentarios29.getTree());
            char_literal30=(Token)match(input,103,FOLLOW_103_in_myassert269);  
            stream_103.add(char_literal30);

            pushFollow(FOLLOW_comentarios_in_myassert271);
            comentarios31=comentarios();

            state._fsp--;

            stream_comentarios.add(comentarios31.getTree());
            char_literal32=(Token)match(input,103,FOLLOW_103_in_myassert273);  
            stream_103.add(char_literal32);

            pushFollow(FOLLOW_comentarios_in_myassert275);
            comentarios33=comentarios();

            state._fsp--;

            stream_comentarios.add(comentarios33.getTree());
            char_literal34=(Token)match(input,99,FOLLOW_99_in_myassert277);  
            stream_99.add(char_literal34);



            // AST REWRITE
            // elements: expected, ID, argsAssert
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 35:181: -> ^( Assert ID ^( ListaArgsAssert ( argsAssert )? ) ^( ExpAssert expected ) )
            {
                // gram/i.g:35:184: ^( Assert ID ^( ListaArgsAssert ( argsAssert )? ) ^( ExpAssert expected ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Assert, "Assert"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // gram/i.g:35:196: ^( ListaArgsAssert ( argsAssert )? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ListaArgsAssert, "ListaArgsAssert"), root_2);

                // gram/i.g:35:214: ( argsAssert )?
                if ( stream_argsAssert.hasNext() ) {
                    adaptor.addChild(root_2, stream_argsAssert.nextTree());

                }
                stream_argsAssert.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:35:227: ^( ExpAssert expected )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpAssert, "ExpAssert"), root_2);

                adaptor.addChild(root_2, stream_expected.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "myassert"

    public static class argsAssert_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argsAssert"
    // gram/i.g:38:1: argsAssert : argumentoAssert ( ',' argumentoAssert )* -> ( argumentoAssert )* ;
    public final iParser.argsAssert_return argsAssert() throws RecognitionException {
        iParser.argsAssert_return retval = new iParser.argsAssert_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal36=null;
        iParser.argumentoAssert_return argumentoAssert35 = null;

        iParser.argumentoAssert_return argumentoAssert37 = null;


        Tree char_literal36_tree=null;
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_argumentoAssert=new RewriteRuleSubtreeStream(adaptor,"rule argumentoAssert");
        try {
            // gram/i.g:38:12: ( argumentoAssert ( ',' argumentoAssert )* -> ( argumentoAssert )* )
            // gram/i.g:39:3: argumentoAssert ( ',' argumentoAssert )*
            {
            pushFollow(FOLLOW_argumentoAssert_in_argsAssert312);
            argumentoAssert35=argumentoAssert();

            state._fsp--;

            stream_argumentoAssert.add(argumentoAssert35.getTree());
            // gram/i.g:39:19: ( ',' argumentoAssert )*
            loop6:
            do {
                int alt6=2;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // gram/i.g:39:21: ',' argumentoAssert
            	    {
            	    char_literal36=(Token)match(input,102,FOLLOW_102_in_argsAssert316);  
            	    stream_102.add(char_literal36);

            	    pushFollow(FOLLOW_argumentoAssert_in_argsAssert318);
            	    argumentoAssert37=argumentoAssert();

            	    state._fsp--;

            	    stream_argumentoAssert.add(argumentoAssert37.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);



            // AST REWRITE
            // elements: argumentoAssert
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 39:44: -> ( argumentoAssert )*
            {
                // gram/i.g:39:47: ( argumentoAssert )*
                while ( stream_argumentoAssert.hasNext() ) {
                    adaptor.addChild(root_0, stream_argumentoAssert.nextTree());

                }
                stream_argumentoAssert.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "argsAssert"

    public static class argumentoAssert_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argumentoAssert"
    // gram/i.g:42:1: argumentoAssert : ( comentarios INT comentarios -> ^( ArgumentoAssertInt INT ) | comentarios CHAR comentarios -> ^( ArgumentoAssertChar CHAR ) | comentarios boolean_assert comentarios -> ^( ArgumentoAssertBool boolean_assert ) );
    public final iParser.argumentoAssert_return argumentoAssert() throws RecognitionException {
        iParser.argumentoAssert_return retval = new iParser.argumentoAssert_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token INT39=null;
        Token CHAR42=null;
        iParser.comentarios_return comentarios38 = null;

        iParser.comentarios_return comentarios40 = null;

        iParser.comentarios_return comentarios41 = null;

        iParser.comentarios_return comentarios43 = null;

        iParser.comentarios_return comentarios44 = null;

        iParser.boolean_assert_return boolean_assert45 = null;

        iParser.comentarios_return comentarios46 = null;


        Tree INT39_tree=null;
        Tree CHAR42_tree=null;
        RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        RewriteRuleSubtreeStream stream_boolean_assert=new RewriteRuleSubtreeStream(adaptor,"rule boolean_assert");
        try {
            // gram/i.g:42:17: ( comentarios INT comentarios -> ^( ArgumentoAssertInt INT ) | comentarios CHAR comentarios -> ^( ArgumentoAssertChar CHAR ) | comentarios boolean_assert comentarios -> ^( ArgumentoAssertBool boolean_assert ) )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // gram/i.g:43:3: comentarios INT comentarios
                    {
                    pushFollow(FOLLOW_comentarios_in_argumentoAssert339);
                    comentarios38=comentarios();

                    state._fsp--;

                    stream_comentarios.add(comentarios38.getTree());
                    INT39=(Token)match(input,INT,FOLLOW_INT_in_argumentoAssert341);  
                    stream_INT.add(INT39);

                    pushFollow(FOLLOW_comentarios_in_argumentoAssert343);
                    comentarios40=comentarios();

                    state._fsp--;

                    stream_comentarios.add(comentarios40.getTree());


                    // AST REWRITE
                    // elements: INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 43:31: -> ^( ArgumentoAssertInt INT )
                    {
                        // gram/i.g:43:34: ^( ArgumentoAssertInt INT )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ArgumentoAssertInt, "ArgumentoAssertInt"), root_1);

                        adaptor.addChild(root_1, stream_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:44:5: comentarios CHAR comentarios
                    {
                    pushFollow(FOLLOW_comentarios_in_argumentoAssert359);
                    comentarios41=comentarios();

                    state._fsp--;

                    stream_comentarios.add(comentarios41.getTree());
                    CHAR42=(Token)match(input,CHAR,FOLLOW_CHAR_in_argumentoAssert361);  
                    stream_CHAR.add(CHAR42);

                    pushFollow(FOLLOW_comentarios_in_argumentoAssert363);
                    comentarios43=comentarios();

                    state._fsp--;

                    stream_comentarios.add(comentarios43.getTree());


                    // AST REWRITE
                    // elements: CHAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 44:34: -> ^( ArgumentoAssertChar CHAR )
                    {
                        // gram/i.g:44:37: ^( ArgumentoAssertChar CHAR )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ArgumentoAssertChar, "ArgumentoAssertChar"), root_1);

                        adaptor.addChild(root_1, stream_CHAR.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // gram/i.g:45:5: comentarios boolean_assert comentarios
                    {
                    pushFollow(FOLLOW_comentarios_in_argumentoAssert377);
                    comentarios44=comentarios();

                    state._fsp--;

                    stream_comentarios.add(comentarios44.getTree());
                    pushFollow(FOLLOW_boolean_assert_in_argumentoAssert379);
                    boolean_assert45=boolean_assert();

                    state._fsp--;

                    stream_boolean_assert.add(boolean_assert45.getTree());
                    pushFollow(FOLLOW_comentarios_in_argumentoAssert381);
                    comentarios46=comentarios();

                    state._fsp--;

                    stream_comentarios.add(comentarios46.getTree());


                    // AST REWRITE
                    // elements: boolean_assert
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 45:44: -> ^( ArgumentoAssertBool boolean_assert )
                    {
                        // gram/i.g:45:47: ^( ArgumentoAssertBool boolean_assert )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ArgumentoAssertBool, "ArgumentoAssertBool"), root_1);

                        adaptor.addChild(root_1, stream_boolean_assert.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "argumentoAssert"

    public static class expected_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expected"
    // gram/i.g:48:1: expected : ( expectedVal | expectedBool | expectedComp );
    public final iParser.expected_return expected() throws RecognitionException {
        iParser.expected_return retval = new iParser.expected_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        iParser.expectedVal_return expectedVal47 = null;

        iParser.expectedBool_return expectedBool48 = null;

        iParser.expectedComp_return expectedComp49 = null;



        try {
            // gram/i.g:48:11: ( expectedVal | expectedBool | expectedComp )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // gram/i.g:49:3: expectedVal
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_expectedVal_in_expected404);
                    expectedVal47=expectedVal();

                    state._fsp--;

                    adaptor.addChild(root_0, expectedVal47.getTree());

                    }
                    break;
                case 2 :
                    // gram/i.g:50:5: expectedBool
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_expectedBool_in_expected410);
                    expectedBool48=expectedBool();

                    state._fsp--;

                    adaptor.addChild(root_0, expectedBool48.getTree());

                    }
                    break;
                case 3 :
                    // gram/i.g:51:5: expectedComp
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_expectedComp_in_expected416);
                    expectedComp49=expectedComp();

                    state._fsp--;

                    adaptor.addChild(root_0, expectedComp49.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expected"

    public static class expectedVal_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expectedVal"
    // gram/i.g:54:3: expectedVal : ( comentarios INT comentarios -> ^( ExpectedArgInt INT ) | comentarios CHAR comentarios -> ^( ExpectedArgChar CHAR ) );
    public final iParser.expectedVal_return expectedVal() throws RecognitionException {
        iParser.expectedVal_return retval = new iParser.expectedVal_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token INT51=null;
        Token CHAR54=null;
        iParser.comentarios_return comentarios50 = null;

        iParser.comentarios_return comentarios52 = null;

        iParser.comentarios_return comentarios53 = null;

        iParser.comentarios_return comentarios55 = null;


        Tree INT51_tree=null;
        Tree CHAR54_tree=null;
        RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        try {
            // gram/i.g:54:16: ( comentarios INT comentarios -> ^( ExpectedArgInt INT ) | comentarios CHAR comentarios -> ^( ExpectedArgChar CHAR ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // gram/i.g:54:18: comentarios INT comentarios
                    {
                    pushFollow(FOLLOW_comentarios_in_expectedVal430);
                    comentarios50=comentarios();

                    state._fsp--;

                    stream_comentarios.add(comentarios50.getTree());
                    INT51=(Token)match(input,INT,FOLLOW_INT_in_expectedVal432);  
                    stream_INT.add(INT51);

                    pushFollow(FOLLOW_comentarios_in_expectedVal434);
                    comentarios52=comentarios();

                    state._fsp--;

                    stream_comentarios.add(comentarios52.getTree());


                    // AST REWRITE
                    // elements: INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 54:46: -> ^( ExpectedArgInt INT )
                    {
                        // gram/i.g:54:49: ^( ExpectedArgInt INT )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpectedArgInt, "ExpectedArgInt"), root_1);

                        adaptor.addChild(root_1, stream_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:55:7: comentarios CHAR comentarios
                    {
                    pushFollow(FOLLOW_comentarios_in_expectedVal451);
                    comentarios53=comentarios();

                    state._fsp--;

                    stream_comentarios.add(comentarios53.getTree());
                    CHAR54=(Token)match(input,CHAR,FOLLOW_CHAR_in_expectedVal453);  
                    stream_CHAR.add(CHAR54);

                    pushFollow(FOLLOW_comentarios_in_expectedVal455);
                    comentarios55=comentarios();

                    state._fsp--;

                    stream_comentarios.add(comentarios55.getTree());


                    // AST REWRITE
                    // elements: CHAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 55:36: -> ^( ExpectedArgChar CHAR )
                    {
                        // gram/i.g:55:39: ^( ExpectedArgChar CHAR )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpectedArgChar, "ExpectedArgChar"), root_1);

                        adaptor.addChild(root_1, stream_CHAR.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expectedVal"

    public static class expectedBool_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expectedBool"
    // gram/i.g:58:3: expectedBool : comentarios boolean_assert comentarios -> ^( ExpectedArgBool boolean_assert ) ;
    public final iParser.expectedBool_return expectedBool() throws RecognitionException {
        iParser.expectedBool_return retval = new iParser.expectedBool_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        iParser.comentarios_return comentarios56 = null;

        iParser.boolean_assert_return boolean_assert57 = null;

        iParser.comentarios_return comentarios58 = null;


        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        RewriteRuleSubtreeStream stream_boolean_assert=new RewriteRuleSubtreeStream(adaptor,"rule boolean_assert");
        try {
            // gram/i.g:58:17: ( comentarios boolean_assert comentarios -> ^( ExpectedArgBool boolean_assert ) )
            // gram/i.g:58:19: comentarios boolean_assert comentarios
            {
            pushFollow(FOLLOW_comentarios_in_expectedBool480);
            comentarios56=comentarios();

            state._fsp--;

            stream_comentarios.add(comentarios56.getTree());
            pushFollow(FOLLOW_boolean_assert_in_expectedBool482);
            boolean_assert57=boolean_assert();

            state._fsp--;

            stream_boolean_assert.add(boolean_assert57.getTree());
            pushFollow(FOLLOW_comentarios_in_expectedBool484);
            comentarios58=comentarios();

            state._fsp--;

            stream_comentarios.add(comentarios58.getTree());


            // AST REWRITE
            // elements: boolean_assert
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 58:58: -> ^( ExpectedArgBool boolean_assert )
            {
                // gram/i.g:58:61: ^( ExpectedArgBool boolean_assert )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpectedArgBool, "ExpectedArgBool"), root_1);

                adaptor.addChild(root_1, stream_boolean_assert.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expectedBool"

    public static class expectedComp_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expectedComp"
    // gram/i.g:61:3: expectedComp : comentarios '\"' comentarios compassert comentarios INT comentarios '\"' comentarios -> ^( ExpectedArgComp compassert INT ) ;
    public final iParser.expectedComp_return expectedComp() throws RecognitionException {
        iParser.expectedComp_return retval = new iParser.expectedComp_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal60=null;
        Token INT64=null;
        Token char_literal66=null;
        iParser.comentarios_return comentarios59 = null;

        iParser.comentarios_return comentarios61 = null;

        iParser.compassert_return compassert62 = null;

        iParser.comentarios_return comentarios63 = null;

        iParser.comentarios_return comentarios65 = null;

        iParser.comentarios_return comentarios67 = null;


        Tree char_literal60_tree=null;
        Tree INT64_tree=null;
        Tree char_literal66_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleSubtreeStream stream_compassert=new RewriteRuleSubtreeStream(adaptor,"rule compassert");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        try {
            // gram/i.g:61:17: ( comentarios '\"' comentarios compassert comentarios INT comentarios '\"' comentarios -> ^( ExpectedArgComp compassert INT ) )
            // gram/i.g:61:19: comentarios '\"' comentarios compassert comentarios INT comentarios '\"' comentarios
            {
            pushFollow(FOLLOW_comentarios_in_expectedComp510);
            comentarios59=comentarios();

            state._fsp--;

            stream_comentarios.add(comentarios59.getTree());
            char_literal60=(Token)match(input,104,FOLLOW_104_in_expectedComp512);  
            stream_104.add(char_literal60);

            pushFollow(FOLLOW_comentarios_in_expectedComp514);
            comentarios61=comentarios();

            state._fsp--;

            stream_comentarios.add(comentarios61.getTree());
            pushFollow(FOLLOW_compassert_in_expectedComp516);
            compassert62=compassert();

            state._fsp--;

            stream_compassert.add(compassert62.getTree());
            pushFollow(FOLLOW_comentarios_in_expectedComp518);
            comentarios63=comentarios();

            state._fsp--;

            stream_comentarios.add(comentarios63.getTree());
            INT64=(Token)match(input,INT,FOLLOW_INT_in_expectedComp520);  
            stream_INT.add(INT64);

            pushFollow(FOLLOW_comentarios_in_expectedComp522);
            comentarios65=comentarios();

            state._fsp--;

            stream_comentarios.add(comentarios65.getTree());
            char_literal66=(Token)match(input,104,FOLLOW_104_in_expectedComp524);  
            stream_104.add(char_literal66);

            pushFollow(FOLLOW_comentarios_in_expectedComp526);
            comentarios67=comentarios();

            state._fsp--;

            stream_comentarios.add(comentarios67.getTree());


            // AST REWRITE
            // elements: INT, compassert
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 61:102: -> ^( ExpectedArgComp compassert INT )
            {
                // gram/i.g:61:105: ^( ExpectedArgComp compassert INT )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpectedArgComp, "ExpectedArgComp"), root_1);

                adaptor.addChild(root_1, stream_compassert.nextTree());
                adaptor.addChild(root_1, stream_INT.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expectedComp"

    public static class boolean_assert_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_assert"
    // gram/i.g:65:3: boolean_assert : ( 'true' | 'false' );
    public final iParser.boolean_assert_return boolean_assert() throws RecognitionException {
        iParser.boolean_assert_return retval = new iParser.boolean_assert_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set68=null;

        Tree set68_tree=null;

        try {
            // gram/i.g:65:18: ( 'true' | 'false' )
            // gram/i.g:
            {
            root_0 = (Tree)adaptor.nil();

            set68=(Token)input.LT(1);
            if ( (input.LA(1)>=105 && input.LA(1)<=106) ) {
                input.consume();
                adaptor.addChild(root_0, (Tree)adaptor.create(set68));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "boolean_assert"

    public static class compassert_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compassert"
    // gram/i.g:68:1: compassert : ( '==' | '>=' | '<=' | '>' | '<' ) ;
    public final iParser.compassert_return compassert() throws RecognitionException {
        iParser.compassert_return retval = new iParser.compassert_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set69=null;

        Tree set69_tree=null;

        try {
            // gram/i.g:68:13: ( ( '==' | '>=' | '<=' | '>' | '<' ) )
            // gram/i.g:69:5: ( '==' | '>=' | '<=' | '>' | '<' )
            {
            root_0 = (Tree)adaptor.nil();

            set69=(Token)input.LT(1);
            if ( (input.LA(1)>=107 && input.LA(1)<=111) ) {
                input.consume();
                adaptor.addChild(root_0, (Tree)adaptor.create(set69));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compassert"

    public static class declaracao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaracao"
    // gram/i.g:77:1: declaracao : c1= comentarios idTipo c2= comentarios dec_nodo (c3= comentarios ',' c4= comentarios dec_nodo )* -> ^( Declaracao ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ^( ListaDecl ( dec_nodo )* ) ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) ) ;
    public final iParser.declaracao_return declaracao() throws RecognitionException {
        iParser.declaracao_return retval = new iParser.declaracao_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal72=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.comentarios_return c3 = null;

        iParser.comentarios_return c4 = null;

        iParser.idTipo_return idTipo70 = null;

        iParser.dec_nodo_return dec_nodo71 = null;

        iParser.dec_nodo_return dec_nodo73 = null;


        Tree char_literal72_tree=null;
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        RewriteRuleSubtreeStream stream_dec_nodo=new RewriteRuleSubtreeStream(adaptor,"rule dec_nodo");
        RewriteRuleSubtreeStream stream_idTipo=new RewriteRuleSubtreeStream(adaptor,"rule idTipo");
        try {
            // gram/i.g:77:12: (c1= comentarios idTipo c2= comentarios dec_nodo (c3= comentarios ',' c4= comentarios dec_nodo )* -> ^( Declaracao ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ^( ListaDecl ( dec_nodo )* ) ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) ) )
            // gram/i.g:78:2: c1= comentarios idTipo c2= comentarios dec_nodo (c3= comentarios ',' c4= comentarios dec_nodo )*
            {
            pushFollow(FOLLOW_comentarios_in_declaracao628);
            c1=comentarios();

            state._fsp--;

            stream_comentarios.add(c1.getTree());
            pushFollow(FOLLOW_idTipo_in_declaracao630);
            idTipo70=idTipo();

            state._fsp--;

            stream_idTipo.add(idTipo70.getTree());
            pushFollow(FOLLOW_comentarios_in_declaracao634);
            c2=comentarios();

            state._fsp--;

            stream_comentarios.add(c2.getTree());
            pushFollow(FOLLOW_dec_nodo_in_declaracao636);
            dec_nodo71=dec_nodo();

            state._fsp--;

            stream_dec_nodo.add(dec_nodo71.getTree());
            // gram/i.g:78:48: (c3= comentarios ',' c4= comentarios dec_nodo )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=COMENTARIO_LINHA && LA10_0<=COMENTARIO_LINHAS)||LA10_0==102) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // gram/i.g:78:50: c3= comentarios ',' c4= comentarios dec_nodo
            	    {
            	    pushFollow(FOLLOW_comentarios_in_declaracao642);
            	    c3=comentarios();

            	    state._fsp--;

            	    stream_comentarios.add(c3.getTree());
            	    char_literal72=(Token)match(input,102,FOLLOW_102_in_declaracao644);  
            	    stream_102.add(char_literal72);

            	    pushFollow(FOLLOW_comentarios_in_declaracao648);
            	    c4=comentarios();

            	    state._fsp--;

            	    stream_comentarios.add(c4.getTree());
            	    pushFollow(FOLLOW_dec_nodo_in_declaracao650);
            	    dec_nodo73=dec_nodo();

            	    state._fsp--;

            	    stream_dec_nodo.add(dec_nodo73.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);



            // AST REWRITE
            // elements: dec_nodo, c1, c3, c2, idTipo, c4
            // token labels: 
            // rule labels: retval, c1, c2, c4, c3
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);
            RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.tree:null);
            RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 78:96: -> ^( Declaracao ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ^( ListaDecl ( dec_nodo )* ) ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) )
            {
                // gram/i.g:78:99: ^( Declaracao ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ^( ListaDecl ( dec_nodo )* ) ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Declaracao, "Declaracao"), root_1);

                // gram/i.g:78:112: ^( Comentarios ( $c1)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:78:126: ( $c1)?
                if ( stream_c1.hasNext() ) {
                    adaptor.addChild(root_2, stream_c1.nextTree());

                }
                stream_c1.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_idTipo.nextTree());
                // gram/i.g:78:139: ^( Comentarios ( $c2)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:78:153: ( $c2)?
                if ( stream_c2.hasNext() ) {
                    adaptor.addChild(root_2, stream_c2.nextTree());

                }
                stream_c2.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:78:159: ^( ListaDecl ( dec_nodo )* )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ListaDecl, "ListaDecl"), root_2);

                // gram/i.g:78:171: ( dec_nodo )*
                while ( stream_dec_nodo.hasNext() ) {
                    adaptor.addChild(root_2, stream_dec_nodo.nextTree());

                }
                stream_dec_nodo.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:78:182: ^( Comentarios ( $c3)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:78:196: ( $c3)?
                if ( stream_c3.hasNext() ) {
                    adaptor.addChild(root_2, stream_c3.nextTree());

                }
                stream_c3.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:78:202: ^( Comentarios ( $c4)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:78:216: ( $c4)?
                if ( stream_c4.hasNext() ) {
                    adaptor.addChild(root_2, stream_c4.nextTree());

                }
                stream_c4.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaracao"

    public static class dec_nodo_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dec_nodo"
    // gram/i.g:81:1: dec_nodo : ( ID c1= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ) Empty ^( Comentarios ) ) | ID c1= comentarios '=' c2= comentarios condicao c3= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) condicao ^( Comentarios ( $c3)? ) ) ) ;
    public final iParser.dec_nodo_return dec_nodo() throws RecognitionException {
        iParser.dec_nodo_return retval = new iParser.dec_nodo_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID74=null;
        Token ID75=null;
        Token char_literal76=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.comentarios_return c3 = null;

        iParser.condicao_return condicao77 = null;


        Tree ID74_tree=null;
        Tree ID75_tree=null;
        Tree char_literal76_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        RewriteRuleSubtreeStream stream_condicao=new RewriteRuleSubtreeStream(adaptor,"rule condicao");
        try {
            // gram/i.g:81:10: ( ( ID c1= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ) Empty ^( Comentarios ) ) | ID c1= comentarios '=' c2= comentarios condicao c3= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) condicao ^( Comentarios ( $c3)? ) ) ) )
            // gram/i.g:82:2: ( ID c1= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ) Empty ^( Comentarios ) ) | ID c1= comentarios '=' c2= comentarios condicao c3= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) condicao ^( Comentarios ( $c3)? ) ) )
            {
            // gram/i.g:82:2: ( ID c1= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ) Empty ^( Comentarios ) ) | ID c1= comentarios '=' c2= comentarios condicao c3= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) condicao ^( Comentarios ( $c3)? ) ) )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // gram/i.g:82:4: ID c1= comentarios
                    {
                    ID74=(Token)match(input,ID,FOLLOW_ID_in_dec_nodo713);  
                    stream_ID.add(ID74);

                    pushFollow(FOLLOW_comentarios_in_dec_nodo717);
                    c1=comentarios();

                    state._fsp--;

                    stream_comentarios.add(c1.getTree());


                    // AST REWRITE
                    // elements: ID, c1
                    // token labels: 
                    // rule labels: retval, c1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 82:22: -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ) Empty ^( Comentarios ) )
                    {
                        // gram/i.g:82:25: ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ) Empty ^( Comentarios ) )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Decl, "Decl"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // gram/i.g:82:35: ^( Comentarios ( $c1)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:82:49: ( $c1)?
                        if ( stream_c1.hasNext() ) {
                            adaptor.addChild(root_2, stream_c1.nextTree());

                        }
                        stream_c1.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // gram/i.g:82:55: ^( Comentarios )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, (Tree)adaptor.create(Empty, "Empty"));
                        // gram/i.g:82:76: ^( Comentarios )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:83:4: ID c1= comentarios '=' c2= comentarios condicao c3= comentarios
                    {
                    ID75=(Token)match(input,ID,FOLLOW_ID_in_dec_nodo749);  
                    stream_ID.add(ID75);

                    pushFollow(FOLLOW_comentarios_in_dec_nodo753);
                    c1=comentarios();

                    state._fsp--;

                    stream_comentarios.add(c1.getTree());
                    char_literal76=(Token)match(input,112,FOLLOW_112_in_dec_nodo755);  
                    stream_112.add(char_literal76);

                    pushFollow(FOLLOW_comentarios_in_dec_nodo759);
                    c2=comentarios();

                    state._fsp--;

                    stream_comentarios.add(c2.getTree());
                    pushFollow(FOLLOW_condicao_in_dec_nodo761);
                    condicao77=condicao();

                    state._fsp--;

                    stream_condicao.add(condicao77.getTree());
                    pushFollow(FOLLOW_comentarios_in_dec_nodo765);
                    c3=comentarios();

                    state._fsp--;

                    stream_comentarios.add(c3.getTree());


                    // AST REWRITE
                    // elements: c3, condicao, c1, ID, c2
                    // token labels: 
                    // rule labels: retval, c1, c2, c3
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
                    RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);
                    RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 83:65: -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) condicao ^( Comentarios ( $c3)? ) )
                    {
                        // gram/i.g:83:68: ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) condicao ^( Comentarios ( $c3)? ) )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Decl, "Decl"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // gram/i.g:83:78: ^( Comentarios ( $c1)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:83:92: ( $c1)?
                        if ( stream_c1.hasNext() ) {
                            adaptor.addChild(root_2, stream_c1.nextTree());

                        }
                        stream_c1.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // gram/i.g:83:98: ^( Comentarios ( $c2)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:83:112: ( $c2)?
                        if ( stream_c2.hasNext() ) {
                            adaptor.addChild(root_2, stream_c2.nextTree());

                        }
                        stream_c2.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_condicao.nextTree());
                        // gram/i.g:83:127: ^( Comentarios ( $c3)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:83:141: ( $c3)?
                        if ( stream_c3.hasNext() ) {
                            adaptor.addChild(root_2, stream_c3.nextTree());

                        }
                        stream_c3.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "dec_nodo"

    public static class funcao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcao"
    // gram/i.g:87:1: funcao : c1= comentarios idTipo c2= comentarios ID c3= comentarios '(' c4= comentarios ( argumentos )? c5= comentarios ')' c6= comentarios blocoCodigo c7= comentarios -> ^( Funcao ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ID ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) ^( ListaArgumentos ( argumentos )? ) ^( Comentarios ( $c5)? ) ^( Comentarios ( $c6)? ) blocoCodigo ^( Comentarios ( $c7)? ) ) ;
    public final iParser.funcao_return funcao() throws RecognitionException {
        iParser.funcao_return retval = new iParser.funcao_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID79=null;
        Token char_literal80=null;
        Token char_literal82=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.comentarios_return c3 = null;

        iParser.comentarios_return c4 = null;

        iParser.comentarios_return c5 = null;

        iParser.comentarios_return c6 = null;

        iParser.comentarios_return c7 = null;

        iParser.idTipo_return idTipo78 = null;

        iParser.argumentos_return argumentos81 = null;

        iParser.blocoCodigo_return blocoCodigo83 = null;


        Tree ID79_tree=null;
        Tree char_literal80_tree=null;
        Tree char_literal82_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_blocoCodigo=new RewriteRuleSubtreeStream(adaptor,"rule blocoCodigo");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        RewriteRuleSubtreeStream stream_argumentos=new RewriteRuleSubtreeStream(adaptor,"rule argumentos");
        RewriteRuleSubtreeStream stream_idTipo=new RewriteRuleSubtreeStream(adaptor,"rule idTipo");
        try {
            // gram/i.g:87:8: (c1= comentarios idTipo c2= comentarios ID c3= comentarios '(' c4= comentarios ( argumentos )? c5= comentarios ')' c6= comentarios blocoCodigo c7= comentarios -> ^( Funcao ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ID ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) ^( ListaArgumentos ( argumentos )? ) ^( Comentarios ( $c5)? ) ^( Comentarios ( $c6)? ) blocoCodigo ^( Comentarios ( $c7)? ) ) )
            // gram/i.g:88:3: c1= comentarios idTipo c2= comentarios ID c3= comentarios '(' c4= comentarios ( argumentos )? c5= comentarios ')' c6= comentarios blocoCodigo c7= comentarios
            {
            pushFollow(FOLLOW_comentarios_in_funcao816);
            c1=comentarios();

            state._fsp--;

            stream_comentarios.add(c1.getTree());
            pushFollow(FOLLOW_idTipo_in_funcao818);
            idTipo78=idTipo();

            state._fsp--;

            stream_idTipo.add(idTipo78.getTree());
            pushFollow(FOLLOW_comentarios_in_funcao822);
            c2=comentarios();

            state._fsp--;

            stream_comentarios.add(c2.getTree());
            ID79=(Token)match(input,ID,FOLLOW_ID_in_funcao824);  
            stream_ID.add(ID79);

            pushFollow(FOLLOW_comentarios_in_funcao828);
            c3=comentarios();

            state._fsp--;

            stream_comentarios.add(c3.getTree());
            char_literal80=(Token)match(input,101,FOLLOW_101_in_funcao830);  
            stream_101.add(char_literal80);

            pushFollow(FOLLOW_comentarios_in_funcao834);
            c4=comentarios();

            state._fsp--;

            stream_comentarios.add(c4.getTree());
            // gram/i.g:88:77: ( argumentos )?
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // gram/i.g:88:77: argumentos
                    {
                    pushFollow(FOLLOW_argumentos_in_funcao836);
                    argumentos81=argumentos();

                    state._fsp--;

                    stream_argumentos.add(argumentos81.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_comentarios_in_funcao841);
            c5=comentarios();

            state._fsp--;

            stream_comentarios.add(c5.getTree());
            char_literal82=(Token)match(input,103,FOLLOW_103_in_funcao843);  
            stream_103.add(char_literal82);

            pushFollow(FOLLOW_comentarios_in_funcao847);
            c6=comentarios();

            state._fsp--;

            stream_comentarios.add(c6.getTree());
            pushFollow(FOLLOW_blocoCodigo_in_funcao849);
            blocoCodigo83=blocoCodigo();

            state._fsp--;

            stream_blocoCodigo.add(blocoCodigo83.getTree());
            pushFollow(FOLLOW_comentarios_in_funcao853);
            c7=comentarios();

            state._fsp--;

            stream_comentarios.add(c7.getTree());


            // AST REWRITE
            // elements: c4, c2, blocoCodigo, ID, c3, c6, c1, c5, idTipo, c7, argumentos
            // token labels: 
            // rule labels: retval, c1, c2, c6, c5, c4, c3, c7
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);
            RewriteRuleSubtreeStream stream_c6=new RewriteRuleSubtreeStream(adaptor,"rule c6",c6!=null?c6.tree:null);
            RewriteRuleSubtreeStream stream_c5=new RewriteRuleSubtreeStream(adaptor,"rule c5",c5!=null?c5.tree:null);
            RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.tree:null);
            RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);
            RewriteRuleSubtreeStream stream_c7=new RewriteRuleSubtreeStream(adaptor,"rule c7",c7!=null?c7.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 88:150: -> ^( Funcao ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ID ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) ^( ListaArgumentos ( argumentos )? ) ^( Comentarios ( $c5)? ) ^( Comentarios ( $c6)? ) blocoCodigo ^( Comentarios ( $c7)? ) )
            {
                // gram/i.g:88:153: ^( Funcao ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ID ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) ^( ListaArgumentos ( argumentos )? ) ^( Comentarios ( $c5)? ) ^( Comentarios ( $c6)? ) blocoCodigo ^( Comentarios ( $c7)? ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Funcao, "Funcao"), root_1);

                // gram/i.g:88:162: ^( Comentarios ( $c1)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:88:176: ( $c1)?
                if ( stream_c1.hasNext() ) {
                    adaptor.addChild(root_2, stream_c1.nextTree());

                }
                stream_c1.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_idTipo.nextTree());
                // gram/i.g:88:189: ^( Comentarios ( $c2)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:88:203: ( $c2)?
                if ( stream_c2.hasNext() ) {
                    adaptor.addChild(root_2, stream_c2.nextTree());

                }
                stream_c2.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_ID.nextNode());
                // gram/i.g:88:212: ^( Comentarios ( $c3)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:88:226: ( $c3)?
                if ( stream_c3.hasNext() ) {
                    adaptor.addChild(root_2, stream_c3.nextTree());

                }
                stream_c3.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:88:232: ^( Comentarios ( $c4)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:88:246: ( $c4)?
                if ( stream_c4.hasNext() ) {
                    adaptor.addChild(root_2, stream_c4.nextTree());

                }
                stream_c4.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:88:252: ^( ListaArgumentos ( argumentos )? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ListaArgumentos, "ListaArgumentos"), root_2);

                // gram/i.g:88:270: ( argumentos )?
                if ( stream_argumentos.hasNext() ) {
                    adaptor.addChild(root_2, stream_argumentos.nextTree());

                }
                stream_argumentos.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:88:283: ^( Comentarios ( $c5)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:88:297: ( $c5)?
                if ( stream_c5.hasNext() ) {
                    adaptor.addChild(root_2, stream_c5.nextTree());

                }
                stream_c5.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:88:303: ^( Comentarios ( $c6)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:88:317: ( $c6)?
                if ( stream_c6.hasNext() ) {
                    adaptor.addChild(root_2, stream_c6.nextTree());

                }
                stream_c6.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_blocoCodigo.nextTree());
                // gram/i.g:88:335: ^( Comentarios ( $c7)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:88:349: ( $c7)?
                if ( stream_c7.hasNext() ) {
                    adaptor.addChild(root_2, stream_c7.nextTree());

                }
                stream_c7.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "funcao"

    public static class argumentos_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argumentos"
    // gram/i.g:91:1: argumentos : argumento ( ',' argumento )* -> ( argumento )+ ;
    public final iParser.argumentos_return argumentos() throws RecognitionException {
        iParser.argumentos_return retval = new iParser.argumentos_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal85=null;
        iParser.argumento_return argumento84 = null;

        iParser.argumento_return argumento86 = null;


        Tree char_literal85_tree=null;
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_argumento=new RewriteRuleSubtreeStream(adaptor,"rule argumento");
        try {
            // gram/i.g:91:12: ( argumento ( ',' argumento )* -> ( argumento )+ )
            // gram/i.g:92:2: argumento ( ',' argumento )*
            {
            pushFollow(FOLLOW_argumento_in_argumentos940);
            argumento84=argumento();

            state._fsp--;

            stream_argumento.add(argumento84.getTree());
            // gram/i.g:92:12: ( ',' argumento )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==102) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // gram/i.g:92:14: ',' argumento
            	    {
            	    char_literal85=(Token)match(input,102,FOLLOW_102_in_argumentos944);  
            	    stream_102.add(char_literal85);

            	    pushFollow(FOLLOW_argumento_in_argumentos946);
            	    argumento86=argumento();

            	    state._fsp--;

            	    stream_argumento.add(argumento86.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);



            // AST REWRITE
            // elements: argumento
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 92:31: -> ( argumento )+
            {
                if ( !(stream_argumento.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_argumento.hasNext() ) {
                    adaptor.addChild(root_0, stream_argumento.nextTree());

                }
                stream_argumento.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "argumentos"

    public static class argumento_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argumento"
    // gram/i.g:98:1: argumento : c1= comentarios idTipo c2= comentarios ID c3= comentarios -> ^( Argumento ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ID ^( Comentarios ( $c3)? ) ) ;
    public final iParser.argumento_return argumento() throws RecognitionException {
        iParser.argumento_return retval = new iParser.argumento_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID88=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.comentarios_return c3 = null;

        iParser.idTipo_return idTipo87 = null;


        Tree ID88_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        RewriteRuleSubtreeStream stream_idTipo=new RewriteRuleSubtreeStream(adaptor,"rule idTipo");
        try {
            // gram/i.g:98:11: (c1= comentarios idTipo c2= comentarios ID c3= comentarios -> ^( Argumento ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ID ^( Comentarios ( $c3)? ) ) )
            // gram/i.g:99:2: c1= comentarios idTipo c2= comentarios ID c3= comentarios
            {
            pushFollow(FOLLOW_comentarios_in_argumento970);
            c1=comentarios();

            state._fsp--;

            stream_comentarios.add(c1.getTree());
            pushFollow(FOLLOW_idTipo_in_argumento972);
            idTipo87=idTipo();

            state._fsp--;

            stream_idTipo.add(idTipo87.getTree());
            pushFollow(FOLLOW_comentarios_in_argumento976);
            c2=comentarios();

            state._fsp--;

            stream_comentarios.add(c2.getTree());
            ID88=(Token)match(input,ID,FOLLOW_ID_in_argumento978);  
            stream_ID.add(ID88);

            pushFollow(FOLLOW_comentarios_in_argumento982);
            c3=comentarios();

            state._fsp--;

            stream_comentarios.add(c3.getTree());


            // AST REWRITE
            // elements: c3, c1, ID, idTipo, c2
            // token labels: 
            // rule labels: retval, c1, c2, c3
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);
            RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 99:57: -> ^( Argumento ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ID ^( Comentarios ( $c3)? ) )
            {
                // gram/i.g:99:60: ^( Argumento ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ID ^( Comentarios ( $c3)? ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Argumento, "Argumento"), root_1);

                // gram/i.g:99:72: ^( Comentarios ( $c1)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:99:86: ( $c1)?
                if ( stream_c1.hasNext() ) {
                    adaptor.addChild(root_2, stream_c1.nextTree());

                }
                stream_c1.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_idTipo.nextTree());
                // gram/i.g:99:99: ^( Comentarios ( $c2)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:99:113: ( $c2)?
                if ( stream_c2.hasNext() ) {
                    adaptor.addChild(root_2, stream_c2.nextTree());

                }
                stream_c2.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_ID.nextNode());
                // gram/i.g:99:122: ^( Comentarios ( $c3)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:99:136: ( $c3)?
                if ( stream_c3.hasNext() ) {
                    adaptor.addChild(root_2, stream_c3.nextTree());

                }
                stream_c3.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "argumento"

    public static class instrucao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instrucao"
    // gram/i.g:104:1: instrucao : ( if_ -> if_ | for_ -> for_ | while_ -> while_ | return_ ';' -> return_ | call ';' -> ^( Exp call ) | print_ ';' -> print_ ) ;
    public final iParser.instrucao_return instrucao() throws RecognitionException {
        iParser.instrucao_return retval = new iParser.instrucao_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal93=null;
        Token char_literal95=null;
        Token char_literal97=null;
        iParser.if__return if_89 = null;

        iParser.for__return for_90 = null;

        iParser.while__return while_91 = null;

        iParser.return__return return_92 = null;

        iParser.call_return call94 = null;

        iParser.print__return print_96 = null;


        Tree char_literal93_tree=null;
        Tree char_literal95_tree=null;
        Tree char_literal97_tree=null;
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleSubtreeStream stream_for_=new RewriteRuleSubtreeStream(adaptor,"rule for_");
        RewriteRuleSubtreeStream stream_return_=new RewriteRuleSubtreeStream(adaptor,"rule return_");
        RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
        RewriteRuleSubtreeStream stream_while_=new RewriteRuleSubtreeStream(adaptor,"rule while_");
        RewriteRuleSubtreeStream stream_if_=new RewriteRuleSubtreeStream(adaptor,"rule if_");
        RewriteRuleSubtreeStream stream_print_=new RewriteRuleSubtreeStream(adaptor,"rule print_");
        try {
            // gram/i.g:104:11: ( ( if_ -> if_ | for_ -> for_ | while_ -> while_ | return_ ';' -> return_ | call ';' -> ^( Exp call ) | print_ ';' -> print_ ) )
            // gram/i.g:105:2: ( if_ -> if_ | for_ -> for_ | while_ -> while_ | return_ ';' -> return_ | call ';' -> ^( Exp call ) | print_ ';' -> print_ )
            {
            // gram/i.g:105:2: ( if_ -> if_ | for_ -> for_ | while_ -> while_ | return_ ';' -> return_ | call ';' -> ^( Exp call ) | print_ ';' -> print_ )
            int alt14=6;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // gram/i.g:105:3: if_
                    {
                    pushFollow(FOLLOW_if__in_instrucao1030);
                    if_89=if_();

                    state._fsp--;

                    stream_if_.add(if_89.getTree());


                    // AST REWRITE
                    // elements: if_
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 105:7: -> if_
                    {
                        adaptor.addChild(root_0, stream_if_.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:105:16: for_
                    {
                    pushFollow(FOLLOW_for__in_instrucao1038);
                    for_90=for_();

                    state._fsp--;

                    stream_for_.add(for_90.getTree());


                    // AST REWRITE
                    // elements: for_
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 105:21: -> for_
                    {
                        adaptor.addChild(root_0, stream_for_.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // gram/i.g:105:31: while_
                    {
                    pushFollow(FOLLOW_while__in_instrucao1046);
                    while_91=while_();

                    state._fsp--;

                    stream_while_.add(while_91.getTree());


                    // AST REWRITE
                    // elements: while_
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 105:38: -> while_
                    {
                        adaptor.addChild(root_0, stream_while_.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // gram/i.g:105:50: return_ ';'
                    {
                    pushFollow(FOLLOW_return__in_instrucao1054);
                    return_92=return_();

                    state._fsp--;

                    stream_return_.add(return_92.getTree());
                    char_literal93=(Token)match(input,99,FOLLOW_99_in_instrucao1056);  
                    stream_99.add(char_literal93);



                    // AST REWRITE
                    // elements: return_
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 105:62: -> return_
                    {
                        adaptor.addChild(root_0, stream_return_.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // gram/i.g:105:75: call ';'
                    {
                    pushFollow(FOLLOW_call_in_instrucao1064);
                    call94=call();

                    state._fsp--;

                    stream_call.add(call94.getTree());
                    char_literal95=(Token)match(input,99,FOLLOW_99_in_instrucao1066);  
                    stream_99.add(char_literal95);



                    // AST REWRITE
                    // elements: call
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 105:84: -> ^( Exp call )
                    {
                        // gram/i.g:105:87: ^( Exp call )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Exp, "Exp"), root_1);

                        adaptor.addChild(root_1, stream_call.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // gram/i.g:105:101: print_ ';'
                    {
                    pushFollow(FOLLOW_print__in_instrucao1078);
                    print_96=print_();

                    state._fsp--;

                    stream_print_.add(print_96.getTree());
                    char_literal97=(Token)match(input,99,FOLLOW_99_in_instrucao1080);  
                    stream_99.add(char_literal97);



                    // AST REWRITE
                    // elements: print_
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 105:112: -> print_
                    {
                        adaptor.addChild(root_0, stream_print_.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instrucao"

    public static class if__return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_"
    // gram/i.g:108:1: if_ : c1= comentarios 'if' c2= comentarios '(' c3= comentarios condicao c4= comentarios ')' c5= comentarios blocoCodigo ( else_ -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo else_ ) | -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( SeqInstrucao ) ) ) ;
    public final iParser.if__return if_() throws RecognitionException {
        iParser.if__return retval = new iParser.if__return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal98=null;
        Token char_literal99=null;
        Token char_literal101=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.comentarios_return c3 = null;

        iParser.comentarios_return c4 = null;

        iParser.comentarios_return c5 = null;

        iParser.condicao_return condicao100 = null;

        iParser.blocoCodigo_return blocoCodigo102 = null;

        iParser.else__return else_103 = null;


        Tree string_literal98_tree=null;
        Tree char_literal99_tree=null;
        Tree char_literal101_tree=null;
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_blocoCodigo=new RewriteRuleSubtreeStream(adaptor,"rule blocoCodigo");
        RewriteRuleSubtreeStream stream_else_=new RewriteRuleSubtreeStream(adaptor,"rule else_");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        RewriteRuleSubtreeStream stream_condicao=new RewriteRuleSubtreeStream(adaptor,"rule condicao");
        try {
            // gram/i.g:108:6: (c1= comentarios 'if' c2= comentarios '(' c3= comentarios condicao c4= comentarios ')' c5= comentarios blocoCodigo ( else_ -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo else_ ) | -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( SeqInstrucao ) ) ) )
            // gram/i.g:109:2: c1= comentarios 'if' c2= comentarios '(' c3= comentarios condicao c4= comentarios ')' c5= comentarios blocoCodigo ( else_ -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo else_ ) | -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( SeqInstrucao ) ) )
            {
            pushFollow(FOLLOW_comentarios_in_if_1099);
            c1=comentarios();

            state._fsp--;

            stream_comentarios.add(c1.getTree());
            string_literal98=(Token)match(input,113,FOLLOW_113_in_if_1101);  
            stream_113.add(string_literal98);

            pushFollow(FOLLOW_comentarios_in_if_1105);
            c2=comentarios();

            state._fsp--;

            stream_comentarios.add(c2.getTree());
            char_literal99=(Token)match(input,101,FOLLOW_101_in_if_1107);  
            stream_101.add(char_literal99);

            pushFollow(FOLLOW_comentarios_in_if_1111);
            c3=comentarios();

            state._fsp--;

            stream_comentarios.add(c3.getTree());
            pushFollow(FOLLOW_condicao_in_if_1113);
            condicao100=condicao();

            state._fsp--;

            stream_condicao.add(condicao100.getTree());
            pushFollow(FOLLOW_comentarios_in_if_1117);
            c4=comentarios();

            state._fsp--;

            stream_comentarios.add(c4.getTree());
            char_literal101=(Token)match(input,103,FOLLOW_103_in_if_1119);  
            stream_103.add(char_literal101);

            pushFollow(FOLLOW_comentarios_in_if_1123);
            c5=comentarios();

            state._fsp--;

            stream_comentarios.add(c5.getTree());
            pushFollow(FOLLOW_blocoCodigo_in_if_1125);
            blocoCodigo102=blocoCodigo();

            state._fsp--;

            stream_blocoCodigo.add(blocoCodigo102.getTree());
            // gram/i.g:109:111: ( else_ -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo else_ ) | -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( SeqInstrucao ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==114) ) {
                alt15=1;
            }
            else if ( (LA15_0==EOF||(LA15_0>=INT && LA15_0<=COMENTARIO_LINHAS)||(LA15_0>=94 && LA15_0<=113)||(LA15_0>=115 && LA15_0<=138)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // gram/i.g:109:113: else_
                    {
                    pushFollow(FOLLOW_else__in_if_1129);
                    else_103=else_();

                    state._fsp--;

                    stream_else_.add(else_103.getTree());


                    // AST REWRITE
                    // elements: c4, else_, c1, c5, condicao, blocoCodigo, c3, c2
                    // token labels: 
                    // rule labels: retval, c1, c2, c5, c4, c3
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
                    RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);
                    RewriteRuleSubtreeStream stream_c5=new RewriteRuleSubtreeStream(adaptor,"rule c5",c5!=null?c5.tree:null);
                    RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.tree:null);
                    RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 109:119: -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo else_ )
                    {
                        // gram/i.g:109:122: ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo else_ )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(If, "If"), root_1);

                        // gram/i.g:109:127: ^( Comentarios ( $c1)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:109:141: ( $c1)?
                        if ( stream_c1.hasNext() ) {
                            adaptor.addChild(root_2, stream_c1.nextTree());

                        }
                        stream_c1.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // gram/i.g:109:147: ^( Comentarios ( $c2)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:109:161: ( $c2)?
                        if ( stream_c2.hasNext() ) {
                            adaptor.addChild(root_2, stream_c2.nextTree());

                        }
                        stream_c2.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // gram/i.g:109:167: ^( Comentarios ( $c3)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:109:181: ( $c3)?
                        if ( stream_c3.hasNext() ) {
                            adaptor.addChild(root_2, stream_c3.nextTree());

                        }
                        stream_c3.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_condicao.nextTree());
                        // gram/i.g:109:196: ^( Comentarios ( $c4)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:109:210: ( $c4)?
                        if ( stream_c4.hasNext() ) {
                            adaptor.addChild(root_2, stream_c4.nextTree());

                        }
                        stream_c4.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // gram/i.g:109:216: ^( Comentarios ( $c5)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:109:230: ( $c5)?
                        if ( stream_c5.hasNext() ) {
                            adaptor.addChild(root_2, stream_c5.nextTree());

                        }
                        stream_c5.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_blocoCodigo.nextTree());
                        adaptor.addChild(root_1, stream_else_.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:110:25: 
                    {

                    // AST REWRITE
                    // elements: blocoCodigo, condicao, c2, c4, c3, c1, c5
                    // token labels: 
                    // rule labels: retval, c1, c2, c5, c4, c3
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
                    RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);
                    RewriteRuleSubtreeStream stream_c5=new RewriteRuleSubtreeStream(adaptor,"rule c5",c5!=null?c5.tree:null);
                    RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.tree:null);
                    RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 110:25: -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( SeqInstrucao ) )
                    {
                        // gram/i.g:110:28: ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( SeqInstrucao ) )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(If, "If"), root_1);

                        // gram/i.g:110:33: ^( Comentarios ( $c1)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:110:47: ( $c1)?
                        if ( stream_c1.hasNext() ) {
                            adaptor.addChild(root_2, stream_c1.nextTree());

                        }
                        stream_c1.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // gram/i.g:110:53: ^( Comentarios ( $c2)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:110:67: ( $c2)?
                        if ( stream_c2.hasNext() ) {
                            adaptor.addChild(root_2, stream_c2.nextTree());

                        }
                        stream_c2.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // gram/i.g:110:73: ^( Comentarios ( $c3)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:110:87: ( $c3)?
                        if ( stream_c3.hasNext() ) {
                            adaptor.addChild(root_2, stream_c3.nextTree());

                        }
                        stream_c3.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_condicao.nextTree());
                        // gram/i.g:110:102: ^( Comentarios ( $c4)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:110:116: ( $c4)?
                        if ( stream_c4.hasNext() ) {
                            adaptor.addChild(root_2, stream_c4.nextTree());

                        }
                        stream_c4.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // gram/i.g:110:122: ^( Comentarios ( $c5)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:110:136: ( $c5)?
                        if ( stream_c5.hasNext() ) {
                            adaptor.addChild(root_2, stream_c5.nextTree());

                        }
                        stream_c5.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_blocoCodigo.nextTree());
                        // gram/i.g:110:154: ^( SeqInstrucao )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(SeqInstrucao, "SeqInstrucao"), root_2);

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "if_"

    public static class else__return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "else_"
    // gram/i.g:114:1: else_ : 'else' ( blocoCodigo -> blocoCodigo | if_ -> if_ ) ;
    public final iParser.else__return else_() throws RecognitionException {
        iParser.else__return retval = new iParser.else__return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal104=null;
        iParser.blocoCodigo_return blocoCodigo105 = null;

        iParser.if__return if_106 = null;


        Tree string_literal104_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleSubtreeStream stream_blocoCodigo=new RewriteRuleSubtreeStream(adaptor,"rule blocoCodigo");
        RewriteRuleSubtreeStream stream_if_=new RewriteRuleSubtreeStream(adaptor,"rule if_");
        try {
            // gram/i.g:114:7: ( 'else' ( blocoCodigo -> blocoCodigo | if_ -> if_ ) )
            // gram/i.g:115:2: 'else' ( blocoCodigo -> blocoCodigo | if_ -> if_ )
            {
            string_literal104=(Token)match(input,114,FOLLOW_114_in_else_1295);  
            stream_114.add(string_literal104);

            // gram/i.g:115:9: ( blocoCodigo -> blocoCodigo | if_ -> if_ )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==120) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=COMENTARIO_LINHA && LA16_0<=COMENTARIO_LINHAS)||LA16_0==113) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // gram/i.g:115:11: blocoCodigo
                    {
                    pushFollow(FOLLOW_blocoCodigo_in_else_1299);
                    blocoCodigo105=blocoCodigo();

                    state._fsp--;

                    stream_blocoCodigo.add(blocoCodigo105.getTree());


                    // AST REWRITE
                    // elements: blocoCodigo
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 115:23: -> blocoCodigo
                    {
                        adaptor.addChild(root_0, stream_blocoCodigo.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:115:40: if_
                    {
                    pushFollow(FOLLOW_if__in_else_1307);
                    if_106=if_();

                    state._fsp--;

                    stream_if_.add(if_106.getTree());


                    // AST REWRITE
                    // elements: if_
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 115:44: -> if_
                    {
                        adaptor.addChild(root_0, stream_if_.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "else_"

    public static class for__return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_"
    // gram/i.g:118:1: for_ : c1= comentarios 'for' c2= comentarios '(' for_declaracao ';' c3= comentarios condicao c4= comentarios ';' c5= comentarios expressao c6= comentarios ')' c7= comentarios blocoCodigo c8= comentarios -> ^( For ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) for_declaracao ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) expressao ^( Comentarios ( $c6)? ) ^( Comentarios ( $c7)? ) blocoCodigo ^( Comentarios ( $c8)? ) ) ;
    public final iParser.for__return for_() throws RecognitionException {
        iParser.for__return retval = new iParser.for__return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal107=null;
        Token char_literal108=null;
        Token char_literal110=null;
        Token char_literal112=null;
        Token char_literal114=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.comentarios_return c3 = null;

        iParser.comentarios_return c4 = null;

        iParser.comentarios_return c5 = null;

        iParser.comentarios_return c6 = null;

        iParser.comentarios_return c7 = null;

        iParser.comentarios_return c8 = null;

        iParser.for_declaracao_return for_declaracao109 = null;

        iParser.condicao_return condicao111 = null;

        iParser.expressao_return expressao113 = null;

        iParser.blocoCodigo_return blocoCodigo115 = null;


        Tree string_literal107_tree=null;
        Tree char_literal108_tree=null;
        Tree char_literal110_tree=null;
        Tree char_literal112_tree=null;
        Tree char_literal114_tree=null;
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_blocoCodigo=new RewriteRuleSubtreeStream(adaptor,"rule blocoCodigo");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        RewriteRuleSubtreeStream stream_condicao=new RewriteRuleSubtreeStream(adaptor,"rule condicao");
        RewriteRuleSubtreeStream stream_for_declaracao=new RewriteRuleSubtreeStream(adaptor,"rule for_declaracao");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // gram/i.g:118:6: (c1= comentarios 'for' c2= comentarios '(' for_declaracao ';' c3= comentarios condicao c4= comentarios ';' c5= comentarios expressao c6= comentarios ')' c7= comentarios blocoCodigo c8= comentarios -> ^( For ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) for_declaracao ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) expressao ^( Comentarios ( $c6)? ) ^( Comentarios ( $c7)? ) blocoCodigo ^( Comentarios ( $c8)? ) ) )
            // gram/i.g:119:2: c1= comentarios 'for' c2= comentarios '(' for_declaracao ';' c3= comentarios condicao c4= comentarios ';' c5= comentarios expressao c6= comentarios ')' c7= comentarios blocoCodigo c8= comentarios
            {
            pushFollow(FOLLOW_comentarios_in_for_1326);
            c1=comentarios();

            state._fsp--;

            stream_comentarios.add(c1.getTree());
            string_literal107=(Token)match(input,115,FOLLOW_115_in_for_1328);  
            stream_115.add(string_literal107);

            pushFollow(FOLLOW_comentarios_in_for_1332);
            c2=comentarios();

            state._fsp--;

            stream_comentarios.add(c2.getTree());
            char_literal108=(Token)match(input,101,FOLLOW_101_in_for_1334);  
            stream_101.add(char_literal108);

            pushFollow(FOLLOW_for_declaracao_in_for_1336);
            for_declaracao109=for_declaracao();

            state._fsp--;

            stream_for_declaracao.add(for_declaracao109.getTree());
            char_literal110=(Token)match(input,99,FOLLOW_99_in_for_1338);  
            stream_99.add(char_literal110);

            pushFollow(FOLLOW_comentarios_in_for_1342);
            c3=comentarios();

            state._fsp--;

            stream_comentarios.add(c3.getTree());
            pushFollow(FOLLOW_condicao_in_for_1344);
            condicao111=condicao();

            state._fsp--;

            stream_condicao.add(condicao111.getTree());
            pushFollow(FOLLOW_comentarios_in_for_1348);
            c4=comentarios();

            state._fsp--;

            stream_comentarios.add(c4.getTree());
            char_literal112=(Token)match(input,99,FOLLOW_99_in_for_1350);  
            stream_99.add(char_literal112);

            pushFollow(FOLLOW_comentarios_in_for_1354);
            c5=comentarios();

            state._fsp--;

            stream_comentarios.add(c5.getTree());
            pushFollow(FOLLOW_expressao_in_for_1356);
            expressao113=expressao();

            state._fsp--;

            stream_expressao.add(expressao113.getTree());
            pushFollow(FOLLOW_comentarios_in_for_1360);
            c6=comentarios();

            state._fsp--;

            stream_comentarios.add(c6.getTree());
            char_literal114=(Token)match(input,103,FOLLOW_103_in_for_1362);  
            stream_103.add(char_literal114);

            pushFollow(FOLLOW_comentarios_in_for_1366);
            c7=comentarios();

            state._fsp--;

            stream_comentarios.add(c7.getTree());
            pushFollow(FOLLOW_blocoCodigo_in_for_1368);
            blocoCodigo115=blocoCodigo();

            state._fsp--;

            stream_blocoCodigo.add(blocoCodigo115.getTree());
            pushFollow(FOLLOW_comentarios_in_for_1372);
            c8=comentarios();

            state._fsp--;

            stream_comentarios.add(c8.getTree());


            // AST REWRITE
            // elements: expressao, for_declaracao, c1, c5, c4, condicao, c2, blocoCodigo, c7, c8, c6, c3
            // token labels: 
            // rule labels: retval, c1, c2, c6, c5, c4, c3, c8, c7
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);
            RewriteRuleSubtreeStream stream_c6=new RewriteRuleSubtreeStream(adaptor,"rule c6",c6!=null?c6.tree:null);
            RewriteRuleSubtreeStream stream_c5=new RewriteRuleSubtreeStream(adaptor,"rule c5",c5!=null?c5.tree:null);
            RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.tree:null);
            RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);
            RewriteRuleSubtreeStream stream_c8=new RewriteRuleSubtreeStream(adaptor,"rule c8",c8!=null?c8.tree:null);
            RewriteRuleSubtreeStream stream_c7=new RewriteRuleSubtreeStream(adaptor,"rule c7",c7!=null?c7.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 119:190: -> ^( For ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) for_declaracao ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) expressao ^( Comentarios ( $c6)? ) ^( Comentarios ( $c7)? ) blocoCodigo ^( Comentarios ( $c8)? ) )
            {
                // gram/i.g:119:193: ^( For ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) for_declaracao ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) expressao ^( Comentarios ( $c6)? ) ^( Comentarios ( $c7)? ) blocoCodigo ^( Comentarios ( $c8)? ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(For, "For"), root_1);

                // gram/i.g:119:199: ^( Comentarios ( $c1)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:119:213: ( $c1)?
                if ( stream_c1.hasNext() ) {
                    adaptor.addChild(root_2, stream_c1.nextTree());

                }
                stream_c1.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:119:219: ^( Comentarios ( $c2)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:119:233: ( $c2)?
                if ( stream_c2.hasNext() ) {
                    adaptor.addChild(root_2, stream_c2.nextTree());

                }
                stream_c2.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_for_declaracao.nextTree());
                // gram/i.g:119:254: ^( Comentarios ( $c3)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:119:268: ( $c3)?
                if ( stream_c3.hasNext() ) {
                    adaptor.addChild(root_2, stream_c3.nextTree());

                }
                stream_c3.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_condicao.nextTree());
                // gram/i.g:119:283: ^( Comentarios ( $c4)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:119:297: ( $c4)?
                if ( stream_c4.hasNext() ) {
                    adaptor.addChild(root_2, stream_c4.nextTree());

                }
                stream_c4.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:119:303: ^( Comentarios ( $c5)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:119:317: ( $c5)?
                if ( stream_c5.hasNext() ) {
                    adaptor.addChild(root_2, stream_c5.nextTree());

                }
                stream_c5.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_expressao.nextTree());
                // gram/i.g:119:333: ^( Comentarios ( $c6)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:119:347: ( $c6)?
                if ( stream_c6.hasNext() ) {
                    adaptor.addChild(root_2, stream_c6.nextTree());

                }
                stream_c6.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:119:353: ^( Comentarios ( $c7)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:119:367: ( $c7)?
                if ( stream_c7.hasNext() ) {
                    adaptor.addChild(root_2, stream_c7.nextTree());

                }
                stream_c7.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_blocoCodigo.nextTree());
                // gram/i.g:119:385: ^( Comentarios ( $c8)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:119:399: ( $c8)?
                if ( stream_c8.hasNext() ) {
                    adaptor.addChild(root_2, stream_c8.nextTree());

                }
                stream_c8.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "for_"

    public static class for_declaracao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_declaracao"
    // gram/i.g:122:1: for_declaracao : ( declaracao -> declaracao | atribuicao -> atribuicao ) ;
    public final iParser.for_declaracao_return for_declaracao() throws RecognitionException {
        iParser.for_declaracao_return retval = new iParser.for_declaracao_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        iParser.declaracao_return declaracao116 = null;

        iParser.atribuicao_return atribuicao117 = null;


        RewriteRuleSubtreeStream stream_atribuicao=new RewriteRuleSubtreeStream(adaptor,"rule atribuicao");
        RewriteRuleSubtreeStream stream_declaracao=new RewriteRuleSubtreeStream(adaptor,"rule declaracao");
        try {
            // gram/i.g:122:16: ( ( declaracao -> declaracao | atribuicao -> atribuicao ) )
            // gram/i.g:123:2: ( declaracao -> declaracao | atribuicao -> atribuicao )
            {
            // gram/i.g:123:2: ( declaracao -> declaracao | atribuicao -> atribuicao )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // gram/i.g:123:4: declaracao
                    {
                    pushFollow(FOLLOW_declaracao_in_for_declaracao1463);
                    declaracao116=declaracao();

                    state._fsp--;

                    stream_declaracao.add(declaracao116.getTree());


                    // AST REWRITE
                    // elements: declaracao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 123:15: -> declaracao
                    {
                        adaptor.addChild(root_0, stream_declaracao.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:124:4: atribuicao
                    {
                    pushFollow(FOLLOW_atribuicao_in_for_declaracao1472);
                    atribuicao117=atribuicao();

                    state._fsp--;

                    stream_atribuicao.add(atribuicao117.getTree());


                    // AST REWRITE
                    // elements: atribuicao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 124:15: -> atribuicao
                    {
                        adaptor.addChild(root_0, stream_atribuicao.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "for_declaracao"

    public static class while__return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "while_"
    // gram/i.g:128:1: while_ : c1= comentarios 'while' c2= comentarios '(' c3= comentarios condicao c4= comentarios ')' c5= comentarios blocoCodigo c6= comentarios -> ^( While ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( Comentarios ( $c6)? ) ) ;
    public final iParser.while__return while_() throws RecognitionException {
        iParser.while__return retval = new iParser.while__return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal118=null;
        Token char_literal119=null;
        Token char_literal121=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.comentarios_return c3 = null;

        iParser.comentarios_return c4 = null;

        iParser.comentarios_return c5 = null;

        iParser.comentarios_return c6 = null;

        iParser.condicao_return condicao120 = null;

        iParser.blocoCodigo_return blocoCodigo122 = null;


        Tree string_literal118_tree=null;
        Tree char_literal119_tree=null;
        Tree char_literal121_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_blocoCodigo=new RewriteRuleSubtreeStream(adaptor,"rule blocoCodigo");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        RewriteRuleSubtreeStream stream_condicao=new RewriteRuleSubtreeStream(adaptor,"rule condicao");
        try {
            // gram/i.g:128:8: (c1= comentarios 'while' c2= comentarios '(' c3= comentarios condicao c4= comentarios ')' c5= comentarios blocoCodigo c6= comentarios -> ^( While ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( Comentarios ( $c6)? ) ) )
            // gram/i.g:129:2: c1= comentarios 'while' c2= comentarios '(' c3= comentarios condicao c4= comentarios ')' c5= comentarios blocoCodigo c6= comentarios
            {
            pushFollow(FOLLOW_comentarios_in_while_1492);
            c1=comentarios();

            state._fsp--;

            stream_comentarios.add(c1.getTree());
            string_literal118=(Token)match(input,116,FOLLOW_116_in_while_1494);  
            stream_116.add(string_literal118);

            pushFollow(FOLLOW_comentarios_in_while_1498);
            c2=comentarios();

            state._fsp--;

            stream_comentarios.add(c2.getTree());
            char_literal119=(Token)match(input,101,FOLLOW_101_in_while_1500);  
            stream_101.add(char_literal119);

            pushFollow(FOLLOW_comentarios_in_while_1504);
            c3=comentarios();

            state._fsp--;

            stream_comentarios.add(c3.getTree());
            pushFollow(FOLLOW_condicao_in_while_1506);
            condicao120=condicao();

            state._fsp--;

            stream_condicao.add(condicao120.getTree());
            pushFollow(FOLLOW_comentarios_in_while_1510);
            c4=comentarios();

            state._fsp--;

            stream_comentarios.add(c4.getTree());
            char_literal121=(Token)match(input,103,FOLLOW_103_in_while_1512);  
            stream_103.add(char_literal121);

            pushFollow(FOLLOW_comentarios_in_while_1516);
            c5=comentarios();

            state._fsp--;

            stream_comentarios.add(c5.getTree());
            pushFollow(FOLLOW_blocoCodigo_in_while_1518);
            blocoCodigo122=blocoCodigo();

            state._fsp--;

            stream_blocoCodigo.add(blocoCodigo122.getTree());
            pushFollow(FOLLOW_comentarios_in_while_1522);
            c6=comentarios();

            state._fsp--;

            stream_comentarios.add(c6.getTree());


            // AST REWRITE
            // elements: blocoCodigo, c1, c5, c4, c6, condicao, c2, c3
            // token labels: 
            // rule labels: retval, c1, c2, c6, c5, c4, c3
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);
            RewriteRuleSubtreeStream stream_c6=new RewriteRuleSubtreeStream(adaptor,"rule c6",c6!=null?c6.tree:null);
            RewriteRuleSubtreeStream stream_c5=new RewriteRuleSubtreeStream(adaptor,"rule c5",c5!=null?c5.tree:null);
            RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.tree:null);
            RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 129:129: -> ^( While ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( Comentarios ( $c6)? ) )
            {
                // gram/i.g:129:132: ^( While ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( Comentarios ( $c6)? ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(While, "While"), root_1);

                // gram/i.g:129:140: ^( Comentarios ( $c1)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:129:154: ( $c1)?
                if ( stream_c1.hasNext() ) {
                    adaptor.addChild(root_2, stream_c1.nextTree());

                }
                stream_c1.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:129:160: ^( Comentarios ( $c2)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:129:174: ( $c2)?
                if ( stream_c2.hasNext() ) {
                    adaptor.addChild(root_2, stream_c2.nextTree());

                }
                stream_c2.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:129:180: ^( Comentarios ( $c3)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:129:194: ( $c3)?
                if ( stream_c3.hasNext() ) {
                    adaptor.addChild(root_2, stream_c3.nextTree());

                }
                stream_c3.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_condicao.nextTree());
                // gram/i.g:129:209: ^( Comentarios ( $c4)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:129:223: ( $c4)?
                if ( stream_c4.hasNext() ) {
                    adaptor.addChild(root_2, stream_c4.nextTree());

                }
                stream_c4.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:129:229: ^( Comentarios ( $c5)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:129:243: ( $c5)?
                if ( stream_c5.hasNext() ) {
                    adaptor.addChild(root_2, stream_c5.nextTree());

                }
                stream_c5.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_blocoCodigo.nextTree());
                // gram/i.g:129:261: ^( Comentarios ( $c6)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:129:275: ( $c6)?
                if ( stream_c6.hasNext() ) {
                    adaptor.addChild(root_2, stream_c6.nextTree());

                }
                stream_c6.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "while_"

    public static class return__return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "return_"
    // gram/i.g:132:1: return_ : c1= comentarios 'return' c2= comentarios expressao c3= comentarios -> ^( Return ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) ) ;
    public final iParser.return__return return_() throws RecognitionException {
        iParser.return__return retval = new iParser.return__return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal123=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.comentarios_return c3 = null;

        iParser.expressao_return expressao124 = null;


        Tree string_literal123_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // gram/i.g:132:10: (c1= comentarios 'return' c2= comentarios expressao c3= comentarios -> ^( Return ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) ) )
            // gram/i.g:133:2: c1= comentarios 'return' c2= comentarios expressao c3= comentarios
            {
            pushFollow(FOLLOW_comentarios_in_return_1594);
            c1=comentarios();

            state._fsp--;

            stream_comentarios.add(c1.getTree());
            string_literal123=(Token)match(input,117,FOLLOW_117_in_return_1596);  
            stream_117.add(string_literal123);

            pushFollow(FOLLOW_comentarios_in_return_1600);
            c2=comentarios();

            state._fsp--;

            stream_comentarios.add(c2.getTree());
            pushFollow(FOLLOW_expressao_in_return_1602);
            expressao124=expressao();

            state._fsp--;

            stream_expressao.add(expressao124.getTree());
            pushFollow(FOLLOW_comentarios_in_return_1606);
            c3=comentarios();

            state._fsp--;

            stream_comentarios.add(c3.getTree());


            // AST REWRITE
            // elements: c1, expressao, c2, c3
            // token labels: 
            // rule labels: retval, c1, c2, c3
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);
            RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 133:66: -> ^( Return ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) )
            {
                // gram/i.g:133:69: ^( Return ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Return, "Return"), root_1);

                // gram/i.g:133:78: ^( Comentarios ( $c1)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:133:92: ( $c1)?
                if ( stream_c1.hasNext() ) {
                    adaptor.addChild(root_2, stream_c1.nextTree());

                }
                stream_c1.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:133:98: ^( Comentarios ( $c2)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:133:112: ( $c2)?
                if ( stream_c2.hasNext() ) {
                    adaptor.addChild(root_2, stream_c2.nextTree());

                }
                stream_c2.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_expressao.nextTree());
                // gram/i.g:133:128: ^( Comentarios ( $c3)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:133:142: ( $c3)?
                if ( stream_c3.hasNext() ) {
                    adaptor.addChild(root_2, stream_c3.nextTree());

                }
                stream_c3.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "return_"

    public static class call_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call"
    // gram/i.g:136:1: call : c1= comentarios ID c2= comentarios '(' c3= comentarios ( parametros )? c4= comentarios ')' c5= comentarios -> ^( Call ^( Comentarios ( $c1)? ) ID ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) ^( ListaParametros ( parametros )? ) ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) ) ;
    public final iParser.call_return call() throws RecognitionException {
        iParser.call_return retval = new iParser.call_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID125=null;
        Token char_literal126=null;
        Token char_literal128=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.comentarios_return c3 = null;

        iParser.comentarios_return c4 = null;

        iParser.comentarios_return c5 = null;

        iParser.parametros_return parametros127 = null;


        Tree ID125_tree=null;
        Tree char_literal126_tree=null;
        Tree char_literal128_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_parametros=new RewriteRuleSubtreeStream(adaptor,"rule parametros");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        try {
            // gram/i.g:136:6: (c1= comentarios ID c2= comentarios '(' c3= comentarios ( parametros )? c4= comentarios ')' c5= comentarios -> ^( Call ^( Comentarios ( $c1)? ) ID ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) ^( ListaParametros ( parametros )? ) ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) ) )
            // gram/i.g:137:2: c1= comentarios ID c2= comentarios '(' c3= comentarios ( parametros )? c4= comentarios ')' c5= comentarios
            {
            pushFollow(FOLLOW_comentarios_in_call1651);
            c1=comentarios();

            state._fsp--;

            stream_comentarios.add(c1.getTree());
            ID125=(Token)match(input,ID,FOLLOW_ID_in_call1653);  
            stream_ID.add(ID125);

            pushFollow(FOLLOW_comentarios_in_call1658);
            c2=comentarios();

            state._fsp--;

            stream_comentarios.add(c2.getTree());
            char_literal126=(Token)match(input,101,FOLLOW_101_in_call1660);  
            stream_101.add(char_literal126);

            pushFollow(FOLLOW_comentarios_in_call1664);
            c3=comentarios();

            state._fsp--;

            stream_comentarios.add(c3.getTree());
            // gram/i.g:137:55: ( parametros )?
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // gram/i.g:137:55: parametros
                    {
                    pushFollow(FOLLOW_parametros_in_call1666);
                    parametros127=parametros();

                    state._fsp--;

                    stream_parametros.add(parametros127.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_comentarios_in_call1671);
            c4=comentarios();

            state._fsp--;

            stream_comentarios.add(c4.getTree());
            char_literal128=(Token)match(input,103,FOLLOW_103_in_call1673);  
            stream_103.add(char_literal128);

            pushFollow(FOLLOW_comentarios_in_call1677);
            c5=comentarios();

            state._fsp--;

            stream_comentarios.add(c5.getTree());


            // AST REWRITE
            // elements: c2, c5, c4, c3, parametros, ID, c1
            // token labels: 
            // rule labels: retval, c1, c2, c5, c4, c3
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);
            RewriteRuleSubtreeStream stream_c5=new RewriteRuleSubtreeStream(adaptor,"rule c5",c5!=null?c5.tree:null);
            RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.tree:null);
            RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 137:101: -> ^( Call ^( Comentarios ( $c1)? ) ID ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) ^( ListaParametros ( parametros )? ) ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) )
            {
                // gram/i.g:137:104: ^( Call ^( Comentarios ( $c1)? ) ID ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) ^( ListaParametros ( parametros )? ) ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Call, "Call"), root_1);

                // gram/i.g:137:111: ^( Comentarios ( $c1)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:137:125: ( $c1)?
                if ( stream_c1.hasNext() ) {
                    adaptor.addChild(root_2, stream_c1.nextTree());

                }
                stream_c1.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_ID.nextNode());
                // gram/i.g:137:134: ^( Comentarios ( $c2)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:137:148: ( $c2)?
                if ( stream_c2.hasNext() ) {
                    adaptor.addChild(root_2, stream_c2.nextTree());

                }
                stream_c2.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:137:154: ^( Comentarios ( $c3)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:137:168: ( $c3)?
                if ( stream_c3.hasNext() ) {
                    adaptor.addChild(root_2, stream_c3.nextTree());

                }
                stream_c3.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:137:174: ^( ListaParametros ( parametros )? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ListaParametros, "ListaParametros"), root_2);

                // gram/i.g:137:192: ( parametros )?
                if ( stream_parametros.hasNext() ) {
                    adaptor.addChild(root_2, stream_parametros.nextTree());

                }
                stream_parametros.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:137:205: ^( Comentarios ( $c4)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:137:219: ( $c4)?
                if ( stream_c4.hasNext() ) {
                    adaptor.addChild(root_2, stream_c4.nextTree());

                }
                stream_c4.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:137:225: ^( Comentarios ( $c5)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:137:239: ( $c5)?
                if ( stream_c5.hasNext() ) {
                    adaptor.addChild(root_2, stream_c5.nextTree());

                }
                stream_c5.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "call"

    public static class print__return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "print_"
    // gram/i.g:140:1: print_ : c1= comentarios 'print' c2= comentarios '(' c3= comentarios expressao c4= comentarios ')' c5= comentarios -> ^( Exp ^( Print ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) expressao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) ) ) ;
    public final iParser.print__return print_() throws RecognitionException {
        iParser.print__return retval = new iParser.print__return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal129=null;
        Token char_literal130=null;
        Token char_literal132=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.comentarios_return c3 = null;

        iParser.comentarios_return c4 = null;

        iParser.comentarios_return c5 = null;

        iParser.expressao_return expressao131 = null;


        Tree string_literal129_tree=null;
        Tree char_literal130_tree=null;
        Tree char_literal132_tree=null;
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // gram/i.g:140:8: (c1= comentarios 'print' c2= comentarios '(' c3= comentarios expressao c4= comentarios ')' c5= comentarios -> ^( Exp ^( Print ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) expressao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) ) ) )
            // gram/i.g:141:2: c1= comentarios 'print' c2= comentarios '(' c3= comentarios expressao c4= comentarios ')' c5= comentarios
            {
            pushFollow(FOLLOW_comentarios_in_print_1745);
            c1=comentarios();

            state._fsp--;

            stream_comentarios.add(c1.getTree());
            string_literal129=(Token)match(input,118,FOLLOW_118_in_print_1747);  
            stream_118.add(string_literal129);

            pushFollow(FOLLOW_comentarios_in_print_1751);
            c2=comentarios();

            state._fsp--;

            stream_comentarios.add(c2.getTree());
            char_literal130=(Token)match(input,101,FOLLOW_101_in_print_1753);  
            stream_101.add(char_literal130);

            pushFollow(FOLLOW_comentarios_in_print_1757);
            c3=comentarios();

            state._fsp--;

            stream_comentarios.add(c3.getTree());
            pushFollow(FOLLOW_expressao_in_print_1759);
            expressao131=expressao();

            state._fsp--;

            stream_expressao.add(expressao131.getTree());
            pushFollow(FOLLOW_comentarios_in_print_1763);
            c4=comentarios();

            state._fsp--;

            stream_comentarios.add(c4.getTree());
            char_literal132=(Token)match(input,103,FOLLOW_103_in_print_1765);  
            stream_103.add(char_literal132);

            pushFollow(FOLLOW_comentarios_in_print_1769);
            c5=comentarios();

            state._fsp--;

            stream_comentarios.add(c5.getTree());


            // AST REWRITE
            // elements: c2, c1, c5, c3, c4, expressao
            // token labels: 
            // rule labels: retval, c1, c2, c5, c4, c3
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);
            RewriteRuleSubtreeStream stream_c5=new RewriteRuleSubtreeStream(adaptor,"rule c5",c5!=null?c5.tree:null);
            RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.tree:null);
            RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 141:103: -> ^( Exp ^( Print ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) expressao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) ) )
            {
                // gram/i.g:141:106: ^( Exp ^( Print ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) expressao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Exp, "Exp"), root_1);

                // gram/i.g:141:112: ^( Print ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) expressao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Print, "Print"), root_2);

                // gram/i.g:141:120: ^( Comentarios ( $c1)? )
                {
                Tree root_3 = (Tree)adaptor.nil();
                root_3 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_3);

                // gram/i.g:141:134: ( $c1)?
                if ( stream_c1.hasNext() ) {
                    adaptor.addChild(root_3, stream_c1.nextTree());

                }
                stream_c1.reset();

                adaptor.addChild(root_2, root_3);
                }
                // gram/i.g:141:140: ^( Comentarios ( $c2)? )
                {
                Tree root_3 = (Tree)adaptor.nil();
                root_3 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_3);

                // gram/i.g:141:154: ( $c2)?
                if ( stream_c2.hasNext() ) {
                    adaptor.addChild(root_3, stream_c2.nextTree());

                }
                stream_c2.reset();

                adaptor.addChild(root_2, root_3);
                }
                // gram/i.g:141:160: ^( Comentarios ( $c3)? )
                {
                Tree root_3 = (Tree)adaptor.nil();
                root_3 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_3);

                // gram/i.g:141:174: ( $c3)?
                if ( stream_c3.hasNext() ) {
                    adaptor.addChild(root_3, stream_c3.nextTree());

                }
                stream_c3.reset();

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, stream_expressao.nextTree());
                // gram/i.g:141:190: ^( Comentarios ( $c4)? )
                {
                Tree root_3 = (Tree)adaptor.nil();
                root_3 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_3);

                // gram/i.g:141:204: ( $c4)?
                if ( stream_c4.hasNext() ) {
                    adaptor.addChild(root_3, stream_c4.nextTree());

                }
                stream_c4.reset();

                adaptor.addChild(root_2, root_3);
                }
                // gram/i.g:141:210: ^( Comentarios ( $c5)? )
                {
                Tree root_3 = (Tree)adaptor.nil();
                root_3 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_3);

                // gram/i.g:141:224: ( $c5)?
                if ( stream_c5.hasNext() ) {
                    adaptor.addChild(root_3, stream_c5.nextTree());

                }
                stream_c5.reset();

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "print_"

    public static class input__return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "input_"
    // gram/i.g:144:1: input_ : c1= comentarios 'input' c2= comentarios '(' c3= comentarios idTipo c4= comentarios ')' c5= comentarios -> ^( Input ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) idTipo ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) ) ;
    public final iParser.input__return input_() throws RecognitionException {
        iParser.input__return retval = new iParser.input__return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal133=null;
        Token char_literal134=null;
        Token char_literal136=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.comentarios_return c3 = null;

        iParser.comentarios_return c4 = null;

        iParser.comentarios_return c5 = null;

        iParser.idTipo_return idTipo135 = null;


        Tree string_literal133_tree=null;
        Tree char_literal134_tree=null;
        Tree char_literal136_tree=null;
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        RewriteRuleSubtreeStream stream_idTipo=new RewriteRuleSubtreeStream(adaptor,"rule idTipo");
        try {
            // gram/i.g:144:8: (c1= comentarios 'input' c2= comentarios '(' c3= comentarios idTipo c4= comentarios ')' c5= comentarios -> ^( Input ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) idTipo ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) ) )
            // gram/i.g:145:2: c1= comentarios 'input' c2= comentarios '(' c3= comentarios idTipo c4= comentarios ')' c5= comentarios
            {
            pushFollow(FOLLOW_comentarios_in_input_1834);
            c1=comentarios();

            state._fsp--;

            stream_comentarios.add(c1.getTree());
            string_literal133=(Token)match(input,119,FOLLOW_119_in_input_1836);  
            stream_119.add(string_literal133);

            pushFollow(FOLLOW_comentarios_in_input_1840);
            c2=comentarios();

            state._fsp--;

            stream_comentarios.add(c2.getTree());
            char_literal134=(Token)match(input,101,FOLLOW_101_in_input_1842);  
            stream_101.add(char_literal134);

            pushFollow(FOLLOW_comentarios_in_input_1846);
            c3=comentarios();

            state._fsp--;

            stream_comentarios.add(c3.getTree());
            pushFollow(FOLLOW_idTipo_in_input_1848);
            idTipo135=idTipo();

            state._fsp--;

            stream_idTipo.add(idTipo135.getTree());
            pushFollow(FOLLOW_comentarios_in_input_1852);
            c4=comentarios();

            state._fsp--;

            stream_comentarios.add(c4.getTree());
            char_literal136=(Token)match(input,103,FOLLOW_103_in_input_1854);  
            stream_103.add(char_literal136);

            pushFollow(FOLLOW_comentarios_in_input_1858);
            c5=comentarios();

            state._fsp--;

            stream_comentarios.add(c5.getTree());


            // AST REWRITE
            // elements: c5, c4, c2, idTipo, c1, c3
            // token labels: 
            // rule labels: retval, c1, c2, c5, c4, c3
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);
            RewriteRuleSubtreeStream stream_c5=new RewriteRuleSubtreeStream(adaptor,"rule c5",c5!=null?c5.tree:null);
            RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.tree:null);
            RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 145:100: -> ^( Input ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) idTipo ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) )
            {
                // gram/i.g:145:103: ^( Input ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) idTipo ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Input, "Input"), root_1);

                // gram/i.g:145:111: ^( Comentarios ( $c1)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:145:125: ( $c1)?
                if ( stream_c1.hasNext() ) {
                    adaptor.addChild(root_2, stream_c1.nextTree());

                }
                stream_c1.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:145:131: ^( Comentarios ( $c2)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:145:145: ( $c2)?
                if ( stream_c2.hasNext() ) {
                    adaptor.addChild(root_2, stream_c2.nextTree());

                }
                stream_c2.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:145:151: ^( Comentarios ( $c3)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:145:165: ( $c3)?
                if ( stream_c3.hasNext() ) {
                    adaptor.addChild(root_2, stream_c3.nextTree());

                }
                stream_c3.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_idTipo.nextTree());
                // gram/i.g:145:178: ^( Comentarios ( $c4)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:145:192: ( $c4)?
                if ( stream_c4.hasNext() ) {
                    adaptor.addChild(root_2, stream_c4.nextTree());

                }
                stream_c4.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:145:198: ^( Comentarios ( $c5)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:145:212: ( $c5)?
                if ( stream_c5.hasNext() ) {
                    adaptor.addChild(root_2, stream_c5.nextTree());

                }
                stream_c5.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "input_"

    public static class parametros_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parametros"
    // gram/i.g:148:1: parametros : parametro ( ',' parametro )* -> ( parametro )+ ;
    public final iParser.parametros_return parametros() throws RecognitionException {
        iParser.parametros_return retval = new iParser.parametros_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal138=null;
        iParser.parametro_return parametro137 = null;

        iParser.parametro_return parametro139 = null;


        Tree char_literal138_tree=null;
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_parametro=new RewriteRuleSubtreeStream(adaptor,"rule parametro");
        try {
            // gram/i.g:148:12: ( parametro ( ',' parametro )* -> ( parametro )+ )
            // gram/i.g:149:2: parametro ( ',' parametro )*
            {
            pushFollow(FOLLOW_parametro_in_parametros1917);
            parametro137=parametro();

            state._fsp--;

            stream_parametro.add(parametro137.getTree());
            // gram/i.g:149:12: ( ',' parametro )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==102) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // gram/i.g:149:14: ',' parametro
            	    {
            	    char_literal138=(Token)match(input,102,FOLLOW_102_in_parametros1921);  
            	    stream_102.add(char_literal138);

            	    pushFollow(FOLLOW_parametro_in_parametros1923);
            	    parametro139=parametro();

            	    state._fsp--;

            	    stream_parametro.add(parametro139.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);



            // AST REWRITE
            // elements: parametro
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 149:30: -> ( parametro )+
            {
                if ( !(stream_parametro.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_parametro.hasNext() ) {
                    adaptor.addChild(root_0, stream_parametro.nextTree());

                }
                stream_parametro.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parametros"

    public static class parametro_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parametro"
    // gram/i.g:152:1: parametro : c1= comentarios expressao c2= comentarios -> ^( Parametro ^( Comentarios ( $c1)? ) expressao ^( Comentarios ( $c2)? ) ) ;
    public final iParser.parametro_return parametro() throws RecognitionException {
        iParser.parametro_return retval = new iParser.parametro_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.expressao_return expressao140 = null;


        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // gram/i.g:152:11: (c1= comentarios expressao c2= comentarios -> ^( Parametro ^( Comentarios ( $c1)? ) expressao ^( Comentarios ( $c2)? ) ) )
            // gram/i.g:153:2: c1= comentarios expressao c2= comentarios
            {
            pushFollow(FOLLOW_comentarios_in_parametro1944);
            c1=comentarios();

            state._fsp--;

            stream_comentarios.add(c1.getTree());
            pushFollow(FOLLOW_expressao_in_parametro1946);
            expressao140=expressao();

            state._fsp--;

            stream_expressao.add(expressao140.getTree());
            pushFollow(FOLLOW_comentarios_in_parametro1950);
            c2=comentarios();

            state._fsp--;

            stream_comentarios.add(c2.getTree());


            // AST REWRITE
            // elements: c1, c2, expressao
            // token labels: 
            // rule labels: retval, c1, c2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 153:42: -> ^( Parametro ^( Comentarios ( $c1)? ) expressao ^( Comentarios ( $c2)? ) )
            {
                // gram/i.g:153:45: ^( Parametro ^( Comentarios ( $c1)? ) expressao ^( Comentarios ( $c2)? ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Parametro, "Parametro"), root_1);

                // gram/i.g:153:57: ^( Comentarios ( $c1)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:153:71: ( $c1)?
                if ( stream_c1.hasNext() ) {
                    adaptor.addChild(root_2, stream_c1.nextTree());

                }
                stream_c1.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_expressao.nextTree());
                // gram/i.g:153:87: ^( Comentarios ( $c2)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:153:101: ( $c2)?
                if ( stream_c2.hasNext() ) {
                    adaptor.addChild(root_2, stream_c2.nextTree());

                }
                stream_c2.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parametro"

    public static class blocoCodigo_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blocoCodigo"
    // gram/i.g:156:1: blocoCodigo : '{' ( codigo )* '}' -> ^( SeqInstrucao ( codigo )* ) ;
    public final iParser.blocoCodigo_return blocoCodigo() throws RecognitionException {
        iParser.blocoCodigo_return retval = new iParser.blocoCodigo_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal141=null;
        Token char_literal143=null;
        iParser.codigo_return codigo142 = null;


        Tree char_literal141_tree=null;
        Tree char_literal143_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleSubtreeStream stream_codigo=new RewriteRuleSubtreeStream(adaptor,"rule codigo");
        try {
            // gram/i.g:156:13: ( '{' ( codigo )* '}' -> ^( SeqInstrucao ( codigo )* ) )
            // gram/i.g:157:2: '{' ( codigo )* '}'
            {
            char_literal141=(Token)match(input,120,FOLLOW_120_in_blocoCodigo1985);  
            stream_120.add(char_literal141);

            // gram/i.g:157:6: ( codigo )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=ID && LA20_0<=COMENTARIO_LINHAS)||(LA20_0>=94 && LA20_0<=98)||LA20_0==113||(LA20_0>=115 && LA20_0<=118)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // gram/i.g:157:6: codigo
            	    {
            	    pushFollow(FOLLOW_codigo_in_blocoCodigo1987);
            	    codigo142=codigo();

            	    state._fsp--;

            	    stream_codigo.add(codigo142.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            char_literal143=(Token)match(input,121,FOLLOW_121_in_blocoCodigo1990);  
            stream_121.add(char_literal143);



            // AST REWRITE
            // elements: codigo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 157:18: -> ^( SeqInstrucao ( codigo )* )
            {
                // gram/i.g:157:21: ^( SeqInstrucao ( codigo )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(SeqInstrucao, "SeqInstrucao"), root_1);

                // gram/i.g:157:36: ( codigo )*
                while ( stream_codigo.hasNext() ) {
                    adaptor.addChild(root_1, stream_codigo.nextTree());

                }
                stream_codigo.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "blocoCodigo"

    public static class codigo_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "codigo"
    // gram/i.g:160:1: codigo : ( atribuicao ';' -> atribuicao | declaracao ';' -> declaracao | instrucao -> instrucao ) ;
    public final iParser.codigo_return codigo() throws RecognitionException {
        iParser.codigo_return retval = new iParser.codigo_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal145=null;
        Token char_literal147=null;
        iParser.atribuicao_return atribuicao144 = null;

        iParser.declaracao_return declaracao146 = null;

        iParser.instrucao_return instrucao148 = null;


        Tree char_literal145_tree=null;
        Tree char_literal147_tree=null;
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleSubtreeStream stream_atribuicao=new RewriteRuleSubtreeStream(adaptor,"rule atribuicao");
        RewriteRuleSubtreeStream stream_declaracao=new RewriteRuleSubtreeStream(adaptor,"rule declaracao");
        RewriteRuleSubtreeStream stream_instrucao=new RewriteRuleSubtreeStream(adaptor,"rule instrucao");
        try {
            // gram/i.g:160:8: ( ( atribuicao ';' -> atribuicao | declaracao ';' -> declaracao | instrucao -> instrucao ) )
            // gram/i.g:161:2: ( atribuicao ';' -> atribuicao | declaracao ';' -> declaracao | instrucao -> instrucao )
            {
            // gram/i.g:161:2: ( atribuicao ';' -> atribuicao | declaracao ';' -> declaracao | instrucao -> instrucao )
            int alt21=3;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // gram/i.g:161:4: atribuicao ';'
                    {
                    pushFollow(FOLLOW_atribuicao_in_codigo2012);
                    atribuicao144=atribuicao();

                    state._fsp--;

                    stream_atribuicao.add(atribuicao144.getTree());
                    char_literal145=(Token)match(input,99,FOLLOW_99_in_codigo2014);  
                    stream_99.add(char_literal145);



                    // AST REWRITE
                    // elements: atribuicao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 161:19: -> atribuicao
                    {
                        adaptor.addChild(root_0, stream_atribuicao.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:162:4: declaracao ';'
                    {
                    pushFollow(FOLLOW_declaracao_in_codigo2023);
                    declaracao146=declaracao();

                    state._fsp--;

                    stream_declaracao.add(declaracao146.getTree());
                    char_literal147=(Token)match(input,99,FOLLOW_99_in_codigo2025);  
                    stream_99.add(char_literal147);



                    // AST REWRITE
                    // elements: declaracao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 162:19: -> declaracao
                    {
                        adaptor.addChild(root_0, stream_declaracao.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // gram/i.g:163:4: instrucao
                    {
                    pushFollow(FOLLOW_instrucao_in_codigo2034);
                    instrucao148=instrucao();

                    state._fsp--;

                    stream_instrucao.add(instrucao148.getTree());


                    // AST REWRITE
                    // elements: instrucao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 163:14: -> instrucao
                    {
                        adaptor.addChild(root_0, stream_instrucao.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "codigo"

    public static class condicao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condicao"
    // gram/i.g:170:1: condicao : condicao_ou (c1= comentarios '?' c2= comentarios expressao c3= comentarios ':' c4= comentarios condicao -> ^( Condicional condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) condicao ) | -> condicao_ou ) ;
    public final iParser.condicao_return condicao() throws RecognitionException {
        iParser.condicao_return retval = new iParser.condicao_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal150=null;
        Token char_literal152=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.comentarios_return c3 = null;

        iParser.comentarios_return c4 = null;

        iParser.condicao_ou_return condicao_ou149 = null;

        iParser.expressao_return expressao151 = null;

        iParser.condicao_return condicao153 = null;


        Tree char_literal150_tree=null;
        Tree char_literal152_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleSubtreeStream stream_condicao_ou=new RewriteRuleSubtreeStream(adaptor,"rule condicao_ou");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        RewriteRuleSubtreeStream stream_condicao=new RewriteRuleSubtreeStream(adaptor,"rule condicao");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // gram/i.g:170:11: ( condicao_ou (c1= comentarios '?' c2= comentarios expressao c3= comentarios ':' c4= comentarios condicao -> ^( Condicional condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) condicao ) | -> condicao_ou ) )
            // gram/i.g:171:2: condicao_ou (c1= comentarios '?' c2= comentarios expressao c3= comentarios ':' c4= comentarios condicao -> ^( Condicional condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) condicao ) | -> condicao_ou )
            {
            pushFollow(FOLLOW_condicao_ou_in_condicao2056);
            condicao_ou149=condicao_ou();

            state._fsp--;

            stream_condicao_ou.add(condicao_ou149.getTree());
            // gram/i.g:171:14: (c1= comentarios '?' c2= comentarios expressao c3= comentarios ':' c4= comentarios condicao -> ^( Condicional condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) condicao ) | -> condicao_ou )
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // gram/i.g:171:16: c1= comentarios '?' c2= comentarios expressao c3= comentarios ':' c4= comentarios condicao
                    {
                    pushFollow(FOLLOW_comentarios_in_condicao2062);
                    c1=comentarios();

                    state._fsp--;

                    stream_comentarios.add(c1.getTree());
                    char_literal150=(Token)match(input,122,FOLLOW_122_in_condicao2064);  
                    stream_122.add(char_literal150);

                    pushFollow(FOLLOW_comentarios_in_condicao2068);
                    c2=comentarios();

                    state._fsp--;

                    stream_comentarios.add(c2.getTree());
                    pushFollow(FOLLOW_expressao_in_condicao2070);
                    expressao151=expressao();

                    state._fsp--;

                    stream_expressao.add(expressao151.getTree());
                    pushFollow(FOLLOW_comentarios_in_condicao2074);
                    c3=comentarios();

                    state._fsp--;

                    stream_comentarios.add(c3.getTree());
                    char_literal152=(Token)match(input,123,FOLLOW_123_in_condicao2076);  
                    stream_123.add(char_literal152);

                    pushFollow(FOLLOW_comentarios_in_condicao2080);
                    c4=comentarios();

                    state._fsp--;

                    stream_comentarios.add(c4.getTree());
                    pushFollow(FOLLOW_condicao_in_condicao2082);
                    condicao153=condicao();

                    state._fsp--;

                    stream_condicao.add(condicao153.getTree());


                    // AST REWRITE
                    // elements: c4, c3, expressao, condicao, condicao_ou, c2, c1
                    // token labels: 
                    // rule labels: retval, c1, c2, c4, c3
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
                    RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);
                    RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.tree:null);
                    RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 171:103: -> ^( Condicional condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) condicao )
                    {
                        // gram/i.g:171:106: ^( Condicional condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) condicao )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Condicional, "Condicional"), root_1);

                        adaptor.addChild(root_1, stream_condicao_ou.nextTree());
                        // gram/i.g:171:132: ^( Comentarios ( $c1)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:171:146: ( $c1)?
                        if ( stream_c1.hasNext() ) {
                            adaptor.addChild(root_2, stream_c1.nextTree());

                        }
                        stream_c1.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // gram/i.g:171:152: ^( Comentarios ( $c2)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:171:166: ( $c2)?
                        if ( stream_c2.hasNext() ) {
                            adaptor.addChild(root_2, stream_c2.nextTree());

                        }
                        stream_c2.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_expressao.nextTree());
                        // gram/i.g:171:182: ^( Comentarios ( $c3)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:171:196: ( $c3)?
                        if ( stream_c3.hasNext() ) {
                            adaptor.addChild(root_2, stream_c3.nextTree());

                        }
                        stream_c3.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // gram/i.g:171:202: ^( Comentarios ( $c4)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:171:216: ( $c4)?
                        if ( stream_c4.hasNext() ) {
                            adaptor.addChild(root_2, stream_c4.nextTree());

                        }
                        stream_c4.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_condicao.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:172:7: 
                    {

                    // AST REWRITE
                    // elements: condicao_ou
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 172:7: -> condicao_ou
                    {
                        adaptor.addChild(root_0, stream_condicao_ou.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condicao"

    public static class condicao_ou_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condicao_ou"
    // gram/i.g:176:1: condicao_ou : ( condicao_e -> condicao_e ) (c1= comentarios '||' c2= comentarios c= condicao_e -> ^( Ou $condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )* ;
    public final iParser.condicao_ou_return condicao_ou() throws RecognitionException {
        iParser.condicao_ou_return retval = new iParser.condicao_ou_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal155=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.condicao_e_return c = null;

        iParser.condicao_e_return condicao_e154 = null;


        Tree string_literal155_tree=null;
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleSubtreeStream stream_condicao_e=new RewriteRuleSubtreeStream(adaptor,"rule condicao_e");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        try {
            // gram/i.g:176:13: ( ( condicao_e -> condicao_e ) (c1= comentarios '||' c2= comentarios c= condicao_e -> ^( Ou $condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )* )
            // gram/i.g:177:2: ( condicao_e -> condicao_e ) (c1= comentarios '||' c2= comentarios c= condicao_e -> ^( Ou $condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )*
            {
            // gram/i.g:177:2: ( condicao_e -> condicao_e )
            // gram/i.g:177:3: condicao_e
            {
            pushFollow(FOLLOW_condicao_e_in_condicao_ou2154);
            condicao_e154=condicao_e();

            state._fsp--;

            stream_condicao_e.add(condicao_e154.getTree());


            // AST REWRITE
            // elements: condicao_e
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 177:14: -> condicao_e
            {
                adaptor.addChild(root_0, stream_condicao_e.nextTree());

            }

            retval.tree = root_0;
            }

            // gram/i.g:177:29: (c1= comentarios '||' c2= comentarios c= condicao_e -> ^( Ou $condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )*
            loop23:
            do {
                int alt23=2;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // gram/i.g:177:31: c1= comentarios '||' c2= comentarios c= condicao_e
            	    {
            	    pushFollow(FOLLOW_comentarios_in_condicao_ou2165);
            	    c1=comentarios();

            	    state._fsp--;

            	    stream_comentarios.add(c1.getTree());
            	    string_literal155=(Token)match(input,124,FOLLOW_124_in_condicao_ou2167);  
            	    stream_124.add(string_literal155);

            	    pushFollow(FOLLOW_comentarios_in_condicao_ou2171);
            	    c2=comentarios();

            	    state._fsp--;

            	    stream_comentarios.add(c2.getTree());
            	    pushFollow(FOLLOW_condicao_e_in_condicao_ou2175);
            	    c=condicao_e();

            	    state._fsp--;

            	    stream_condicao_e.add(c.getTree());


            	    // AST REWRITE
            	    // elements: c, condicao_ou, c2, c1
            	    // token labels: 
            	    // rule labels: retval, c1, c2, c
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            	    RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);
            	    RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);

            	    root_0 = (Tree)adaptor.nil();
            	    // 177:79: -> ^( Ou $condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c)
            	    {
            	        // gram/i.g:177:82: ^( Ou $condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c)
            	        {
            	        Tree root_1 = (Tree)adaptor.nil();
            	        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Ou, "Ou"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        // gram/i.g:177:100: ^( Comentarios ( $c1)? )
            	        {
            	        Tree root_2 = (Tree)adaptor.nil();
            	        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	        // gram/i.g:177:114: ( $c1)?
            	        if ( stream_c1.hasNext() ) {
            	            adaptor.addChild(root_2, stream_c1.nextTree());

            	        }
            	        stream_c1.reset();

            	        adaptor.addChild(root_1, root_2);
            	        }
            	        // gram/i.g:177:120: ^( Comentarios ( $c2)? )
            	        {
            	        Tree root_2 = (Tree)adaptor.nil();
            	        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	        // gram/i.g:177:134: ( $c2)?
            	        if ( stream_c2.hasNext() ) {
            	            adaptor.addChild(root_2, stream_c2.nextTree());

            	        }
            	        stream_c2.reset();

            	        adaptor.addChild(root_1, root_2);
            	        }
            	        adaptor.addChild(root_1, stream_c.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condicao_ou"

    public static class condicao_e_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condicao_e"
    // gram/i.g:180:1: condicao_e : ( condicao_comparacao -> condicao_comparacao ) (c1= comentarios '&&' c2= comentarios c= condicao_comparacao -> ^( E $condicao_e ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )* ;
    public final iParser.condicao_e_return condicao_e() throws RecognitionException {
        iParser.condicao_e_return retval = new iParser.condicao_e_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal157=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.condicao_comparacao_return c = null;

        iParser.condicao_comparacao_return condicao_comparacao156 = null;


        Tree string_literal157_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        RewriteRuleSubtreeStream stream_condicao_comparacao=new RewriteRuleSubtreeStream(adaptor,"rule condicao_comparacao");
        try {
            // gram/i.g:180:12: ( ( condicao_comparacao -> condicao_comparacao ) (c1= comentarios '&&' c2= comentarios c= condicao_comparacao -> ^( E $condicao_e ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )* )
            // gram/i.g:181:2: ( condicao_comparacao -> condicao_comparacao ) (c1= comentarios '&&' c2= comentarios c= condicao_comparacao -> ^( E $condicao_e ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )*
            {
            // gram/i.g:181:2: ( condicao_comparacao -> condicao_comparacao )
            // gram/i.g:181:3: condicao_comparacao
            {
            pushFollow(FOLLOW_condicao_comparacao_in_condicao_e2219);
            condicao_comparacao156=condicao_comparacao();

            state._fsp--;

            stream_condicao_comparacao.add(condicao_comparacao156.getTree());


            // AST REWRITE
            // elements: condicao_comparacao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 181:23: -> condicao_comparacao
            {
                adaptor.addChild(root_0, stream_condicao_comparacao.nextTree());

            }

            retval.tree = root_0;
            }

            // gram/i.g:181:47: (c1= comentarios '&&' c2= comentarios c= condicao_comparacao -> ^( E $condicao_e ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )*
            loop24:
            do {
                int alt24=2;
                alt24 = dfa24.predict(input);
                switch (alt24) {
            	case 1 :
            	    // gram/i.g:181:49: c1= comentarios '&&' c2= comentarios c= condicao_comparacao
            	    {
            	    pushFollow(FOLLOW_comentarios_in_condicao_e2230);
            	    c1=comentarios();

            	    state._fsp--;

            	    stream_comentarios.add(c1.getTree());
            	    string_literal157=(Token)match(input,125,FOLLOW_125_in_condicao_e2232);  
            	    stream_125.add(string_literal157);

            	    pushFollow(FOLLOW_comentarios_in_condicao_e2236);
            	    c2=comentarios();

            	    state._fsp--;

            	    stream_comentarios.add(c2.getTree());
            	    pushFollow(FOLLOW_condicao_comparacao_in_condicao_e2240);
            	    c=condicao_comparacao();

            	    state._fsp--;

            	    stream_condicao_comparacao.add(c.getTree());


            	    // AST REWRITE
            	    // elements: c1, c2, c, condicao_e
            	    // token labels: 
            	    // rule labels: retval, c1, c, c2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            	    RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);
            	    RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            	    root_0 = (Tree)adaptor.nil();
            	    // 181:106: -> ^( E $condicao_e ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c)
            	    {
            	        // gram/i.g:181:109: ^( E $condicao_e ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c)
            	        {
            	        Tree root_1 = (Tree)adaptor.nil();
            	        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(E, "E"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        // gram/i.g:181:125: ^( Comentarios ( $c1)? )
            	        {
            	        Tree root_2 = (Tree)adaptor.nil();
            	        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	        // gram/i.g:181:139: ( $c1)?
            	        if ( stream_c1.hasNext() ) {
            	            adaptor.addChild(root_2, stream_c1.nextTree());

            	        }
            	        stream_c1.reset();

            	        adaptor.addChild(root_1, root_2);
            	        }
            	        // gram/i.g:181:145: ^( Comentarios ( $c2)? )
            	        {
            	        Tree root_2 = (Tree)adaptor.nil();
            	        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	        // gram/i.g:181:159: ( $c2)?
            	        if ( stream_c2.hasNext() ) {
            	            adaptor.addChild(root_2, stream_c2.nextTree());

            	        }
            	        stream_c2.reset();

            	        adaptor.addChild(root_1, root_2);
            	        }
            	        adaptor.addChild(root_1, stream_c.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condicao_e"

    public static class condicao_comparacao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condicao_comparacao"
    // gram/i.g:184:1: condicao_comparacao : ( condicao_igualdade -> condicao_igualdade ) (c1= comentarios ( '>' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Maior ) ^( Comentarios ( $c2)? ) $c) | '<' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Menor ) ^( Comentarios ( $c2)? ) $c) | '>=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MaiorQ ) ^( Comentarios ( $c2)? ) $c) | '<=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MenorQ ) ^( Comentarios ( $c2)? ) $c) ) )* ;
    public final iParser.condicao_comparacao_return condicao_comparacao() throws RecognitionException {
        iParser.condicao_comparacao_return retval = new iParser.condicao_comparacao_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal159=null;
        Token char_literal160=null;
        Token string_literal161=null;
        Token string_literal162=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.condicao_igualdade_return c = null;

        iParser.condicao_igualdade_return condicao_igualdade158 = null;


        Tree char_literal159_tree=null;
        Tree char_literal160_tree=null;
        Tree string_literal161_tree=null;
        Tree string_literal162_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_condicao_igualdade=new RewriteRuleSubtreeStream(adaptor,"rule condicao_igualdade");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        try {
            // gram/i.g:184:21: ( ( condicao_igualdade -> condicao_igualdade ) (c1= comentarios ( '>' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Maior ) ^( Comentarios ( $c2)? ) $c) | '<' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Menor ) ^( Comentarios ( $c2)? ) $c) | '>=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MaiorQ ) ^( Comentarios ( $c2)? ) $c) | '<=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MenorQ ) ^( Comentarios ( $c2)? ) $c) ) )* )
            // gram/i.g:185:2: ( condicao_igualdade -> condicao_igualdade ) (c1= comentarios ( '>' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Maior ) ^( Comentarios ( $c2)? ) $c) | '<' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Menor ) ^( Comentarios ( $c2)? ) $c) | '>=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MaiorQ ) ^( Comentarios ( $c2)? ) $c) | '<=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MenorQ ) ^( Comentarios ( $c2)? ) $c) ) )*
            {
            // gram/i.g:185:2: ( condicao_igualdade -> condicao_igualdade )
            // gram/i.g:185:3: condicao_igualdade
            {
            pushFollow(FOLLOW_condicao_igualdade_in_condicao_comparacao2284);
            condicao_igualdade158=condicao_igualdade();

            state._fsp--;

            stream_condicao_igualdade.add(condicao_igualdade158.getTree());


            // AST REWRITE
            // elements: condicao_igualdade
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 185:22: -> condicao_igualdade
            {
                adaptor.addChild(root_0, stream_condicao_igualdade.nextTree());

            }

            retval.tree = root_0;
            }

            // gram/i.g:185:46: (c1= comentarios ( '>' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Maior ) ^( Comentarios ( $c2)? ) $c) | '<' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Menor ) ^( Comentarios ( $c2)? ) $c) | '>=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MaiorQ ) ^( Comentarios ( $c2)? ) $c) | '<=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MenorQ ) ^( Comentarios ( $c2)? ) $c) ) )*
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // gram/i.g:185:48: c1= comentarios ( '>' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Maior ) ^( Comentarios ( $c2)? ) $c) | '<' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Menor ) ^( Comentarios ( $c2)? ) $c) | '>=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MaiorQ ) ^( Comentarios ( $c2)? ) $c) | '<=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MenorQ ) ^( Comentarios ( $c2)? ) $c) )
            	    {
            	    pushFollow(FOLLOW_comentarios_in_condicao_comparacao2296);
            	    c1=comentarios();

            	    state._fsp--;

            	    stream_comentarios.add(c1.getTree());
            	    // gram/i.g:185:63: ( '>' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Maior ) ^( Comentarios ( $c2)? ) $c) | '<' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Menor ) ^( Comentarios ( $c2)? ) $c) | '>=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MaiorQ ) ^( Comentarios ( $c2)? ) $c) | '<=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MenorQ ) ^( Comentarios ( $c2)? ) $c) )
            	    int alt25=4;
            	    switch ( input.LA(1) ) {
            	    case 110:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case 111:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case 108:
            	        {
            	        alt25=3;
            	        }
            	        break;
            	    case 109:
            	        {
            	        alt25=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt25) {
            	        case 1 :
            	            // gram/i.g:185:65: '>' c2= comentarios c= condicao_igualdade
            	            {
            	            char_literal159=(Token)match(input,110,FOLLOW_110_in_condicao_comparacao2300);  
            	            stream_110.add(char_literal159);

            	            pushFollow(FOLLOW_comentarios_in_condicao_comparacao2304);
            	            c2=comentarios();

            	            state._fsp--;

            	            stream_comentarios.add(c2.getTree());
            	            pushFollow(FOLLOW_condicao_igualdade_in_condicao_comparacao2308);
            	            c=condicao_igualdade();

            	            state._fsp--;

            	            stream_condicao_igualdade.add(c.getTree());


            	            // AST REWRITE
            	            // elements: c1, c, c2, condicao_comparacao
            	            // token labels: 
            	            // rule labels: retval, c1, c2, c
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            	            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);
            	            RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 185:105: -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Maior ) ^( Comentarios ( $c2)? ) $c)
            	            {
            	                // gram/i.g:185:108: ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Maior ) ^( Comentarios ( $c2)? ) $c)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comp, "Comp"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:185:136: ^( Comentarios ( $c1)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:185:150: ( $c1)?
            	                if ( stream_c1.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c1.nextTree());

            	                }
            	                stream_c1.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:185:156: ^( Maior )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Maior, "Maior"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:185:165: ^( Comentarios ( $c2)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:185:179: ( $c2)?
            	                if ( stream_c2.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c2.nextTree());

            	                }
            	                stream_c2.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_c.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;
            	        case 2 :
            	            // gram/i.g:186:20: '<' c2= comentarios c= condicao_igualdade
            	            {
            	            char_literal160=(Token)match(input,111,FOLLOW_111_in_condicao_comparacao2362);  
            	            stream_111.add(char_literal160);

            	            pushFollow(FOLLOW_comentarios_in_condicao_comparacao2366);
            	            c2=comentarios();

            	            state._fsp--;

            	            stream_comentarios.add(c2.getTree());
            	            pushFollow(FOLLOW_condicao_igualdade_in_condicao_comparacao2370);
            	            c=condicao_igualdade();

            	            state._fsp--;

            	            stream_condicao_igualdade.add(c.getTree());


            	            // AST REWRITE
            	            // elements: c, c2, condicao_comparacao, c1
            	            // token labels: 
            	            // rule labels: retval, c1, c2, c
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            	            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);
            	            RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 186:60: -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Menor ) ^( Comentarios ( $c2)? ) $c)
            	            {
            	                // gram/i.g:186:63: ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Menor ) ^( Comentarios ( $c2)? ) $c)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comp, "Comp"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:186:91: ^( Comentarios ( $c1)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:186:105: ( $c1)?
            	                if ( stream_c1.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c1.nextTree());

            	                }
            	                stream_c1.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:186:111: ^( Menor )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Menor, "Menor"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:186:120: ^( Comentarios ( $c2)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:186:134: ( $c2)?
            	                if ( stream_c2.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c2.nextTree());

            	                }
            	                stream_c2.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_c.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;
            	        case 3 :
            	            // gram/i.g:187:20: '>=' c2= comentarios c= condicao_igualdade
            	            {
            	            string_literal161=(Token)match(input,108,FOLLOW_108_in_condicao_comparacao2424);  
            	            stream_108.add(string_literal161);

            	            pushFollow(FOLLOW_comentarios_in_condicao_comparacao2428);
            	            c2=comentarios();

            	            state._fsp--;

            	            stream_comentarios.add(c2.getTree());
            	            pushFollow(FOLLOW_condicao_igualdade_in_condicao_comparacao2432);
            	            c=condicao_igualdade();

            	            state._fsp--;

            	            stream_condicao_igualdade.add(c.getTree());


            	            // AST REWRITE
            	            // elements: c2, c1, c, condicao_comparacao
            	            // token labels: 
            	            // rule labels: retval, c1, c, c2
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            	            RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);
            	            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 187:61: -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MaiorQ ) ^( Comentarios ( $c2)? ) $c)
            	            {
            	                // gram/i.g:187:64: ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MaiorQ ) ^( Comentarios ( $c2)? ) $c)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comp, "Comp"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:187:92: ^( Comentarios ( $c1)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:187:106: ( $c1)?
            	                if ( stream_c1.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c1.nextTree());

            	                }
            	                stream_c1.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:187:112: ^( MaiorQ )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(MaiorQ, "MaiorQ"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:187:122: ^( Comentarios ( $c2)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:187:136: ( $c2)?
            	                if ( stream_c2.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c2.nextTree());

            	                }
            	                stream_c2.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_c.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;
            	        case 4 :
            	            // gram/i.g:188:20: '<=' c2= comentarios c= condicao_igualdade
            	            {
            	            string_literal162=(Token)match(input,109,FOLLOW_109_in_condicao_comparacao2486);  
            	            stream_109.add(string_literal162);

            	            pushFollow(FOLLOW_comentarios_in_condicao_comparacao2490);
            	            c2=comentarios();

            	            state._fsp--;

            	            stream_comentarios.add(c2.getTree());
            	            pushFollow(FOLLOW_condicao_igualdade_in_condicao_comparacao2494);
            	            c=condicao_igualdade();

            	            state._fsp--;

            	            stream_condicao_igualdade.add(c.getTree());


            	            // AST REWRITE
            	            // elements: c2, condicao_comparacao, c1, c
            	            // token labels: 
            	            // rule labels: retval, c1, c, c2
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            	            RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);
            	            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 188:61: -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MenorQ ) ^( Comentarios ( $c2)? ) $c)
            	            {
            	                // gram/i.g:188:64: ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MenorQ ) ^( Comentarios ( $c2)? ) $c)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comp, "Comp"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:188:92: ^( Comentarios ( $c1)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:188:106: ( $c1)?
            	                if ( stream_c1.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c1.nextTree());

            	                }
            	                stream_c1.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:188:112: ^( MenorQ )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(MenorQ, "MenorQ"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:188:122: ^( Comentarios ( $c2)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:188:136: ( $c2)?
            	                if ( stream_c2.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c2.nextTree());

            	                }
            	                stream_c2.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_c.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condicao_comparacao"

    public static class condicao_igualdade_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condicao_igualdade"
    // gram/i.g:193:1: condicao_igualdade : ( expressao -> expressao ) (c1= comentarios ( '!=' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c1)? ) ^( Dif ) ^( Comentarios ( $c2)? ) $e) | '==' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c2)? ) ^( Igual ) ^( Comentarios ( $c2)? ) $e) ) )* ;
    public final iParser.condicao_igualdade_return condicao_igualdade() throws RecognitionException {
        iParser.condicao_igualdade_return retval = new iParser.condicao_igualdade_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal164=null;
        Token string_literal165=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.expressao_return e = null;

        iParser.expressao_return expressao163 = null;


        Tree string_literal164_tree=null;
        Tree string_literal165_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // gram/i.g:193:20: ( ( expressao -> expressao ) (c1= comentarios ( '!=' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c1)? ) ^( Dif ) ^( Comentarios ( $c2)? ) $e) | '==' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c2)? ) ^( Igual ) ^( Comentarios ( $c2)? ) $e) ) )* )
            // gram/i.g:194:2: ( expressao -> expressao ) (c1= comentarios ( '!=' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c1)? ) ^( Dif ) ^( Comentarios ( $c2)? ) $e) | '==' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c2)? ) ^( Igual ) ^( Comentarios ( $c2)? ) $e) ) )*
            {
            // gram/i.g:194:2: ( expressao -> expressao )
            // gram/i.g:194:3: expressao
            {
            pushFollow(FOLLOW_expressao_in_condicao_igualdade2573);
            expressao163=expressao();

            state._fsp--;

            stream_expressao.add(expressao163.getTree());


            // AST REWRITE
            // elements: expressao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 194:13: -> expressao
            {
                adaptor.addChild(root_0, stream_expressao.nextTree());

            }

            retval.tree = root_0;
            }

            // gram/i.g:194:27: (c1= comentarios ( '!=' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c1)? ) ^( Dif ) ^( Comentarios ( $c2)? ) $e) | '==' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c2)? ) ^( Igual ) ^( Comentarios ( $c2)? ) $e) ) )*
            loop28:
            do {
                int alt28=2;
                alt28 = dfa28.predict(input);
                switch (alt28) {
            	case 1 :
            	    // gram/i.g:194:29: c1= comentarios ( '!=' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c1)? ) ^( Dif ) ^( Comentarios ( $c2)? ) $e) | '==' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c2)? ) ^( Igual ) ^( Comentarios ( $c2)? ) $e) )
            	    {
            	    pushFollow(FOLLOW_comentarios_in_condicao_igualdade2584);
            	    c1=comentarios();

            	    state._fsp--;

            	    stream_comentarios.add(c1.getTree());
            	    // gram/i.g:194:44: ( '!=' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c1)? ) ^( Dif ) ^( Comentarios ( $c2)? ) $e) | '==' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c2)? ) ^( Igual ) ^( Comentarios ( $c2)? ) $e) )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==126) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==107) ) {
            	        alt27=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // gram/i.g:194:46: '!=' c2= comentarios e= expressao
            	            {
            	            string_literal164=(Token)match(input,126,FOLLOW_126_in_condicao_igualdade2588);  
            	            stream_126.add(string_literal164);

            	            pushFollow(FOLLOW_comentarios_in_condicao_igualdade2592);
            	            c2=comentarios();

            	            state._fsp--;

            	            stream_comentarios.add(c2.getTree());
            	            pushFollow(FOLLOW_expressao_in_condicao_igualdade2596);
            	            e=expressao();

            	            state._fsp--;

            	            stream_expressao.add(e.getTree());


            	            // AST REWRITE
            	            // elements: c1, condicao_igualdade, c2, e
            	            // token labels: 
            	            // rule labels: retval, e, c1, c2
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);
            	            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            	            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 194:78: -> ^( Comp $condicao_igualdade ^( Comentarios ( $c1)? ) ^( Dif ) ^( Comentarios ( $c2)? ) $e)
            	            {
            	                // gram/i.g:194:81: ^( Comp $condicao_igualdade ^( Comentarios ( $c1)? ) ^( Dif ) ^( Comentarios ( $c2)? ) $e)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comp, "Comp"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:194:108: ^( Comentarios ( $c1)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:194:122: ( $c1)?
            	                if ( stream_c1.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c1.nextTree());

            	                }
            	                stream_c1.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:194:128: ^( Dif )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Dif, "Dif"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:194:135: ^( Comentarios ( $c2)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:194:149: ( $c2)?
            	                if ( stream_c2.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c2.nextTree());

            	                }
            	                stream_c2.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_e.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;
            	        case 2 :
            	            // gram/i.g:195:16: '==' c2= comentarios e= expressao
            	            {
            	            string_literal165=(Token)match(input,107,FOLLOW_107_in_condicao_igualdade2646);  
            	            stream_107.add(string_literal165);

            	            pushFollow(FOLLOW_comentarios_in_condicao_igualdade2650);
            	            c2=comentarios();

            	            state._fsp--;

            	            stream_comentarios.add(c2.getTree());
            	            pushFollow(FOLLOW_expressao_in_condicao_igualdade2654);
            	            e=expressao();

            	            state._fsp--;

            	            stream_expressao.add(e.getTree());


            	            // AST REWRITE
            	            // elements: condicao_igualdade, e, c2, c2
            	            // token labels: 
            	            // rule labels: retval, e, c2
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);
            	            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 195:48: -> ^( Comp $condicao_igualdade ^( Comentarios ( $c2)? ) ^( Igual ) ^( Comentarios ( $c2)? ) $e)
            	            {
            	                // gram/i.g:195:51: ^( Comp $condicao_igualdade ^( Comentarios ( $c2)? ) ^( Igual ) ^( Comentarios ( $c2)? ) $e)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comp, "Comp"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:195:78: ^( Comentarios ( $c2)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:195:92: ( $c2)?
            	                if ( stream_c2.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c2.nextTree());

            	                }
            	                stream_c2.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:195:98: ^( Igual )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Igual, "Igual"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:195:107: ^( Comentarios ( $c2)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:195:121: ( $c2)?
            	                if ( stream_c2.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c2.nextTree());

            	                }
            	                stream_c2.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_e.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condicao_igualdade"

    public static class atribuicao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atribuicao"
    // gram/i.g:202:1: atribuicao : c1= comentarios ID c2= comentarios opAtribuicao c3= comentarios condicao c4= comentarios -> ^( Atribuicao ^( Comentarios ( $c1)? ) ID ^( Comentarios ( $c2)? ) opAtribuicao ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ) ;
    public final iParser.atribuicao_return atribuicao() throws RecognitionException {
        iParser.atribuicao_return retval = new iParser.atribuicao_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID166=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.comentarios_return c3 = null;

        iParser.comentarios_return c4 = null;

        iParser.opAtribuicao_return opAtribuicao167 = null;

        iParser.condicao_return condicao168 = null;


        Tree ID166_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        RewriteRuleSubtreeStream stream_condicao=new RewriteRuleSubtreeStream(adaptor,"rule condicao");
        RewriteRuleSubtreeStream stream_opAtribuicao=new RewriteRuleSubtreeStream(adaptor,"rule opAtribuicao");
        try {
            // gram/i.g:202:12: (c1= comentarios ID c2= comentarios opAtribuicao c3= comentarios condicao c4= comentarios -> ^( Atribuicao ^( Comentarios ( $c1)? ) ID ^( Comentarios ( $c2)? ) opAtribuicao ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ) )
            // gram/i.g:203:2: c1= comentarios ID c2= comentarios opAtribuicao c3= comentarios condicao c4= comentarios
            {
            pushFollow(FOLLOW_comentarios_in_atribuicao2728);
            c1=comentarios();

            state._fsp--;

            stream_comentarios.add(c1.getTree());
            ID166=(Token)match(input,ID,FOLLOW_ID_in_atribuicao2730);  
            stream_ID.add(ID166);

            pushFollow(FOLLOW_comentarios_in_atribuicao2734);
            c2=comentarios();

            state._fsp--;

            stream_comentarios.add(c2.getTree());
            pushFollow(FOLLOW_opAtribuicao_in_atribuicao2736);
            opAtribuicao167=opAtribuicao();

            state._fsp--;

            stream_opAtribuicao.add(opAtribuicao167.getTree());
            pushFollow(FOLLOW_comentarios_in_atribuicao2740);
            c3=comentarios();

            state._fsp--;

            stream_comentarios.add(c3.getTree());
            pushFollow(FOLLOW_condicao_in_atribuicao2742);
            condicao168=condicao();

            state._fsp--;

            stream_condicao.add(condicao168.getTree());
            pushFollow(FOLLOW_comentarios_in_atribuicao2746);
            c4=comentarios();

            state._fsp--;

            stream_comentarios.add(c4.getTree());


            // AST REWRITE
            // elements: c4, c2, c3, c1, opAtribuicao, condicao, ID
            // token labels: 
            // rule labels: retval, c1, c2, c4, c3
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);
            RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.tree:null);
            RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 203:87: -> ^( Atribuicao ^( Comentarios ( $c1)? ) ID ^( Comentarios ( $c2)? ) opAtribuicao ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) )
            {
                // gram/i.g:203:90: ^( Atribuicao ^( Comentarios ( $c1)? ) ID ^( Comentarios ( $c2)? ) opAtribuicao ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Atribuicao, "Atribuicao"), root_1);

                // gram/i.g:203:103: ^( Comentarios ( $c1)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:203:117: ( $c1)?
                if ( stream_c1.hasNext() ) {
                    adaptor.addChild(root_2, stream_c1.nextTree());

                }
                stream_c1.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_ID.nextNode());
                // gram/i.g:203:126: ^( Comentarios ( $c2)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:203:140: ( $c2)?
                if ( stream_c2.hasNext() ) {
                    adaptor.addChild(root_2, stream_c2.nextTree());

                }
                stream_c2.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_opAtribuicao.nextTree());
                // gram/i.g:203:159: ^( Comentarios ( $c3)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:203:173: ( $c3)?
                if ( stream_c3.hasNext() ) {
                    adaptor.addChild(root_2, stream_c3.nextTree());

                }
                stream_c3.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_condicao.nextTree());
                // gram/i.g:203:188: ^( Comentarios ( $c4)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:203:202: ( $c4)?
                if ( stream_c4.hasNext() ) {
                    adaptor.addChild(root_2, stream_c4.nextTree());

                }
                stream_c4.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atribuicao"

    public static class opAtribuicao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "opAtribuicao"
    // gram/i.g:206:1: opAtribuicao : ( '=' -> ^( Atrib ) | '*=' -> ^( Mult ) | '/=' -> ^( Div ) | '+=' -> ^( Soma ) | '-=' -> ^( Sub ) ) ;
    public final iParser.opAtribuicao_return opAtribuicao() throws RecognitionException {
        iParser.opAtribuicao_return retval = new iParser.opAtribuicao_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal169=null;
        Token string_literal170=null;
        Token string_literal171=null;
        Token string_literal172=null;
        Token string_literal173=null;

        Tree char_literal169_tree=null;
        Tree string_literal170_tree=null;
        Tree string_literal171_tree=null;
        Tree string_literal172_tree=null;
        Tree string_literal173_tree=null;
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");

        try {
            // gram/i.g:206:14: ( ( '=' -> ^( Atrib ) | '*=' -> ^( Mult ) | '/=' -> ^( Div ) | '+=' -> ^( Soma ) | '-=' -> ^( Sub ) ) )
            // gram/i.g:207:2: ( '=' -> ^( Atrib ) | '*=' -> ^( Mult ) | '/=' -> ^( Div ) | '+=' -> ^( Soma ) | '-=' -> ^( Sub ) )
            {
            // gram/i.g:207:2: ( '=' -> ^( Atrib ) | '*=' -> ^( Mult ) | '/=' -> ^( Div ) | '+=' -> ^( Soma ) | '-=' -> ^( Sub ) )
            int alt29=5;
            switch ( input.LA(1) ) {
            case 112:
                {
                alt29=1;
                }
                break;
            case 127:
                {
                alt29=2;
                }
                break;
            case 128:
                {
                alt29=3;
                }
                break;
            case 129:
                {
                alt29=4;
                }
                break;
            case 130:
                {
                alt29=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // gram/i.g:207:4: '='
                    {
                    char_literal169=(Token)match(input,112,FOLLOW_112_in_opAtribuicao2803);  
                    stream_112.add(char_literal169);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 207:8: -> ^( Atrib )
                    {
                        // gram/i.g:207:11: ^( Atrib )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Atrib, "Atrib"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:208:4: '*='
                    {
                    string_literal170=(Token)match(input,127,FOLLOW_127_in_opAtribuicao2814);  
                    stream_127.add(string_literal170);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 208:9: -> ^( Mult )
                    {
                        // gram/i.g:208:12: ^( Mult )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Mult, "Mult"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // gram/i.g:209:4: '/='
                    {
                    string_literal171=(Token)match(input,128,FOLLOW_128_in_opAtribuicao2825);  
                    stream_128.add(string_literal171);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 209:9: -> ^( Div )
                    {
                        // gram/i.g:209:12: ^( Div )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Div, "Div"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // gram/i.g:210:4: '+='
                    {
                    string_literal172=(Token)match(input,129,FOLLOW_129_in_opAtribuicao2836);  
                    stream_129.add(string_literal172);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 210:9: -> ^( Soma )
                    {
                        // gram/i.g:210:12: ^( Soma )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Soma, "Soma"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // gram/i.g:211:4: '-='
                    {
                    string_literal173=(Token)match(input,130,FOLLOW_130_in_opAtribuicao2847);  
                    stream_130.add(string_literal173);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 211:9: -> ^( Sub )
                    {
                        // gram/i.g:211:12: ^( Sub )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Sub, "Sub"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "opAtribuicao"

    public static class expressao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressao"
    // gram/i.g:217:1: expressao : ( expressaoNum -> expressaoNum ) (c1= comentarios ( '+' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Mais ) ^( Comentarios ( $c2)? ) $e) | '-' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Menos ) ^( Comentarios ( $c2)? ) $e) ) )* ;
    public final iParser.expressao_return expressao() throws RecognitionException {
        iParser.expressao_return retval = new iParser.expressao_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal175=null;
        Token char_literal176=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.expressaoNum_return e = null;

        iParser.expressaoNum_return expressaoNum174 = null;


        Tree char_literal175_tree=null;
        Tree char_literal176_tree=null;
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        RewriteRuleSubtreeStream stream_expressaoNum=new RewriteRuleSubtreeStream(adaptor,"rule expressaoNum");
        try {
            // gram/i.g:217:11: ( ( expressaoNum -> expressaoNum ) (c1= comentarios ( '+' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Mais ) ^( Comentarios ( $c2)? ) $e) | '-' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Menos ) ^( Comentarios ( $c2)? ) $e) ) )* )
            // gram/i.g:218:2: ( expressaoNum -> expressaoNum ) (c1= comentarios ( '+' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Mais ) ^( Comentarios ( $c2)? ) $e) | '-' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Menos ) ^( Comentarios ( $c2)? ) $e) ) )*
            {
            // gram/i.g:218:2: ( expressaoNum -> expressaoNum )
            // gram/i.g:218:3: expressaoNum
            {
            pushFollow(FOLLOW_expressaoNum_in_expressao2870);
            expressaoNum174=expressaoNum();

            state._fsp--;

            stream_expressaoNum.add(expressaoNum174.getTree());


            // AST REWRITE
            // elements: expressaoNum
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 218:16: -> expressaoNum
            {
                adaptor.addChild(root_0, stream_expressaoNum.nextTree());

            }

            retval.tree = root_0;
            }

            // gram/i.g:218:33: (c1= comentarios ( '+' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Mais ) ^( Comentarios ( $c2)? ) $e) | '-' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Menos ) ^( Comentarios ( $c2)? ) $e) ) )*
            loop31:
            do {
                int alt31=2;
                alt31 = dfa31.predict(input);
                switch (alt31) {
            	case 1 :
            	    // gram/i.g:218:35: c1= comentarios ( '+' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Mais ) ^( Comentarios ( $c2)? ) $e) | '-' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Menos ) ^( Comentarios ( $c2)? ) $e) )
            	    {
            	    pushFollow(FOLLOW_comentarios_in_expressao2881);
            	    c1=comentarios();

            	    state._fsp--;

            	    stream_comentarios.add(c1.getTree());
            	    // gram/i.g:218:50: ( '+' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Mais ) ^( Comentarios ( $c2)? ) $e) | '-' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Menos ) ^( Comentarios ( $c2)? ) $e) )
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==131) ) {
            	        alt30=1;
            	    }
            	    else if ( (LA30_0==132) ) {
            	        alt30=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // gram/i.g:218:52: '+' c2= comentarios e= expressaoNum
            	            {
            	            char_literal175=(Token)match(input,131,FOLLOW_131_in_expressao2885);  
            	            stream_131.add(char_literal175);

            	            pushFollow(FOLLOW_comentarios_in_expressao2889);
            	            c2=comentarios();

            	            state._fsp--;

            	            stream_comentarios.add(c2.getTree());
            	            pushFollow(FOLLOW_expressaoNum_in_expressao2893);
            	            e=expressaoNum();

            	            state._fsp--;

            	            stream_expressaoNum.add(e.getTree());


            	            // AST REWRITE
            	            // elements: c2, c1, expressao, e
            	            // token labels: 
            	            // rule labels: retval, e, c1, c2
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);
            	            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            	            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 218:86: -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Mais ) ^( Comentarios ( $c2)? ) $e)
            	            {
            	                // gram/i.g:218:89: ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Mais ) ^( Comentarios ( $c2)? ) $e)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpNum, "ExpNum"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:218:109: ^( Comentarios ( $c1)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:218:123: ( $c1)?
            	                if ( stream_c1.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c1.nextTree());

            	                }
            	                stream_c1.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:218:129: ^( Mais )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Mais, "Mais"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:218:137: ^( Comentarios ( $c2)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:218:151: ( $c2)?
            	                if ( stream_c2.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c2.nextTree());

            	                }
            	                stream_c2.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_e.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;
            	        case 2 :
            	            // gram/i.g:219:17: '-' c2= comentarios e= expressaoNum
            	            {
            	            char_literal176=(Token)match(input,132,FOLLOW_132_in_expressao2944);  
            	            stream_132.add(char_literal176);

            	            pushFollow(FOLLOW_comentarios_in_expressao2948);
            	            c2=comentarios();

            	            state._fsp--;

            	            stream_comentarios.add(c2.getTree());
            	            pushFollow(FOLLOW_expressaoNum_in_expressao2952);
            	            e=expressaoNum();

            	            state._fsp--;

            	            stream_expressaoNum.add(e.getTree());


            	            // AST REWRITE
            	            // elements: c2, expressao, e, c1
            	            // token labels: 
            	            // rule labels: retval, e, c1, c2
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);
            	            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            	            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 219:51: -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Menos ) ^( Comentarios ( $c2)? ) $e)
            	            {
            	                // gram/i.g:219:54: ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Menos ) ^( Comentarios ( $c2)? ) $e)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpNum, "ExpNum"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:219:74: ^( Comentarios ( $c1)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:219:88: ( $c1)?
            	                if ( stream_c1.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c1.nextTree());

            	                }
            	                stream_c1.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:219:94: ^( Menos )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Menos, "Menos"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:219:103: ^( Comentarios ( $c2)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:219:117: ( $c2)?
            	                if ( stream_c2.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c2.nextTree());

            	                }
            	                stream_c2.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_e.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressao"

    public static class expressaoNum_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressaoNum"
    // gram/i.g:224:1: expressaoNum : ( oper -> oper ) (c1= comentarios ( '*' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Vezes ) ^( Comentarios ( $c2)? ) $o) | '/' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Divide ) ^( Comentarios ( $c2)? ) $o) | '%' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Mod ) ^( Comentarios ( $c2)? ) $o) ) )* ;
    public final iParser.expressaoNum_return expressaoNum() throws RecognitionException {
        iParser.expressaoNum_return retval = new iParser.expressaoNum_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal178=null;
        Token char_literal179=null;
        Token char_literal180=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.oper_return o = null;

        iParser.oper_return oper177 = null;


        Tree char_literal178_tree=null;
        Tree char_literal179_tree=null;
        Tree char_literal180_tree=null;
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleSubtreeStream stream_oper=new RewriteRuleSubtreeStream(adaptor,"rule oper");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        try {
            // gram/i.g:224:14: ( ( oper -> oper ) (c1= comentarios ( '*' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Vezes ) ^( Comentarios ( $c2)? ) $o) | '/' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Divide ) ^( Comentarios ( $c2)? ) $o) | '%' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Mod ) ^( Comentarios ( $c2)? ) $o) ) )* )
            // gram/i.g:225:2: ( oper -> oper ) (c1= comentarios ( '*' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Vezes ) ^( Comentarios ( $c2)? ) $o) | '/' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Divide ) ^( Comentarios ( $c2)? ) $o) | '%' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Mod ) ^( Comentarios ( $c2)? ) $o) ) )*
            {
            // gram/i.g:225:2: ( oper -> oper )
            // gram/i.g:225:3: oper
            {
            pushFollow(FOLLOW_oper_in_expressaoNum3025);
            oper177=oper();

            state._fsp--;

            stream_oper.add(oper177.getTree());


            // AST REWRITE
            // elements: oper
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 225:8: -> oper
            {
                adaptor.addChild(root_0, stream_oper.nextTree());

            }

            retval.tree = root_0;
            }

            // gram/i.g:225:17: (c1= comentarios ( '*' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Vezes ) ^( Comentarios ( $c2)? ) $o) | '/' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Divide ) ^( Comentarios ( $c2)? ) $o) | '%' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Mod ) ^( Comentarios ( $c2)? ) $o) ) )*
            loop33:
            do {
                int alt33=2;
                alt33 = dfa33.predict(input);
                switch (alt33) {
            	case 1 :
            	    // gram/i.g:225:19: c1= comentarios ( '*' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Vezes ) ^( Comentarios ( $c2)? ) $o) | '/' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Divide ) ^( Comentarios ( $c2)? ) $o) | '%' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Mod ) ^( Comentarios ( $c2)? ) $o) )
            	    {
            	    pushFollow(FOLLOW_comentarios_in_expressaoNum3036);
            	    c1=comentarios();

            	    state._fsp--;

            	    stream_comentarios.add(c1.getTree());
            	    // gram/i.g:225:34: ( '*' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Vezes ) ^( Comentarios ( $c2)? ) $o) | '/' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Divide ) ^( Comentarios ( $c2)? ) $o) | '%' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Mod ) ^( Comentarios ( $c2)? ) $o) )
            	    int alt32=3;
            	    switch ( input.LA(1) ) {
            	    case 133:
            	        {
            	        alt32=1;
            	        }
            	        break;
            	    case 134:
            	        {
            	        alt32=2;
            	        }
            	        break;
            	    case 135:
            	        {
            	        alt32=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt32) {
            	        case 1 :
            	            // gram/i.g:225:36: '*' c2= comentarios o= oper
            	            {
            	            char_literal178=(Token)match(input,133,FOLLOW_133_in_expressaoNum3040);  
            	            stream_133.add(char_literal178);

            	            pushFollow(FOLLOW_comentarios_in_expressaoNum3044);
            	            c2=comentarios();

            	            state._fsp--;

            	            stream_comentarios.add(c2.getTree());
            	            pushFollow(FOLLOW_oper_in_expressaoNum3048);
            	            o=oper();

            	            state._fsp--;

            	            stream_oper.add(o.getTree());


            	            // AST REWRITE
            	            // elements: c2, o, c1, expressaoNum
            	            // token labels: 
            	            // rule labels: retval, c1, c2, o
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            	            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);
            	            RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 225:62: -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Vezes ) ^( Comentarios ( $c2)? ) $o)
            	            {
            	                // gram/i.g:225:65: ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Vezes ) ^( Comentarios ( $c2)? ) $o)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpNum, "ExpNum"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:225:88: ^( Comentarios ( $c1)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:225:102: ( $c1)?
            	                if ( stream_c1.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c1.nextTree());

            	                }
            	                stream_c1.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:225:108: ^( Vezes )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Vezes, "Vezes"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:225:117: ^( Comentarios ( $c2)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:225:131: ( $c2)?
            	                if ( stream_c2.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c2.nextTree());

            	                }
            	                stream_c2.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_o.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;
            	        case 2 :
            	            // gram/i.g:226:12: '/' c2= comentarios o= oper
            	            {
            	            char_literal179=(Token)match(input,134,FOLLOW_134_in_expressaoNum3094);  
            	            stream_134.add(char_literal179);

            	            pushFollow(FOLLOW_comentarios_in_expressaoNum3098);
            	            c2=comentarios();

            	            state._fsp--;

            	            stream_comentarios.add(c2.getTree());
            	            pushFollow(FOLLOW_oper_in_expressaoNum3102);
            	            o=oper();

            	            state._fsp--;

            	            stream_oper.add(o.getTree());


            	            // AST REWRITE
            	            // elements: o, c2, expressaoNum, c1
            	            // token labels: 
            	            // rule labels: retval, c1, c2, o
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            	            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);
            	            RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 226:38: -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Divide ) ^( Comentarios ( $c2)? ) $o)
            	            {
            	                // gram/i.g:226:41: ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Divide ) ^( Comentarios ( $c2)? ) $o)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpNum, "ExpNum"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:226:64: ^( Comentarios ( $c1)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:226:78: ( $c1)?
            	                if ( stream_c1.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c1.nextTree());

            	                }
            	                stream_c1.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:226:84: ^( Divide )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Divide, "Divide"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:226:94: ^( Comentarios ( $c2)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:226:108: ( $c2)?
            	                if ( stream_c2.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c2.nextTree());

            	                }
            	                stream_c2.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_o.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;
            	        case 3 :
            	            // gram/i.g:227:12: '%' c2= comentarios o= oper
            	            {
            	            char_literal180=(Token)match(input,135,FOLLOW_135_in_expressaoNum3148);  
            	            stream_135.add(char_literal180);

            	            pushFollow(FOLLOW_comentarios_in_expressaoNum3152);
            	            c2=comentarios();

            	            state._fsp--;

            	            stream_comentarios.add(c2.getTree());
            	            pushFollow(FOLLOW_oper_in_expressaoNum3156);
            	            o=oper();

            	            state._fsp--;

            	            stream_oper.add(o.getTree());


            	            // AST REWRITE
            	            // elements: expressaoNum, c2, c1, o
            	            // token labels: 
            	            // rule labels: retval, c1, c2, o
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            	            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);
            	            RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 227:38: -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Mod ) ^( Comentarios ( $c2)? ) $o)
            	            {
            	                // gram/i.g:227:41: ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Mod ) ^( Comentarios ( $c2)? ) $o)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpNum, "ExpNum"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:227:64: ^( Comentarios ( $c1)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:227:78: ( $c1)?
            	                if ( stream_c1.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c1.nextTree());

            	                }
            	                stream_c1.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:227:84: ^( Mod )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Mod, "Mod"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:227:91: ^( Comentarios ( $c2)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:227:105: ( $c2)?
            	                if ( stream_c2.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c2.nextTree());

            	                }
            	                stream_c2.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_o.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressaoNum"

    public static class oper_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oper"
    // gram/i.g:232:1: oper : ( opUnario ID -> ^( opUnario ^( Id ID ) ) | opUnario tipo -> ^( opUnario tipo ) | tipo -> tipo | ID -> ^( Id ID ) | incOp ID -> ^( IncAntes incOp ID ) | ID incOp -> ^( IncDepois incOp ID ) | call -> call | input_ -> input_ ) ;
    public final iParser.oper_return oper() throws RecognitionException {
        iParser.oper_return retval = new iParser.oper_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID182=null;
        Token ID186=null;
        Token ID188=null;
        Token ID189=null;
        iParser.opUnario_return opUnario181 = null;

        iParser.opUnario_return opUnario183 = null;

        iParser.tipo_return tipo184 = null;

        iParser.tipo_return tipo185 = null;

        iParser.incOp_return incOp187 = null;

        iParser.incOp_return incOp190 = null;

        iParser.call_return call191 = null;

        iParser.input__return input_192 = null;


        Tree ID182_tree=null;
        Tree ID186_tree=null;
        Tree ID188_tree=null;
        Tree ID189_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_opUnario=new RewriteRuleSubtreeStream(adaptor,"rule opUnario");
        RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
        RewriteRuleSubtreeStream stream_incOp=new RewriteRuleSubtreeStream(adaptor,"rule incOp");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        RewriteRuleSubtreeStream stream_input_=new RewriteRuleSubtreeStream(adaptor,"rule input_");
        try {
            // gram/i.g:232:6: ( ( opUnario ID -> ^( opUnario ^( Id ID ) ) | opUnario tipo -> ^( opUnario tipo ) | tipo -> tipo | ID -> ^( Id ID ) | incOp ID -> ^( IncAntes incOp ID ) | ID incOp -> ^( IncDepois incOp ID ) | call -> call | input_ -> input_ ) )
            // gram/i.g:233:2: ( opUnario ID -> ^( opUnario ^( Id ID ) ) | opUnario tipo -> ^( opUnario tipo ) | tipo -> tipo | ID -> ^( Id ID ) | incOp ID -> ^( IncAntes incOp ID ) | ID incOp -> ^( IncDepois incOp ID ) | call -> call | input_ -> input_ )
            {
            // gram/i.g:233:2: ( opUnario ID -> ^( opUnario ^( Id ID ) ) | opUnario tipo -> ^( opUnario tipo ) | tipo -> tipo | ID -> ^( Id ID ) | incOp ID -> ^( IncAntes incOp ID ) | ID incOp -> ^( IncDepois incOp ID ) | call -> call | input_ -> input_ )
            int alt34=8;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // gram/i.g:233:4: opUnario ID
                    {
                    pushFollow(FOLLOW_opUnario_in_oper3221);
                    opUnario181=opUnario();

                    state._fsp--;

                    stream_opUnario.add(opUnario181.getTree());
                    ID182=(Token)match(input,ID,FOLLOW_ID_in_oper3223);  
                    stream_ID.add(ID182);



                    // AST REWRITE
                    // elements: ID, opUnario
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 233:16: -> ^( opUnario ^( Id ID ) )
                    {
                        // gram/i.g:233:19: ^( opUnario ^( Id ID ) )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(stream_opUnario.nextNode(), root_1);

                        // gram/i.g:233:30: ^( Id ID )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Id, "Id"), root_2);

                        adaptor.addChild(root_2, stream_ID.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:234:4: opUnario tipo
                    {
                    pushFollow(FOLLOW_opUnario_in_oper3240);
                    opUnario183=opUnario();

                    state._fsp--;

                    stream_opUnario.add(opUnario183.getTree());
                    pushFollow(FOLLOW_tipo_in_oper3242);
                    tipo184=tipo();

                    state._fsp--;

                    stream_tipo.add(tipo184.getTree());


                    // AST REWRITE
                    // elements: opUnario, tipo
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 234:18: -> ^( opUnario tipo )
                    {
                        // gram/i.g:234:21: ^( opUnario tipo )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(stream_opUnario.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_tipo.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // gram/i.g:235:4: tipo
                    {
                    pushFollow(FOLLOW_tipo_in_oper3255);
                    tipo185=tipo();

                    state._fsp--;

                    stream_tipo.add(tipo185.getTree());


                    // AST REWRITE
                    // elements: tipo
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 235:9: -> tipo
                    {
                        adaptor.addChild(root_0, stream_tipo.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // gram/i.g:236:4: ID
                    {
                    ID186=(Token)match(input,ID,FOLLOW_ID_in_oper3264);  
                    stream_ID.add(ID186);



                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 236:7: -> ^( Id ID )
                    {
                        // gram/i.g:236:10: ^( Id ID )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Id, "Id"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // gram/i.g:237:4: incOp ID
                    {
                    pushFollow(FOLLOW_incOp_in_oper3277);
                    incOp187=incOp();

                    state._fsp--;

                    stream_incOp.add(incOp187.getTree());
                    ID188=(Token)match(input,ID,FOLLOW_ID_in_oper3279);  
                    stream_ID.add(ID188);



                    // AST REWRITE
                    // elements: incOp, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 237:13: -> ^( IncAntes incOp ID )
                    {
                        // gram/i.g:237:16: ^( IncAntes incOp ID )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(IncAntes, "IncAntes"), root_1);

                        adaptor.addChild(root_1, stream_incOp.nextTree());
                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // gram/i.g:238:4: ID incOp
                    {
                    ID189=(Token)match(input,ID,FOLLOW_ID_in_oper3294);  
                    stream_ID.add(ID189);

                    pushFollow(FOLLOW_incOp_in_oper3296);
                    incOp190=incOp();

                    state._fsp--;

                    stream_incOp.add(incOp190.getTree());


                    // AST REWRITE
                    // elements: incOp, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 238:13: -> ^( IncDepois incOp ID )
                    {
                        // gram/i.g:238:16: ^( IncDepois incOp ID )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(IncDepois, "IncDepois"), root_1);

                        adaptor.addChild(root_1, stream_incOp.nextTree());
                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // gram/i.g:239:4: call
                    {
                    pushFollow(FOLLOW_call_in_oper3311);
                    call191=call();

                    state._fsp--;

                    stream_call.add(call191.getTree());


                    // AST REWRITE
                    // elements: call
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 239:9: -> call
                    {
                        adaptor.addChild(root_0, stream_call.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // gram/i.g:240:4: input_
                    {
                    pushFollow(FOLLOW_input__in_oper3320);
                    input_192=input_();

                    state._fsp--;

                    stream_input_.add(input_192.getTree());


                    // AST REWRITE
                    // elements: input_
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 240:11: -> input_
                    {
                        adaptor.addChild(root_0, stream_input_.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "oper"

    public static class incOp_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incOp"
    // gram/i.g:244:1: incOp : ( '++' -> ^( Inc ) | '--' -> ^( Dec ) ) ;
    public final iParser.incOp_return incOp() throws RecognitionException {
        iParser.incOp_return retval = new iParser.incOp_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal193=null;
        Token string_literal194=null;

        Tree string_literal193_tree=null;
        Tree string_literal194_tree=null;
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");

        try {
            // gram/i.g:244:7: ( ( '++' -> ^( Inc ) | '--' -> ^( Dec ) ) )
            // gram/i.g:245:2: ( '++' -> ^( Inc ) | '--' -> ^( Dec ) )
            {
            // gram/i.g:245:2: ( '++' -> ^( Inc ) | '--' -> ^( Dec ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==136) ) {
                alt35=1;
            }
            else if ( (LA35_0==137) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // gram/i.g:245:4: '++'
                    {
                    string_literal193=(Token)match(input,136,FOLLOW_136_in_incOp3340);  
                    stream_136.add(string_literal193);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 245:9: -> ^( Inc )
                    {
                        // gram/i.g:245:12: ^( Inc )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Inc, "Inc"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:245:21: '--'
                    {
                    string_literal194=(Token)match(input,137,FOLLOW_137_in_incOp3350);  
                    stream_137.add(string_literal194);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 245:26: -> ^( Dec )
                    {
                        // gram/i.g:245:29: ^( Dec )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Dec, "Dec"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "incOp"

    public static class opUnario_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "opUnario"
    // gram/i.g:248:1: opUnario : ( '+' -> ^( Pos ) | '-' -> ^( Neg ) | '!' -> ^( Nao ) ) ;
    public final iParser.opUnario_return opUnario() throws RecognitionException {
        iParser.opUnario_return retval = new iParser.opUnario_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal195=null;
        Token char_literal196=null;
        Token char_literal197=null;

        Tree char_literal195_tree=null;
        Tree char_literal196_tree=null;
        Tree char_literal197_tree=null;
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");

        try {
            // gram/i.g:248:10: ( ( '+' -> ^( Pos ) | '-' -> ^( Neg ) | '!' -> ^( Nao ) ) )
            // gram/i.g:249:2: ( '+' -> ^( Pos ) | '-' -> ^( Neg ) | '!' -> ^( Nao ) )
            {
            // gram/i.g:249:2: ( '+' -> ^( Pos ) | '-' -> ^( Neg ) | '!' -> ^( Nao ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 131:
                {
                alt36=1;
                }
                break;
            case 132:
                {
                alt36=2;
                }
                break;
            case 138:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // gram/i.g:249:4: '+'
                    {
                    char_literal195=(Token)match(input,131,FOLLOW_131_in_opUnario3370);  
                    stream_131.add(char_literal195);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 249:8: -> ^( Pos )
                    {
                        // gram/i.g:249:11: ^( Pos )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Pos, "Pos"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:250:4: '-'
                    {
                    char_literal196=(Token)match(input,132,FOLLOW_132_in_opUnario3381);  
                    stream_132.add(char_literal196);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 250:8: -> ^( Neg )
                    {
                        // gram/i.g:250:11: ^( Neg )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Neg, "Neg"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // gram/i.g:251:4: '!'
                    {
                    char_literal197=(Token)match(input,138,FOLLOW_138_in_opUnario3392);  
                    stream_138.add(char_literal197);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 251:8: -> ^( Nao )
                    {
                        // gram/i.g:251:11: ^( Nao )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Nao, "Nao"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "opUnario"

    public static class boolean__return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_"
    // gram/i.g:255:1: boolean_ : ( 'true' -> ^( True ) | 'false' -> ^( False ) ) ;
    public final iParser.boolean__return boolean_() throws RecognitionException {
        iParser.boolean__return retval = new iParser.boolean__return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal198=null;
        Token string_literal199=null;

        Tree string_literal198_tree=null;
        Tree string_literal199_tree=null;
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");

        try {
            // gram/i.g:255:10: ( ( 'true' -> ^( True ) | 'false' -> ^( False ) ) )
            // gram/i.g:255:12: ( 'true' -> ^( True ) | 'false' -> ^( False ) )
            {
            // gram/i.g:255:12: ( 'true' -> ^( True ) | 'false' -> ^( False ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==105) ) {
                alt37=1;
            }
            else if ( (LA37_0==106) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // gram/i.g:255:13: 'true'
                    {
                    string_literal198=(Token)match(input,105,FOLLOW_105_in_boolean_3412);  
                    stream_105.add(string_literal198);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 255:20: -> ^( True )
                    {
                        // gram/i.g:255:23: ^( True )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(True, "True"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:255:33: 'false'
                    {
                    string_literal199=(Token)match(input,106,FOLLOW_106_in_boolean_3422);  
                    stream_106.add(string_literal199);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 255:41: -> ^( False )
                    {
                        // gram/i.g:255:44: ^( False )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(False, "False"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "boolean_"

    public static class comentarios_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comentarios"
    // gram/i.g:259:1: comentarios : ( ( comentario )* -> ( comentario )* ) ;
    public final iParser.comentarios_return comentarios() throws RecognitionException {
        iParser.comentarios_return retval = new iParser.comentarios_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        iParser.comentario_return comentario200 = null;


        RewriteRuleSubtreeStream stream_comentario=new RewriteRuleSubtreeStream(adaptor,"rule comentario");
        try {
            // gram/i.g:259:13: ( ( ( comentario )* -> ( comentario )* ) )
            // gram/i.g:260:2: ( ( comentario )* -> ( comentario )* )
            {
            // gram/i.g:260:2: ( ( comentario )* -> ( comentario )* )
            // gram/i.g:260:4: ( comentario )*
            {
            // gram/i.g:260:4: ( comentario )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==COMENTARIO_LINHA) ) {
                    alt38=1;
                }
                else if ( (LA38_0==COMENTARIO_LINHAS) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // gram/i.g:260:4: comentario
            	    {
            	    pushFollow(FOLLOW_comentario_in_comentarios3444);
            	    comentario200=comentario();

            	    state._fsp--;

            	    stream_comentario.add(comentario200.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);



            // AST REWRITE
            // elements: comentario
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 260:16: -> ( comentario )*
            {
                // gram/i.g:260:19: ( comentario )*
                while ( stream_comentario.hasNext() ) {
                    adaptor.addChild(root_0, stream_comentario.nextTree());

                }
                stream_comentario.reset();

            }

            retval.tree = root_0;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comentarios"

    public static class comentario_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comentario"
    // gram/i.g:265:1: comentario : ( COMENTARIO_LINHA -> ^( Comentario COMENTARIO_LINHA ) | COMENTARIO_LINHAS -> ^( Comentario COMENTARIO_LINHAS ) ) ;
    public final iParser.comentario_return comentario() throws RecognitionException {
        iParser.comentario_return retval = new iParser.comentario_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token COMENTARIO_LINHA201=null;
        Token COMENTARIO_LINHAS202=null;

        Tree COMENTARIO_LINHA201_tree=null;
        Tree COMENTARIO_LINHAS202_tree=null;
        RewriteRuleTokenStream stream_COMENTARIO_LINHA=new RewriteRuleTokenStream(adaptor,"token COMENTARIO_LINHA");
        RewriteRuleTokenStream stream_COMENTARIO_LINHAS=new RewriteRuleTokenStream(adaptor,"token COMENTARIO_LINHAS");

        try {
            // gram/i.g:265:12: ( ( COMENTARIO_LINHA -> ^( Comentario COMENTARIO_LINHA ) | COMENTARIO_LINHAS -> ^( Comentario COMENTARIO_LINHAS ) ) )
            // gram/i.g:266:2: ( COMENTARIO_LINHA -> ^( Comentario COMENTARIO_LINHA ) | COMENTARIO_LINHAS -> ^( Comentario COMENTARIO_LINHAS ) )
            {
            // gram/i.g:266:2: ( COMENTARIO_LINHA -> ^( Comentario COMENTARIO_LINHA ) | COMENTARIO_LINHAS -> ^( Comentario COMENTARIO_LINHAS ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==COMENTARIO_LINHA) ) {
                alt39=1;
            }
            else if ( (LA39_0==COMENTARIO_LINHAS) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // gram/i.g:266:4: COMENTARIO_LINHA
                    {
                    COMENTARIO_LINHA201=(Token)match(input,COMENTARIO_LINHA,FOLLOW_COMENTARIO_LINHA_in_comentario3467);  
                    stream_COMENTARIO_LINHA.add(COMENTARIO_LINHA201);



                    // AST REWRITE
                    // elements: COMENTARIO_LINHA
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 266:21: -> ^( Comentario COMENTARIO_LINHA )
                    {
                        // gram/i.g:266:24: ^( Comentario COMENTARIO_LINHA )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentario, "Comentario"), root_1);

                        adaptor.addChild(root_1, stream_COMENTARIO_LINHA.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:267:4: COMENTARIO_LINHAS
                    {
                    COMENTARIO_LINHAS202=(Token)match(input,COMENTARIO_LINHAS,FOLLOW_COMENTARIO_LINHAS_in_comentario3480);  
                    stream_COMENTARIO_LINHAS.add(COMENTARIO_LINHAS202);



                    // AST REWRITE
                    // elements: COMENTARIO_LINHAS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 267:22: -> ^( Comentario COMENTARIO_LINHAS )
                    {
                        // gram/i.g:267:25: ^( Comentario COMENTARIO_LINHAS )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentario, "Comentario"), root_1);

                        adaptor.addChild(root_1, stream_COMENTARIO_LINHAS.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comentario"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA4_eotS =
        "\20\uffff";
    static final String DFA4_eofS =
        "\20\uffff";
    static final String DFA4_minS =
        "\3\127\5\126\1\uffff\2\126\3\127\2\uffff";
    static final String DFA4_maxS =
        "\3\144\5\130\1\uffff\2\130\3\160\2\uffff";
    static final String DFA4_acceptS =
        "\10\uffff\1\3\5\uffff\1\1\1\2";
    static final String DFA4_specialS =
        "\20\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\1\2\5\uffff\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10",
            "\1\1\1\2\5\uffff\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10",
            "\1\1\1\2\5\uffff\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10",
            "\1\13\1\11\1\12",
            "\1\13\1\11\1\12",
            "\1\13\1\11\1\12",
            "\1\13\1\11\1\12",
            "\1\13\1\11\1\12",
            "",
            "\1\13\1\11\1\12",
            "\1\13\1\11\1\12",
            "\1\14\1\15\12\uffff\1\16\1\uffff\1\17\1\16\11\uffff\1\16",
            "\1\14\1\15\12\uffff\1\16\1\uffff\1\17\1\16\11\uffff\1\16",
            "\1\14\1\15\12\uffff\1\16\1\uffff\1\17\1\16\11\uffff\1\16",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "28:2: ( declaracao ';' -> declaracao | funcao -> funcao | myassert -> myassert )";
        }
    }
    static final String DFA5_eotS =
        "\16\uffff";
    static final String DFA5_eofS =
        "\16\uffff";
    static final String DFA5_minS =
        "\3\123\3\127\1\uffff\2\127\1\uffff\4\127";
    static final String DFA5_maxS =
        "\3\152\3\147\1\uffff\2\147\1\uffff\4\147";
    static final String DFA5_acceptS =
        "\6\uffff\1\2\2\uffff\1\1\4\uffff";
    static final String DFA5_specialS =
        "\16\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\3\1\uffff\1\4\1\uffff\1\1\1\2\17\uffff\1\6\2\5",
            "\1\3\1\uffff\1\4\1\uffff\1\1\1\2\17\uffff\1\6\2\5",
            "\1\3\1\uffff\1\4\1\uffff\1\1\1\2\17\uffff\1\6\2\5",
            "\1\7\1\10\15\uffff\1\11\1\6",
            "\1\12\1\13\15\uffff\1\11\1\6",
            "\1\14\1\15\15\uffff\1\11\1\6",
            "",
            "\1\7\1\10\15\uffff\1\11\1\6",
            "\1\7\1\10\15\uffff\1\11\1\6",
            "",
            "\1\12\1\13\15\uffff\1\11\1\6",
            "\1\12\1\13\15\uffff\1\11\1\6",
            "\1\14\1\15\15\uffff\1\11\1\6",
            "\1\14\1\15\15\uffff\1\11\1\6"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "35:93: ( ( argsAssert ',' expected ) | expected )";
        }
    }
    static final String DFA6_eotS =
        "\17\uffff";
    static final String DFA6_eofS =
        "\17\uffff";
    static final String DFA6_minS =
        "\1\146\3\123\3\127\1\uffff\2\127\1\uffff\4\127";
    static final String DFA6_maxS =
        "\1\146\3\152\3\147\1\uffff\2\147\1\uffff\4\147";
    static final String DFA6_acceptS =
        "\7\uffff\1\2\2\uffff\1\1\4\uffff";
    static final String DFA6_specialS =
        "\17\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1",
            "\1\4\1\uffff\1\5\1\uffff\1\2\1\3\17\uffff\1\7\2\6",
            "\1\4\1\uffff\1\5\1\uffff\1\2\1\3\17\uffff\1\7\2\6",
            "\1\4\1\uffff\1\5\1\uffff\1\2\1\3\17\uffff\1\7\2\6",
            "\1\10\1\11\15\uffff\1\12\1\7",
            "\1\13\1\14\15\uffff\1\12\1\7",
            "\1\15\1\16\15\uffff\1\12\1\7",
            "",
            "\1\10\1\11\15\uffff\1\12\1\7",
            "\1\10\1\11\15\uffff\1\12\1\7",
            "",
            "\1\13\1\14\15\uffff\1\12\1\7",
            "\1\13\1\14\15\uffff\1\12\1\7",
            "\1\15\1\16\15\uffff\1\12\1\7",
            "\1\15\1\16\15\uffff\1\12\1\7"
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "()* loopback of 39:19: ( ',' argumentoAssert )*";
        }
    }
    static final String DFA7_eotS =
        "\6\uffff";
    static final String DFA7_eofS =
        "\6\uffff";
    static final String DFA7_minS =
        "\3\123\3\uffff";
    static final String DFA7_maxS =
        "\3\152\3\uffff";
    static final String DFA7_acceptS =
        "\3\uffff\1\1\1\2\1\3";
    static final String DFA7_specialS =
        "\6\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\3\1\uffff\1\4\1\uffff\1\1\1\2\20\uffff\2\5",
            "\1\3\1\uffff\1\4\1\uffff\1\1\1\2\20\uffff\2\5",
            "\1\3\1\uffff\1\4\1\uffff\1\1\1\2\20\uffff\2\5",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "42:1: argumentoAssert : ( comentarios INT comentarios -> ^( ArgumentoAssertInt INT ) | comentarios CHAR comentarios -> ^( ArgumentoAssertChar CHAR ) | comentarios boolean_assert comentarios -> ^( ArgumentoAssertBool boolean_assert ) );";
        }
    }
    static final String DFA8_eotS =
        "\6\uffff";
    static final String DFA8_eofS =
        "\6\uffff";
    static final String DFA8_minS =
        "\3\123\3\uffff";
    static final String DFA8_maxS =
        "\3\152\3\uffff";
    static final String DFA8_acceptS =
        "\3\uffff\1\1\1\2\1\3";
    static final String DFA8_specialS =
        "\6\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\3\1\uffff\1\3\1\uffff\1\1\1\2\17\uffff\1\5\2\4",
            "\1\3\1\uffff\1\3\1\uffff\1\1\1\2\17\uffff\1\5\2\4",
            "\1\3\1\uffff\1\3\1\uffff\1\1\1\2\17\uffff\1\5\2\4",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "48:1: expected : ( expectedVal | expectedBool | expectedComp );";
        }
    }
    static final String DFA9_eotS =
        "\5\uffff";
    static final String DFA9_eofS =
        "\5\uffff";
    static final String DFA9_minS =
        "\3\123\2\uffff";
    static final String DFA9_maxS =
        "\3\130\2\uffff";
    static final String DFA9_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA9_specialS =
        "\5\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\3\1\uffff\1\4\1\uffff\1\1\1\2",
            "\1\3\1\uffff\1\4\1\uffff\1\1\1\2",
            "\1\3\1\uffff\1\4\1\uffff\1\1\1\2",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "54:3: expectedVal : ( comentarios INT comentarios -> ^( ExpectedArgInt INT ) | comentarios CHAR comentarios -> ^( ExpectedArgChar CHAR ) );";
        }
    }
    static final String DFA11_eotS =
        "\6\uffff";
    static final String DFA11_eofS =
        "\6\uffff";
    static final String DFA11_minS =
        "\1\126\3\127\2\uffff";
    static final String DFA11_maxS =
        "\1\126\3\160\2\uffff";
    static final String DFA11_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA11_specialS =
        "\6\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1",
            "\1\2\1\3\12\uffff\1\5\2\uffff\1\5\11\uffff\1\4",
            "\1\2\1\3\12\uffff\1\5\2\uffff\1\5\11\uffff\1\4",
            "\1\2\1\3\12\uffff\1\5\2\uffff\1\5\11\uffff\1\4",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "82:2: ( ID c1= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ) Empty ^( Comentarios ) ) | ID c1= comentarios '=' c2= comentarios condicao c3= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) condicao ^( Comentarios ( $c3)? ) ) )";
        }
    }
    static final String DFA12_eotS =
        "\5\uffff";
    static final String DFA12_eofS =
        "\5\uffff";
    static final String DFA12_minS =
        "\3\127\2\uffff";
    static final String DFA12_maxS =
        "\3\147\2\uffff";
    static final String DFA12_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA12_specialS =
        "\5\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\1\2\5\uffff\5\3\4\uffff\1\4",
            "\1\1\1\2\5\uffff\5\3\4\uffff\1\4",
            "\1\1\1\2\5\uffff\5\3\4\uffff\1\4",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "88:77: ( argumentos )?";
        }
    }
    static final String DFA14_eotS =
        "\11\uffff";
    static final String DFA14_eofS =
        "\11\uffff";
    static final String DFA14_minS =
        "\3\126\6\uffff";
    static final String DFA14_maxS =
        "\3\166\6\uffff";
    static final String DFA14_acceptS =
        "\3\uffff\1\1\1\2\1\3\1\4\1\5\1\6";
    static final String DFA14_specialS =
        "\11\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\7\1\1\1\2\30\uffff\1\3\1\uffff\1\4\1\5\1\6\1\10",
            "\1\7\1\1\1\2\30\uffff\1\3\1\uffff\1\4\1\5\1\6\1\10",
            "\1\7\1\1\1\2\30\uffff\1\3\1\uffff\1\4\1\5\1\6\1\10",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "105:2: ( if_ -> if_ | for_ -> for_ | while_ -> while_ | return_ ';' -> return_ | call ';' -> ^( Exp call ) | print_ ';' -> print_ )";
        }
    }
    static final String DFA17_eotS =
        "\5\uffff";
    static final String DFA17_eofS =
        "\5\uffff";
    static final String DFA17_minS =
        "\3\126\2\uffff";
    static final String DFA17_maxS =
        "\3\142\2\uffff";
    static final String DFA17_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA17_specialS =
        "\5\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\4\1\1\1\2\5\uffff\5\3",
            "\1\4\1\1\1\2\5\uffff\5\3",
            "\1\4\1\1\1\2\5\uffff\5\3",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "123:2: ( declaracao -> declaracao | atribuicao -> atribuicao )";
        }
    }
    static final String DFA18_eotS =
        "\5\uffff";
    static final String DFA18_eofS =
        "\5\uffff";
    static final String DFA18_minS =
        "\3\123\2\uffff";
    static final String DFA18_maxS =
        "\3\u008a\2\uffff";
    static final String DFA18_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA18_specialS =
        "\5\uffff}>";
    static final String[] DFA18_transitionS = {
            "\4\3\1\1\1\2\16\uffff\1\4\1\uffff\2\3\14\uffff\1\3\13\uffff"+
            "\2\3\3\uffff\3\3",
            "\4\3\1\1\1\2\16\uffff\1\4\1\uffff\2\3\14\uffff\1\3\13\uffff"+
            "\2\3\3\uffff\3\3",
            "\4\3\1\1\1\2\16\uffff\1\4\1\uffff\2\3\14\uffff\1\3\13\uffff"+
            "\2\3\3\uffff\3\3",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "137:55: ( parametros )?";
        }
    }
    static final String DFA21_eotS =
        "\11\uffff";
    static final String DFA21_eofS =
        "\11\uffff";
    static final String DFA21_minS =
        "\3\126\1\127\2\uffff\2\127\1\uffff";
    static final String DFA21_maxS =
        "\3\166\1\u0082\2\uffff\2\u0082\1\uffff";
    static final String DFA21_acceptS =
        "\4\uffff\1\2\1\3\2\uffff\1\1";
    static final String DFA21_specialS =
        "\11\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\3\1\1\1\2\5\uffff\5\4\16\uffff\1\5\1\uffff\4\5",
            "\1\3\1\1\1\2\5\uffff\5\4\16\uffff\1\5\1\uffff\4\5",
            "\1\3\1\1\1\2\5\uffff\5\4\16\uffff\1\5\1\uffff\4\5",
            "\1\6\1\7\14\uffff\1\5\12\uffff\1\10\16\uffff\4\10",
            "",
            "",
            "\1\6\1\7\14\uffff\1\5\12\uffff\1\10\16\uffff\4\10",
            "\1\6\1\7\14\uffff\1\5\12\uffff\1\10\16\uffff\4\10",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "161:2: ( atribuicao ';' -> atribuicao | declaracao ';' -> declaracao | instrucao -> instrucao )";
        }
    }
    static final String DFA22_eotS =
        "\5\uffff";
    static final String DFA22_eofS =
        "\5\uffff";
    static final String DFA22_minS =
        "\3\127\2\uffff";
    static final String DFA22_maxS =
        "\3\172\2\uffff";
    static final String DFA22_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA22_specialS =
        "\5\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\1\1\2\12\uffff\1\4\2\uffff\2\4\22\uffff\1\3",
            "\1\1\1\2\12\uffff\1\4\2\uffff\2\4\22\uffff\1\3",
            "\1\1\1\2\12\uffff\1\4\2\uffff\2\4\22\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "171:14: (c1= comentarios '?' c2= comentarios expressao c3= comentarios ':' c4= comentarios condicao -> ^( Condicional condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) condicao ) | -> condicao_ou )";
        }
    }
    static final String DFA23_eotS =
        "\5\uffff";
    static final String DFA23_eofS =
        "\5\uffff";
    static final String DFA23_minS =
        "\3\127\2\uffff";
    static final String DFA23_maxS =
        "\3\174\2\uffff";
    static final String DFA23_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA23_specialS =
        "\5\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1\1\2\12\uffff\1\3\2\uffff\2\3\22\uffff\1\3\1\uffff\1\4",
            "\1\1\1\2\12\uffff\1\3\2\uffff\2\3\22\uffff\1\3\1\uffff\1\4",
            "\1\1\1\2\12\uffff\1\3\2\uffff\2\3\22\uffff\1\3\1\uffff\1\4",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "()* loopback of 177:29: (c1= comentarios '||' c2= comentarios c= condicao_e -> ^( Ou $condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )*";
        }
    }
    static final String DFA24_eotS =
        "\5\uffff";
    static final String DFA24_eofS =
        "\5\uffff";
    static final String DFA24_minS =
        "\3\127\2\uffff";
    static final String DFA24_maxS =
        "\3\175\2\uffff";
    static final String DFA24_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA24_specialS =
        "\5\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\1\1\2\12\uffff\1\3\2\uffff\2\3\22\uffff\1\3\1\uffff\1\3\1"+
            "\4",
            "\1\1\1\2\12\uffff\1\3\2\uffff\2\3\22\uffff\1\3\1\uffff\1\3"+
            "\1\4",
            "\1\1\1\2\12\uffff\1\3\2\uffff\2\3\22\uffff\1\3\1\uffff\1\3"+
            "\1\4",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "()* loopback of 181:47: (c1= comentarios '&&' c2= comentarios c= condicao_comparacao -> ^( E $condicao_e ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )*";
        }
    }
    static final String DFA26_eotS =
        "\5\uffff";
    static final String DFA26_eofS =
        "\5\uffff";
    static final String DFA26_minS =
        "\3\127\2\uffff";
    static final String DFA26_maxS =
        "\3\175\2\uffff";
    static final String DFA26_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA26_specialS =
        "\5\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1\1\2\12\uffff\1\3\2\uffff\2\3\4\uffff\4\4\12\uffff\1\3\1"+
            "\uffff\2\3",
            "\1\1\1\2\12\uffff\1\3\2\uffff\2\3\4\uffff\4\4\12\uffff\1\3"+
            "\1\uffff\2\3",
            "\1\1\1\2\12\uffff\1\3\2\uffff\2\3\4\uffff\4\4\12\uffff\1\3"+
            "\1\uffff\2\3",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "()* loopback of 185:46: (c1= comentarios ( '>' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Maior ) ^( Comentarios ( $c2)? ) $c) | '<' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Menor ) ^( Comentarios ( $c2)? ) $c) | '>=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MaiorQ ) ^( Comentarios ( $c2)? ) $c) | '<=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MenorQ ) ^( Comentarios ( $c2)? ) $c) ) )*";
        }
    }
    static final String DFA28_eotS =
        "\5\uffff";
    static final String DFA28_eofS =
        "\5\uffff";
    static final String DFA28_minS =
        "\3\127\2\uffff";
    static final String DFA28_maxS =
        "\3\176\2\uffff";
    static final String DFA28_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA28_specialS =
        "\5\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\1\1\2\12\uffff\1\3\2\uffff\2\3\3\uffff\1\4\4\3\12\uffff\1"+
            "\3\1\uffff\2\3\1\4",
            "\1\1\1\2\12\uffff\1\3\2\uffff\2\3\3\uffff\1\4\4\3\12\uffff"+
            "\1\3\1\uffff\2\3\1\4",
            "\1\1\1\2\12\uffff\1\3\2\uffff\2\3\3\uffff\1\4\4\3\12\uffff"+
            "\1\3\1\uffff\2\3\1\4",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "()* loopback of 194:27: (c1= comentarios ( '!=' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c1)? ) ^( Dif ) ^( Comentarios ( $c2)? ) $e) | '==' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c2)? ) ^( Igual ) ^( Comentarios ( $c2)? ) $e) ) )*";
        }
    }
    static final String DFA31_eotS =
        "\5\uffff";
    static final String DFA31_eofS =
        "\5\uffff";
    static final String DFA31_minS =
        "\3\127\2\uffff";
    static final String DFA31_maxS =
        "\3\u0084\2\uffff";
    static final String DFA31_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA31_specialS =
        "\5\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1\1\2\12\uffff\1\3\2\uffff\2\3\3\uffff\5\3\12\uffff\5\3\4"+
            "\uffff\2\4",
            "\1\1\1\2\12\uffff\1\3\2\uffff\2\3\3\uffff\5\3\12\uffff\5\3"+
            "\4\uffff\2\4",
            "\1\1\1\2\12\uffff\1\3\2\uffff\2\3\3\uffff\5\3\12\uffff\5\3"+
            "\4\uffff\2\4",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "()* loopback of 218:33: (c1= comentarios ( '+' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Mais ) ^( Comentarios ( $c2)? ) $e) | '-' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Menos ) ^( Comentarios ( $c2)? ) $e) ) )*";
        }
    }
    static final String DFA33_eotS =
        "\5\uffff";
    static final String DFA33_eofS =
        "\5\uffff";
    static final String DFA33_minS =
        "\3\127\2\uffff";
    static final String DFA33_maxS =
        "\3\u0087\2\uffff";
    static final String DFA33_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA33_specialS =
        "\5\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\1\1\2\12\uffff\1\3\2\uffff\2\3\3\uffff\5\3\12\uffff\5\3\4"+
            "\uffff\2\3\3\4",
            "\1\1\1\2\12\uffff\1\3\2\uffff\2\3\3\uffff\5\3\12\uffff\5\3"+
            "\4\uffff\2\3\3\4",
            "\1\1\1\2\12\uffff\1\3\2\uffff\2\3\3\uffff\5\3\12\uffff\5\3"+
            "\4\uffff\2\3\3\4",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "()* loopback of 225:17: (c1= comentarios ( '*' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Vezes ) ^( Comentarios ( $c2)? ) $o) | '/' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Divide ) ^( Comentarios ( $c2)? ) $o) | '%' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Mod ) ^( Comentarios ( $c2)? ) $o) ) )*";
        }
    }
    static final String DFA34_eotS =
        "\21\uffff";
    static final String DFA34_eofS =
        "\21\uffff";
    static final String DFA34_minS =
        "\4\123\1\uffff\1\127\1\uffff\2\126\4\uffff\2\127\2\uffff";
    static final String DFA34_maxS =
        "\1\u008a\3\152\1\uffff\1\u0089\1\uffff\2\167\4\uffff\2\u0087\2\uffff";
    static final String DFA34_acceptS =
        "\4\uffff\1\3\1\uffff\1\5\2\uffff\1\10\1\2\1\1\1\6\2\uffff\1\4\1"+
        "\7";
    static final String DFA34_specialS =
        "\21\uffff}>";
    static final String[] DFA34_transitionS = {
            "\3\4\1\5\1\7\1\10\20\uffff\2\4\14\uffff\1\11\13\uffff\1\1\1"+
            "\2\3\uffff\2\6\1\3",
            "\3\12\1\13\22\uffff\2\12",
            "\3\12\1\13\22\uffff\2\12",
            "\3\12\1\13\22\uffff\2\12",
            "",
            "\1\15\1\16\12\uffff\1\17\1\uffff\1\20\2\17\3\uffff\5\17\12"+
            "\uffff\5\17\4\uffff\5\17\2\14",
            "",
            "\1\20\1\7\1\10\36\uffff\1\11",
            "\1\20\1\7\1\10\36\uffff\1\11",
            "",
            "",
            "",
            "",
            "\1\15\1\16\12\uffff\1\17\1\uffff\1\20\2\17\3\uffff\5\17\12"+
            "\uffff\5\17\4\uffff\5\17",
            "\1\15\1\16\12\uffff\1\17\1\uffff\1\20\2\17\3\uffff\5\17\12"+
            "\uffff\5\17\4\uffff\5\17",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "233:2: ( opUnario ID -> ^( opUnario ^( Id ID ) ) | opUnario tipo -> ^( opUnario tipo ) | tipo -> tipo | ID -> ^( Id ID ) | incOp ID -> ^( IncAntes incOp ID ) | ID incOp -> ^( IncDepois incOp ID ) | call -> call | input_ -> input_ )";
        }
    }
 

    public static final BitSet FOLLOW_94_in_idTipo54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_idTipo64 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_idTipo74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_idTipo84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_idTipo94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_tipo114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_tipo126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_tipo138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean__in_tipo150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_programa_in_prog169 = new BitSet(new long[]{0x0000000000000000L,0x00000017C1800000L});
    public static final BitSet FOLLOW_EOF_in_prog172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracao_in_programa194 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_programa196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcao_in_programa205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_myassert_in_programa215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentarios_in_myassert234 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_myassert236 = new BitSet(new long[]{0x0000000000000000L,0x0000002001800000L});
    public static final BitSet FOLLOW_comentarios_in_myassert238 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_myassert240 = new BitSet(new long[]{0x0000000000000000L,0x0000000001C00000L});
    public static final BitSet FOLLOW_comentarios_in_myassert242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_myassert244 = new BitSet(new long[]{0x0000000000000000L,0x0000002001800000L});
    public static final BitSet FOLLOW_comentarios_in_myassert246 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_myassert248 = new BitSet(new long[]{0x0000000000000000L,0x0000070001A80000L});
    public static final BitSet FOLLOW_comentarios_in_myassert250 = new BitSet(new long[]{0x0000000000000000L,0x0000070001A80000L});
    public static final BitSet FOLLOW_argsAssert_in_myassert254 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_myassert256 = new BitSet(new long[]{0x0000000000000000L,0x0000070001A80000L});
    public static final BitSet FOLLOW_expected_in_myassert258 = new BitSet(new long[]{0x0000000000000000L,0x0000008001800000L});
    public static final BitSet FOLLOW_expected_in_myassert263 = new BitSet(new long[]{0x0000000000000000L,0x0000008001800000L});
    public static final BitSet FOLLOW_comentarios_in_myassert266 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_myassert269 = new BitSet(new long[]{0x0000000000000000L,0x0000008001800000L});
    public static final BitSet FOLLOW_comentarios_in_myassert271 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_myassert273 = new BitSet(new long[]{0x0000000000000000L,0x0000000801800000L});
    public static final BitSet FOLLOW_comentarios_in_myassert275 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_myassert277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argumentoAssert_in_argsAssert312 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_argsAssert316 = new BitSet(new long[]{0x0000000000000000L,0x0000060001A80000L});
    public static final BitSet FOLLOW_argumentoAssert_in_argsAssert318 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_comentarios_in_argumentoAssert339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_INT_in_argumentoAssert341 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_comentarios_in_argumentoAssert343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentarios_in_argumentoAssert359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_CHAR_in_argumentoAssert361 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_comentarios_in_argumentoAssert363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentarios_in_argumentoAssert377 = new BitSet(new long[]{0x0000000000000000L,0x0000060001A80000L});
    public static final BitSet FOLLOW_boolean_assert_in_argumentoAssert379 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_comentarios_in_argumentoAssert381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expectedVal_in_expected404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expectedBool_in_expected410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expectedComp_in_expected416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentarios_in_expectedVal430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_INT_in_expectedVal432 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_comentarios_in_expectedVal434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentarios_in_expectedVal451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_CHAR_in_expectedVal453 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_comentarios_in_expectedVal455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentarios_in_expectedBool480 = new BitSet(new long[]{0x0000000000000000L,0x0000060001A80000L});
    public static final BitSet FOLLOW_boolean_assert_in_expectedBool482 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_comentarios_in_expectedBool484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentarios_in_expectedComp510 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_expectedComp512 = new BitSet(new long[]{0x0000000000000000L,0x0000F80001800000L});
    public static final BitSet FOLLOW_comentarios_in_expectedComp514 = new BitSet(new long[]{0x0000000000000000L,0x0000F80001800000L});
    public static final BitSet FOLLOW_compassert_in_expectedComp516 = new BitSet(new long[]{0x0000000000000000L,0x0000000001880000L});
    public static final BitSet FOLLOW_comentarios_in_expectedComp518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_INT_in_expectedComp520 = new BitSet(new long[]{0x0000000000000000L,0x0000010001800000L});
    public static final BitSet FOLLOW_comentarios_in_expectedComp522 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_expectedComp524 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_comentarios_in_expectedComp526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_boolean_assert0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_compassert572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentarios_in_declaracao628 = new BitSet(new long[]{0x0000000000000000L,0x00000007C1800000L});
    public static final BitSet FOLLOW_idTipo_in_declaracao630 = new BitSet(new long[]{0x0000000000000000L,0x0000000001C00000L});
    public static final BitSet FOLLOW_comentarios_in_declaracao634 = new BitSet(new long[]{0x0000000000000000L,0x0000000001C00000L});
    public static final BitSet FOLLOW_dec_nodo_in_declaracao636 = new BitSet(new long[]{0x0000000000000002L,0x0000004001800000L});
    public static final BitSet FOLLOW_comentarios_in_declaracao642 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_declaracao644 = new BitSet(new long[]{0x0000000000000000L,0x0000000001C00000L});
    public static final BitSet FOLLOW_comentarios_in_declaracao648 = new BitSet(new long[]{0x0000000000000000L,0x0000000001C00000L});
    public static final BitSet FOLLOW_dec_nodo_in_declaracao650 = new BitSet(new long[]{0x0000000000000002L,0x0000004001800000L});
    public static final BitSet FOLLOW_ID_in_dec_nodo713 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_comentarios_in_dec_nodo717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_dec_nodo749 = new BitSet(new long[]{0x0000000000000000L,0x0001000001800000L});
    public static final BitSet FOLLOW_comentarios_in_dec_nodo753 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_dec_nodo755 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_comentarios_in_dec_nodo759 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_condicao_in_dec_nodo761 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_comentarios_in_dec_nodo765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentarios_in_funcao816 = new BitSet(new long[]{0x0000000000000000L,0x00000007C1800000L});
    public static final BitSet FOLLOW_idTipo_in_funcao818 = new BitSet(new long[]{0x0000000000000000L,0x0000000001C00000L});
    public static final BitSet FOLLOW_comentarios_in_funcao822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_funcao824 = new BitSet(new long[]{0x0000000000000000L,0x0000002001800000L});
    public static final BitSet FOLLOW_comentarios_in_funcao828 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_funcao830 = new BitSet(new long[]{0x0000000000000000L,0x00000087C1800000L});
    public static final BitSet FOLLOW_comentarios_in_funcao834 = new BitSet(new long[]{0x0000000000000000L,0x00000087C1800000L});
    public static final BitSet FOLLOW_argumentos_in_funcao836 = new BitSet(new long[]{0x0000000000000000L,0x0000008001800000L});
    public static final BitSet FOLLOW_comentarios_in_funcao841 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_funcao843 = new BitSet(new long[]{0x0000000000000000L,0x0100000001800000L});
    public static final BitSet FOLLOW_comentarios_in_funcao847 = new BitSet(new long[]{0x0000000000000000L,0x0100000001800000L});
    public static final BitSet FOLLOW_blocoCodigo_in_funcao849 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_comentarios_in_funcao853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argumento_in_argumentos940 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_argumentos944 = new BitSet(new long[]{0x0000000000000000L,0x00000007C1800000L});
    public static final BitSet FOLLOW_argumento_in_argumentos946 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_comentarios_in_argumento970 = new BitSet(new long[]{0x0000000000000000L,0x00000007C1800000L});
    public static final BitSet FOLLOW_idTipo_in_argumento972 = new BitSet(new long[]{0x0000000000000000L,0x0000000001C00000L});
    public static final BitSet FOLLOW_comentarios_in_argumento976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_argumento978 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_comentarios_in_argumento982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if__in_instrucao1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for__in_instrucao1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while__in_instrucao1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return__in_instrucao1054 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_instrucao1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_instrucao1064 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_instrucao1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print__in_instrucao1078 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_instrucao1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentarios_in_if_1099 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_if_1101 = new BitSet(new long[]{0x0000000000000000L,0x0000002001800000L});
    public static final BitSet FOLLOW_comentarios_in_if_1105 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_if_1107 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_comentarios_in_if_1111 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_condicao_in_if_1113 = new BitSet(new long[]{0x0000000000000000L,0x0000008001800000L});
    public static final BitSet FOLLOW_comentarios_in_if_1117 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_if_1119 = new BitSet(new long[]{0x0000000000000000L,0x0100000001800000L});
    public static final BitSet FOLLOW_comentarios_in_if_1123 = new BitSet(new long[]{0x0000000000000000L,0x0100000001800000L});
    public static final BitSet FOLLOW_blocoCodigo_in_if_1125 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_else__in_if_1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_else_1295 = new BitSet(new long[]{0x0000000000000000L,0x0102000001800000L});
    public static final BitSet FOLLOW_blocoCodigo_in_else_1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if__in_else_1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentarios_in_for_1326 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_for_1328 = new BitSet(new long[]{0x0000000000000000L,0x0000002001800000L});
    public static final BitSet FOLLOW_comentarios_in_for_1332 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_for_1334 = new BitSet(new long[]{0x0000000000000000L,0x00000007C1C00000L});
    public static final BitSet FOLLOW_for_declaracao_in_for_1336 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_for_1338 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_comentarios_in_for_1342 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_condicao_in_for_1344 = new BitSet(new long[]{0x0000000000000000L,0x0000000801800000L});
    public static final BitSet FOLLOW_comentarios_in_for_1348 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_for_1350 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_comentarios_in_for_1354 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_expressao_in_for_1356 = new BitSet(new long[]{0x0000000000000000L,0x0000008001800000L});
    public static final BitSet FOLLOW_comentarios_in_for_1360 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_for_1362 = new BitSet(new long[]{0x0000000000000000L,0x0100000001800000L});
    public static final BitSet FOLLOW_comentarios_in_for_1366 = new BitSet(new long[]{0x0000000000000000L,0x0100000001800000L});
    public static final BitSet FOLLOW_blocoCodigo_in_for_1368 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_comentarios_in_for_1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracao_in_for_declaracao1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atribuicao_in_for_declaracao1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentarios_in_while_1492 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_while_1494 = new BitSet(new long[]{0x0000000000000000L,0x0000002001800000L});
    public static final BitSet FOLLOW_comentarios_in_while_1498 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_while_1500 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_comentarios_in_while_1504 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_condicao_in_while_1506 = new BitSet(new long[]{0x0000000000000000L,0x0000008001800000L});
    public static final BitSet FOLLOW_comentarios_in_while_1510 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_while_1512 = new BitSet(new long[]{0x0000000000000000L,0x0100000001800000L});
    public static final BitSet FOLLOW_comentarios_in_while_1516 = new BitSet(new long[]{0x0000000000000000L,0x0100000001800000L});
    public static final BitSet FOLLOW_blocoCodigo_in_while_1518 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_comentarios_in_while_1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentarios_in_return_1594 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_return_1596 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_comentarios_in_return_1600 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_expressao_in_return_1602 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_comentarios_in_return_1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentarios_in_call1651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_call1653 = new BitSet(new long[]{0x0000000000000000L,0x0000002001800000L});
    public static final BitSet FOLLOW_comentarios_in_call1658 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_call1660 = new BitSet(new long[]{0x0000000000000000L,0x0080068001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_comentarios_in_call1664 = new BitSet(new long[]{0x0000000000000000L,0x0080068001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_parametros_in_call1666 = new BitSet(new long[]{0x0000000000000000L,0x0000008001800000L});
    public static final BitSet FOLLOW_comentarios_in_call1671 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_call1673 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_comentarios_in_call1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentarios_in_print_1745 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_print_1747 = new BitSet(new long[]{0x0000000000000000L,0x0000002001800000L});
    public static final BitSet FOLLOW_comentarios_in_print_1751 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_print_1753 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_comentarios_in_print_1757 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_expressao_in_print_1759 = new BitSet(new long[]{0x0000000000000000L,0x0000008001800000L});
    public static final BitSet FOLLOW_comentarios_in_print_1763 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_print_1765 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_comentarios_in_print_1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentarios_in_input_1834 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_input_1836 = new BitSet(new long[]{0x0000000000000000L,0x0000002001800000L});
    public static final BitSet FOLLOW_comentarios_in_input_1840 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_input_1842 = new BitSet(new long[]{0x0000000000000000L,0x00000007C1800000L});
    public static final BitSet FOLLOW_comentarios_in_input_1846 = new BitSet(new long[]{0x0000000000000000L,0x00000007C1800000L});
    public static final BitSet FOLLOW_idTipo_in_input_1848 = new BitSet(new long[]{0x0000000000000000L,0x0000008001800000L});
    public static final BitSet FOLLOW_comentarios_in_input_1852 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_input_1854 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_comentarios_in_input_1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parametro_in_parametros1917 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_parametros1921 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_parametro_in_parametros1923 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_comentarios_in_parametro1944 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_expressao_in_parametro1946 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_comentarios_in_parametro1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_blocoCodigo1985 = new BitSet(new long[]{0x0000000000000000L,0x037A0007C1C00000L});
    public static final BitSet FOLLOW_codigo_in_blocoCodigo1987 = new BitSet(new long[]{0x0000000000000000L,0x037A0007C1C00000L});
    public static final BitSet FOLLOW_121_in_blocoCodigo1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atribuicao_in_codigo2012 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_codigo2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracao_in_codigo2023 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_codigo2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrucao_in_codigo2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condicao_ou_in_condicao2056 = new BitSet(new long[]{0x0000000000000002L,0x0400000001800000L});
    public static final BitSet FOLLOW_comentarios_in_condicao2062 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_condicao2064 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_comentarios_in_condicao2068 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_expressao_in_condicao2070 = new BitSet(new long[]{0x0000000000000000L,0x0800000001800000L});
    public static final BitSet FOLLOW_comentarios_in_condicao2074 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_condicao2076 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_comentarios_in_condicao2080 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_condicao_in_condicao2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condicao_e_in_condicao_ou2154 = new BitSet(new long[]{0x0000000000000002L,0x1000000001800000L});
    public static final BitSet FOLLOW_comentarios_in_condicao_ou2165 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_condicao_ou2167 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_comentarios_in_condicao_ou2171 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_condicao_e_in_condicao_ou2175 = new BitSet(new long[]{0x0000000000000002L,0x1000000001800000L});
    public static final BitSet FOLLOW_condicao_comparacao_in_condicao_e2219 = new BitSet(new long[]{0x0000000000000002L,0x2000000001800000L});
    public static final BitSet FOLLOW_comentarios_in_condicao_e2230 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_condicao_e2232 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_comentarios_in_condicao_e2236 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_condicao_comparacao_in_condicao_e2240 = new BitSet(new long[]{0x0000000000000002L,0x2000000001800000L});
    public static final BitSet FOLLOW_condicao_igualdade_in_condicao_comparacao2284 = new BitSet(new long[]{0x0000000000000002L,0x0000F00001800000L});
    public static final BitSet FOLLOW_comentarios_in_condicao_comparacao2296 = new BitSet(new long[]{0x0000000000000000L,0x0000F00000000000L});
    public static final BitSet FOLLOW_110_in_condicao_comparacao2300 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_comentarios_in_condicao_comparacao2304 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_condicao_igualdade_in_condicao_comparacao2308 = new BitSet(new long[]{0x0000000000000002L,0x0000F00001800000L});
    public static final BitSet FOLLOW_111_in_condicao_comparacao2362 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_comentarios_in_condicao_comparacao2366 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_condicao_igualdade_in_condicao_comparacao2370 = new BitSet(new long[]{0x0000000000000002L,0x0000F00001800000L});
    public static final BitSet FOLLOW_108_in_condicao_comparacao2424 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_comentarios_in_condicao_comparacao2428 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_condicao_igualdade_in_condicao_comparacao2432 = new BitSet(new long[]{0x0000000000000002L,0x0000F00001800000L});
    public static final BitSet FOLLOW_109_in_condicao_comparacao2486 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_comentarios_in_condicao_comparacao2490 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_condicao_igualdade_in_condicao_comparacao2494 = new BitSet(new long[]{0x0000000000000002L,0x0000F00001800000L});
    public static final BitSet FOLLOW_expressao_in_condicao_igualdade2573 = new BitSet(new long[]{0x0000000000000002L,0x4000080001800000L});
    public static final BitSet FOLLOW_comentarios_in_condicao_igualdade2584 = new BitSet(new long[]{0x0000000000000000L,0x4000080000000000L});
    public static final BitSet FOLLOW_126_in_condicao_igualdade2588 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_comentarios_in_condicao_igualdade2592 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_expressao_in_condicao_igualdade2596 = new BitSet(new long[]{0x0000000000000002L,0x4000080001800000L});
    public static final BitSet FOLLOW_107_in_condicao_igualdade2646 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_comentarios_in_condicao_igualdade2650 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_expressao_in_condicao_igualdade2654 = new BitSet(new long[]{0x0000000000000002L,0x4000080001800000L});
    public static final BitSet FOLLOW_comentarios_in_atribuicao2728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_atribuicao2730 = new BitSet(new long[]{0x0000000000000000L,0x8001000001800000L,0x0000000000000007L});
    public static final BitSet FOLLOW_comentarios_in_atribuicao2734 = new BitSet(new long[]{0x0000000000000000L,0x8001000001800000L,0x0000000000000007L});
    public static final BitSet FOLLOW_opAtribuicao_in_atribuicao2736 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_comentarios_in_atribuicao2740 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_condicao_in_atribuicao2742 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_comentarios_in_atribuicao2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_opAtribuicao2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_opAtribuicao2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_opAtribuicao2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_opAtribuicao2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_opAtribuicao2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoNum_in_expressao2870 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L,0x0000000000000018L});
    public static final BitSet FOLLOW_comentarios_in_expressao2881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_131_in_expressao2885 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_comentarios_in_expressao2889 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_expressaoNum_in_expressao2893 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L,0x0000000000000018L});
    public static final BitSet FOLLOW_132_in_expressao2944 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_comentarios_in_expressao2948 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_expressaoNum_in_expressao2952 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L,0x0000000000000018L});
    public static final BitSet FOLLOW_oper_in_expressaoNum3025 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_comentarios_in_expressaoNum3036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_133_in_expressaoNum3040 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_comentarios_in_expressaoNum3044 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_oper_in_expressaoNum3048 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_134_in_expressaoNum3094 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_comentarios_in_expressaoNum3098 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_oper_in_expressaoNum3102 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_135_in_expressaoNum3148 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_comentarios_in_expressaoNum3152 = new BitSet(new long[]{0x0000000000000000L,0x0080060001F80000L,0x0000000000000718L});
    public static final BitSet FOLLOW_oper_in_expressaoNum3156 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_opUnario_in_oper3221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_oper3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opUnario_in_oper3240 = new BitSet(new long[]{0x0000000000000000L,0x0000060000380000L});
    public static final BitSet FOLLOW_tipo_in_oper3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipo_in_oper3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_oper3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incOp_in_oper3277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_oper3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_oper3294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_incOp_in_oper3296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_oper3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_input__in_oper3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_incOp3340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_incOp3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_opUnario3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_opUnario3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_opUnario3392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_boolean_3412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_boolean_3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentario_in_comentarios3444 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_COMENTARIO_LINHA_in_comentario3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMENTARIO_LINHAS_in_comentario3480 = new BitSet(new long[]{0x0000000000000002L});

}