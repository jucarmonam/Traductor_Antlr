// Generated from C:/Users/carju/Desktop/LenguajesProgramacion/AntlrFolder/traductor/grammar\MyGrammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, COMMENT=47, LINE_COMMENT=48, WS=49, VAR=50, SET=51, PIZQ=52, 
		PDER=53, ROP=54, RIP=55, SMCOLON=56, COLON=57, MULOP=58, SUMOP=59, DOUBLE=60, 
		INT=61, STRING=62, CARACTER=63, BOOLEANO=64, ID=65;
	public static final int
		RULE_inicio = 0, RULE_estruct = 1, RULE_function = 2, RULE_return = 3, 
		RULE_parameters = 4, RULE_main = 5, RULE_comands = 6, RULE_comand = 7, 
		RULE_read = 8, RULE_idr = 9, RULE_print = 10, RULE_print_ = 11, RULE_id = 12, 
		RULE_call_function = 13, RULE_declaration = 14, RULE_asignacion = 15, 
		RULE_asignacion_id = 16, RULE_id_pos_estruct = 17, RULE_valor = 18, RULE_if = 19, 
		RULE_else = 20, RULE_func_id = 21, RULE_par_fun = 22, RULE_while = 23, 
		RULE_do_while = 24, RULE_for = 25, RULE_switch = 26, RULE_casos = 27, 
		RULE_romper = 28, RULE_type = 29, RULE_operador_binario = 30, RULE_operador_neg = 31, 
		RULE_primitive = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "estruct", "function", "return", "parameters", "main", "comands", 
			"comand", "read", "idr", "print", "print_", "id", "call_function", "declaration", 
			"asignacion", "asignacion_id", "id_pos_estruct", "valor", "if", "else", 
			"func_id", "par_fun", "while", "do_while", "for", "switch", "casos", 
			"romper", "type", "operador_binario", "operador_neg", "primitive"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'estructura'", "'fin_estructura'", "'funcion'", "'hacer'", "'fin_funcion'", 
			"'retornar'", "'funcion_principal'", "'fin_principal'", "'romper'", "'leer'", 
			"'.'", "'imprimir'", "'='", "'si'", "'entonces'", "'fin_si'", "'si_no'", 
			"'mientras'", "'fin_mientras'", "'para'", "'fin_para'", "'seleccionar'", 
			"'entre'", "'fin_seleccionar'", "'caso'", "':'", "'defecto'", "'+'", 
			"'-'", "'*'", "'/'", "'<'", "'<='", "'>='", "'>'", "'=='", "'!='", "'&&'", 
			"'||'", "'%'", "'!'", "'booleano'", "'caracter'", "'entero'", "'real'", 
			"'cadena'", null, null, null, "'var'", "'set'", "'('", "')'", null, null, 
			"';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "COMMENT", 
			"LINE_COMMENT", "WS", "VAR", "SET", "PIZQ", "PDER", "ROP", "RIP", "SMCOLON", 
			"COLON", "MULOP", "SUMOP", "DOUBLE", "INT", "STRING", "CARACTER", "BOOLEANO", 
			"ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicioContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<EstructContext> estruct() {
			return getRuleContexts(EstructContext.class);
		}
		public EstructContext estruct(int i) {
			return getRuleContext(EstructContext.class,i);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__2) {
				{
				setState(68);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(66);
					function();
					}
					break;
				case T__0:
					{
					setState(67);
					estruct();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			main();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__2) {
				{
				setState(76);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(74);
					function();
					}
					break;
				case T__0:
					{
					setState(75);
					estruct();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EstructContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public EstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterEstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitEstruct(this);
		}
	}

	public final EstructContext estruct() throws RecognitionException {
		EstructContext _localctx = new EstructContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_estruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__0);
			setState(82);
			match(ID);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (T__41 - 42)) | (1L << (T__42 - 42)) | (1L << (T__43 - 42)) | (1L << (T__44 - 42)) | (1L << (T__45 - 42)) | (1L << (ID - 42)))) != 0)) {
				{
				{
				setState(83);
				declaration();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public TerminalNode PIZQ() { return getToken(MyGrammarParser.PIZQ, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MyGrammarParser.PDER, 0); }
		public ComandsContext comands() {
			return getRuleContext(ComandsContext.class,0);
		}
		public ReturnContext return() {
			return getRuleContext(ReturnContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__2);
			setState(92);
			type();
			setState(93);
			match(ID);
			setState(94);
			match(PIZQ);
			setState(95);
			parameters();
			setState(96);
			match(PDER);
			setState(97);
			match(T__3);
			setState(98);
			comands();
			setState(99);
			return();
			setState(100);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode SMCOLON() { return getToken(MyGrammarParser.SMCOLON, 0); }
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitReturn(this);
		}
	}

	public final ReturnContext return() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__5);
			setState(103);
			valor(0);
			setState(104);
			match(SMCOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(MyGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyGrammarParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(MyGrammarParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MyGrammarParser.COLON, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameters);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				type();
				setState(107);
				match(ID);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(108);
					match(COLON);
					setState(109);
					type();
					setState(110);
					match(ID);
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case PDER:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public ComandsContext comands() {
			return getRuleContext(ComandsContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__6);
			setState(121);
			comands();
			setState(122);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandsContext extends ParserRuleContext {
		public ComandContext comand() {
			return getRuleContext(ComandContext.class,0);
		}
		public ComandsContext comands() {
			return getRuleContext(ComandsContext.class,0);
		}
		public ComandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterComands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitComands(this);
		}
	}

	public final ComandsContext comands() throws RecognitionException {
		ComandsContext _localctx = new ComandsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comands);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				comand();
				setState(125);
				comands();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandContext extends ParserRuleContext {
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Asignacion_idContext asignacion_id() {
			return getRuleContext(Asignacion_idContext.class,0);
		}
		public IfContext if() {
			return getRuleContext(IfContext.class,0);
		}
		public Func_idContext func_id() {
			return getRuleContext(Func_idContext.class,0);
		}
		public WhileContext while() {
			return getRuleContext(WhileContext.class,0);
		}
		public Do_whileContext do_while() {
			return getRuleContext(Do_whileContext.class,0);
		}
		public ForContext for() {
			return getRuleContext(ForContext.class,0);
		}
		public SwitchContext switch() {
			return getRuleContext(SwitchContext.class,0);
		}
		public ComandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterComand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitComand(this);
		}
	}

	public final ComandContext comand() throws RecognitionException {
		ComandContext _localctx = new ComandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comand);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				read();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				print();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				asignacion_id();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				if();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				func_id();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(136);
				while();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(137);
				do_while();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(138);
				for();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(139);
				switch();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(140);
				match(T__8);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(MyGrammarParser.PIZQ, 0); }
		public IdrContext idr() {
			return getRuleContext(IdrContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MyGrammarParser.PDER, 0); }
		public TerminalNode SMCOLON() { return getToken(MyGrammarParser.SMCOLON, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__9);
			setState(144);
			match(PIZQ);
			setState(145);
			idr();
			setState(146);
			match(PDER);
			setState(147);
			match(SMCOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdrContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MyGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyGrammarParser.ID, i);
		}
		public IdrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterIdr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitIdr(this);
		}
	}

	public final IdrContext idr() throws RecognitionException {
		IdrContext _localctx = new IdrContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_idr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(ID);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(150);
				match(T__10);
				setState(151);
				match(ID);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(MyGrammarParser.PIZQ, 0); }
		public Print_Context print_() {
			return getRuleContext(Print_Context.class,0);
		}
		public TerminalNode PDER() { return getToken(MyGrammarParser.PDER, 0); }
		public TerminalNode SMCOLON() { return getToken(MyGrammarParser.SMCOLON, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__11);
			setState(158);
			match(PIZQ);
			setState(159);
			print_();
			setState(160);
			match(PDER);
			setState(161);
			match(SMCOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_Context extends ParserRuleContext {
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(MyGrammarParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MyGrammarParser.COLON, i);
		}
		public Print_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPrint_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPrint_(this);
		}
	}

	public final Print_Context print_() throws RecognitionException {
		Print_Context _localctx = new Print_Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_print_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			valor(0);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(164);
				match(COLON);
				setState(165);
				valor(0);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MyGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyGrammarParser.ID, i);
		}
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_id);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(ID);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(172);
					match(T__10);
					setState(173);
					match(ID);
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(179);
			call_function();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_functionContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(MyGrammarParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(MyGrammarParser.PDER, 0); }
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(MyGrammarParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MyGrammarParser.COLON, i);
		}
		public Call_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterCall_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitCall_function(this);
		}
	}

	public final Call_functionContext call_function() throws RecognitionException {
		Call_functionContext _localctx = new Call_functionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_call_function);
		int _la;
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(PIZQ);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (T__28 - 29)) | (1L << (T__40 - 29)) | (1L << (PIZQ - 29)) | (1L << (DOUBLE - 29)) | (1L << (INT - 29)) | (1L << (STRING - 29)) | (1L << (CARACTER - 29)) | (1L << (BOOLEANO - 29)) | (1L << (ID - 29)))) != 0)) {
					{
					setState(182);
					valor(0);
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COLON) {
						{
						{
						setState(183);
						match(COLON);
						setState(184);
						valor(0);
						}
						}
						setState(189);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(192);
				match(PDER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(MyGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyGrammarParser.ID, i);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public TerminalNode SMCOLON() { return getToken(MyGrammarParser.SMCOLON, 0); }
		public List<TerminalNode> COLON() { return getTokens(MyGrammarParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MyGrammarParser.COLON, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			type();
			setState(197);
			match(ID);
			setState(198);
			asignacion();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(199);
				match(COLON);
				setState(200);
				match(ID);
				setState(201);
				asignacion();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			match(SMCOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_asignacion);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(T__12);
				setState(210);
				valor(0);
				}
				break;
			case SMCOLON:
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Asignacion_idContext extends ParserRuleContext {
		public Id_pos_estructContext id_pos_estruct() {
			return getRuleContext(Id_pos_estructContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode SMCOLON() { return getToken(MyGrammarParser.SMCOLON, 0); }
		public Asignacion_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAsignacion_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAsignacion_id(this);
		}
	}

	public final Asignacion_idContext asignacion_id() throws RecognitionException {
		Asignacion_idContext _localctx = new Asignacion_idContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_asignacion_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			id_pos_estruct();
			setState(215);
			match(T__12);
			setState(216);
			valor(0);
			setState(217);
			match(SMCOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_pos_estructContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MyGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyGrammarParser.ID, i);
		}
		public Id_pos_estructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_pos_estruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterId_pos_estruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitId_pos_estruct(this);
		}
	}

	public final Id_pos_estructContext id_pos_estruct() throws RecognitionException {
		Id_pos_estructContext _localctx = new Id_pos_estructContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_id_pos_estruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(ID);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(220);
				match(T__10);
				setState(221);
				match(ID);
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(MyGrammarParser.PIZQ, 0); }
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public TerminalNode PDER() { return getToken(MyGrammarParser.PDER, 0); }
		public Operador_negContext operador_neg() {
			return getRuleContext(Operador_negContext.class,0);
		}
		public TerminalNode DOUBLE() { return getToken(MyGrammarParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(MyGrammarParser.INT, 0); }
		public TerminalNode CARACTER() { return getToken(MyGrammarParser.CARACTER, 0); }
		public TerminalNode STRING() { return getToken(MyGrammarParser.STRING, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode BOOLEANO() { return getToken(MyGrammarParser.BOOLEANO, 0); }
		public Operador_binarioContext operador_binario() {
			return getRuleContext(Operador_binarioContext.class,0);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitValor(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		return valor(0);
	}

	private ValorContext valor(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValorContext _localctx = new ValorContext(_ctx, _parentState);
		ValorContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_valor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PIZQ:
				{
				setState(228);
				match(PIZQ);
				setState(229);
				valor(0);
				setState(230);
				match(PDER);
				}
				break;
			case T__28:
			case T__40:
				{
				setState(232);
				operador_neg();
				setState(233);
				valor(8);
				}
				break;
			case DOUBLE:
				{
				setState(235);
				match(DOUBLE);
				}
				break;
			case INT:
				{
				setState(236);
				match(INT);
				}
				break;
			case CARACTER:
				{
				setState(237);
				match(CARACTER);
				}
				break;
			case STRING:
				{
				setState(238);
				match(STRING);
				}
				break;
			case ID:
				{
				setState(239);
				id();
				}
				break;
			case BOOLEANO:
				{
				setState(240);
				match(BOOLEANO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ValorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_valor);
					setState(243);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(244);
					operador_binario();
					setState(245);
					valor(8);
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IfContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(MyGrammarParser.PIZQ, 0); }
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public TerminalNode PDER() { return getToken(MyGrammarParser.PDER, 0); }
		public ComandsContext comands() {
			return getRuleContext(ComandsContext.class,0);
		}
		public ElseContext else() {
			return getRuleContext(ElseContext.class,0);
		}
		public List<TerminalNode> RIP() { return getTokens(MyGrammarParser.RIP); }
		public TerminalNode RIP(int i) {
			return getToken(MyGrammarParser.RIP, i);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitIf(this);
		}
	}

	public final IfContext if() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__13);
			setState(253);
			match(PIZQ);
			setState(254);
			valor(0);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RIP) {
				{
				{
				setState(255);
				match(RIP);
				setState(256);
				valor(0);
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
			match(PDER);
			setState(263);
			match(T__14);
			setState(264);
			comands();
			setState(265);
			else();
			setState(266);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseContext extends ParserRuleContext {
		public ComandsContext comands() {
			return getRuleContext(ComandsContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitElse(this);
		}
	}

	public final ElseContext else() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_else);
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(T__16);
				setState(269);
				comands();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public TerminalNode PIZQ() { return getToken(MyGrammarParser.PIZQ, 0); }
		public Par_funContext par_fun() {
			return getRuleContext(Par_funContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MyGrammarParser.PDER, 0); }
		public TerminalNode SMCOLON() { return getToken(MyGrammarParser.SMCOLON, 0); }
		public Func_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFunc_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFunc_id(this);
		}
	}

	public final Func_idContext func_id() throws RecognitionException {
		Func_idContext _localctx = new Func_idContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_func_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(ID);
			setState(274);
			match(PIZQ);
			setState(275);
			par_fun();
			setState(276);
			match(PDER);
			setState(277);
			match(SMCOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Par_funContext extends ParserRuleContext {
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(MyGrammarParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MyGrammarParser.COLON, i);
		}
		public Par_funContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_par_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPar_fun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPar_fun(this);
		}
	}

	public final Par_funContext par_fun() throws RecognitionException {
		Par_funContext _localctx = new Par_funContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_par_fun);
		int _la;
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
			case T__40:
			case PIZQ:
			case DOUBLE:
			case INT:
			case STRING:
			case CARACTER:
			case BOOLEANO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				valor(0);
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(280);
					match(COLON);
					setState(281);
					valor(0);
					}
					}
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case PDER:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(MyGrammarParser.PIZQ, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MyGrammarParser.PDER, 0); }
		public ComandsContext comands() {
			return getRuleContext(ComandsContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitWhile(this);
		}
	}

	public final WhileContext while() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__17);
			setState(291);
			match(PIZQ);
			setState(292);
			valor(0);
			setState(293);
			match(PDER);
			setState(294);
			match(T__3);
			setState(295);
			comands();
			setState(296);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_whileContext extends ParserRuleContext {
		public ComandsContext comands() {
			return getRuleContext(ComandsContext.class,0);
		}
		public TerminalNode PIZQ() { return getToken(MyGrammarParser.PIZQ, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MyGrammarParser.PDER, 0); }
		public TerminalNode SMCOLON() { return getToken(MyGrammarParser.SMCOLON, 0); }
		public Do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterDo_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitDo_while(this);
		}
	}

	public final Do_whileContext do_while() throws RecognitionException {
		Do_whileContext _localctx = new Do_whileContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(T__3);
			setState(299);
			comands();
			setState(300);
			match(T__17);
			setState(301);
			match(PIZQ);
			setState(302);
			valor(0);
			setState(303);
			match(PDER);
			setState(304);
			match(SMCOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(MyGrammarParser.PIZQ, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public TerminalNode SMCOLON() { return getToken(MyGrammarParser.SMCOLON, 0); }
		public TerminalNode PDER() { return getToken(MyGrammarParser.PDER, 0); }
		public ComandsContext comands() {
			return getRuleContext(ComandsContext.class,0);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFor(this);
		}
	}

	public final ForContext for() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(T__19);
			setState(307);
			match(PIZQ);
			setState(308);
			declaration();
			setState(309);
			valor(0);
			setState(310);
			match(SMCOLON);
			setState(311);
			valor(0);
			setState(312);
			match(PDER);
			setState(313);
			match(T__3);
			setState(314);
			comands();
			setState(315);
			match(T__20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(MyGrammarParser.PIZQ, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MyGrammarParser.PDER, 0); }
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public SwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitSwitch(this);
		}
	}

	public final SwitchContext switch() throws RecognitionException {
		SwitchContext _localctx = new SwitchContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_switch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(T__21);
			setState(318);
			match(PIZQ);
			setState(319);
			id();
			setState(320);
			match(PDER);
			setState(321);
			match(T__22);
			setState(322);
			casos();
			setState(323);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CasosContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public ComandsContext comands() {
			return getRuleContext(ComandsContext.class,0);
		}
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public RomperContext romper() {
			return getRuleContext(RomperContext.class,0);
		}
		public CasosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterCasos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitCasos(this);
		}
	}

	public final CasosContext casos() throws RecognitionException {
		CasosContext _localctx = new CasosContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_casos);
		int _la;
		try {
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				match(T__24);
				setState(326);
				valor(0);
				setState(327);
				match(T__25);
				setState(328);
				comands();
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(329);
					romper();
					}
				}

				setState(332);
				casos();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				match(T__26);
				setState(335);
				match(T__25);
				setState(336);
				comands();
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(337);
					romper();
					}
				}

				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RomperContext extends ParserRuleContext {
		public TerminalNode SMCOLON() { return getToken(MyGrammarParser.SMCOLON, 0); }
		public RomperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_romper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterRomper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitRomper(this);
		}
	}

	public final RomperContext romper() throws RecognitionException {
		RomperContext _localctx = new RomperContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_romper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(T__8);
			setState(344);
			match(SMCOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_type);
		try {
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(ID);
				}
				break;
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				primitive();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operador_binarioContext extends ParserRuleContext {
		public Operador_binarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_binario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterOperador_binario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitOperador_binario(this);
		}
	}

	public final Operador_binarioContext operador_binario() throws RecognitionException {
		Operador_binarioContext _localctx = new Operador_binarioContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_operador_binario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operador_negContext extends ParserRuleContext {
		public Operador_negContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterOperador_neg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitOperador_neg(this);
		}
	}

	public final Operador_negContext operador_neg() throws RecognitionException {
		Operador_negContext _localctx = new Operador_negContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_operador_neg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_la = _input.LA(1);
			if ( !(_la==T__28 || _la==T__40) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveContext extends ParserRuleContext {
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPrimitive(this);
		}
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_primitive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return valor_sempred((ValorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean valor_sempred(ValorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C\u0167\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\7\2G\n\2\f\2\16\2J\13\2\3\2\3\2\3\2\7\2O\n\2\f\2\16"+
		"\2R\13\2\3\3\3\3\3\3\7\3W\n\3\f\3\16\3Z\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6"+
		"s\n\6\f\6\16\6v\13\6\3\6\5\6y\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b"+
		"\u0083\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0090\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u009b\n\13\f\13\16\13\u009e"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u00a9\n\r\f\r\16\r\u00ac"+
		"\13\r\3\16\3\16\3\16\7\16\u00b1\n\16\f\16\16\16\u00b4\13\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\7\17\u00bc\n\17\f\17\16\17\u00bf\13\17\5\17\u00c1"+
		"\n\17\3\17\3\17\5\17\u00c5\n\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00cd"+
		"\n\20\f\20\16\20\u00d0\13\20\3\20\3\20\3\21\3\21\3\21\5\21\u00d7\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\7\23\u00e1\n\23\f\23\16\23\u00e4"+
		"\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u00f4\n\24\3\24\3\24\3\24\3\24\7\24\u00fa\n\24\f\24\16\24\u00fd"+
		"\13\24\3\25\3\25\3\25\3\25\3\25\7\25\u0104\n\25\f\25\16\25\u0107\13\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\5\26\u0112\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u011d\n\30\f\30\16\30\u0120\13"+
		"\30\3\30\5\30\u0123\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u014d\n\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0155"+
		"\n\35\3\35\5\35\u0158\n\35\3\36\3\36\3\36\3\37\3\37\5\37\u015f\n\37\3"+
		" \3 \3!\3!\3\"\3\"\3\"\2\3&#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@B\2\5\3\2\36*\4\2\37\37++\3\2,\60\2\u0171\2H\3"+
		"\2\2\2\4S\3\2\2\2\6]\3\2\2\2\bh\3\2\2\2\nx\3\2\2\2\fz\3\2\2\2\16\u0082"+
		"\3\2\2\2\20\u008f\3\2\2\2\22\u0091\3\2\2\2\24\u0097\3\2\2\2\26\u009f\3"+
		"\2\2\2\30\u00a5\3\2\2\2\32\u00ad\3\2\2\2\34\u00c4\3\2\2\2\36\u00c6\3\2"+
		"\2\2 \u00d6\3\2\2\2\"\u00d8\3\2\2\2$\u00dd\3\2\2\2&\u00f3\3\2\2\2(\u00fe"+
		"\3\2\2\2*\u0111\3\2\2\2,\u0113\3\2\2\2.\u0122\3\2\2\2\60\u0124\3\2\2\2"+
		"\62\u012c\3\2\2\2\64\u0134\3\2\2\2\66\u013f\3\2\2\28\u0157\3\2\2\2:\u0159"+
		"\3\2\2\2<\u015e\3\2\2\2>\u0160\3\2\2\2@\u0162\3\2\2\2B\u0164\3\2\2\2D"+
		"G\5\6\4\2EG\5\4\3\2FD\3\2\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2"+
		"IK\3\2\2\2JH\3\2\2\2KP\5\f\7\2LO\5\6\4\2MO\5\4\3\2NL\3\2\2\2NM\3\2\2\2"+
		"OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\3\3\2\2\2RP\3\2\2\2ST\7\3\2\2TX\7C\2\2"+
		"UW\5\36\20\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2"+
		"\2[\\\7\4\2\2\\\5\3\2\2\2]^\7\5\2\2^_\5<\37\2_`\7C\2\2`a\7\66\2\2ab\5"+
		"\n\6\2bc\7\67\2\2cd\7\6\2\2de\5\16\b\2ef\5\b\5\2fg\7\7\2\2g\7\3\2\2\2"+
		"hi\7\b\2\2ij\5&\24\2jk\7:\2\2k\t\3\2\2\2lm\5<\37\2mt\7C\2\2no\7;\2\2o"+
		"p\5<\37\2pq\7C\2\2qs\3\2\2\2rn\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u"+
		"y\3\2\2\2vt\3\2\2\2wy\3\2\2\2xl\3\2\2\2xw\3\2\2\2y\13\3\2\2\2z{\7\t\2"+
		"\2{|\5\16\b\2|}\7\n\2\2}\r\3\2\2\2~\177\5\20\t\2\177\u0080\5\16\b\2\u0080"+
		"\u0083\3\2\2\2\u0081\u0083\3\2\2\2\u0082~\3\2\2\2\u0082\u0081\3\2\2\2"+
		"\u0083\17\3\2\2\2\u0084\u0090\5\22\n\2\u0085\u0090\5\26\f\2\u0086\u0090"+
		"\5\36\20\2\u0087\u0090\5\"\22\2\u0088\u0090\5(\25\2\u0089\u0090\5,\27"+
		"\2\u008a\u0090\5\60\31\2\u008b\u0090\5\62\32\2\u008c\u0090\5\64\33\2\u008d"+
		"\u0090\5\66\34\2\u008e\u0090\7\13\2\2\u008f\u0084\3\2\2\2\u008f\u0085"+
		"\3\2\2\2\u008f\u0086\3\2\2\2\u008f\u0087\3\2\2\2\u008f\u0088\3\2\2\2\u008f"+
		"\u0089\3\2\2\2\u008f\u008a\3\2\2\2\u008f\u008b\3\2\2\2\u008f\u008c\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\21\3\2\2\2\u0091\u0092"+
		"\7\f\2\2\u0092\u0093\7\66\2\2\u0093\u0094\5\24\13\2\u0094\u0095\7\67\2"+
		"\2\u0095\u0096\7:\2\2\u0096\23\3\2\2\2\u0097\u009c\7C\2\2\u0098\u0099"+
		"\7\r\2\2\u0099\u009b\7C\2\2\u009a\u0098\3\2\2\2\u009b\u009e\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\25\3\2\2\2\u009e\u009c\3\2\2"+
		"\2\u009f\u00a0\7\16\2\2\u00a0\u00a1\7\66\2\2\u00a1\u00a2\5\30\r\2\u00a2"+
		"\u00a3\7\67\2\2\u00a3\u00a4\7:\2\2\u00a4\27\3\2\2\2\u00a5\u00aa\5&\24"+
		"\2\u00a6\u00a7\7;\2\2\u00a7\u00a9\5&\24\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac"+
		"\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\31\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\u00b2\7C\2\2\u00ae\u00af\7\r\2\2\u00af\u00b1\7C\2"+
		"\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\5\34\17\2"+
		"\u00b6\33\3\2\2\2\u00b7\u00c0\7\66\2\2\u00b8\u00bd\5&\24\2\u00b9\u00ba"+
		"\7;\2\2\u00ba\u00bc\5&\24\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00c0\u00b8\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c5\7\67\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00b7\3\2\2\2\u00c4\u00c3\3"+
		"\2\2\2\u00c5\35\3\2\2\2\u00c6\u00c7\5<\37\2\u00c7\u00c8\7C\2\2\u00c8\u00ce"+
		"\5 \21\2\u00c9\u00ca\7;\2\2\u00ca\u00cb\7C\2\2\u00cb\u00cd\5 \21\2\u00cc"+
		"\u00c9\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7:\2\2\u00d2"+
		"\37\3\2\2\2\u00d3\u00d4\7\17\2\2\u00d4\u00d7\5&\24\2\u00d5\u00d7\3\2\2"+
		"\2\u00d6\u00d3\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7!\3\2\2\2\u00d8\u00d9"+
		"\5$\23\2\u00d9\u00da\7\17\2\2\u00da\u00db\5&\24\2\u00db\u00dc\7:\2\2\u00dc"+
		"#\3\2\2\2\u00dd\u00e2\7C\2\2\u00de\u00df\7\r\2\2\u00df\u00e1\7C\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3%\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\b\24\1\2\u00e6\u00e7"+
		"\7\66\2\2\u00e7\u00e8\5&\24\2\u00e8\u00e9\7\67\2\2\u00e9\u00f4\3\2\2\2"+
		"\u00ea\u00eb\5@!\2\u00eb\u00ec\5&\24\n\u00ec\u00f4\3\2\2\2\u00ed\u00f4"+
		"\7>\2\2\u00ee\u00f4\7?\2\2\u00ef\u00f4\7A\2\2\u00f0\u00f4\7@\2\2\u00f1"+
		"\u00f4\5\32\16\2\u00f2\u00f4\7B\2\2\u00f3\u00e5\3\2\2\2\u00f3\u00ea\3"+
		"\2\2\2\u00f3\u00ed\3\2\2\2\u00f3\u00ee\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f3"+
		"\u00f0\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00fb\3\2"+
		"\2\2\u00f5\u00f6\f\t\2\2\u00f6\u00f7\5> \2\u00f7\u00f8\5&\24\n\u00f8\u00fa"+
		"\3\2\2\2\u00f9\u00f5\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\'\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\7\20\2"+
		"\2\u00ff\u0100\7\66\2\2\u0100\u0105\5&\24\2\u0101\u0102\79\2\2\u0102\u0104"+
		"\5&\24\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7\67"+
		"\2\2\u0109\u010a\7\21\2\2\u010a\u010b\5\16\b\2\u010b\u010c\5*\26\2\u010c"+
		"\u010d\7\22\2\2\u010d)\3\2\2\2\u010e\u010f\7\23\2\2\u010f\u0112\5\16\b"+
		"\2\u0110\u0112\3\2\2\2\u0111\u010e\3\2\2\2\u0111\u0110\3\2\2\2\u0112+"+
		"\3\2\2\2\u0113\u0114\7C\2\2\u0114\u0115\7\66\2\2\u0115\u0116\5.\30\2\u0116"+
		"\u0117\7\67\2\2\u0117\u0118\7:\2\2\u0118-\3\2\2\2\u0119\u011e\5&\24\2"+
		"\u011a\u011b\7;\2\2\u011b\u011d\5&\24\2\u011c\u011a\3\2\2\2\u011d\u0120"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0123\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0119\3\2\2\2\u0122\u0121\3\2"+
		"\2\2\u0123/\3\2\2\2\u0124\u0125\7\24\2\2\u0125\u0126\7\66\2\2\u0126\u0127"+
		"\5&\24\2\u0127\u0128\7\67\2\2\u0128\u0129\7\6\2\2\u0129\u012a\5\16\b\2"+
		"\u012a\u012b\7\25\2\2\u012b\61\3\2\2\2\u012c\u012d\7\6\2\2\u012d\u012e"+
		"\5\16\b\2\u012e\u012f\7\24\2\2\u012f\u0130\7\66\2\2\u0130\u0131\5&\24"+
		"\2\u0131\u0132\7\67\2\2\u0132\u0133\7:\2\2\u0133\63\3\2\2\2\u0134\u0135"+
		"\7\26\2\2\u0135\u0136\7\66\2\2\u0136\u0137\5\36\20\2\u0137\u0138\5&\24"+
		"\2\u0138\u0139\7:\2\2\u0139\u013a\5&\24\2\u013a\u013b\7\67\2\2\u013b\u013c"+
		"\7\6\2\2\u013c\u013d\5\16\b\2\u013d\u013e\7\27\2\2\u013e\65\3\2\2\2\u013f"+
		"\u0140\7\30\2\2\u0140\u0141\7\66\2\2\u0141\u0142\5\32\16\2\u0142\u0143"+
		"\7\67\2\2\u0143\u0144\7\31\2\2\u0144\u0145\58\35\2\u0145\u0146\7\32\2"+
		"\2\u0146\67\3\2\2\2\u0147\u0148\7\33\2\2\u0148\u0149\5&\24\2\u0149\u014a"+
		"\7\34\2\2\u014a\u014c\5\16\b\2\u014b\u014d\5:\36\2\u014c\u014b\3\2\2\2"+
		"\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\58\35\2\u014f\u0158"+
		"\3\2\2\2\u0150\u0151\7\35\2\2\u0151\u0152\7\34\2\2\u0152\u0154\5\16\b"+
		"\2\u0153\u0155\5:\36\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0158"+
		"\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0147\3\2\2\2\u0157\u0150\3\2\2\2\u0157"+
		"\u0156\3\2\2\2\u01589\3\2\2\2\u0159\u015a\7\13\2\2\u015a\u015b\7:\2\2"+
		"\u015b;\3\2\2\2\u015c\u015f\7C\2\2\u015d\u015f\5B\"\2\u015e\u015c\3\2"+
		"\2\2\u015e\u015d\3\2\2\2\u015f=\3\2\2\2\u0160\u0161\t\2\2\2\u0161?\3\2"+
		"\2\2\u0162\u0163\t\3\2\2\u0163A\3\2\2\2\u0164\u0165\t\4\2\2\u0165C\3\2"+
		"\2\2\36FHNPXtx\u0082\u008f\u009c\u00aa\u00b2\u00bd\u00c0\u00c4\u00ce\u00d6"+
		"\u00e2\u00f3\u00fb\u0105\u0111\u011e\u0122\u014c\u0154\u0157\u015e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}