// Generated from Rose.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RoseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENTS=1, WHITESPACE=2, BEGIN=3, DECLARE=4, ELSE=5, END=6, EXIT=7, FOR=8, 
		IF=9, IN=10, INTEGER=11, IS=12, LOOP=13, PROCEDURE=14, READ=15, THEN=16, 
		WRITE=17, COLON=18, RANGE=19, SEMICOLON=20, ADD=21, MINUS=22, ASTERISK=23, 
		SLASH=24, PERCENT=25, EQUAL=26, ANGLE_BRACKETS=27, GREATER_THAN=28, GREATER_THAN_OR_EQUAL=29, 
		LESS_THAN=30, LESS_THAN_OR_EQUAL=31, AND=32, OR=33, EXCLAMATION=34, ASSIGNMENT=35, 
		LEFT_PARENTHESES=36, RIGHT_PARENTHESES=37, ID=38, CONST_INT=39;
	public static final int
		RULE_token = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"token"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'begin'", "'declare'", "'else'", "'end'", "'exit'", 
			"'for'", "'if'", "'in'", "'integer'", "'is'", "'loop'", "'procedure'", 
			"'read'", "'then'", "'write'", "':'", "'..'", "';'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'='", "'<>'", "'>'", "'>='", "'<'", "'<='", "'&&'", "'||'", 
			"'!'", "':='", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENTS", "WHITESPACE", "BEGIN", "DECLARE", "ELSE", "END", "EXIT", 
			"FOR", "IF", "IN", "INTEGER", "IS", "LOOP", "PROCEDURE", "READ", "THEN", 
			"WRITE", "COLON", "RANGE", "SEMICOLON", "ADD", "MINUS", "ASTERISK", "SLASH", 
			"PERCENT", "EQUAL", "ANGLE_BRACKETS", "GREATER_THAN", "GREATER_THAN_OR_EQUAL", 
			"LESS_THAN", "LESS_THAN_OR_EQUAL", "AND", "OR", "EXCLAMATION", "ASSIGNMENT", 
			"LEFT_PARENTHESES", "RIGHT_PARENTHESES", "ID", "CONST_INT"
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
	public String getGrammarFileName() { return "Rose.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RoseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TokenContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(RoseParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RoseParser.ID, i);
		}
		public List<TerminalNode> BEGIN() { return getTokens(RoseParser.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(RoseParser.BEGIN, i);
		}
		public List<TerminalNode> DECLARE() { return getTokens(RoseParser.DECLARE); }
		public TerminalNode DECLARE(int i) {
			return getToken(RoseParser.DECLARE, i);
		}
		public List<TerminalNode> ELSE() { return getTokens(RoseParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(RoseParser.ELSE, i);
		}
		public List<TerminalNode> END() { return getTokens(RoseParser.END); }
		public TerminalNode END(int i) {
			return getToken(RoseParser.END, i);
		}
		public List<TerminalNode> EXIT() { return getTokens(RoseParser.EXIT); }
		public TerminalNode EXIT(int i) {
			return getToken(RoseParser.EXIT, i);
		}
		public List<TerminalNode> FOR() { return getTokens(RoseParser.FOR); }
		public TerminalNode FOR(int i) {
			return getToken(RoseParser.FOR, i);
		}
		public List<TerminalNode> IF() { return getTokens(RoseParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(RoseParser.IF, i);
		}
		public List<TerminalNode> IN() { return getTokens(RoseParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(RoseParser.IN, i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(RoseParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(RoseParser.INTEGER, i);
		}
		public List<TerminalNode> IS() { return getTokens(RoseParser.IS); }
		public TerminalNode IS(int i) {
			return getToken(RoseParser.IS, i);
		}
		public List<TerminalNode> LOOP() { return getTokens(RoseParser.LOOP); }
		public TerminalNode LOOP(int i) {
			return getToken(RoseParser.LOOP, i);
		}
		public List<TerminalNode> PROCEDURE() { return getTokens(RoseParser.PROCEDURE); }
		public TerminalNode PROCEDURE(int i) {
			return getToken(RoseParser.PROCEDURE, i);
		}
		public List<TerminalNode> READ() { return getTokens(RoseParser.READ); }
		public TerminalNode READ(int i) {
			return getToken(RoseParser.READ, i);
		}
		public List<TerminalNode> THEN() { return getTokens(RoseParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(RoseParser.THEN, i);
		}
		public List<TerminalNode> WRITE() { return getTokens(RoseParser.WRITE); }
		public TerminalNode WRITE(int i) {
			return getToken(RoseParser.WRITE, i);
		}
		public List<TerminalNode> CONST_INT() { return getTokens(RoseParser.CONST_INT); }
		public TerminalNode CONST_INT(int i) {
			return getToken(RoseParser.CONST_INT, i);
		}
		public List<TerminalNode> COLON() { return getTokens(RoseParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(RoseParser.COLON, i);
		}
		public List<TerminalNode> RANGE() { return getTokens(RoseParser.RANGE); }
		public TerminalNode RANGE(int i) {
			return getToken(RoseParser.RANGE, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(RoseParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(RoseParser.SEMICOLON, i);
		}
		public List<TerminalNode> ADD() { return getTokens(RoseParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(RoseParser.ADD, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(RoseParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(RoseParser.MINUS, i);
		}
		public List<TerminalNode> ASTERISK() { return getTokens(RoseParser.ASTERISK); }
		public TerminalNode ASTERISK(int i) {
			return getToken(RoseParser.ASTERISK, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(RoseParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(RoseParser.SLASH, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(RoseParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(RoseParser.PERCENT, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(RoseParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(RoseParser.EQUAL, i);
		}
		public List<TerminalNode> ANGLE_BRACKETS() { return getTokens(RoseParser.ANGLE_BRACKETS); }
		public TerminalNode ANGLE_BRACKETS(int i) {
			return getToken(RoseParser.ANGLE_BRACKETS, i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(RoseParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(RoseParser.GREATER_THAN, i);
		}
		public List<TerminalNode> GREATER_THAN_OR_EQUAL() { return getTokens(RoseParser.GREATER_THAN_OR_EQUAL); }
		public TerminalNode GREATER_THAN_OR_EQUAL(int i) {
			return getToken(RoseParser.GREATER_THAN_OR_EQUAL, i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(RoseParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(RoseParser.LESS_THAN, i);
		}
		public List<TerminalNode> LESS_THAN_OR_EQUAL() { return getTokens(RoseParser.LESS_THAN_OR_EQUAL); }
		public TerminalNode LESS_THAN_OR_EQUAL(int i) {
			return getToken(RoseParser.LESS_THAN_OR_EQUAL, i);
		}
		public List<TerminalNode> AND() { return getTokens(RoseParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(RoseParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(RoseParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(RoseParser.OR, i);
		}
		public List<TerminalNode> EXCLAMATION() { return getTokens(RoseParser.EXCLAMATION); }
		public TerminalNode EXCLAMATION(int i) {
			return getToken(RoseParser.EXCLAMATION, i);
		}
		public List<TerminalNode> ASSIGNMENT() { return getTokens(RoseParser.ASSIGNMENT); }
		public TerminalNode ASSIGNMENT(int i) {
			return getToken(RoseParser.ASSIGNMENT, i);
		}
		public List<TerminalNode> LEFT_PARENTHESES() { return getTokens(RoseParser.LEFT_PARENTHESES); }
		public TerminalNode LEFT_PARENTHESES(int i) {
			return getToken(RoseParser.LEFT_PARENTHESES, i);
		}
		public List<TerminalNode> RIGHT_PARENTHESES() { return getTokens(RoseParser.RIGHT_PARENTHESES); }
		public TerminalNode RIGHT_PARENTHESES(int i) {
			return getToken(RoseParser.RIGHT_PARENTHESES, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(RoseParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(RoseParser.WHITESPACE, i);
		}
		public List<TerminalNode> COMMENTS() { return getTokens(RoseParser.COMMENTS); }
		public TerminalNode COMMENTS(int i) {
			return getToken(RoseParser.COMMENTS, i);
		}
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitToken(this);
		}
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_token);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENTS) | (1L << WHITESPACE) | (1L << BEGIN) | (1L << DECLARE) | (1L << ELSE) | (1L << END) | (1L << EXIT) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << INTEGER) | (1L << IS) | (1L << LOOP) | (1L << PROCEDURE) | (1L << READ) | (1L << THEN) | (1L << WRITE) | (1L << COLON) | (1L << RANGE) | (1L << SEMICOLON) | (1L << ADD) | (1L << MINUS) | (1L << ASTERISK) | (1L << SLASH) | (1L << PERCENT) | (1L << EQUAL) | (1L << ANGLE_BRACKETS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUAL) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUAL) | (1L << AND) | (1L << OR) | (1L << EXCLAMATION) | (1L << ASSIGNMENT) | (1L << LEFT_PARENTHESES) | (1L << RIGHT_PARENTHESES) | (1L << ID) | (1L << CONST_INT))) != 0)) {
				{
				{
				setState(2);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENTS) | (1L << WHITESPACE) | (1L << BEGIN) | (1L << DECLARE) | (1L << ELSE) | (1L << END) | (1L << EXIT) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << INTEGER) | (1L << IS) | (1L << LOOP) | (1L << PROCEDURE) | (1L << READ) | (1L << THEN) | (1L << WRITE) | (1L << COLON) | (1L << RANGE) | (1L << SEMICOLON) | (1L << ADD) | (1L << MINUS) | (1L << ASTERISK) | (1L << SLASH) | (1L << PERCENT) | (1L << EQUAL) | (1L << ANGLE_BRACKETS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUAL) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUAL) | (1L << AND) | (1L << OR) | (1L << EXCLAMATION) | (1L << ASSIGNMENT) | (1L << LEFT_PARENTHESES) | (1L << RIGHT_PARENTHESES) | (1L << ID) | (1L << CONST_INT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(7);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\13\4\2\t\2\3\2\7"+
		"\2\6\n\2\f\2\16\2\t\13\2\3\2\2\2\3\2\2\3\3\2\3)\2\n\2\7\3\2\2\2\4\6\t"+
		"\2\2\2\5\4\3\2\2\2\6\t\3\2\2\2\7\5\3\2\2\2\7\b\3\2\2\2\b\3\3\2\2\2\t\7"+
		"\3\2\2\2\3\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}