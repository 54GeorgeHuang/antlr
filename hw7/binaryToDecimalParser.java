// Generated from binaryToDecimal.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class binaryToDecimalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3;
	public static final int
		RULE_program = 0, RULE_s = 1, RULE_l = 2, RULE_ls = 3, RULE_r = 4, RULE_rs = 5, 
		RULE_b = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "s", "l", "ls", "r", "rs", "b"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'0'", "'1'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
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
	public String getGrammarFileName() { return "binaryToDecimal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public binaryToDecimalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public SContext s;
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof binaryToDecimalListener ) ((binaryToDecimalListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof binaryToDecimalListener ) ((binaryToDecimalListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			((ProgramContext)_localctx).s = s();
			System.out.println(((ProgramContext)_localctx).s.val);
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

	public static class SContext extends ParserRuleContext {
		public float val;
		public LContext l;
		public RContext r;
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public RContext r() {
			return getRuleContext(RContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof binaryToDecimalListener ) ((binaryToDecimalListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof binaryToDecimalListener ) ((binaryToDecimalListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			((SContext)_localctx).l = l();
			setState(18);
			match(T__0);
			setState(19);
			((SContext)_localctx).r = r();
			((SContext)_localctx).val =  (float)((SContext)_localctx).l.val + ((SContext)_localctx).r.val;
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

	public static class LContext extends ParserRuleContext {
		public int val;
		public BContext b;
		public LsContext ls;
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public LsContext ls() {
			return getRuleContext(LsContext.class,0);
		}
		public LContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof binaryToDecimalListener ) ((binaryToDecimalListener)listener).enterL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof binaryToDecimalListener ) ((binaryToDecimalListener)listener).exitL(this);
		}
	}

	public final LContext l() throws RecognitionException {
		LContext _localctx = new LContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_l);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			((LContext)_localctx).b = b();
			setState(23);
			((LContext)_localctx).ls = ls(((LContext)_localctx).b.val);
			((LContext)_localctx).val =  ((LContext)_localctx).ls.val;
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

	public static class LsContext extends ParserRuleContext {
		public int in;
		public int val;
		public BContext b;
		public LsContext ls;
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public LsContext ls() {
			return getRuleContext(LsContext.class,0);
		}
		public LsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public LsContext(ParserRuleContext parent, int invokingState, int in) {
			super(parent, invokingState);
			this.in = in;
		}
		@Override public int getRuleIndex() { return RULE_ls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof binaryToDecimalListener ) ((binaryToDecimalListener)listener).enterLs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof binaryToDecimalListener ) ((binaryToDecimalListener)listener).exitLs(this);
		}
	}

	public final LsContext ls(int in) throws RecognitionException {
		LsContext _localctx = new LsContext(_ctx, getState(), in);
		enterRule(_localctx, 6, RULE_ls);
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				((LsContext)_localctx).b = b();
				setState(27);
				((LsContext)_localctx).ls = ls(_localctx.in*2 + ((LsContext)_localctx).b.val);
				((LsContext)_localctx).val =  ((LsContext)_localctx).ls.val;
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				((LsContext)_localctx).val =  _localctx.in;
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

	public static class RContext extends ParserRuleContext {
		public float val;
		public BContext b;
		public RsContext rs;
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public RsContext rs() {
			return getRuleContext(RsContext.class,0);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof binaryToDecimalListener ) ((binaryToDecimalListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof binaryToDecimalListener ) ((binaryToDecimalListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			((RContext)_localctx).b = b();
			setState(34);
			((RContext)_localctx).rs = rs();
			((RContext)_localctx).val =  (float)((RContext)_localctx).b.val/2 + ((RContext)_localctx).rs.val/2;
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

	public static class RsContext extends ParserRuleContext {
		public float val;
		public BContext b;
		public RsContext rs;
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public RsContext rs() {
			return getRuleContext(RsContext.class,0);
		}
		public RsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof binaryToDecimalListener ) ((binaryToDecimalListener)listener).enterRs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof binaryToDecimalListener ) ((binaryToDecimalListener)listener).exitRs(this);
		}
	}

	public final RsContext rs() throws RecognitionException {
		RsContext _localctx = new RsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rs);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				((RsContext)_localctx).b = b();
				setState(38);
				((RsContext)_localctx).rs = rs();
				((RsContext)_localctx).val =  (float)((RsContext)_localctx).b.val/2 + ((RsContext)_localctx).rs.val/2;
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				((RsContext)_localctx).val =  0;
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

	public static class BContext extends ParserRuleContext {
		public int val;
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof binaryToDecimalListener ) ((binaryToDecimalListener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof binaryToDecimalListener ) ((binaryToDecimalListener)listener).exitB(this);
		}
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_b);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(T__1);
				((BContext)_localctx).val =  0;
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(T__2);
				((BContext)_localctx).val =  1;
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\5\65\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5\"\n\5\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\5\7-\n\7\3\b\3\b\3\b\3\b\5\b\63\n\b\3\b\2\2\t\2\4\6"+
		"\b\n\f\16\2\2\2\60\2\20\3\2\2\2\4\23\3\2\2\2\6\30\3\2\2\2\b!\3\2\2\2\n"+
		"#\3\2\2\2\f,\3\2\2\2\16\62\3\2\2\2\20\21\5\4\3\2\21\22\b\2\1\2\22\3\3"+
		"\2\2\2\23\24\5\6\4\2\24\25\7\3\2\2\25\26\5\n\6\2\26\27\b\3\1\2\27\5\3"+
		"\2\2\2\30\31\5\16\b\2\31\32\5\b\5\2\32\33\b\4\1\2\33\7\3\2\2\2\34\35\5"+
		"\16\b\2\35\36\5\b\5\2\36\37\b\5\1\2\37\"\3\2\2\2 \"\b\5\1\2!\34\3\2\2"+
		"\2! \3\2\2\2\"\t\3\2\2\2#$\5\16\b\2$%\5\f\7\2%&\b\6\1\2&\13\3\2\2\2\'"+
		"(\5\16\b\2()\5\f\7\2)*\b\7\1\2*-\3\2\2\2+-\b\7\1\2,\'\3\2\2\2,+\3\2\2"+
		"\2-\r\3\2\2\2./\7\4\2\2/\63\b\b\1\2\60\61\7\5\2\2\61\63\b\b\1\2\62.\3"+
		"\2\2\2\62\60\3\2\2\2\63\17\3\2\2\2\5!,\62";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}