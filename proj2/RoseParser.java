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
		RULE_program = 0, RULE_variables = 1, RULE_variable = 2, RULE_statements = 3, 
		RULE_statement = 4, RULE_assignment_statement = 5, RULE_if_statement = 6, 
		RULE_if_statement_ = 7, RULE_for_statement = 8, RULE_exit_statement = 9, 
		RULE_read_statement = 10, RULE_write_statement = 11, RULE_bool_expression = 12, 
		RULE_bool_expression_ = 13, RULE_bool_term = 14, RULE_bool_term_ = 15, 
		RULE_bool_factor = 16, RULE_bool_primary = 17, RULE_relation_op = 18, 
		RULE_relation_op_ = 19, RULE_relation_op__ = 20, RULE_arith_expression = 21, 
		RULE_arith_expression_ = 22, RULE_arith_term = 23, RULE_arith_term_ = 24, 
		RULE_arith_factor = 25, RULE_arith_primary = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "variables", "variable", "statements", "statement", "assignment_statement", 
			"if_statement", "if_statement_", "for_statement", "exit_statement", "read_statement", 
			"write_statement", "bool_expression", "bool_expression_", "bool_term", 
			"bool_term_", "bool_factor", "bool_primary", "relation_op", "relation_op_", 
			"relation_op__", "arith_expression", "arith_expression_", "arith_term", 
			"arith_term_", "arith_factor", "arith_primary"
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

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(RoseParser.PROCEDURE, 0); }
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode IS() { return getToken(RoseParser.IS, 0); }
		public TerminalNode DECLARE() { return getToken(RoseParser.DECLARE, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(RoseParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(RoseParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(PROCEDURE);
			setState(55);
			match(ID);
			setState(56);
			match(IS);
			setState(57);
			match(DECLARE);
			setState(58);
			variables();
			setState(59);
			match(BEGIN);
			setState(60);
			statements();
			setState(61);
			match(END);
			setState(62);
			match(SEMICOLON);
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

	public static class VariablesContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitVariables(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variables);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				variable();
				setState(65);
				variables();
				}
				break;
			case BEGIN:
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode COLON() { return getToken(RoseParser.COLON, 0); }
		public TerminalNode INTEGER() { return getToken(RoseParser.INTEGER, 0); }
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(ID);
			setState(71);
			match(COLON);
			setState(72);
			match(INTEGER);
			setState(73);
			match(SEMICOLON);
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statements);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXIT:
			case FOR:
			case IF:
			case READ:
			case WRITE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				statement();
				setState(76);
				statements();
				}
				break;
			case ELSE:
			case END:
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

	public static class StatementContext extends ParserRuleContext {
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Exit_statementContext exit_statement() {
			return getRuleContext(Exit_statementContext.class,0);
		}
		public Read_statementContext read_statement() {
			return getRuleContext(Read_statementContext.class,0);
		}
		public Write_statementContext write_statement() {
			return getRuleContext(Write_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				assignment_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				if_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				for_statement();
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				exit_statement();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				read_statement();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				write_statement();
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(RoseParser.ASSIGNMENT, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitAssignment_statement(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(ID);
			setState(90);
			match(ASSIGNMENT);
			setState(91);
			arith_expression();
			setState(92);
			match(SEMICOLON);
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(RoseParser.IF, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(RoseParser.THEN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public If_statement_Context if_statement_() {
			return getRuleContext(If_statement_Context.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(IF);
			setState(95);
			bool_expression();
			setState(96);
			match(THEN);
			setState(97);
			statements();
			setState(98);
			if_statement_();
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

	public static class If_statement_Context extends ParserRuleContext {
		public TerminalNode END() { return getToken(RoseParser.END, 0); }
		public TerminalNode IF() { return getToken(RoseParser.IF, 0); }
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public TerminalNode ELSE() { return getToken(RoseParser.ELSE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public If_statement_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterIf_statement_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitIf_statement_(this);
		}
	}

	public final If_statement_Context if_statement_() throws RecognitionException {
		If_statement_Context _localctx = new If_statement_Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_statement_);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(END);
				setState(101);
				match(IF);
				setState(102);
				match(SEMICOLON);
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(ELSE);
				setState(104);
				statements();
				setState(105);
				match(END);
				setState(106);
				match(IF);
				setState(107);
				match(SEMICOLON);
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(RoseParser.FOR, 0); }
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode IN() { return getToken(RoseParser.IN, 0); }
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public TerminalNode RANGE() { return getToken(RoseParser.RANGE, 0); }
		public List<TerminalNode> LOOP() { return getTokens(RoseParser.LOOP); }
		public TerminalNode LOOP(int i) {
			return getToken(RoseParser.LOOP, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(RoseParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(FOR);
			setState(112);
			match(ID);
			setState(113);
			match(IN);
			setState(114);
			arith_expression();
			setState(115);
			match(RANGE);
			setState(116);
			arith_expression();
			setState(117);
			match(LOOP);
			setState(118);
			statements();
			setState(119);
			match(END);
			setState(120);
			match(LOOP);
			setState(121);
			match(SEMICOLON);
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

	public static class Exit_statementContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(RoseParser.EXIT, 0); }
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public Exit_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterExit_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitExit_statement(this);
		}
	}

	public final Exit_statementContext exit_statement() throws RecognitionException {
		Exit_statementContext _localctx = new Exit_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exit_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(EXIT);
			setState(124);
			match(SEMICOLON);
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

	public static class Read_statementContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(RoseParser.READ, 0); }
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public Read_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterRead_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitRead_statement(this);
		}
	}

	public final Read_statementContext read_statement() throws RecognitionException {
		Read_statementContext _localctx = new Read_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_read_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(READ);
			setState(127);
			match(ID);
			setState(128);
			match(SEMICOLON);
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

	public static class Write_statementContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(RoseParser.WRITE, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public Write_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterWrite_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitWrite_statement(this);
		}
	}

	public final Write_statementContext write_statement() throws RecognitionException {
		Write_statementContext _localctx = new Write_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_write_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(WRITE);
			setState(131);
			arith_expression();
			setState(132);
			match(SEMICOLON);
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

	public static class Bool_expressionContext extends ParserRuleContext {
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_expression_Context bool_expression_() {
			return getRuleContext(Bool_expression_Context.class,0);
		}
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_expression(this);
		}
	}

	public final Bool_expressionContext bool_expression() throws RecognitionException {
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bool_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			bool_term();
			setState(135);
			bool_expression_();
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

	public static class Bool_expression_Context extends ParserRuleContext {
		public TerminalNode OR() { return getToken(RoseParser.OR, 0); }
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_expression_Context bool_expression_() {
			return getRuleContext(Bool_expression_Context.class,0);
		}
		public Bool_expression_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expression_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_expression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_expression_(this);
		}
	}

	public final Bool_expression_Context bool_expression_() throws RecognitionException {
		Bool_expression_Context _localctx = new Bool_expression_Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_bool_expression_);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(OR);
				setState(138);
				bool_term();
				setState(139);
				bool_expression_();
				}
				break;
			case THEN:
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

	public static class Bool_termContext extends ParserRuleContext {
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_term_Context bool_term_() {
			return getRuleContext(Bool_term_Context.class,0);
		}
		public Bool_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_term(this);
		}
	}

	public final Bool_termContext bool_term() throws RecognitionException {
		Bool_termContext _localctx = new Bool_termContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bool_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			bool_factor();
			setState(145);
			bool_term_();
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

	public static class Bool_term_Context extends ParserRuleContext {
		public TerminalNode AND() { return getToken(RoseParser.AND, 0); }
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_term_Context bool_term_() {
			return getRuleContext(Bool_term_Context.class,0);
		}
		public Bool_term_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_term_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_term_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_term_(this);
		}
	}

	public final Bool_term_Context bool_term_() throws RecognitionException {
		Bool_term_Context _localctx = new Bool_term_Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_bool_term_);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(AND);
				setState(148);
				bool_factor();
				setState(149);
				bool_term_();
				}
				break;
			case THEN:
			case OR:
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

	public static class Bool_factorContext extends ParserRuleContext {
		public TerminalNode EXCLAMATION() { return getToken(RoseParser.EXCLAMATION, 0); }
		public Bool_primaryContext bool_primary() {
			return getRuleContext(Bool_primaryContext.class,0);
		}
		public Bool_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_factor(this);
		}
	}

	public final Bool_factorContext bool_factor() throws RecognitionException {
		Bool_factorContext _localctx = new Bool_factorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bool_factor);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXCLAMATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(EXCLAMATION);
				setState(155);
				bool_primary();
				}
				break;
			case MINUS:
			case LEFT_PARENTHESES:
			case ID:
			case CONST_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				bool_primary();
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

	public static class Bool_primaryContext extends ParserRuleContext {
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public Relation_opContext relation_op() {
			return getRuleContext(Relation_opContext.class,0);
		}
		public Bool_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_primary(this);
		}
	}

	public final Bool_primaryContext bool_primary() throws RecognitionException {
		Bool_primaryContext _localctx = new Bool_primaryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bool_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			arith_expression();
			setState(160);
			relation_op();
			setState(161);
			arith_expression();
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

	public static class Relation_opContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(RoseParser.EQUAL, 0); }
		public TerminalNode LESS_THAN() { return getToken(RoseParser.LESS_THAN, 0); }
		public Relation_op_Context relation_op_() {
			return getRuleContext(Relation_op_Context.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(RoseParser.GREATER_THAN, 0); }
		public Relation_op__Context relation_op__() {
			return getRuleContext(Relation_op__Context.class,0);
		}
		public Relation_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterRelation_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitRelation_op(this);
		}
	}

	public final Relation_opContext relation_op() throws RecognitionException {
		Relation_opContext _localctx = new Relation_opContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relation_op);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(EQUAL);
				}
				break;
			case LESS_THAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(LESS_THAN);
				setState(165);
				relation_op_();
				}
				break;
			case GREATER_THAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				match(GREATER_THAN);
				setState(167);
				relation_op__();
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

	public static class Relation_op_Context extends ParserRuleContext {
		public TerminalNode GREATER_THAN() { return getToken(RoseParser.GREATER_THAN, 0); }
		public TerminalNode EQUAL() { return getToken(RoseParser.EQUAL, 0); }
		public Relation_op_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_op_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterRelation_op_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitRelation_op_(this);
		}
	}

	public final Relation_op_Context relation_op_() throws RecognitionException {
		Relation_op_Context _localctx = new Relation_op_Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_relation_op_);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GREATER_THAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(GREATER_THAN);
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(EQUAL);
				}
				break;
			case MINUS:
			case LEFT_PARENTHESES:
			case ID:
			case CONST_INT:
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

	public static class Relation_op__Context extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(RoseParser.EQUAL, 0); }
		public Relation_op__Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_op__; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterRelation_op__(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitRelation_op__(this);
		}
	}

	public final Relation_op__Context relation_op__() throws RecognitionException {
		Relation_op__Context _localctx = new Relation_op__Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_relation_op__);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(EQUAL);
				}
				break;
			case MINUS:
			case LEFT_PARENTHESES:
			case ID:
			case CONST_INT:
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

	public static class Arith_expressionContext extends ParserRuleContext {
		public Arith_termContext arith_term() {
			return getRuleContext(Arith_termContext.class,0);
		}
		public Arith_expression_Context arith_expression_() {
			return getRuleContext(Arith_expression_Context.class,0);
		}
		public Arith_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_expression(this);
		}
	}

	public final Arith_expressionContext arith_expression() throws RecognitionException {
		Arith_expressionContext _localctx = new Arith_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arith_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			arith_term();
			setState(180);
			arith_expression_();
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

	public static class Arith_expression_Context extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(RoseParser.ADD, 0); }
		public Arith_termContext arith_term() {
			return getRuleContext(Arith_termContext.class,0);
		}
		public Arith_expression_Context arith_expression_() {
			return getRuleContext(Arith_expression_Context.class,0);
		}
		public TerminalNode MINUS() { return getToken(RoseParser.MINUS, 0); }
		public Arith_expression_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expression_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_expression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_expression_(this);
		}
	}

	public final Arith_expression_Context arith_expression_() throws RecognitionException {
		Arith_expression_Context _localctx = new Arith_expression_Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_arith_expression_);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(ADD);
				setState(183);
				arith_term();
				setState(184);
				arith_expression_();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(MINUS);
				setState(187);
				arith_term();
				setState(188);
				arith_expression_();
				}
				break;
			case LOOP:
			case THEN:
			case RANGE:
			case SEMICOLON:
			case EQUAL:
			case GREATER_THAN:
			case LESS_THAN:
			case AND:
			case OR:
			case RIGHT_PARENTHESES:
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

	public static class Arith_termContext extends ParserRuleContext {
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Arith_term_Context arith_term_() {
			return getRuleContext(Arith_term_Context.class,0);
		}
		public Arith_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_term(this);
		}
	}

	public final Arith_termContext arith_term() throws RecognitionException {
		Arith_termContext _localctx = new Arith_termContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arith_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			arith_factor();
			setState(194);
			arith_term_();
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

	public static class Arith_term_Context extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(RoseParser.ASTERISK, 0); }
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Arith_term_Context arith_term_() {
			return getRuleContext(Arith_term_Context.class,0);
		}
		public TerminalNode SLASH() { return getToken(RoseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(RoseParser.PERCENT, 0); }
		public Arith_term_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_term_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_term_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_term_(this);
		}
	}

	public final Arith_term_Context arith_term_() throws RecognitionException {
		Arith_term_Context _localctx = new Arith_term_Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_arith_term_);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASTERISK:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(ASTERISK);
				setState(197);
				arith_factor();
				setState(198);
				arith_term_();
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(SLASH);
				setState(201);
				arith_factor();
				setState(202);
				arith_term_();
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(PERCENT);
				setState(205);
				arith_factor();
				setState(206);
				arith_term_();
				}
				break;
			case LOOP:
			case THEN:
			case RANGE:
			case SEMICOLON:
			case ADD:
			case MINUS:
			case EQUAL:
			case GREATER_THAN:
			case LESS_THAN:
			case AND:
			case OR:
			case RIGHT_PARENTHESES:
				enterOuterAlt(_localctx, 4);
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

	public static class Arith_factorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(RoseParser.MINUS, 0); }
		public Arith_primaryContext arith_primary() {
			return getRuleContext(Arith_primaryContext.class,0);
		}
		public Arith_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_factor(this);
		}
	}

	public final Arith_factorContext arith_factor() throws RecognitionException {
		Arith_factorContext _localctx = new Arith_factorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arith_factor);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(MINUS);
				setState(212);
				arith_primary();
				}
				break;
			case LEFT_PARENTHESES:
			case ID:
			case CONST_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				arith_primary();
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

	public static class Arith_primaryContext extends ParserRuleContext {
		public TerminalNode CONST_INT() { return getToken(RoseParser.CONST_INT, 0); }
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode LEFT_PARENTHESES() { return getToken(RoseParser.LEFT_PARENTHESES, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESES() { return getToken(RoseParser.RIGHT_PARENTHESES, 0); }
		public Arith_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_primary(this);
		}
	}

	public final Arith_primaryContext arith_primary() throws RecognitionException {
		Arith_primaryContext _localctx = new Arith_primaryContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arith_primary);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(CONST_INT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(ID);
				}
				break;
			case LEFT_PARENTHESES:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				match(LEFT_PARENTHESES);
				setState(219);
				arith_expression();
				setState(220);
				match(RIGHT_PARENTHESES);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00e3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\5\3G\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5R\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6Z\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tp\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u0091\n\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u009b\n\21\3\22\3\22\3\22\5\22"+
		"\u00a0\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u00ab\n"+
		"\24\3\25\3\25\3\25\5\25\u00b0\n\25\3\26\3\26\5\26\u00b4\n\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00c2\n\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u00d4\n\32\3\33\3\33\3\33\5\33\u00d9\n\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\5\34\u00e1\n\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\66\2\2\2\u00df\28\3\2\2\2\4F\3\2\2\2\6H\3"+
		"\2\2\2\bQ\3\2\2\2\nY\3\2\2\2\f[\3\2\2\2\16`\3\2\2\2\20o\3\2\2\2\22q\3"+
		"\2\2\2\24}\3\2\2\2\26\u0080\3\2\2\2\30\u0084\3\2\2\2\32\u0088\3\2\2\2"+
		"\34\u0090\3\2\2\2\36\u0092\3\2\2\2 \u009a\3\2\2\2\"\u009f\3\2\2\2$\u00a1"+
		"\3\2\2\2&\u00aa\3\2\2\2(\u00af\3\2\2\2*\u00b3\3\2\2\2,\u00b5\3\2\2\2."+
		"\u00c1\3\2\2\2\60\u00c3\3\2\2\2\62\u00d3\3\2\2\2\64\u00d8\3\2\2\2\66\u00e0"+
		"\3\2\2\289\7\20\2\29:\7(\2\2:;\7\16\2\2;<\7\6\2\2<=\5\4\3\2=>\7\5\2\2"+
		">?\5\b\5\2?@\7\b\2\2@A\7\26\2\2A\3\3\2\2\2BC\5\6\4\2CD\5\4\3\2DG\3\2\2"+
		"\2EG\3\2\2\2FB\3\2\2\2FE\3\2\2\2G\5\3\2\2\2HI\7(\2\2IJ\7\24\2\2JK\7\r"+
		"\2\2KL\7\26\2\2L\7\3\2\2\2MN\5\n\6\2NO\5\b\5\2OR\3\2\2\2PR\3\2\2\2QM\3"+
		"\2\2\2QP\3\2\2\2R\t\3\2\2\2SZ\5\f\7\2TZ\5\16\b\2UZ\5\22\n\2VZ\5\24\13"+
		"\2WZ\5\26\f\2XZ\5\30\r\2YS\3\2\2\2YT\3\2\2\2YU\3\2\2\2YV\3\2\2\2YW\3\2"+
		"\2\2YX\3\2\2\2Z\13\3\2\2\2[\\\7(\2\2\\]\7%\2\2]^\5,\27\2^_\7\26\2\2_\r"+
		"\3\2\2\2`a\7\13\2\2ab\5\32\16\2bc\7\22\2\2cd\5\b\5\2de\5\20\t\2e\17\3"+
		"\2\2\2fg\7\b\2\2gh\7\13\2\2hp\7\26\2\2ij\7\7\2\2jk\5\b\5\2kl\7\b\2\2l"+
		"m\7\13\2\2mn\7\26\2\2np\3\2\2\2of\3\2\2\2oi\3\2\2\2p\21\3\2\2\2qr\7\n"+
		"\2\2rs\7(\2\2st\7\f\2\2tu\5,\27\2uv\7\25\2\2vw\5,\27\2wx\7\17\2\2xy\5"+
		"\b\5\2yz\7\b\2\2z{\7\17\2\2{|\7\26\2\2|\23\3\2\2\2}~\7\t\2\2~\177\7\26"+
		"\2\2\177\25\3\2\2\2\u0080\u0081\7\21\2\2\u0081\u0082\7(\2\2\u0082\u0083"+
		"\7\26\2\2\u0083\27\3\2\2\2\u0084\u0085\7\23\2\2\u0085\u0086\5,\27\2\u0086"+
		"\u0087\7\26\2\2\u0087\31\3\2\2\2\u0088\u0089\5\36\20\2\u0089\u008a\5\34"+
		"\17\2\u008a\33\3\2\2\2\u008b\u008c\7#\2\2\u008c\u008d\5\36\20\2\u008d"+
		"\u008e\5\34\17\2\u008e\u0091\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008b\3"+
		"\2\2\2\u0090\u008f\3\2\2\2\u0091\35\3\2\2\2\u0092\u0093\5\"\22\2\u0093"+
		"\u0094\5 \21\2\u0094\37\3\2\2\2\u0095\u0096\7\"\2\2\u0096\u0097\5\"\22"+
		"\2\u0097\u0098\5 \21\2\u0098\u009b\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0095"+
		"\3\2\2\2\u009a\u0099\3\2\2\2\u009b!\3\2\2\2\u009c\u009d\7$\2\2\u009d\u00a0"+
		"\5$\23\2\u009e\u00a0\5$\23\2\u009f\u009c\3\2\2\2\u009f\u009e\3\2\2\2\u00a0"+
		"#\3\2\2\2\u00a1\u00a2\5,\27\2\u00a2\u00a3\5&\24\2\u00a3\u00a4\5,\27\2"+
		"\u00a4%\3\2\2\2\u00a5\u00ab\7\34\2\2\u00a6\u00a7\7 \2\2\u00a7\u00ab\5"+
		"(\25\2\u00a8\u00a9\7\36\2\2\u00a9\u00ab\5*\26\2\u00aa\u00a5\3\2\2\2\u00aa"+
		"\u00a6\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\'\3\2\2\2\u00ac\u00b0\7\36\2"+
		"\2\u00ad\u00b0\7\34\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ac\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0)\3\2\2\2\u00b1\u00b4\7\34\2\2"+
		"\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4+\3"+
		"\2\2\2\u00b5\u00b6\5\60\31\2\u00b6\u00b7\5.\30\2\u00b7-\3\2\2\2\u00b8"+
		"\u00b9\7\27\2\2\u00b9\u00ba\5\60\31\2\u00ba\u00bb\5.\30\2\u00bb\u00c2"+
		"\3\2\2\2\u00bc\u00bd\7\30\2\2\u00bd\u00be\5\60\31\2\u00be\u00bf\5.\30"+
		"\2\u00bf\u00c2\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00b8\3\2\2\2\u00c1\u00bc"+
		"\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2/\3\2\2\2\u00c3\u00c4\5\64\33\2\u00c4"+
		"\u00c5\5\62\32\2\u00c5\61\3\2\2\2\u00c6\u00c7\7\31\2\2\u00c7\u00c8\5\64"+
		"\33\2\u00c8\u00c9\5\62\32\2\u00c9\u00d4\3\2\2\2\u00ca\u00cb\7\32\2\2\u00cb"+
		"\u00cc\5\64\33\2\u00cc\u00cd\5\62\32\2\u00cd\u00d4\3\2\2\2\u00ce\u00cf"+
		"\7\33\2\2\u00cf\u00d0\5\64\33\2\u00d0\u00d1\5\62\32\2\u00d1\u00d4\3\2"+
		"\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00c6\3\2\2\2\u00d3\u00ca\3\2\2\2\u00d3"+
		"\u00ce\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\63\3\2\2\2\u00d5\u00d6\7\30\2"+
		"\2\u00d6\u00d9\5\66\34\2\u00d7\u00d9\5\66\34\2\u00d8\u00d5\3\2\2\2\u00d8"+
		"\u00d7\3\2\2\2\u00d9\65\3\2\2\2\u00da\u00e1\7)\2\2\u00db\u00e1\7(\2\2"+
		"\u00dc\u00dd\7&\2\2\u00dd\u00de\5,\27\2\u00de\u00df\7\'\2\2\u00df\u00e1"+
		"\3\2\2\2\u00e0\u00da\3\2\2\2\u00e0\u00db\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e1"+
		"\67\3\2\2\2\20FQYo\u0090\u009a\u009f\u00aa\u00af\u00b3\u00c1\u00d3\u00d8"+
		"\u00e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}