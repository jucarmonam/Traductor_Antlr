// Generated from C:/Users/chasj/Desktop/JuanPablo/Traductor_Antlr/grammar\MyGrammar.g4 by ANTLR 4.9.1
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
		RULE_inicio = 0, RULE_estructura = 1, RULE_declaractionEstruct = 2, RULE_funcion = 3, 
		RULE_retornar = 4, RULE_parameters = 5, RULE_main = 6, RULE_comands = 7, 
		RULE_comand = 8, RULE_leer = 9, RULE_idr = 10, RULE_imprimir = 11, RULE_imprimir_ = 12, 
		RULE_id = 13, RULE_call_funcion = 14, RULE_declaration = 15, RULE_asignacion = 16, 
		RULE_asignacion_id = 17, RULE_valor = 18, RULE_si = 19, RULE_si_no = 20, 
		RULE_func_id = 21, RULE_par_fun = 22, RULE_mientras = 23, RULE_hacer_mientras = 24, 
		RULE_para = 25, RULE_seleccionar = 26, RULE_casos = 27, RULE_casos_ = 28, 
		RULE_defecto = 29, RULE_romper = 30, RULE_type = 31, RULE_operador_binario = 32, 
		RULE_operador_neg = 33, RULE_primitive = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "estructura", "declaractionEstruct", "funcion", "retornar", 
			"parameters", "main", "comands", "comand", "leer", "idr", "imprimir", 
			"imprimir_", "id", "call_funcion", "declaration", "asignacion", "asignacion_id", 
			"valor", "si", "si_no", "func_id", "par_fun", "mientras", "hacer_mientras", 
			"para", "seleccionar", "casos", "casos_", "defecto", "romper", "type", 
			"operador_binario", "operador_neg", "primitive"
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
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__2) {
				{
				setState(72);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(70);
					funcion();
					}
					break;
				case T__0:
					{
					setState(71);
					estructura();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			main();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__2) {
				{
				setState(80);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(78);
					funcion();
					}
					break;
				case T__0:
					{
					setState(79);
					estructura();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(84);
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
		public List<DeclaractionEstructContext> declaractionEstruct() {
			return getRuleContexts(DeclaractionEstructContext.class);
		}
		public DeclaractionEstructContext declaractionEstruct(int i) {
			return getRuleContext(DeclaractionEstructContext.class,i);
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
			setState(85);
			match(T__0);
			setState(86);
			match(ID);
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(87);
				declaractionEstruct();
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (T__41 - 42)) | (1L << (T__42 - 42)) | (1L << (T__43 - 42)) | (1L << (T__44 - 42)) | (1L << (T__45 - 42)) | (1L << (ID - 42)))) != 0) );
			setState(92);
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

	public static class DeclaractionEstructContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(MyGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyGrammarParser.ID, i);
		}
		public TerminalNode SMCOLON() { return getToken(MyGrammarParser.SMCOLON, 0); }
		public List<TerminalNode> COLON() { return getTokens(MyGrammarParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MyGrammarParser.COLON, i);
		}
		public DeclaractionEstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaractionEstruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterDeclaractionEstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitDeclaractionEstruct(this);
		}
	}

	public final DeclaractionEstructContext declaractionEstruct() throws RecognitionException {
		DeclaractionEstructContext _localctx = new DeclaractionEstructContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaractionEstruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			type();
			setState(95);
			match(ID);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(96);
				match(COLON);
				setState(97);
				match(ID);
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
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
		enterRule(_localctx, 6, RULE_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__2);
			setState(106);
			type();
			setState(107);
			match(ID);
			setState(108);
			match(PIZQ);
			setState(109);
			parameters();
			setState(110);
			match(PDER);
			setState(111);
			match(T__3);
			setState(112);
			comands();
			setState(113);
			retornar();
			setState(114);
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
		enterRule(_localctx, 8, RULE_retornar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__5);
			setState(117);
			valor(0);
			setState(118);
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
		enterRule(_localctx, 10, RULE_parameters);
		int _la;
		try {
			setState(132);
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
				setState(120);
				type();
				setState(121);
				match(ID);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(122);
					match(COLON);
					setState(123);
					type();
					setState(124);
					match(ID);
					}
					}
					setState(130);
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
		enterRule(_localctx, 12, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__6);
			setState(135);
			comands();
			setState(136);
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
		enterRule(_localctx, 14, RULE_comands);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				comand();
				setState(139);
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
		enterRule(_localctx, 16, RULE_comand);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				leer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				imprimir();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				si();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
				func_id();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(149);
				mientras();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(150);
				hacer_mientras();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(151);
				para();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(152);
				seleccionar();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(153);
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
		enterRule(_localctx, 18, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__9);
			setState(157);
			match(PIZQ);
			setState(158);
			idr();
			setState(159);
			match(PDER);
			setState(160);
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
		enterRule(_localctx, 20, RULE_idr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(ID);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(163);
				match(T__10);
				setState(164);
				match(ID);
				}
				}
				setState(169);
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
		enterRule(_localctx, 22, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__11);
			setState(171);
			match(PIZQ);
			setState(172);
			imprimir_();
			setState(173);
			match(PDER);
			setState(174);
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
		enterRule(_localctx, 24, RULE_imprimir_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			valor(0);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(177);
				match(COLON);
				setState(178);
				valor(0);
				}
				}
				setState(183);
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
		enterRule(_localctx, 26, RULE_id);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(ID);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(185);
					match(T__10);
					setState(186);
					match(ID);
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(192);
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
		enterRule(_localctx, 28, RULE_call_funcion);
		int _la;
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(PIZQ);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (T__28 - 29)) | (1L << (T__40 - 29)) | (1L << (PIZQ - 29)) | (1L << (DOUBLE - 29)) | (1L << (INT - 29)) | (1L << (STRING - 29)) | (1L << (CARACTER - 29)) | (1L << (BOOLEANO - 29)) | (1L << (ID - 29)))) != 0)) {
					{
					setState(195);
					valor(0);
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COLON) {
						{
						{
						setState(196);
						match(COLON);
						setState(197);
						valor(0);
						}
						}
						setState(202);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(205);
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
		enterRule(_localctx, 30, RULE_declaration);
		int _la;
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				primitive();
				setState(210);
				match(ID);
				setState(211);
				asignacion();
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(212);
					match(COLON);
					setState(213);
					match(ID);
					setState(214);
					asignacion();
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(220);
				match(SMCOLON);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(ID);
				setState(223);
				asignacion_id();
				setState(224);
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
		enterRule(_localctx, 32, RULE_asignacion);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(T__12);
				setState(229);
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
		enterRule(_localctx, 34, RULE_asignacion_id);
		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(233);
					match(T__10);
					setState(234);
					match(ID);
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(240);
				match(T__12);
				setState(241);
				valor(0);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_valor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PIZQ:
				{
				setState(246);
				match(PIZQ);
				setState(247);
				valor(0);
				setState(248);
				match(PDER);
				}
				break;
			case T__28:
			case T__40:
				{
				setState(250);
				operador_neg();
				setState(251);
				valor(8);
				}
				break;
			case DOUBLE:
				{
				setState(253);
				match(DOUBLE);
				}
				break;
			case INT:
				{
				setState(254);
				match(INT);
				}
				break;
			case CARACTER:
				{
				setState(255);
				match(CARACTER);
				}
				break;
			case STRING:
				{
				setState(256);
				match(STRING);
				}
				break;
			case ID:
				{
				setState(257);
				id();
				}
				break;
			case BOOLEANO:
				{
				setState(258);
				match(BOOLEANO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ValorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_valor);
					setState(261);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(262);
					operador_binario();
					setState(263);
					valor(8);
					}
					} 
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 38, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(T__13);
			setState(271);
			match(PIZQ);
			setState(272);
			valor(0);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RIP) {
				{
				{
				setState(273);
				match(RIP);
				setState(274);
				valor(0);
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			match(PDER);
			setState(281);
			match(T__14);
			setState(282);
			comands();
			setState(283);
			si_no();
			setState(284);
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
		enterRule(_localctx, 40, RULE_si_no);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(T__16);
				setState(287);
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
			setState(291);
			match(ID);
			setState(292);
			match(PIZQ);
			setState(293);
			par_fun();
			setState(294);
			match(PDER);
			setState(295);
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
			setState(306);
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
				setState(297);
				valor(0);
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(298);
					match(COLON);
					setState(299);
					valor(0);
					}
					}
					setState(304);
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
		enterRule(_localctx, 46, RULE_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(T__17);
			setState(309);
			match(PIZQ);
			setState(310);
			valor(0);
			setState(311);
			match(PDER);
			setState(312);
			match(T__3);
			setState(313);
			comands();
			setState(314);
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
		enterRule(_localctx, 48, RULE_hacer_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(T__3);
			setState(317);
			comands();
			setState(318);
			match(T__17);
			setState(319);
			match(PIZQ);
			setState(320);
			valor(0);
			setState(321);
			match(PDER);
			setState(322);
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
		enterRule(_localctx, 50, RULE_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(T__19);
			setState(325);
			match(PIZQ);
			setState(326);
			declaration();
			setState(327);
			valor(0);
			setState(328);
			match(SMCOLON);
			setState(329);
			valor(0);
			setState(330);
			match(PDER);
			setState(331);
			match(T__3);
			setState(332);
			comands();
			setState(333);
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
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
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
		enterRule(_localctx, 52, RULE_seleccionar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(T__21);
			setState(336);
			match(PIZQ);
			setState(337);
			valor(0);
			setState(338);
			match(PDER);
			setState(339);
			match(T__22);
			setState(340);
			casos();
			setState(341);
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
		public List<Casos_Context> casos_() {
			return getRuleContexts(Casos_Context.class);
		}
		public Casos_Context casos_(int i) {
			return getRuleContext(Casos_Context.class,i);
		}
		public DefectoContext defecto() {
			return getRuleContext(DefectoContext.class,0);
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
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(344); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(343);
					casos_();
					}
					}
					setState(346); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__24 );
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26) {
					{
					setState(348);
					defecto();
					}
				}

				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				defecto();
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

	public static class Casos_Context extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public ComandsContext comands() {
			return getRuleContext(ComandsContext.class,0);
		}
		public RomperContext romper() {
			return getRuleContext(RomperContext.class,0);
		}
		public Casos_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casos_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterCasos_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitCasos_(this);
		}
	}

	public final Casos_Context casos_() throws RecognitionException {
		Casos_Context _localctx = new Casos_Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_casos_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(T__24);
			setState(355);
			valor(0);
			setState(356);
			match(T__25);
			setState(357);
			comands();
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(358);
				romper();
				}
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

	public static class DefectoContext extends ParserRuleContext {
		public ComandsContext comands() {
			return getRuleContext(ComandsContext.class,0);
		}
		public RomperContext romper() {
			return getRuleContext(RomperContext.class,0);
		}
		public DefectoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defecto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterDefecto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitDefecto(this);
		}
	}

	public final DefectoContext defecto() throws RecognitionException {
		DefectoContext _localctx = new DefectoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_defecto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(T__26);
			setState(362);
			match(T__25);
			setState(363);
			comands();
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(364);
				romper();
				}
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
		enterRule(_localctx, 60, RULE_romper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(T__8);
			setState(368);
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
		enterRule(_localctx, 62, RULE_type);
		try {
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
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
				setState(371);
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
		enterRule(_localctx, 64, RULE_operador_binario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
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
		enterRule(_localctx, 66, RULE_operador_neg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
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
		enterRule(_localctx, 68, RULE_primitive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C\u017f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\7\2K\n\2\f\2\16\2N\13\2\3\2\3\2\3\2\7"+
		"\2S\n\2\f\2\16\2V\13\2\3\3\3\3\3\3\6\3[\n\3\r\3\16\3\\\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\7\4e\n\4\f\4\16\4h\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0081\n\7\f"+
		"\7\16\7\u0084\13\7\3\7\5\7\u0087\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5"+
		"\t\u0091\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009d\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00a8\n\f\f\f\16\f\u00ab\13"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u00b6\n\16\f\16\16\16\u00b9"+
		"\13\16\3\17\3\17\3\17\7\17\u00be\n\17\f\17\16\17\u00c1\13\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\7\20\u00c9\n\20\f\20\16\20\u00cc\13\20\5\20\u00ce"+
		"\n\20\3\20\3\20\5\20\u00d2\n\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00da"+
		"\n\21\f\21\16\21\u00dd\13\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e5"+
		"\n\21\3\22\3\22\3\22\5\22\u00ea\n\22\3\23\3\23\7\23\u00ee\n\23\f\23\16"+
		"\23\u00f1\13\23\3\23\3\23\3\23\5\23\u00f6\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0106\n\24\3\24\3\24"+
		"\3\24\3\24\7\24\u010c\n\24\f\24\16\24\u010f\13\24\3\25\3\25\3\25\3\25"+
		"\3\25\7\25\u0116\n\25\f\25\16\25\u0119\13\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\5\26\u0124\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\7\30\u012f\n\30\f\30\16\30\u0132\13\30\3\30\5\30\u0135\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\6\35\u015b\n\35\r\35\16\35\u015c"+
		"\3\35\5\35\u0160\n\35\3\35\5\35\u0163\n\35\3\36\3\36\3\36\3\36\3\36\5"+
		"\36\u016a\n\36\3\37\3\37\3\37\3\37\5\37\u0170\n\37\3 \3 \3 \3!\3!\5!\u0177"+
		"\n!\3\"\3\"\3#\3#\3$\3$\3$\2\3&%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDF\2\5\3\2\36*\4\2\37\37++\3\2,\60\2\u018a"+
		"\2L\3\2\2\2\4W\3\2\2\2\6`\3\2\2\2\bk\3\2\2\2\nv\3\2\2\2\f\u0086\3\2\2"+
		"\2\16\u0088\3\2\2\2\20\u0090\3\2\2\2\22\u009c\3\2\2\2\24\u009e\3\2\2\2"+
		"\26\u00a4\3\2\2\2\30\u00ac\3\2\2\2\32\u00b2\3\2\2\2\34\u00ba\3\2\2\2\36"+
		"\u00d1\3\2\2\2 \u00e4\3\2\2\2\"\u00e9\3\2\2\2$\u00f5\3\2\2\2&\u0105\3"+
		"\2\2\2(\u0110\3\2\2\2*\u0123\3\2\2\2,\u0125\3\2\2\2.\u0134\3\2\2\2\60"+
		"\u0136\3\2\2\2\62\u013e\3\2\2\2\64\u0146\3\2\2\2\66\u0151\3\2\2\28\u0162"+
		"\3\2\2\2:\u0164\3\2\2\2<\u016b\3\2\2\2>\u0171\3\2\2\2@\u0176\3\2\2\2B"+
		"\u0178\3\2\2\2D\u017a\3\2\2\2F\u017c\3\2\2\2HK\5\b\5\2IK\5\4\3\2JH\3\2"+
		"\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OT\5\16"+
		"\b\2PS\5\b\5\2QS\5\4\3\2RP\3\2\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2"+
		"\2\2U\3\3\2\2\2VT\3\2\2\2WX\7\3\2\2XZ\7C\2\2Y[\5\6\4\2ZY\3\2\2\2[\\\3"+
		"\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\4\2\2_\5\3\2\2\2`a\5@!\2af"+
		"\7C\2\2bc\7;\2\2ce\7C\2\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3"+
		"\2\2\2hf\3\2\2\2ij\7:\2\2j\7\3\2\2\2kl\7\5\2\2lm\5@!\2mn\7C\2\2no\7\66"+
		"\2\2op\5\f\7\2pq\7\67\2\2qr\7\6\2\2rs\5\20\t\2st\5\n\6\2tu\7\7\2\2u\t"+
		"\3\2\2\2vw\7\b\2\2wx\5&\24\2xy\7:\2\2y\13\3\2\2\2z{\5@!\2{\u0082\7C\2"+
		"\2|}\7;\2\2}~\5@!\2~\177\7C\2\2\177\u0081\3\2\2\2\u0080|\3\2\2\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0087\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0085\u0087\3\2\2\2\u0086z\3\2\2\2\u0086\u0085"+
		"\3\2\2\2\u0087\r\3\2\2\2\u0088\u0089\7\t\2\2\u0089\u008a\5\20\t\2\u008a"+
		"\u008b\7\n\2\2\u008b\17\3\2\2\2\u008c\u008d\5\22\n\2\u008d\u008e\5\20"+
		"\t\2\u008e\u0091\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008c\3\2\2\2\u0090"+
		"\u008f\3\2\2\2\u0091\21\3\2\2\2\u0092\u009d\5\24\13\2\u0093\u009d\5\30"+
		"\r\2\u0094\u009d\5 \21\2\u0095\u009d\5(\25\2\u0096\u009d\5,\27\2\u0097"+
		"\u009d\5\60\31\2\u0098\u009d\5\62\32\2\u0099\u009d\5\64\33\2\u009a\u009d"+
		"\5\66\34\2\u009b\u009d\7\13\2\2\u009c\u0092\3\2\2\2\u009c\u0093\3\2\2"+
		"\2\u009c\u0094\3\2\2\2\u009c\u0095\3\2\2\2\u009c\u0096\3\2\2\2\u009c\u0097"+
		"\3\2\2\2\u009c\u0098\3\2\2\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009b\3\2\2\2\u009d\23\3\2\2\2\u009e\u009f\7\f\2\2\u009f\u00a0\7\66\2"+
		"\2\u00a0\u00a1\5\26\f\2\u00a1\u00a2\7\67\2\2\u00a2\u00a3\7:\2\2\u00a3"+
		"\25\3\2\2\2\u00a4\u00a9\7C\2\2\u00a5\u00a6\7\r\2\2\u00a6\u00a8\7C\2\2"+
		"\u00a7\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\27\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7\16\2\2\u00ad"+
		"\u00ae\7\66\2\2\u00ae\u00af\5\32\16\2\u00af\u00b0\7\67\2\2\u00b0\u00b1"+
		"\7:\2\2\u00b1\31\3\2\2\2\u00b2\u00b7\5&\24\2\u00b3\u00b4\7;\2\2\u00b4"+
		"\u00b6\5&\24\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\33\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bf"+
		"\7C\2\2\u00bb\u00bc\7\r\2\2\u00bc\u00be\7C\2\2\u00bd\u00bb\3\2\2\2\u00be"+
		"\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2"+
		"\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\5\36\20\2\u00c3\35\3\2\2\2\u00c4"+
		"\u00cd\7\66\2\2\u00c5\u00ca\5&\24\2\u00c6\u00c7\7;\2\2\u00c7\u00c9\5&"+
		"\24\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00c5\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d2\7\67\2\2\u00d0"+
		"\u00d2\3\2\2\2\u00d1\u00c4\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\37\3\2\2"+
		"\2\u00d3\u00d4\5F$\2\u00d4\u00d5\7C\2\2\u00d5\u00db\5\"\22\2\u00d6\u00d7"+
		"\7;\2\2\u00d7\u00d8\7C\2\2\u00d8\u00da\5\"\22\2\u00d9\u00d6\3\2\2\2\u00da"+
		"\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2"+
		"\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7:\2\2\u00df\u00e5\3\2\2\2\u00e0"+
		"\u00e1\7C\2\2\u00e1\u00e2\5$\23\2\u00e2\u00e3\7:\2\2\u00e3\u00e5\3\2\2"+
		"\2\u00e4\u00d3\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e5!\3\2\2\2\u00e6\u00e7"+
		"\7\17\2\2\u00e7\u00ea\5&\24\2\u00e8\u00ea\3\2\2\2\u00e9\u00e6\3\2\2\2"+
		"\u00e9\u00e8\3\2\2\2\u00ea#\3\2\2\2\u00eb\u00ec\7\r\2\2\u00ec\u00ee\7"+
		"C\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7\17"+
		"\2\2\u00f3\u00f6\5&\24\2\u00f4\u00f6\7C\2\2\u00f5\u00ef\3\2\2\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6%\3\2\2\2\u00f7\u00f8\b\24\1\2\u00f8\u00f9\7\66\2"+
		"\2\u00f9\u00fa\5&\24\2\u00fa\u00fb\7\67\2\2\u00fb\u0106\3\2\2\2\u00fc"+
		"\u00fd\5D#\2\u00fd\u00fe\5&\24\n\u00fe\u0106\3\2\2\2\u00ff\u0106\7>\2"+
		"\2\u0100\u0106\7?\2\2\u0101\u0106\7A\2\2\u0102\u0106\7@\2\2\u0103\u0106"+
		"\5\34\17\2\u0104\u0106\7B\2\2\u0105\u00f7\3\2\2\2\u0105\u00fc\3\2\2\2"+
		"\u0105\u00ff\3\2\2\2\u0105\u0100\3\2\2\2\u0105\u0101\3\2\2\2\u0105\u0102"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106\u010d\3\2\2\2\u0107"+
		"\u0108\f\t\2\2\u0108\u0109\5B\"\2\u0109\u010a\5&\24\n\u010a\u010c\3\2"+
		"\2\2\u010b\u0107\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\'\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\7\20\2"+
		"\2\u0111\u0112\7\66\2\2\u0112\u0117\5&\24\2\u0113\u0114\79\2\2\u0114\u0116"+
		"\5&\24\2\u0115\u0113\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b\7\67"+
		"\2\2\u011b\u011c\7\21\2\2\u011c\u011d\5\20\t\2\u011d\u011e\5*\26\2\u011e"+
		"\u011f\7\22\2\2\u011f)\3\2\2\2\u0120\u0121\7\23\2\2\u0121\u0124\5\20\t"+
		"\2\u0122\u0124\3\2\2\2\u0123\u0120\3\2\2\2\u0123\u0122\3\2\2\2\u0124+"+
		"\3\2\2\2\u0125\u0126\7C\2\2\u0126\u0127\7\66\2\2\u0127\u0128\5.\30\2\u0128"+
		"\u0129\7\67\2\2\u0129\u012a\7:\2\2\u012a-\3\2\2\2\u012b\u0130\5&\24\2"+
		"\u012c\u012d\7;\2\2\u012d\u012f\5&\24\2\u012e\u012c\3\2\2\2\u012f\u0132"+
		"\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0135\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u012b\3\2\2\2\u0134\u0133\3\2"+
		"\2\2\u0135/\3\2\2\2\u0136\u0137\7\24\2\2\u0137\u0138\7\66\2\2\u0138\u0139"+
		"\5&\24\2\u0139\u013a\7\67\2\2\u013a\u013b\7\6\2\2\u013b\u013c\5\20\t\2"+
		"\u013c\u013d\7\25\2\2\u013d\61\3\2\2\2\u013e\u013f\7\6\2\2\u013f\u0140"+
		"\5\20\t\2\u0140\u0141\7\24\2\2\u0141\u0142\7\66\2\2\u0142\u0143\5&\24"+
		"\2\u0143\u0144\7\67\2\2\u0144\u0145\7:\2\2\u0145\63\3\2\2\2\u0146\u0147"+
		"\7\26\2\2\u0147\u0148\7\66\2\2\u0148\u0149\5 \21\2\u0149\u014a\5&\24\2"+
		"\u014a\u014b\7:\2\2\u014b\u014c\5&\24\2\u014c\u014d\7\67\2\2\u014d\u014e"+
		"\7\6\2\2\u014e\u014f\5\20\t\2\u014f\u0150\7\27\2\2\u0150\65\3\2\2\2\u0151"+
		"\u0152\7\30\2\2\u0152\u0153\7\66\2\2\u0153\u0154\5&\24\2\u0154\u0155\7"+
		"\67\2\2\u0155\u0156\7\31\2\2\u0156\u0157\58\35\2\u0157\u0158\7\32\2\2"+
		"\u0158\67\3\2\2\2\u0159\u015b\5:\36\2\u015a\u0159\3\2\2\2\u015b\u015c"+
		"\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2\2\2\u015e"+
		"\u0160\5<\37\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0163\3\2"+
		"\2\2\u0161\u0163\5<\37\2\u0162\u015a\3\2\2\2\u0162\u0161\3\2\2\2\u0163"+
		"9\3\2\2\2\u0164\u0165\7\33\2\2\u0165\u0166\5&\24\2\u0166\u0167\7\34\2"+
		"\2\u0167\u0169\5\20\t\2\u0168\u016a\5> \2\u0169\u0168\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u016a;\3\2\2\2\u016b\u016c\7\35\2\2\u016c\u016d\7\34\2\2\u016d"+
		"\u016f\5\20\t\2\u016e\u0170\5> \2\u016f\u016e\3\2\2\2\u016f\u0170\3\2"+
		"\2\2\u0170=\3\2\2\2\u0171\u0172\7\13\2\2\u0172\u0173\7:\2\2\u0173?\3\2"+
		"\2\2\u0174\u0177\7C\2\2\u0175\u0177\5F$\2\u0176\u0174\3\2\2\2\u0176\u0175"+
		"\3\2\2\2\u0177A\3\2\2\2\u0178\u0179\t\2\2\2\u0179C\3\2\2\2\u017a\u017b"+
		"\t\3\2\2\u017bE\3\2\2\2\u017c\u017d\t\4\2\2\u017dG\3\2\2\2#JLRT\\f\u0082"+
		"\u0086\u0090\u009c\u00a9\u00b7\u00bf\u00ca\u00cd\u00d1\u00db\u00e4\u00e9"+
		"\u00ef\u00f5\u0105\u010d\u0117\u0123\u0130\u0134\u015c\u015f\u0162\u0169"+
		"\u016f\u0176";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}