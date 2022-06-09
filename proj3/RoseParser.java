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
		WRITE=17, COLON=18, RANGE=19, SEMICOLON=20, ADD=21, MINUS=22, MULTIPLY=23, 
		DIVISION=24, MOD=25, EQUAL=26, ANGLE_BRACKETS=27, GREATER_THAN=28, GREATER_THAN_OR_EQUAL=29, 
		LESS_THAN=30, LESS_THAN_OR_EQUAL=31, AND=32, OR=33, NOT=34, ASSIGNMENT=35, 
		LEFT_PARENTHESES=36, RIGHT_PARENTHESES=37, ID=38, CONST_INT=39;
	public static final int
		RULE_program = 0, RULE_variables = 1, RULE_variable = 2, RULE_statements = 3, 
		RULE_statement = 4, RULE_assignment_statement = 5, RULE_read_statement = 6, 
		RULE_write_statement = 7, RULE_arith_expression = 8, RULE_arith_expression_ = 9, 
		RULE_arith_term = 10, RULE_arith_term_ = 11, RULE_arith_factor = 12, RULE_arith_primary = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "variables", "variable", "statements", "statement", "assignment_statement", 
			"read_statement", "write_statement", "arith_expression", "arith_expression_", 
			"arith_term", "arith_term_", "arith_factor", "arith_primary"
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
			"WRITE", "COLON", "RANGE", "SEMICOLON", "ADD", "MINUS", "MULTIPLY", "DIVISION", 
			"MOD", "EQUAL", "ANGLE_BRACKETS", "GREATER_THAN", "GREATER_THAN_OR_EQUAL", 
			"LESS_THAN", "LESS_THAN_OR_EQUAL", "AND", "OR", "NOT", "ASSIGNMENT", 
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
			setState(28);
			match(PROCEDURE);
			setState(29);
			match(ID);
			setState(30);
			match(IS);
			setState(31);
			match(DECLARE);
			System.out.println("\t" + ".data");
			setState(33);
			variables();
			setState(34);
			match(BEGIN);
			System.out.println("\t" + ".text");
				System.out.println("main:");
			setState(36);
			statements(0);
			setState(37);
			match(END);
			setState(38);
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
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				variable();
				setState(41);
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
		public Token ID;
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
			setState(46);
			((VariableContext)_localctx).ID = match(ID);
			setState(47);
			match(COLON);
			setState(48);
			match(INTEGER);
			setState(49);
			match(SEMICOLON);
			System.out.println((((VariableContext)_localctx).ID!=null?((VariableContext)_localctx).ID.getText():null) + ": " + ".word 0");
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
		public int reg;
		public StatementContext statement;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementsContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
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

	public final StatementsContext statements(int reg) throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState(), reg);
		enterRule(_localctx, 6, RULE_statements);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
			case WRITE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				((StatementsContext)_localctx).statement = statement(_localctx.reg);
				setState(53);
				statements(((StatementsContext)_localctx).statement.nreg);
				}
				break;
			case END:
				enterOuterAlt(_localctx, 2);
				{
				System.out.println("no more statements, reg = $t" + _localctx.reg);
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
		public int reg;
		public int nreg;
		public Assignment_statementContext assignment_statement;
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Read_statementContext read_statement() {
			return getRuleContext(Read_statementContext.class,0);
		}
		public Write_statementContext write_statement() {
			return getRuleContext(Write_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
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

	public final StatementContext statement(int reg) throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState(), reg);
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				((StatementContext)_localctx).assignment_statement = assignment_statement(_localctx.reg);
				((StatementContext)_localctx).nreg =  ((StatementContext)_localctx).assignment_statement.nreg;
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				read_statement();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				write_statement(_localctx.reg);
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
		public int reg;
		public int nreg;
		public Token ID;
		public Arith_expressionContext arith_expression;
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(RoseParser.ASSIGNMENT, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
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

	public final Assignment_statementContext assignment_statement(int reg) throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState(), reg);
		enterRule(_localctx, 10, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			((Assignment_statementContext)_localctx).ID = match(ID);
			setState(66);
			match(ASSIGNMENT);
			setState(67);
			((Assignment_statementContext)_localctx).arith_expression = arith_expression(_localctx.reg);
			setState(68);
			match(SEMICOLON);
			System.out.println("\t" + "la $t" + ((Assignment_statementContext)_localctx).arith_expression.nreg + ", " + (((Assignment_statementContext)_localctx).ID!=null?((Assignment_statementContext)_localctx).ID.getText():null));
				System.out.println("\t" + "sw $t" + ((Assignment_statementContext)_localctx).arith_expression.place + ", " + "0($t" + ((Assignment_statementContext)_localctx).arith_expression.nreg +")" );
				((Assignment_statementContext)_localctx).nreg =  ((Assignment_statementContext)_localctx).arith_expression.nreg - 1;
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
		enterRule(_localctx, 12, RULE_read_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(READ);
			setState(72);
			match(ID);
			setState(73);
			match(SEMICOLON);
			System.out.println("\t" + "li $v0, 5");
				System.out.println("\t" + "syscall");
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
		public int reg;
		public int nreg;
		public Arith_expressionContext arith_expression;
		public TerminalNode WRITE() { return getToken(RoseParser.WRITE, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public Write_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Write_statementContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
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

	public final Write_statementContext write_statement(int reg) throws RecognitionException {
		Write_statementContext _localctx = new Write_statementContext(_ctx, getState(), reg);
		enterRule(_localctx, 14, RULE_write_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(WRITE);
			setState(77);
			((Write_statementContext)_localctx).arith_expression = arith_expression(_localctx.reg);
			setState(78);
			match(SEMICOLON);
			System.out.println("\t" + "move $a0, $t" + ((Write_statementContext)_localctx).arith_expression.place);
				System.out.println("\t" + "li $v0, 1");
				System.out.println("\t" + "syscall");
				((Write_statementContext)_localctx).nreg =  ((Write_statementContext)_localctx).arith_expression.nreg-1;
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
		public int reg;
		public int nreg;
		public int place;
		public Arith_termContext arith_term;
		public Arith_expression_Context arith_expression_;
		public Arith_termContext arith_term() {
			return getRuleContext(Arith_termContext.class,0);
		}
		public Arith_expression_Context arith_expression_() {
			return getRuleContext(Arith_expression_Context.class,0);
		}
		public Arith_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_expressionContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
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

	public final Arith_expressionContext arith_expression(int reg) throws RecognitionException {
		Arith_expressionContext _localctx = new Arith_expressionContext(_ctx, getState(), reg);
		enterRule(_localctx, 16, RULE_arith_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			((Arith_expressionContext)_localctx).arith_term = arith_term(_localctx.reg);
			setState(82);
			((Arith_expressionContext)_localctx).arith_expression_ = arith_expression_(((Arith_expressionContext)_localctx).arith_term.nreg, ((Arith_expressionContext)_localctx).arith_term.place);
			((Arith_expressionContext)_localctx).nreg =  ((Arith_expressionContext)_localctx).arith_expression_.nreg; ((Arith_expressionContext)_localctx).place =  ((Arith_expressionContext)_localctx).arith_expression_.place;
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
		public int reg;
		public int notMyPlace;
		public int nreg;
		public int place;
		public Arith_termContext arith_term;
		public TerminalNode ADD() { return getToken(RoseParser.ADD, 0); }
		public Arith_termContext arith_term() {
			return getRuleContext(Arith_termContext.class,0);
		}
		public Arith_expression_Context arith_expression_() {
			return getRuleContext(Arith_expression_Context.class,0);
		}
		public TerminalNode MINUS() { return getToken(RoseParser.MINUS, 0); }
		public Arith_expression_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_expression_Context(ParserRuleContext parent, int invokingState, int reg, int notMyPlace) {
			super(parent, invokingState);
			this.reg = reg;
			this.notMyPlace = notMyPlace;
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

	public final Arith_expression_Context arith_expression_(int reg,int notMyPlace) throws RecognitionException {
		Arith_expression_Context _localctx = new Arith_expression_Context(_ctx, getState(), reg, notMyPlace);
		enterRule(_localctx, 18, RULE_arith_expression_);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(ADD);
				setState(86);
				((Arith_expression_Context)_localctx).arith_term = arith_term(_localctx.reg);
				System.out.println("\t" + "add $t" + _localctx.notMyPlace + ", $t" + _localctx.notMyPlace + ", $t" + ((Arith_expression_Context)_localctx).arith_term.place);
					((Arith_expression_Context)_localctx).place =  _localctx.notMyPlace; ((Arith_expression_Context)_localctx).nreg =  ((Arith_expression_Context)_localctx).arith_term.nreg-1;
				setState(88);
				arith_expression_(_localctx.nreg, _localctx.place);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(MINUS);
				setState(91);
				((Arith_expression_Context)_localctx).arith_term = arith_term(_localctx.reg);
				System.out.println("\t" + "sub $t" + _localctx.notMyPlace + ", $t" + _localctx.notMyPlace + ", $t" + ((Arith_expression_Context)_localctx).arith_term.place);
					((Arith_expression_Context)_localctx).place =  _localctx.notMyPlace; ((Arith_expression_Context)_localctx).nreg =  ((Arith_expression_Context)_localctx).arith_term.nreg-1;
				setState(93);
				arith_expression_(_localctx.nreg, _localctx.place);
				}
				break;
			case SEMICOLON:
			case RIGHT_PARENTHESES:
				enterOuterAlt(_localctx, 3);
				{
				((Arith_expression_Context)_localctx).nreg =  _localctx.reg; ((Arith_expression_Context)_localctx).place =  _localctx.notMyPlace;
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
		public int reg;
		public int nreg;
		public int place;
		public Arith_factorContext arith_factor;
		public Arith_term_Context arith_term_;
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Arith_term_Context arith_term_() {
			return getRuleContext(Arith_term_Context.class,0);
		}
		public Arith_termContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_termContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
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

	public final Arith_termContext arith_term(int reg) throws RecognitionException {
		Arith_termContext _localctx = new Arith_termContext(_ctx, getState(), reg);
		enterRule(_localctx, 20, RULE_arith_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			((Arith_termContext)_localctx).arith_factor = arith_factor(_localctx.reg);
			setState(99);
			((Arith_termContext)_localctx).arith_term_ = arith_term_(((Arith_termContext)_localctx).arith_factor.nreg, ((Arith_termContext)_localctx).arith_factor.place);
			((Arith_termContext)_localctx).nreg =  ((Arith_termContext)_localctx).arith_term_.nreg; ((Arith_termContext)_localctx).place =  ((Arith_termContext)_localctx).arith_term_.place;
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
		public int reg;
		public int notMyPlace;
		public int nreg;
		public int place;
		public Arith_factorContext arith_factor;
		public TerminalNode MULTIPLY() { return getToken(RoseParser.MULTIPLY, 0); }
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Arith_term_Context arith_term_() {
			return getRuleContext(Arith_term_Context.class,0);
		}
		public TerminalNode DIVISION() { return getToken(RoseParser.DIVISION, 0); }
		public TerminalNode MOD() { return getToken(RoseParser.MOD, 0); }
		public Arith_term_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_term_Context(ParserRuleContext parent, int invokingState, int reg, int notMyPlace) {
			super(parent, invokingState);
			this.reg = reg;
			this.notMyPlace = notMyPlace;
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

	public final Arith_term_Context arith_term_(int reg,int notMyPlace) throws RecognitionException {
		Arith_term_Context _localctx = new Arith_term_Context(_ctx, getState(), reg, notMyPlace);
		enterRule(_localctx, 22, RULE_arith_term_);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTIPLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(MULTIPLY);
				setState(103);
				((Arith_term_Context)_localctx).arith_factor = arith_factor(_localctx.reg);
				System.out.println("\t" + "mul $t" + _localctx.notMyPlace + ", $t" + _localctx.notMyPlace + ", $t" + ((Arith_term_Context)_localctx).arith_factor.place);
					((Arith_term_Context)_localctx).place =  _localctx.notMyPlace; ((Arith_term_Context)_localctx).nreg =  ((Arith_term_Context)_localctx).arith_factor.nreg-1;
				setState(105);
				arith_term_(_localctx.nreg, _localctx.place);
				}
				break;
			case DIVISION:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(DIVISION);
				setState(108);
				((Arith_term_Context)_localctx).arith_factor = arith_factor(_localctx.reg);
				System.out.println("\t" + "div $t" + _localctx.notMyPlace + ", $t" + _localctx.notMyPlace + ", $t" + ((Arith_term_Context)_localctx).arith_factor.place);
					((Arith_term_Context)_localctx).place =  _localctx.notMyPlace; ((Arith_term_Context)_localctx).nreg =  ((Arith_term_Context)_localctx).arith_factor.nreg-1;
				setState(110);
				arith_term_(_localctx.nreg, _localctx.place);
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				match(MOD);
				setState(113);
				((Arith_term_Context)_localctx).arith_factor = arith_factor(_localctx.reg);
				System.out.println("\t" + "rem $t" + _localctx.notMyPlace + ", $t" + _localctx.notMyPlace + ", $t" + ((Arith_term_Context)_localctx).arith_factor.place);
					((Arith_term_Context)_localctx).place =  _localctx.notMyPlace; ((Arith_term_Context)_localctx).nreg =  ((Arith_term_Context)_localctx).arith_factor.nreg-1;
				setState(115);
				arith_term_(_localctx.nreg, _localctx.place);
				}
				break;
			case SEMICOLON:
			case ADD:
			case MINUS:
			case RIGHT_PARENTHESES:
				enterOuterAlt(_localctx, 4);
				{
				((Arith_term_Context)_localctx).nreg =  _localctx.reg; ((Arith_term_Context)_localctx).place =  _localctx.notMyPlace;
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
		public int reg;
		public int nreg;
		public int place;
		public Arith_primaryContext arith_primary;
		public TerminalNode MINUS() { return getToken(RoseParser.MINUS, 0); }
		public Arith_primaryContext arith_primary() {
			return getRuleContext(Arith_primaryContext.class,0);
		}
		public Arith_factorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_factorContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
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

	public final Arith_factorContext arith_factor(int reg) throws RecognitionException {
		Arith_factorContext _localctx = new Arith_factorContext(_ctx, getState(), reg);
		enterRule(_localctx, 24, RULE_arith_factor);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(MINUS);
				setState(121);
				((Arith_factorContext)_localctx).arith_primary = arith_primary(_localctx.reg);
				System.out.println("\t" + "neg $t" + ((Arith_factorContext)_localctx).arith_primary.place + ", $t" + ((Arith_factorContext)_localctx).arith_primary.place);
					((Arith_factorContext)_localctx).place =  ((Arith_factorContext)_localctx).arith_primary.place; ((Arith_factorContext)_localctx).nreg =  ((Arith_factorContext)_localctx).arith_primary.nreg;
				}
				break;
			case LEFT_PARENTHESES:
			case ID:
			case CONST_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				((Arith_factorContext)_localctx).arith_primary = arith_primary(_localctx.reg);
				((Arith_factorContext)_localctx).place =  ((Arith_factorContext)_localctx).arith_primary.place; ((Arith_factorContext)_localctx).nreg =  ((Arith_factorContext)_localctx).arith_primary.nreg;
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
		public int reg;
		public int nreg;
		public int place;
		public Token CONST_INT;
		public Token ID;
		public Arith_expressionContext arith_expression;
		public TerminalNode CONST_INT() { return getToken(RoseParser.CONST_INT, 0); }
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode LEFT_PARENTHESES() { return getToken(RoseParser.LEFT_PARENTHESES, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESES() { return getToken(RoseParser.RIGHT_PARENTHESES, 0); }
		public Arith_primaryContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_primaryContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
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

	public final Arith_primaryContext arith_primary(int reg) throws RecognitionException {
		Arith_primaryContext _localctx = new Arith_primaryContext(_ctx, getState(), reg);
		enterRule(_localctx, 26, RULE_arith_primary);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				((Arith_primaryContext)_localctx).CONST_INT = match(CONST_INT);
				System.out.println("\t" + "li $t" + _localctx.reg + ", " + (((Arith_primaryContext)_localctx).CONST_INT!=null?((Arith_primaryContext)_localctx).CONST_INT.getText():null));
					((Arith_primaryContext)_localctx).place =  _localctx.reg; ((Arith_primaryContext)_localctx).nreg =  _localctx.reg + 1;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				((Arith_primaryContext)_localctx).ID = match(ID);
				System.out.println("\t" + "la $t" + _localctx.reg + ", " + (((Arith_primaryContext)_localctx).ID!=null?((Arith_primaryContext)_localctx).ID.getText():null));
					System.out.println("\t" + "lw $t" + _localctx.reg + ", " + "0($t" + _localctx.reg + ")");
					((Arith_primaryContext)_localctx).place =  _localctx.reg; ((Arith_primaryContext)_localctx).nreg =  _localctx.reg+1;
				}
				break;
			case LEFT_PARENTHESES:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				match(LEFT_PARENTHESES);
				setState(134);
				((Arith_primaryContext)_localctx).arith_expression = arith_expression(_localctx.reg);
				setState(135);
				match(RIGHT_PARENTHESES);
				((Arith_primaryContext)_localctx).place =  ((Arith_primaryContext)_localctx).arith_expression.place; ((Arith_primaryContext)_localctx).nreg =  ((Arith_primaryContext)_localctx).arith_expression.nreg;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u008f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\5\5;\n\5\3\6\3\6\3\6\3\6\3\6\5\6B\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13c\n\13\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\ry\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0082\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u008d\n\17\3\17\2\2\20\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\2\2\2\u008c\2\36\3\2\2\2\4.\3\2\2\2\6\60"+
		"\3\2\2\2\b:\3\2\2\2\nA\3\2\2\2\fC\3\2\2\2\16I\3\2\2\2\20N\3\2\2\2\22S"+
		"\3\2\2\2\24b\3\2\2\2\26d\3\2\2\2\30x\3\2\2\2\32\u0081\3\2\2\2\34\u008c"+
		"\3\2\2\2\36\37\7\20\2\2\37 \7(\2\2 !\7\16\2\2!\"\7\6\2\2\"#\b\2\1\2#$"+
		"\5\4\3\2$%\7\5\2\2%&\b\2\1\2&\'\5\b\5\2\'(\7\b\2\2()\7\26\2\2)\3\3\2\2"+
		"\2*+\5\6\4\2+,\5\4\3\2,/\3\2\2\2-/\3\2\2\2.*\3\2\2\2.-\3\2\2\2/\5\3\2"+
		"\2\2\60\61\7(\2\2\61\62\7\24\2\2\62\63\7\r\2\2\63\64\7\26\2\2\64\65\b"+
		"\4\1\2\65\7\3\2\2\2\66\67\5\n\6\2\678\5\b\5\28;\3\2\2\29;\b\5\1\2:\66"+
		"\3\2\2\2:9\3\2\2\2;\t\3\2\2\2<=\5\f\7\2=>\b\6\1\2>B\3\2\2\2?B\5\16\b\2"+
		"@B\5\20\t\2A<\3\2\2\2A?\3\2\2\2A@\3\2\2\2B\13\3\2\2\2CD\7(\2\2DE\7%\2"+
		"\2EF\5\22\n\2FG\7\26\2\2GH\b\7\1\2H\r\3\2\2\2IJ\7\21\2\2JK\7(\2\2KL\7"+
		"\26\2\2LM\b\b\1\2M\17\3\2\2\2NO\7\23\2\2OP\5\22\n\2PQ\7\26\2\2QR\b\t\1"+
		"\2R\21\3\2\2\2ST\5\26\f\2TU\5\24\13\2UV\b\n\1\2V\23\3\2\2\2WX\7\27\2\2"+
		"XY\5\26\f\2YZ\b\13\1\2Z[\5\24\13\2[c\3\2\2\2\\]\7\30\2\2]^\5\26\f\2^_"+
		"\b\13\1\2_`\5\24\13\2`c\3\2\2\2ac\b\13\1\2bW\3\2\2\2b\\\3\2\2\2ba\3\2"+
		"\2\2c\25\3\2\2\2de\5\32\16\2ef\5\30\r\2fg\b\f\1\2g\27\3\2\2\2hi\7\31\2"+
		"\2ij\5\32\16\2jk\b\r\1\2kl\5\30\r\2ly\3\2\2\2mn\7\32\2\2no\5\32\16\2o"+
		"p\b\r\1\2pq\5\30\r\2qy\3\2\2\2rs\7\33\2\2st\5\32\16\2tu\b\r\1\2uv\5\30"+
		"\r\2vy\3\2\2\2wy\b\r\1\2xh\3\2\2\2xm\3\2\2\2xr\3\2\2\2xw\3\2\2\2y\31\3"+
		"\2\2\2z{\7\30\2\2{|\5\34\17\2|}\b\16\1\2}\u0082\3\2\2\2~\177\5\34\17\2"+
		"\177\u0080\b\16\1\2\u0080\u0082\3\2\2\2\u0081z\3\2\2\2\u0081~\3\2\2\2"+
		"\u0082\33\3\2\2\2\u0083\u0084\7)\2\2\u0084\u008d\b\17\1\2\u0085\u0086"+
		"\7(\2\2\u0086\u008d\b\17\1\2\u0087\u0088\7&\2\2\u0088\u0089\5\22\n\2\u0089"+
		"\u008a\7\'\2\2\u008a\u008b\b\17\1\2\u008b\u008d\3\2\2\2\u008c\u0083\3"+
		"\2\2\2\u008c\u0085\3\2\2\2\u008c\u0087\3\2\2\2\u008d\35\3\2\2\2\t.:Ab"+
		"x\u0081\u008c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}