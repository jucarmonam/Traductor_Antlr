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
		RULE_inicio = 0, RULE_estructura = 1, RULE_funcion = 2, RULE_retornar = 3, 
		RULE_parameters = 4, RULE_main = 5, RULE_comands = 6, RULE_comand = 7, 
		RULE_leer = 8, RULE_idr = 9, RULE_imprimir = 10, RULE_imprimir_ = 11, 
		RULE_id = 12, RULE_call_funcion = 13, RULE_declaration = 14, RULE_asignacion = 15, 
		RULE_asignacion_id = 16, RULE_valor = 17, RULE_si = 18, RULE_si_no = 19, 
		RULE_func_id = 20, RULE_par_fun = 21, RULE_mientras = 22, RULE_hacer_mientras = 23, 
		RULE_para = 24, RULE_seleccionar = 25, RULE_casos = 26, RULE_romper = 27, 
		RULE_type = 28, RULE_operador_binario = 29, RULE_operador_neg = 30, RULE_primitive = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "estructura", "funcion", "retornar", "parameters", "main", 
			"comands", "comand", "leer", "idr", "imprimir", "imprimir_", "id", "call_funcion", 
			"declaration", "asignacion", "asignacion_id", "valor", "si", "si_no", 
			"func_id", "par_fun", "mientras", "hacer_mientras", "para", "seleccionar", 
			"casos", "romper", "type", "operador_binario", "operador_neg", "primitive"
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
		public List<FuncionContext> funcion() {
			return getRuleContexts(FuncionContext.class);
		}
		public FuncionContext funcion(int i) {
			return getRuleContext(FuncionContext.class,i);
		}
		public List<EstructuraContext> estructura() {
			return getRuleContexts(EstructuraContext.class);
		}
		public EstructuraContext estructura(int i) {
			return getRuleContext(EstructuraContext.class,i);
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
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__2) {
				{
				setState(66);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(64);
					funcion();
					}
					break;
				case T__0:
					{
					setState(65);
					estructura();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			main();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__2) {
				{
				setState(74);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(72);
					funcion();
					}
					break;
				case T__0:
					{
					setState(73);
					estructura();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(78);
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

	public static class EstructuraContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public EstructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterEstructura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitEstructura(this);
		}
	}

	public final EstructuraContext estructura() throws RecognitionException {
		EstructuraContext _localctx = new EstructuraContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_estructura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__0);
			setState(80);
			match(ID);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (T__41 - 42)) | (1L << (T__42 - 42)) | (1L << (T__43 - 42)) | (1L << (T__44 - 42)) | (1L << (T__45 - 42)) | (1L << (ID - 42)))) != 0)) {
				{
				{
				setState(81);
				declaration();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
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

	public static class FuncionContext extends ParserRuleContext {
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
		public RetornarContext retornar() {
			return getRuleContext(RetornarContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFuncion(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__2);
			setState(90);
			type();
			setState(91);
			match(ID);
			setState(92);
			match(PIZQ);
			setState(93);
			parameters();
			setState(94);
			match(PDER);
			setState(95);
			match(T__3);
			setState(96);
			comands();
			setState(97);
			retornar();
			setState(98);
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

	public static class RetornarContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode SMCOLON() { return getToken(MyGrammarParser.SMCOLON, 0); }
		public RetornarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retornar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterRetornar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitRetornar(this);
		}
	}

	public final RetornarContext retornar() throws RecognitionException {
		RetornarContext _localctx = new RetornarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_retornar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__5);
			setState(101);
			valor(0);
			setState(102);
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
			setState(116);
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
				setState(104);
				type();
				setState(105);
				match(ID);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(106);
					match(COLON);
					setState(107);
					type();
					setState(108);
					match(ID);
					}
					}
					setState(114);
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
			setState(118);
			match(T__6);
			setState(119);
			comands();
			setState(120);
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
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				comand();
				setState(123);
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
		public LeerContext leer() {
			return getRuleContext(LeerContext.class,0);
		}
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public Func_idContext func_id() {
			return getRuleContext(Func_idContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public Hacer_mientrasContext hacer_mientras() {
			return getRuleContext(Hacer_mientrasContext.class,0);
		}
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public SeleccionarContext seleccionar() {
			return getRuleContext(SeleccionarContext.class,0);
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
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				leer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				imprimir();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				si();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				func_id();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(133);
				mientras();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(134);
				hacer_mientras();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(135);
				para();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(136);
				seleccionar();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(137);
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

	public static class LeerContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(MyGrammarParser.PIZQ, 0); }
		public IdrContext idr() {
			return getRuleContext(IdrContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MyGrammarParser.PDER, 0); }
		public TerminalNode SMCOLON() { return getToken(MyGrammarParser.SMCOLON, 0); }
		public LeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterLeer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitLeer(this);
		}
	}

	public final LeerContext leer() throws RecognitionException {
		LeerContext _localctx = new LeerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__9);
			setState(141);
			match(PIZQ);
			setState(142);
			idr();
			setState(143);
			match(PDER);
			setState(144);
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
			setState(146);
			match(ID);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(147);
				match(T__10);
				setState(148);
				match(ID);
				}
				}
				setState(153);
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

	public static class ImprimirContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(MyGrammarParser.PIZQ, 0); }
		public Imprimir_Context imprimir_() {
			return getRuleContext(Imprimir_Context.class,0);
		}
		public TerminalNode PDER() { return getToken(MyGrammarParser.PDER, 0); }
		public TerminalNode SMCOLON() { return getToken(MyGrammarParser.SMCOLON, 0); }
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterImprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitImprimir(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__11);
			setState(155);
			match(PIZQ);
			setState(156);
			imprimir_();
			setState(157);
			match(PDER);
			setState(158);
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

	public static class Imprimir_Context extends ParserRuleContext {
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
		public Imprimir_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterImprimir_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitImprimir_(this);
		}
	}

	public final Imprimir_Context imprimir_() throws RecognitionException {
		Imprimir_Context _localctx = new Imprimir_Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_imprimir_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			valor(0);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(161);
				match(COLON);
				setState(162);
				valor(0);
				}
				}
				setState(167);
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
		public Call_funcionContext call_funcion() {
			return getRuleContext(Call_funcionContext.class,0);
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
			setState(168);
			match(ID);
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(169);
					match(T__10);
					setState(170);
					match(ID);
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(176);
			call_funcion();
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

	public static class Call_funcionContext extends ParserRuleContext {
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
		public Call_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterCall_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitCall_funcion(this);
		}
	}

	public final Call_funcionContext call_funcion() throws RecognitionException {
		Call_funcionContext _localctx = new Call_funcionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_call_funcion);
		int _la;
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(PIZQ);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (T__28 - 29)) | (1L << (T__40 - 29)) | (1L << (PIZQ - 29)) | (1L << (DOUBLE - 29)) | (1L << (INT - 29)) | (1L << (STRING - 29)) | (1L << (CARACTER - 29)) | (1L << (BOOLEANO - 29)) | (1L << (ID - 29)))) != 0)) {
					{
					setState(179);
					valor(0);
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COLON) {
						{
						{
						setState(180);
						match(COLON);
						setState(181);
						valor(0);
						}
						}
						setState(186);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(189);
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
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
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
		public Asignacion_idContext asignacion_id() {
			return getRuleContext(Asignacion_idContext.class,0);
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
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				primitive();
				setState(194);
				match(ID);
				setState(195);
				asignacion();
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(196);
					match(COLON);
					setState(197);
					match(ID);
					setState(198);
					asignacion();
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
				match(SMCOLON);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(ID);
				setState(207);
				asignacion_id();
				setState(208);
				match(SMCOLON);
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
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(T__12);
				setState(213);
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
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(MyGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyGrammarParser.ID, i);
		}
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
		int _la;
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(217);
					match(T__10);
					setState(218);
					match(ID);
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(224);
				match(T__12);
				setState(225);
				valor(0);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(ID);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_valor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PIZQ:
				{
				setState(230);
				match(PIZQ);
				setState(231);
				valor(0);
				setState(232);
				match(PDER);
				}
				break;
			case T__28:
			case T__40:
				{
				setState(234);
				operador_neg();
				setState(235);
				valor(8);
				}
				break;
			case DOUBLE:
				{
				setState(237);
				match(DOUBLE);
				}
				break;
			case INT:
				{
				setState(238);
				match(INT);
				}
				break;
			case CARACTER:
				{
				setState(239);
				match(CARACTER);
				}
				break;
			case STRING:
				{
				setState(240);
				match(STRING);
				}
				break;
			case ID:
				{
				setState(241);
				id();
				}
				break;
			case BOOLEANO:
				{
				setState(242);
				match(BOOLEANO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ValorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_valor);
					setState(245);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(246);
					operador_binario();
					setState(247);
					valor(8);
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class SiContext extends ParserRuleContext {
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
		public Si_noContext si_no() {
			return getRuleContext(Si_noContext.class,0);
		}
		public List<TerminalNode> RIP() { return getTokens(MyGrammarParser.RIP); }
		public TerminalNode RIP(int i) {
			return getToken(MyGrammarParser.RIP, i);
		}
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitSi(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__13);
			setState(255);
			match(PIZQ);
			setState(256);
			valor(0);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RIP) {
				{
				{
				setState(257);
				match(RIP);
				setState(258);
				valor(0);
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			match(PDER);
			setState(265);
			match(T__14);
			setState(266);
			comands();
			setState(267);
			si_no();
			setState(268);
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

	public static class Si_noContext extends ParserRuleContext {
		public ComandsContext comands() {
			return getRuleContext(ComandsContext.class,0);
		}
		public Si_noContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si_no; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterSi_no(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitSi_no(this);
		}
	}

	public final Si_noContext si_no() throws RecognitionException {
		Si_noContext _localctx = new Si_noContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_si_no);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(T__16);
				setState(271);
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
		enterRule(_localctx, 40, RULE_func_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(ID);
			setState(276);
			match(PIZQ);
			setState(277);
			par_fun();
			setState(278);
			match(PDER);
			setState(279);
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
		enterRule(_localctx, 42, RULE_par_fun);
		int _la;
		try {
			setState(290);
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
				setState(281);
				valor(0);
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(282);
					match(COLON);
					setState(283);
					valor(0);
					}
					}
					setState(288);
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

	public static class MientrasContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(MyGrammarParser.PIZQ, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MyGrammarParser.PDER, 0); }
		public ComandsContext comands() {
			return getRuleContext(ComandsContext.class,0);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitMientras(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(T__17);
			setState(293);
			match(PIZQ);
			setState(294);
			valor(0);
			setState(295);
			match(PDER);
			setState(296);
			match(T__3);
			setState(297);
			comands();
			setState(298);
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

	public static class Hacer_mientrasContext extends ParserRuleContext {
		public ComandsContext comands() {
			return getRuleContext(ComandsContext.class,0);
		}
		public TerminalNode PIZQ() { return getToken(MyGrammarParser.PIZQ, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MyGrammarParser.PDER, 0); }
		public TerminalNode SMCOLON() { return getToken(MyGrammarParser.SMCOLON, 0); }
		public Hacer_mientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hacer_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterHacer_mientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitHacer_mientras(this);
		}
	}

	public final Hacer_mientrasContext hacer_mientras() throws RecognitionException {
		Hacer_mientrasContext _localctx = new Hacer_mientrasContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_hacer_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__3);
			setState(301);
			comands();
			setState(302);
			match(T__17);
			setState(303);
			match(PIZQ);
			setState(304);
			valor(0);
			setState(305);
			match(PDER);
			setState(306);
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

	public static class ParaContext extends ParserRuleContext {
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
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPara(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(T__19);
			setState(309);
			match(PIZQ);
			setState(310);
			declaration();
			setState(311);
			valor(0);
			setState(312);
			match(SMCOLON);
			setState(313);
			valor(0);
			setState(314);
			match(PDER);
			setState(315);
			match(T__3);
			setState(316);
			comands();
			setState(317);
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

	public static class SeleccionarContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(MyGrammarParser.PIZQ, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MyGrammarParser.PDER, 0); }
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public SeleccionarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seleccionar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterSeleccionar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitSeleccionar(this);
		}
	}

	public final SeleccionarContext seleccionar() throws RecognitionException {
		SeleccionarContext _localctx = new SeleccionarContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_seleccionar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(T__21);
			setState(320);
			match(PIZQ);
			setState(321);
			id();
			setState(322);
			match(PDER);
			setState(323);
			match(T__22);
			setState(324);
			casos();
			setState(325);
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
		enterRule(_localctx, 52, RULE_casos);
		int _la;
		try {
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(T__24);
				setState(328);
				valor(0);
				setState(329);
				match(T__25);
				setState(330);
				comands();
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(331);
					romper();
					}
				}

				setState(334);
				casos();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				match(T__26);
				setState(337);
				match(T__25);
				setState(338);
				comands();
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(339);
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
		enterRule(_localctx, 54, RULE_romper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(T__8);
			setState(346);
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
		enterRule(_localctx, 56, RULE_type);
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
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
				setState(349);
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
		enterRule(_localctx, 58, RULE_operador_binario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
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
		enterRule(_localctx, 60, RULE_operador_neg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
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
		enterRule(_localctx, 62, RULE_primitive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
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
		case 17:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C\u0169\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\2\3\2\3\2\7\2M\n\2\f\2\16\2P\13"+
		"\2\3\3\3\3\3\3\7\3U\n\3\f\3\16\3X\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6q\n\6"+
		"\f\6\16\6t\13\6\3\6\5\6w\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u0081"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008d\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u0098\n\13\f\13\16\13\u009b\13\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u00a6\n\r\f\r\16\r\u00a9\13\r\3\16"+
		"\3\16\3\16\7\16\u00ae\n\16\f\16\16\16\u00b1\13\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\7\17\u00b9\n\17\f\17\16\17\u00bc\13\17\5\17\u00be\n\17\3\17"+
		"\3\17\5\17\u00c2\n\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00ca\n\20\f"+
		"\20\16\20\u00cd\13\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00d5\n\20\3"+
		"\21\3\21\3\21\5\21\u00da\n\21\3\22\3\22\7\22\u00de\n\22\f\22\16\22\u00e1"+
		"\13\22\3\22\3\22\3\22\5\22\u00e6\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f6\n\23\3\23\3\23\3\23"+
		"\3\23\7\23\u00fc\n\23\f\23\16\23\u00ff\13\23\3\24\3\24\3\24\3\24\3\24"+
		"\7\24\u0106\n\24\f\24\16\24\u0109\13\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\5\25\u0114\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\7\27\u011f\n\27\f\27\16\27\u0122\13\27\3\27\5\27\u0125\n\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\5\34\u014f\n\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0157\n\34\3\34\5\34\u015a\n\34\3"+
		"\35\3\35\3\35\3\36\3\36\5\36\u0161\n\36\3\37\3\37\3 \3 \3!\3!\3!\2\3$"+
		"\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2"+
		"\5\3\2\36*\4\2\37\37++\3\2,\60\2\u0175\2F\3\2\2\2\4Q\3\2\2\2\6[\3\2\2"+
		"\2\bf\3\2\2\2\nv\3\2\2\2\fx\3\2\2\2\16\u0080\3\2\2\2\20\u008c\3\2\2\2"+
		"\22\u008e\3\2\2\2\24\u0094\3\2\2\2\26\u009c\3\2\2\2\30\u00a2\3\2\2\2\32"+
		"\u00aa\3\2\2\2\34\u00c1\3\2\2\2\36\u00d4\3\2\2\2 \u00d9\3\2\2\2\"\u00e5"+
		"\3\2\2\2$\u00f5\3\2\2\2&\u0100\3\2\2\2(\u0113\3\2\2\2*\u0115\3\2\2\2,"+
		"\u0124\3\2\2\2.\u0126\3\2\2\2\60\u012e\3\2\2\2\62\u0136\3\2\2\2\64\u0141"+
		"\3\2\2\2\66\u0159\3\2\2\28\u015b\3\2\2\2:\u0160\3\2\2\2<\u0162\3\2\2\2"+
		">\u0164\3\2\2\2@\u0166\3\2\2\2BE\5\6\4\2CE\5\4\3\2DB\3\2\2\2DC\3\2\2\2"+
		"EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IN\5\f\7\2JM\5\6\4\2"+
		"KM\5\4\3\2LJ\3\2\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\3\3\2\2"+
		"\2PN\3\2\2\2QR\7\3\2\2RV\7C\2\2SU\5\36\20\2TS\3\2\2\2UX\3\2\2\2VT\3\2"+
		"\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7\4\2\2Z\5\3\2\2\2[\\\7\5\2\2\\]"+
		"\5:\36\2]^\7C\2\2^_\7\66\2\2_`\5\n\6\2`a\7\67\2\2ab\7\6\2\2bc\5\16\b\2"+
		"cd\5\b\5\2de\7\7\2\2e\7\3\2\2\2fg\7\b\2\2gh\5$\23\2hi\7:\2\2i\t\3\2\2"+
		"\2jk\5:\36\2kr\7C\2\2lm\7;\2\2mn\5:\36\2no\7C\2\2oq\3\2\2\2pl\3\2\2\2"+
		"qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2sw\3\2\2\2tr\3\2\2\2uw\3\2\2\2vj\3\2\2\2"+
		"vu\3\2\2\2w\13\3\2\2\2xy\7\t\2\2yz\5\16\b\2z{\7\n\2\2{\r\3\2\2\2|}\5\20"+
		"\t\2}~\5\16\b\2~\u0081\3\2\2\2\177\u0081\3\2\2\2\u0080|\3\2\2\2\u0080"+
		"\177\3\2\2\2\u0081\17\3\2\2\2\u0082\u008d\5\22\n\2\u0083\u008d\5\26\f"+
		"\2\u0084\u008d\5\36\20\2\u0085\u008d\5&\24\2\u0086\u008d\5*\26\2\u0087"+
		"\u008d\5.\30\2\u0088\u008d\5\60\31\2\u0089\u008d\5\62\32\2\u008a\u008d"+
		"\5\64\33\2\u008b\u008d\7\13\2\2\u008c\u0082\3\2\2\2\u008c\u0083\3\2\2"+
		"\2\u008c\u0084\3\2\2\2\u008c\u0085\3\2\2\2\u008c\u0086\3\2\2\2\u008c\u0087"+
		"\3\2\2\2\u008c\u0088\3\2\2\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008b\3\2\2\2\u008d\21\3\2\2\2\u008e\u008f\7\f\2\2\u008f\u0090\7\66\2"+
		"\2\u0090\u0091\5\24\13\2\u0091\u0092\7\67\2\2\u0092\u0093\7:\2\2\u0093"+
		"\23\3\2\2\2\u0094\u0099\7C\2\2\u0095\u0096\7\r\2\2\u0096\u0098\7C\2\2"+
		"\u0097\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\25\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\16\2\2\u009d"+
		"\u009e\7\66\2\2\u009e\u009f\5\30\r\2\u009f\u00a0\7\67\2\2\u00a0\u00a1"+
		"\7:\2\2\u00a1\27\3\2\2\2\u00a2\u00a7\5$\23\2\u00a3\u00a4\7;\2\2\u00a4"+
		"\u00a6\5$\23\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\31\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00af"+
		"\7C\2\2\u00ab\u00ac\7\r\2\2\u00ac\u00ae\7C\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\5\34\17\2\u00b3\33\3\2\2\2\u00b4"+
		"\u00bd\7\66\2\2\u00b5\u00ba\5$\23\2\u00b6\u00b7\7;\2\2\u00b7\u00b9\5$"+
		"\23\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00b5\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c2\7\67\2\2\u00c0"+
		"\u00c2\3\2\2\2\u00c1\u00b4\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\35\3\2\2"+
		"\2\u00c3\u00c4\5@!\2\u00c4\u00c5\7C\2\2\u00c5\u00cb\5 \21\2\u00c6\u00c7"+
		"\7;\2\2\u00c7\u00c8\7C\2\2\u00c8\u00ca\5 \21\2\u00c9\u00c6\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7:\2\2\u00cf\u00d5\3\2\2\2\u00d0"+
		"\u00d1\7C\2\2\u00d1\u00d2\5\"\22\2\u00d2\u00d3\7:\2\2\u00d3\u00d5\3\2"+
		"\2\2\u00d4\u00c3\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d5\37\3\2\2\2\u00d6\u00d7"+
		"\7\17\2\2\u00d7\u00da\5$\23\2\u00d8\u00da\3\2\2\2\u00d9\u00d6\3\2\2\2"+
		"\u00d9\u00d8\3\2\2\2\u00da!\3\2\2\2\u00db\u00dc\7\r\2\2\u00dc\u00de\7"+
		"C\2\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\7\17"+
		"\2\2\u00e3\u00e6\5$\23\2\u00e4\u00e6\7C\2\2\u00e5\u00df\3\2\2\2\u00e5"+
		"\u00e4\3\2\2\2\u00e6#\3\2\2\2\u00e7\u00e8\b\23\1\2\u00e8\u00e9\7\66\2"+
		"\2\u00e9\u00ea\5$\23\2\u00ea\u00eb\7\67\2\2\u00eb\u00f6\3\2\2\2\u00ec"+
		"\u00ed\5> \2\u00ed\u00ee\5$\23\n\u00ee\u00f6\3\2\2\2\u00ef\u00f6\7>\2"+
		"\2\u00f0\u00f6\7?\2\2\u00f1\u00f6\7A\2\2\u00f2\u00f6\7@\2\2\u00f3\u00f6"+
		"\5\32\16\2\u00f4\u00f6\7B\2\2\u00f5\u00e7\3\2\2\2\u00f5\u00ec\3\2\2\2"+
		"\u00f5\u00ef\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f5\u00f2"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00fd\3\2\2\2\u00f7"+
		"\u00f8\f\t\2\2\u00f8\u00f9\5<\37\2\u00f9\u00fa\5$\23\n\u00fa\u00fc\3\2"+
		"\2\2\u00fb\u00f7\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe%\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\7\20\2\2"+
		"\u0101\u0102\7\66\2\2\u0102\u0107\5$\23\2\u0103\u0104\79\2\2\u0104\u0106"+
		"\5$\23\2\u0105\u0103\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\7\67"+
		"\2\2\u010b\u010c\7\21\2\2\u010c\u010d\5\16\b\2\u010d\u010e\5(\25\2\u010e"+
		"\u010f\7\22\2\2\u010f\'\3\2\2\2\u0110\u0111\7\23\2\2\u0111\u0114\5\16"+
		"\b\2\u0112\u0114\3\2\2\2\u0113\u0110\3\2\2\2\u0113\u0112\3\2\2\2\u0114"+
		")\3\2\2\2\u0115\u0116\7C\2\2\u0116\u0117\7\66\2\2\u0117\u0118\5,\27\2"+
		"\u0118\u0119\7\67\2\2\u0119\u011a\7:\2\2\u011a+\3\2\2\2\u011b\u0120\5"+
		"$\23\2\u011c\u011d\7;\2\2\u011d\u011f\5$\23\2\u011e\u011c\3\2\2\2\u011f"+
		"\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0125\3\2"+
		"\2\2\u0122\u0120\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u011b\3\2\2\2\u0124"+
		"\u0123\3\2\2\2\u0125-\3\2\2\2\u0126\u0127\7\24\2\2\u0127\u0128\7\66\2"+
		"\2\u0128\u0129\5$\23\2\u0129\u012a\7\67\2\2\u012a\u012b\7\6\2\2\u012b"+
		"\u012c\5\16\b\2\u012c\u012d\7\25\2\2\u012d/\3\2\2\2\u012e\u012f\7\6\2"+
		"\2\u012f\u0130\5\16\b\2\u0130\u0131\7\24\2\2\u0131\u0132\7\66\2\2\u0132"+
		"\u0133\5$\23\2\u0133\u0134\7\67\2\2\u0134\u0135\7:\2\2\u0135\61\3\2\2"+
		"\2\u0136\u0137\7\26\2\2\u0137\u0138\7\66\2\2\u0138\u0139\5\36\20\2\u0139"+
		"\u013a\5$\23\2\u013a\u013b\7:\2\2\u013b\u013c\5$\23\2\u013c\u013d\7\67"+
		"\2\2\u013d\u013e\7\6\2\2\u013e\u013f\5\16\b\2\u013f\u0140\7\27\2\2\u0140"+
		"\63\3\2\2\2\u0141\u0142\7\30\2\2\u0142\u0143\7\66\2\2\u0143\u0144\5\32"+
		"\16\2\u0144\u0145\7\67\2\2\u0145\u0146\7\31\2\2\u0146\u0147\5\66\34\2"+
		"\u0147\u0148\7\32\2\2\u0148\65\3\2\2\2\u0149\u014a\7\33\2\2\u014a\u014b"+
		"\5$\23\2\u014b\u014c\7\34\2\2\u014c\u014e\5\16\b\2\u014d\u014f\58\35\2"+
		"\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151"+
		"\5\66\34\2\u0151\u015a\3\2\2\2\u0152\u0153\7\35\2\2\u0153\u0154\7\34\2"+
		"\2\u0154\u0156\5\16\b\2\u0155\u0157\58\35\2\u0156\u0155\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0149\3\2"+
		"\2\2\u0159\u0152\3\2\2\2\u0159\u0158\3\2\2\2\u015a\67\3\2\2\2\u015b\u015c"+
		"\7\13\2\2\u015c\u015d\7:\2\2\u015d9\3\2\2\2\u015e\u0161\7C\2\2\u015f\u0161"+
		"\5@!\2\u0160\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161;\3\2\2\2\u0162\u0163"+
		"\t\2\2\2\u0163=\3\2\2\2\u0164\u0165\t\3\2\2\u0165?\3\2\2\2\u0166\u0167"+
		"\t\4\2\2\u0167A\3\2\2\2 DFLNVrv\u0080\u008c\u0099\u00a7\u00af\u00ba\u00bd"+
		"\u00c1\u00cb\u00d4\u00d9\u00df\u00e5\u00f5\u00fd\u0107\u0113\u0120\u0124"+
		"\u014e\u0156\u0159\u0160";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}