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
		RULE_statement = 4, RULE_assignment_statement = 5, RULE_if_statement = 6, 
		RULE_if_statement_ = 7, RULE_for_statement = 8, RULE_exit_statement = 9, 
		RULE_read_statement = 10, RULE_write_statement = 11, RULE_bool_expression = 12, 
		RULE_bool_expression_ = 13, RULE_bool_term = 14, RULE_bool_term_ = 15, 
		RULE_bool_factor = 16, RULE_bool_primary = 17, RULE_relation_op = 18, 
		RULE_arith_expression = 19, RULE_arith_expression_ = 20, RULE_arith_term = 21, 
		RULE_arith_term_ = 22, RULE_arith_factor = 23, RULE_arith_primary = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "variables", "variable", "statements", "statement", "assignment_statement", 
			"if_statement", "if_statement_", "for_statement", "exit_statement", "read_statement", 
			"write_statement", "bool_expression", "bool_expression_", "bool_term", 
			"bool_term_", "bool_factor", "bool_primary", "relation_op", "arith_expression", 
			"arith_expression_", "arith_term", "arith_term_", "arith_factor", "arith_primary"
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
			setState(50);
			match(PROCEDURE);
			setState(51);
			match(ID);
			setState(52);
			match(IS);
			setState(53);
			match(DECLARE);
			System.out.println("\t" + ".data");
			setState(55);
			variables();
			setState(56);
			match(BEGIN);
			System.out.println("\t" + ".text");
				System.out.println("main:");
			setState(58);
			statements(0, 1);
			setState(59);
			match(END);
			setState(60);
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
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				variable();
				setState(63);
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
			setState(68);
			((VariableContext)_localctx).ID = match(ID);
			setState(69);
			match(COLON);
			setState(70);
			match(INTEGER);
			setState(71);
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
		public int label;
		public int nreg;
		public int nlabel;
		public StatementContext statement;
		public StatementsContext statements;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementsContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
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

	public final StatementsContext statements(int reg,int label) throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState(), reg, label);
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
				setState(74);
				((StatementsContext)_localctx).statement = statement(_localctx.reg, _localctx.label);
				setState(75);
				((StatementsContext)_localctx).statements = statements(((StatementsContext)_localctx).statement.nreg, ((StatementsContext)_localctx).statement.nlabel);

						((StatementsContext)_localctx).nreg =  ((StatementsContext)_localctx).statements.nreg; ((StatementsContext)_localctx).nlabel =  ((StatementsContext)_localctx).statements.nlabel;
					
				}
				break;
			case ELSE:
			case END:
				enterOuterAlt(_localctx, 2);
				{

						// System.out.println("no more statements, reg = $t" + _localctx.reg); 
						((StatementsContext)_localctx).nreg =  _localctx.reg; ((StatementsContext)_localctx).nlabel =  _localctx.label;
					
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
		public int label;
		public int nreg;
		public int nlabel;
		public Assignment_statementContext assignment_statement;
		public If_statementContext if_statement;
		public For_statementContext for_statement;
		public Read_statementContext read_statement;
		public Write_statementContext write_statement;
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
		public StatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
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

	public final StatementContext statement(int reg,int label) throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				((StatementContext)_localctx).assignment_statement = assignment_statement(_localctx.reg);

						((StatementContext)_localctx).nreg =  ((StatementContext)_localctx).assignment_statement.nreg; ((StatementContext)_localctx).nlabel =  _localctx.label;
					
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				((StatementContext)_localctx).if_statement = if_statement(_localctx.reg, _localctx.label);

						((StatementContext)_localctx).nreg =  ((StatementContext)_localctx).if_statement.nreg; 
						((StatementContext)_localctx).nlabel =  ((StatementContext)_localctx).if_statement.nlabel;
					
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				((StatementContext)_localctx).for_statement = for_statement(_localctx.reg, _localctx.label);

						((StatementContext)_localctx).nreg =  ((StatementContext)_localctx).for_statement.nreg;
						((StatementContext)_localctx).nlabel =  ((StatementContext)_localctx).for_statement.nlabel;
					
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				exit_statement();

						((StatementContext)_localctx).nreg =  _localctx.reg;
						((StatementContext)_localctx).nlabel =  _localctx.label;
					
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				((StatementContext)_localctx).read_statement = read_statement(_localctx.reg);

						((StatementContext)_localctx).nreg =  ((StatementContext)_localctx).read_statement.nreg;
						((StatementContext)_localctx).nlabel =  _localctx.label;
					
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				((StatementContext)_localctx).write_statement = write_statement(_localctx.reg);

						((StatementContext)_localctx).nreg =  ((StatementContext)_localctx).write_statement.nreg;
						((StatementContext)_localctx).nlabel =  _localctx.label;
					
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
			setState(101);
			((Assignment_statementContext)_localctx).ID = match(ID);
			setState(102);
			match(ASSIGNMENT);
			setState(103);
			((Assignment_statementContext)_localctx).arith_expression = arith_expression(_localctx.reg);
			setState(104);
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

	public static class If_statementContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public int temp_B_true;
		public int temp_B_false;
		public int temp_L_to_next;
		public Bool_expressionContext bool_expression;
		public StatementsContext statements;
		public If_statement_Context if_statement_;
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
		public If_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public If_statementContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
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

	public final If_statementContext if_statement(int reg,int label) throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 12, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(IF);
			setState(108);
			((If_statementContext)_localctx).bool_expression = bool_expression(_localctx.reg, _localctx.label, _localctx.label+1, _localctx.label+3);

					((If_statementContext)_localctx).temp_B_true =  _localctx.label; 
					((If_statementContext)_localctx).temp_B_false =  _localctx.label+1; 
					((If_statementContext)_localctx).temp_L_to_next =  _localctx.label+2;
				
			setState(110);
			match(THEN);

					System.out.println("L" + _localctx.temp_B_true + ":");
				
			setState(112);
			((If_statementContext)_localctx).statements = statements(((If_statementContext)_localctx).bool_expression.nreg, ((If_statementContext)_localctx).bool_expression.nlabel);
			setState(113);
			((If_statementContext)_localctx).if_statement_ = if_statement_(((If_statementContext)_localctx).statements.nreg, ((If_statementContext)_localctx).statements.nlabel, _localctx.temp_L_to_next, _localctx.temp_B_false);

					((If_statementContext)_localctx).nreg =  ((If_statementContext)_localctx).if_statement_.nreg; 
					((If_statementContext)_localctx).nlabel =  ((If_statementContext)_localctx).if_statement_.nlabel;
				
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
		public int reg;
		public int label;
		public int L_to_next;
		public int B_false;
		public int nreg;
		public int nlabel;
		public StatementsContext statements;
		public TerminalNode END() { return getToken(RoseParser.END, 0); }
		public TerminalNode IF() { return getToken(RoseParser.IF, 0); }
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public TerminalNode ELSE() { return getToken(RoseParser.ELSE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public If_statement_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public If_statement_Context(ParserRuleContext parent, int invokingState, int reg, int label, int L_to_next, int B_false) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.L_to_next = L_to_next;
			this.B_false = B_false;
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

	public final If_statement_Context if_statement_(int reg,int label,int L_to_next,int B_false) throws RecognitionException {
		If_statement_Context _localctx = new If_statement_Context(_ctx, getState(), reg, label, L_to_next, B_false);
		enterRule(_localctx, 14, RULE_if_statement_);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(END);
				setState(117);
				match(IF);
				setState(118);
				match(SEMICOLON);

						System.out.println("L" + _localctx.B_false + ":"); 
						((If_statement_Context)_localctx).nreg =  _localctx.reg; 
						((If_statement_Context)_localctx).nlabel =  _localctx.label;
					
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(ELSE);

						System.out.println("\t" + "b L" + _localctx.L_to_next); 
						System.out.println("L" + _localctx.B_false + ":");
					
				setState(122);
				((If_statement_Context)_localctx).statements = statements(_localctx.reg, _localctx.label);

						System.out.println("L" + _localctx.L_to_next + ":"); 
						((If_statement_Context)_localctx).nreg =  ((If_statement_Context)_localctx).statements.nreg; 
						((If_statement_Context)_localctx).nlabel =  ((If_statement_Context)_localctx).statements.nlabel;
					
				setState(124);
				match(END);
				setState(125);
				match(IF);
				setState(126);
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
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public int temp_B_true;
		public int temp_B_false;
		public int temp_L_begin;
		public Token ID;
		public Arith_expressionContext E1;
		public Arith_expressionContext E2;
		public StatementsContext statements;
		public TerminalNode FOR() { return getToken(RoseParser.FOR, 0); }
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode IN() { return getToken(RoseParser.IN, 0); }
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
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public For_statementContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
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

	public final For_statementContext for_statement(int reg,int label) throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 16, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(FOR);
			setState(131);
			((For_statementContext)_localctx).ID = match(ID);
			setState(132);
			match(IN);
			setState(133);
			((For_statementContext)_localctx).E1 = arith_expression(_localctx.reg);
			setState(134);
			match(RANGE);

					System.out.println("\t" + "la $t" + ((For_statementContext)_localctx).E1.nreg + ", " + (((For_statementContext)_localctx).ID!=null?((For_statementContext)_localctx).ID.getText():null));
					System.out.println("\t" + "sw $t" + ((For_statementContext)_localctx).E1.place + ", 0($t" + ((For_statementContext)_localctx).E1.nreg + ")" );
					((For_statementContext)_localctx).reg =  ((For_statementContext)_localctx).E1.nreg-1;
					((For_statementContext)_localctx).temp_L_begin =  _localctx.label++;
					((For_statementContext)_localctx).temp_B_true =  _localctx.label++;
					((For_statementContext)_localctx).temp_B_false =  _localctx.label++;
					System.out.println("L" + _localctx.temp_L_begin + ":");
					System.out.println("\t" + "la $t" + _localctx.reg + ", " + (((For_statementContext)_localctx).ID!=null?((For_statementContext)_localctx).ID.getText():null));
					System.out.println("\t" + "lw $t" + _localctx.reg + ", 0($t" + _localctx.reg + ")" );
				
			setState(136);
			((For_statementContext)_localctx).E2 = arith_expression(_localctx.reg+1);
			setState(137);
			match(LOOP);

					System.out.println("\t" + "ble $t" + _localctx.reg + ", $t" + ((For_statementContext)_localctx).E2.place + ", " + "L" + _localctx.temp_B_true);
					((For_statementContext)_localctx).reg =  _localctx.reg;
					System.out.println("\t" + "b L" + _localctx.temp_B_false);
					System.out.println("L" + _localctx.temp_B_true + ":");
				
			setState(139);
			((For_statementContext)_localctx).statements = statements(_localctx.reg, _localctx.label);

					((For_statementContext)_localctx).reg =  ((For_statementContext)_localctx).statements.nreg;
					System.out.println("\t" + "la $t" + _localctx.reg + ", " + (((For_statementContext)_localctx).ID!=null?((For_statementContext)_localctx).ID.getText():null));
					System.out.println("\t" + "lw $t" + _localctx.reg + ", 0($t" + _localctx.reg + ")" );
					System.out.println("\t" + "li $t" + (_localctx.reg+1) + ", 1");
					System.out.println("\t" + "add $t" + _localctx.reg + ", $t" + _localctx.reg + ", $t" + (_localctx.reg+1));
					System.out.println("\t" + "la $t" + (_localctx.reg+1) + ", " + (((For_statementContext)_localctx).ID!=null?((For_statementContext)_localctx).ID.getText():null));
					System.out.println("\t" + "sw $t" + _localctx.reg + ", 0($t" + (_localctx.reg+1) + ")" );
					System.out.println("\t" + "b L" + _localctx.temp_L_begin);		
				
			setState(141);
			match(END);
			setState(142);
			match(LOOP);
			setState(143);
			match(SEMICOLON);

					System.out.println("L" + _localctx.temp_B_false + ":");
					((For_statementContext)_localctx).nreg =  _localctx.reg;
					((For_statementContext)_localctx).nlabel =  ((For_statementContext)_localctx).statements.nlabel;
				
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
			setState(146);
			match(EXIT);
			setState(147);
			match(SEMICOLON);

				System.out.println("\t" + "li $v0, 10");
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

	public static class Read_statementContext extends ParserRuleContext {
		public int reg;
		public int nreg;
		public Token ID;
		public TerminalNode READ() { return getToken(RoseParser.READ, 0); }
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public Read_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Read_statementContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
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

	public final Read_statementContext read_statement(int reg) throws RecognitionException {
		Read_statementContext _localctx = new Read_statementContext(_ctx, getState(), reg);
		enterRule(_localctx, 20, RULE_read_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(READ);
			setState(151);
			((Read_statementContext)_localctx).ID = match(ID);
			setState(152);
			match(SEMICOLON);

				System.out.println("\t" + "li $v0, 5");
				System.out.println("\t" + "syscall");
				System.out.println("\t" + "la $t" + _localctx.reg + ", " + (((Read_statementContext)_localctx).ID!=null?((Read_statementContext)_localctx).ID.getText():null));
				System.out.println("\t" + "sw $v0, 0($t" + _localctx.reg + ")");
				((Read_statementContext)_localctx).nreg =  _localctx.reg;
				
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
		enterRule(_localctx, 22, RULE_write_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(WRITE);
			setState(156);
			((Write_statementContext)_localctx).arith_expression = arith_expression(_localctx.reg);
			setState(157);
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

	public static class Bool_expressionContext extends ParserRuleContext {
		public int reg;
		public int B_true;
		public int B_false;
		public int label;
		public int nreg;
		public int nlabel;
		public Bool_termContext bool_term;
		public Bool_expression_Context bool_expression_;
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_expression_Context bool_expression_() {
			return getRuleContext(Bool_expression_Context.class,0);
		}
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_expressionContext(ParserRuleContext parent, int invokingState, int reg, int B_true, int B_false, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.B_true = B_true;
			this.B_false = B_false;
			this.label = label;
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

	public final Bool_expressionContext bool_expression(int reg,int B_true,int B_false,int label) throws RecognitionException {
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, getState(), reg, B_true, B_false, label);
		enterRule(_localctx, 24, RULE_bool_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			((Bool_expressionContext)_localctx).bool_term = bool_term(_localctx.reg, _localctx.B_true, _localctx.B_false, _localctx.label);
			setState(161);
			((Bool_expressionContext)_localctx).bool_expression_ = bool_expression_(((Bool_expressionContext)_localctx).bool_term.nreg, _localctx.B_true, _localctx.B_false, ((Bool_expressionContext)_localctx).bool_term.nlabel, ((Bool_expressionContext)_localctx).bool_term.n_E1_place, ((Bool_expressionContext)_localctx).bool_term.n_E2_place, ((Bool_expressionContext)_localctx).bool_term.n_operation, ((Bool_expressionContext)_localctx).bool_term.n_f_not);

					((Bool_expressionContext)_localctx).nreg =  ((Bool_expressionContext)_localctx).bool_expression_.nreg;
					((Bool_expressionContext)_localctx).nlabel =  ((Bool_expressionContext)_localctx).bool_expression_.nlabel;
				
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
		public int reg;
		public int B_true;
		public int B_false;
		public int label;
		public int E1_place;
		public int E2_place;
		public int operation;
		public int f_not;
		public int nreg;
		public int nlabel;
		public int temp_B_true;
		public int temp_B_false;
		public Bool_termContext bool_term;
		public TerminalNode OR() { return getToken(RoseParser.OR, 0); }
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_expression_Context bool_expression_() {
			return getRuleContext(Bool_expression_Context.class,0);
		}
		public Bool_expression_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_expression_Context(ParserRuleContext parent, int invokingState, int reg, int B_true, int B_false, int label, int E1_place, int E2_place, int operation, int f_not) {
			super(parent, invokingState);
			this.reg = reg;
			this.B_true = B_true;
			this.B_false = B_false;
			this.label = label;
			this.E1_place = E1_place;
			this.E2_place = E2_place;
			this.operation = operation;
			this.f_not = f_not;
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

	public final Bool_expression_Context bool_expression_(int reg,int B_true,int B_false,int label,int E1_place,int E2_place,int operation,int f_not) throws RecognitionException {
		Bool_expression_Context _localctx = new Bool_expression_Context(_ctx, getState(), reg, B_true, B_false, label, E1_place, E2_place, operation, f_not);
		enterRule(_localctx, 26, RULE_bool_expression_);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{

						((Bool_expression_Context)_localctx).temp_B_false =  _localctx.label;
						((Bool_expression_Context)_localctx).temp_B_true =  _localctx.B_true;
						if (_localctx.f_not == 1)
						{
							((Bool_expression_Context)_localctx).temp_B_true =  _localctx.label;
							((Bool_expression_Context)_localctx).temp_B_false =  _localctx.B_true;
						}
						_localctx.label++;
						switch (_localctx.operation){
						case 0:
							System.out.println("\t" + "beq $t" + _localctx.E1_place + ", $t" + _localctx.E2_place + ", " + "L" + _localctx.temp_B_true);
							break;
						case 1:
							System.out.println("error: angle bracket case");
							break;
						case 2:
							System.out.println("\t" + "bgt $t" + _localctx.E1_place + ", $t" + _localctx.E2_place + ", " + "L" + _localctx.temp_B_true);
							break;
						case 3:
							System.out.println("\t" + "bge $t" + _localctx.E1_place + ", $t" + _localctx.E2_place + ", " + "L" + _localctx.temp_B_true);
							break;
						case 4:
							System.out.println("\t" + "blt $t" + _localctx.E1_place + ", $t" + _localctx.E2_place + ", " + "L" + _localctx.temp_B_true);
							break;
						case 5:
							System.out.println("\t" + "ble $t" + _localctx.E1_place + ", $t" + _localctx.E2_place + ", " + "L" + _localctx.temp_B_true);
							break;
						default:
							System.out.println("error: switch to default");
						}
						System.out.println("\t" + "b L" + _localctx.temp_B_false);
						_localctx.reg -= 2;
					
				setState(165);
				match(OR);

						System.out.println("L" + _localctx.temp_B_false + ":");
					
				setState(167);
				((Bool_expression_Context)_localctx).bool_term = bool_term(_localctx.reg, _localctx.B_true, _localctx.B_false, _localctx.label);
				setState(168);
				bool_expression_(((Bool_expression_Context)_localctx).bool_term.nreg, _localctx.B_true, _localctx.B_false, ((Bool_expression_Context)_localctx).bool_term.nlabel, ((Bool_expression_Context)_localctx).bool_term.n_E1_place, ((Bool_expression_Context)_localctx).bool_term.n_E2_place, ((Bool_expression_Context)_localctx).bool_term.n_operation, ((Bool_expression_Context)_localctx).bool_term.n_f_not);
				}
				break;
			case THEN:
				enterOuterAlt(_localctx, 2);
				{

						((Bool_expression_Context)_localctx).temp_B_false =  _localctx.B_false;
						((Bool_expression_Context)_localctx).temp_B_true =  _localctx.B_true;
						if (_localctx.f_not == 1)
						{
							((Bool_expression_Context)_localctx).temp_B_true =  _localctx.B_false;
							((Bool_expression_Context)_localctx).temp_B_false =  _localctx.B_true;
						}
						switch (_localctx.operation){
						case 0:
							System.out.println("\t" + "beq $t" + _localctx.E1_place + ", $t" + _localctx.E2_place + ", " + "L" + _localctx.temp_B_true);
							break;
						case 1:
							System.out.println("error: angle bracket case");
							break;
						case 2:
							System.out.println("\t" + "bgt $t" + _localctx.E1_place + ", $t" + _localctx.E2_place + ", " + "L" + _localctx.temp_B_true);
							break;
						case 3:
							System.out.println("\t" + "bge $t" + _localctx.E1_place + ", $t" + _localctx.E2_place + ", " + "L" + _localctx.temp_B_true);
							break;
						case 4:
							System.out.println("\t" + "blt $t" + _localctx.E1_place + ", $t" + _localctx.E2_place + ", " + "L" + _localctx.temp_B_true);
							break;
						case 5:
							System.out.println("\t" + "ble $t" + _localctx.E1_place + ", $t" + _localctx.E2_place + ", " + "L" + _localctx.temp_B_true);
							break;
						default:
							System.out.println("error: switch to default");
						}
						System.out.println("\t" + "b L" + _localctx.temp_B_false);
						_localctx.reg -= 2;

						((Bool_expression_Context)_localctx).nreg =  _localctx.reg;
						((Bool_expression_Context)_localctx).nlabel =  _localctx.label;
					
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
		public int reg;
		public int B_true;
		public int B_false;
		public int label;
		public int nreg;
		public int nlabel;
		public int n_E1_place;
		public int n_E2_place;
		public int n_operation;
		public int n_f_not;
		public Bool_factorContext bool_factor;
		public Bool_term_Context bool_term_;
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_term_Context bool_term_() {
			return getRuleContext(Bool_term_Context.class,0);
		}
		public Bool_termContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_termContext(ParserRuleContext parent, int invokingState, int reg, int B_true, int B_false, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.B_true = B_true;
			this.B_false = B_false;
			this.label = label;
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

	public final Bool_termContext bool_term(int reg,int B_true,int B_false,int label) throws RecognitionException {
		Bool_termContext _localctx = new Bool_termContext(_ctx, getState(), reg, B_true, B_false, label);
		enterRule(_localctx, 28, RULE_bool_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			((Bool_termContext)_localctx).bool_factor = bool_factor(_localctx.reg);
			setState(174);
			((Bool_termContext)_localctx).bool_term_ = bool_term_(((Bool_termContext)_localctx).bool_factor.nreg, _localctx.B_true, _localctx.B_false, _localctx.label, ((Bool_termContext)_localctx).bool_factor.n_E1_place, ((Bool_termContext)_localctx).bool_factor.n_E2_place, ((Bool_termContext)_localctx).bool_factor.n_operation, ((Bool_termContext)_localctx).bool_factor.n_f_not);

					((Bool_termContext)_localctx).nreg =  ((Bool_termContext)_localctx).bool_term_.nreg;
					((Bool_termContext)_localctx).nlabel =  ((Bool_termContext)_localctx).bool_term_.nlabel;
					((Bool_termContext)_localctx).n_E1_place =  ((Bool_termContext)_localctx).bool_term_.n_E1_place;
					((Bool_termContext)_localctx).n_E2_place =  ((Bool_termContext)_localctx).bool_term_.n_E2_place;
					((Bool_termContext)_localctx).n_operation =  ((Bool_termContext)_localctx).bool_term_.n_operation;
					((Bool_termContext)_localctx).n_f_not =  ((Bool_termContext)_localctx).bool_term_.n_f_not;
				
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
		public int reg;
		public int B_true;
		public int B_false;
		public int label;
		public int E1_place;
		public int E2_place;
		public int operation;
		public int f_not;
		public int nreg;
		public int nlabel;
		public int n_E1_place;
		public int n_E2_place;
		public int n_operation;
		public int n_f_not;
		public int temp_B_true;
		public int temp_B_false;
		public Bool_factorContext bool_factor;
		public TerminalNode AND() { return getToken(RoseParser.AND, 0); }
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_term_Context bool_term_() {
			return getRuleContext(Bool_term_Context.class,0);
		}
		public Bool_term_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_term_Context(ParserRuleContext parent, int invokingState, int reg, int B_true, int B_false, int label, int E1_place, int E2_place, int operation, int f_not) {
			super(parent, invokingState);
			this.reg = reg;
			this.B_true = B_true;
			this.B_false = B_false;
			this.label = label;
			this.E1_place = E1_place;
			this.E2_place = E2_place;
			this.operation = operation;
			this.f_not = f_not;
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

	public final Bool_term_Context bool_term_(int reg,int B_true,int B_false,int label,int E1_place,int E2_place,int operation,int f_not) throws RecognitionException {
		Bool_term_Context _localctx = new Bool_term_Context(_ctx, getState(), reg, B_true, B_false, label, E1_place, E2_place, operation, f_not);
		enterRule(_localctx, 30, RULE_bool_term_);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{

						((Bool_term_Context)_localctx).temp_B_true =  _localctx.label;
						((Bool_term_Context)_localctx).temp_B_false =  _localctx.B_false;
						if (_localctx.f_not == 1)
						{
							((Bool_term_Context)_localctx).temp_B_true =  _localctx.B_false;
							((Bool_term_Context)_localctx).temp_B_false =  _localctx.label;
						}
						_localctx.label++;
						switch (_localctx.operation){
							case 0:
								System.out.println("\t" + "beq $t" + _localctx.E1_place + ", $t" + _localctx.E2_place + ", " + "L" + _localctx.temp_B_true);
								break;
							case 1:
								System.out.println("error: angle bracket case");
								break;
							case 2:
								System.out.println("\t" + "bgt $t" + _localctx.E1_place + ", $t" + _localctx.E2_place + ", " + "L" + _localctx.temp_B_true);
								break;
							case 3:
								System.out.println("\t" + "bge $t" + _localctx.E1_place + ", $t" + _localctx.E2_place + ", " + "L" + _localctx.temp_B_true);
								break;
							case 4:
								System.out.println("\t" + "blt $t" + _localctx.E1_place + ", $t" + _localctx.E2_place + ", " + "L" + _localctx.temp_B_true);
								break;
							case 5:
								System.out.println("\t" + "ble $t" + _localctx.E1_place + ", $t" + _localctx.E2_place + ", " + "L" + _localctx.temp_B_true);
								break;
							default:
								System.out.println("error: switch to default");
					}
					System.out.println("\t" + "b L" + _localctx.temp_B_false);
					_localctx.reg -= 2;
					
				setState(178);
				match(AND);

						System.out.println("L" + _localctx.temp_B_true + ":");
					
				setState(180);
				((Bool_term_Context)_localctx).bool_factor = bool_factor(_localctx.reg);
				setState(181);
				bool_term_(((Bool_term_Context)_localctx).bool_factor.nreg, _localctx.B_true, _localctx.B_false, _localctx.label, ((Bool_term_Context)_localctx).bool_factor.n_E1_place, ((Bool_term_Context)_localctx).bool_factor.n_E2_place, ((Bool_term_Context)_localctx).bool_factor.n_operation, ((Bool_term_Context)_localctx).bool_factor.n_f_not);
				}
				break;
			case THEN:
			case OR:
				enterOuterAlt(_localctx, 2);
				{

						((Bool_term_Context)_localctx).nreg =  _localctx.reg;
						((Bool_term_Context)_localctx).nlabel =  _localctx.label;
						((Bool_term_Context)_localctx).n_E1_place =  _localctx.E1_place;
						((Bool_term_Context)_localctx).n_E2_place =  _localctx.E2_place;
						((Bool_term_Context)_localctx).n_operation =  _localctx.operation;
						((Bool_term_Context)_localctx).n_f_not =  _localctx.f_not;
					
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
		public int reg;
		public int nreg;
		public int n_E1_place;
		public int n_E2_place;
		public int n_operation;
		public int n_f_not;
		public Bool_primaryContext bool_primary;
		public TerminalNode NOT() { return getToken(RoseParser.NOT, 0); }
		public Bool_primaryContext bool_primary() {
			return getRuleContext(Bool_primaryContext.class,0);
		}
		public Bool_factorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_factorContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
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

	public final Bool_factorContext bool_factor(int reg) throws RecognitionException {
		Bool_factorContext _localctx = new Bool_factorContext(_ctx, getState(), reg);
		enterRule(_localctx, 32, RULE_bool_factor);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(NOT);
				setState(187);
				((Bool_factorContext)_localctx).bool_primary = bool_primary(_localctx.reg);

						((Bool_factorContext)_localctx).nreg =  ((Bool_factorContext)_localctx).bool_primary.nreg; 
						((Bool_factorContext)_localctx).n_E1_place =  ((Bool_factorContext)_localctx).bool_primary.n_E1_place; 
						((Bool_factorContext)_localctx).n_E2_place =  ((Bool_factorContext)_localctx).bool_primary.n_E2_place; 
						((Bool_factorContext)_localctx).n_operation =  ((Bool_factorContext)_localctx).bool_primary.n_operation; 
						((Bool_factorContext)_localctx).n_f_not =  1;
					
				}
				break;
			case MINUS:
			case LEFT_PARENTHESES:
			case ID:
			case CONST_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				((Bool_factorContext)_localctx).bool_primary = bool_primary(_localctx.reg);

						((Bool_factorContext)_localctx).nreg =  ((Bool_factorContext)_localctx).bool_primary.nreg; 
						((Bool_factorContext)_localctx).n_E1_place =  ((Bool_factorContext)_localctx).bool_primary.n_E1_place; 
						((Bool_factorContext)_localctx).n_E2_place =  ((Bool_factorContext)_localctx).bool_primary.n_E2_place; 
						((Bool_factorContext)_localctx).n_operation =  ((Bool_factorContext)_localctx).bool_primary.n_operation; 
						((Bool_factorContext)_localctx).n_f_not =  0;
					
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
		public int reg;
		public int nreg;
		public int n_E1_place;
		public int n_E2_place;
		public int n_operation;
		public Arith_expressionContext E1;
		public Relation_opContext relation_op;
		public Arith_expressionContext E2;
		public Relation_opContext relation_op() {
			return getRuleContext(Relation_opContext.class,0);
		}
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public Bool_primaryContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_primaryContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
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

	public final Bool_primaryContext bool_primary(int reg) throws RecognitionException {
		Bool_primaryContext _localctx = new Bool_primaryContext(_ctx, getState(), reg);
		enterRule(_localctx, 34, RULE_bool_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			((Bool_primaryContext)_localctx).E1 = arith_expression(_localctx.reg);
			setState(196);
			((Bool_primaryContext)_localctx).relation_op = relation_op();
			setState(197);
			((Bool_primaryContext)_localctx).E2 = arith_expression(((Bool_primaryContext)_localctx).E1.nreg);

					((Bool_primaryContext)_localctx).nreg =  ((Bool_primaryContext)_localctx).E2.nreg; 
					((Bool_primaryContext)_localctx).n_E1_place =  ((Bool_primaryContext)_localctx).E1.place; 
					((Bool_primaryContext)_localctx).n_E2_place =  ((Bool_primaryContext)_localctx).E2.place; 
					((Bool_primaryContext)_localctx).n_operation =  ((Bool_primaryContext)_localctx).relation_op.operation;
				
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
		public int operation;
		public TerminalNode EQUAL() { return getToken(RoseParser.EQUAL, 0); }
		public TerminalNode ANGLE_BRACKETS() { return getToken(RoseParser.ANGLE_BRACKETS, 0); }
		public TerminalNode GREATER_THAN() { return getToken(RoseParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_OR_EQUAL() { return getToken(RoseParser.GREATER_THAN_OR_EQUAL, 0); }
		public TerminalNode LESS_THAN() { return getToken(RoseParser.LESS_THAN, 0); }
		public TerminalNode LESS_THAN_OR_EQUAL() { return getToken(RoseParser.LESS_THAN_OR_EQUAL, 0); }
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
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(EQUAL);
				((Relation_opContext)_localctx).operation =  0;
				}
				break;
			case ANGLE_BRACKETS:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(ANGLE_BRACKETS);
				((Relation_opContext)_localctx).operation =  1;
				}
				break;
			case GREATER_THAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(GREATER_THAN);
				((Relation_opContext)_localctx).operation =  2;
				}
				break;
			case GREATER_THAN_OR_EQUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				match(GREATER_THAN_OR_EQUAL);
				((Relation_opContext)_localctx).operation =  3;
				}
				break;
			case LESS_THAN:
				enterOuterAlt(_localctx, 5);
				{
				setState(208);
				match(LESS_THAN);
				((Relation_opContext)_localctx).operation =  4;
				}
				break;
			case LESS_THAN_OR_EQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(210);
				match(LESS_THAN_OR_EQUAL);
				((Relation_opContext)_localctx).operation =  5;
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
		enterRule(_localctx, 38, RULE_arith_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			((Arith_expressionContext)_localctx).arith_term = arith_term(_localctx.reg);
			setState(215);
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
		enterRule(_localctx, 40, RULE_arith_expression_);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(ADD);
				setState(219);
				((Arith_expression_Context)_localctx).arith_term = arith_term(_localctx.reg);
				System.out.println("\t" + "add $t" + _localctx.notMyPlace + ", $t" + _localctx.notMyPlace + ", $t" + ((Arith_expression_Context)_localctx).arith_term.place);
					((Arith_expression_Context)_localctx).place =  _localctx.notMyPlace; ((Arith_expression_Context)_localctx).nreg =  ((Arith_expression_Context)_localctx).arith_term.nreg-1;
				setState(221);
				arith_expression_(_localctx.nreg, _localctx.place);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(MINUS);
				setState(224);
				((Arith_expression_Context)_localctx).arith_term = arith_term(_localctx.reg);
				System.out.println("\t" + "sub $t" + _localctx.notMyPlace + ", $t" + _localctx.notMyPlace + ", $t" + ((Arith_expression_Context)_localctx).arith_term.place);
					((Arith_expression_Context)_localctx).place =  _localctx.notMyPlace; ((Arith_expression_Context)_localctx).nreg =  ((Arith_expression_Context)_localctx).arith_term.nreg-1;
				setState(226);
				arith_expression_(_localctx.nreg, _localctx.place);
				}
				break;
			case LOOP:
			case THEN:
			case RANGE:
			case SEMICOLON:
			case EQUAL:
			case ANGLE_BRACKETS:
			case GREATER_THAN:
			case GREATER_THAN_OR_EQUAL:
			case LESS_THAN:
			case LESS_THAN_OR_EQUAL:
			case AND:
			case OR:
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
		enterRule(_localctx, 42, RULE_arith_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			((Arith_termContext)_localctx).arith_factor = arith_factor(_localctx.reg);
			setState(232);
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
		enterRule(_localctx, 44, RULE_arith_term_);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTIPLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(MULTIPLY);
				setState(236);
				((Arith_term_Context)_localctx).arith_factor = arith_factor(_localctx.reg);
				System.out.println("\t" + "mul $t" + _localctx.notMyPlace + ", $t" + _localctx.notMyPlace + ", $t" + ((Arith_term_Context)_localctx).arith_factor.place);
					((Arith_term_Context)_localctx).place =  _localctx.notMyPlace; ((Arith_term_Context)_localctx).nreg =  ((Arith_term_Context)_localctx).arith_factor.nreg-1;
				setState(238);
				arith_term_(_localctx.nreg, _localctx.place);
				}
				break;
			case DIVISION:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(DIVISION);
				setState(241);
				((Arith_term_Context)_localctx).arith_factor = arith_factor(_localctx.reg);
				System.out.println("\t" + "div $t" + _localctx.notMyPlace + ", $t" + _localctx.notMyPlace + ", $t" + ((Arith_term_Context)_localctx).arith_factor.place);
					((Arith_term_Context)_localctx).place =  _localctx.notMyPlace; ((Arith_term_Context)_localctx).nreg =  ((Arith_term_Context)_localctx).arith_factor.nreg-1;
				setState(243);
				arith_term_(_localctx.nreg, _localctx.place);
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				match(MOD);
				setState(246);
				((Arith_term_Context)_localctx).arith_factor = arith_factor(_localctx.reg);
				System.out.println("\t" + "rem $t" + _localctx.notMyPlace + ", $t" + _localctx.notMyPlace + ", $t" + ((Arith_term_Context)_localctx).arith_factor.place);
					((Arith_term_Context)_localctx).place =  _localctx.notMyPlace; ((Arith_term_Context)_localctx).nreg =  ((Arith_term_Context)_localctx).arith_factor.nreg-1;
				setState(248);
				arith_term_(_localctx.nreg, _localctx.place);
				}
				break;
			case LOOP:
			case THEN:
			case RANGE:
			case SEMICOLON:
			case ADD:
			case MINUS:
			case EQUAL:
			case ANGLE_BRACKETS:
			case GREATER_THAN:
			case GREATER_THAN_OR_EQUAL:
			case LESS_THAN:
			case LESS_THAN_OR_EQUAL:
			case AND:
			case OR:
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
		enterRule(_localctx, 46, RULE_arith_factor);
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(MINUS);
				setState(254);
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
				setState(257);
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
		enterRule(_localctx, 48, RULE_arith_primary);
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				((Arith_primaryContext)_localctx).CONST_INT = match(CONST_INT);
				System.out.println("\t" + "li $t" + _localctx.reg + ", " + (((Arith_primaryContext)_localctx).CONST_INT!=null?((Arith_primaryContext)_localctx).CONST_INT.getText():null));
					((Arith_primaryContext)_localctx).place =  _localctx.reg; ((Arith_primaryContext)_localctx).nreg =  _localctx.reg + 1;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				((Arith_primaryContext)_localctx).ID = match(ID);
				System.out.println("\t" + "la $t" + _localctx.reg + ", " + (((Arith_primaryContext)_localctx).ID!=null?((Arith_primaryContext)_localctx).ID.getText():null));
					System.out.println("\t" + "lw $t" + _localctx.reg + ", " + "0($t" + _localctx.reg + ")");
					((Arith_primaryContext)_localctx).place =  _localctx.reg; ((Arith_primaryContext)_localctx).nreg =  _localctx.reg+1;
				}
				break;
			case LEFT_PARENTHESES:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(LEFT_PARENTHESES);
				setState(267);
				((Arith_primaryContext)_localctx).arith_expression = arith_expression(_localctx.reg);
				setState(268);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0114\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\5\3E\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5R\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6f\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0083\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ae\n\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00bb\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u00c4\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00d7\n\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00e8"+
		"\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00fe\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u0107\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0112\n\32\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\2\2\2\u0112\2\64\3\2\2\2\4D\3\2\2\2\6F\3\2\2\2\bQ\3"+
		"\2\2\2\ne\3\2\2\2\fg\3\2\2\2\16m\3\2\2\2\20\u0082\3\2\2\2\22\u0084\3\2"+
		"\2\2\24\u0094\3\2\2\2\26\u0098\3\2\2\2\30\u009d\3\2\2\2\32\u00a2\3\2\2"+
		"\2\34\u00ad\3\2\2\2\36\u00af\3\2\2\2 \u00ba\3\2\2\2\"\u00c3\3\2\2\2$\u00c5"+
		"\3\2\2\2&\u00d6\3\2\2\2(\u00d8\3\2\2\2*\u00e7\3\2\2\2,\u00e9\3\2\2\2."+
		"\u00fd\3\2\2\2\60\u0106\3\2\2\2\62\u0111\3\2\2\2\64\65\7\20\2\2\65\66"+
		"\7(\2\2\66\67\7\16\2\2\678\7\6\2\289\b\2\1\29:\5\4\3\2:;\7\5\2\2;<\b\2"+
		"\1\2<=\5\b\5\2=>\7\b\2\2>?\7\26\2\2?\3\3\2\2\2@A\5\6\4\2AB\5\4\3\2BE\3"+
		"\2\2\2CE\3\2\2\2D@\3\2\2\2DC\3\2\2\2E\5\3\2\2\2FG\7(\2\2GH\7\24\2\2HI"+
		"\7\r\2\2IJ\7\26\2\2JK\b\4\1\2K\7\3\2\2\2LM\5\n\6\2MN\5\b\5\2NO\b\5\1\2"+
		"OR\3\2\2\2PR\b\5\1\2QL\3\2\2\2QP\3\2\2\2R\t\3\2\2\2ST\5\f\7\2TU\b\6\1"+
		"\2Uf\3\2\2\2VW\5\16\b\2WX\b\6\1\2Xf\3\2\2\2YZ\5\22\n\2Z[\b\6\1\2[f\3\2"+
		"\2\2\\]\5\24\13\2]^\b\6\1\2^f\3\2\2\2_`\5\26\f\2`a\b\6\1\2af\3\2\2\2b"+
		"c\5\30\r\2cd\b\6\1\2df\3\2\2\2eS\3\2\2\2eV\3\2\2\2eY\3\2\2\2e\\\3\2\2"+
		"\2e_\3\2\2\2eb\3\2\2\2f\13\3\2\2\2gh\7(\2\2hi\7%\2\2ij\5(\25\2jk\7\26"+
		"\2\2kl\b\7\1\2l\r\3\2\2\2mn\7\13\2\2no\5\32\16\2op\b\b\1\2pq\7\22\2\2"+
		"qr\b\b\1\2rs\5\b\5\2st\5\20\t\2tu\b\b\1\2u\17\3\2\2\2vw\7\b\2\2wx\7\13"+
		"\2\2xy\7\26\2\2y\u0083\b\t\1\2z{\7\7\2\2{|\b\t\1\2|}\5\b\5\2}~\b\t\1\2"+
		"~\177\7\b\2\2\177\u0080\7\13\2\2\u0080\u0081\7\26\2\2\u0081\u0083\3\2"+
		"\2\2\u0082v\3\2\2\2\u0082z\3\2\2\2\u0083\21\3\2\2\2\u0084\u0085\7\n\2"+
		"\2\u0085\u0086\7(\2\2\u0086\u0087\7\f\2\2\u0087\u0088\5(\25\2\u0088\u0089"+
		"\7\25\2\2\u0089\u008a\b\n\1\2\u008a\u008b\5(\25\2\u008b\u008c\7\17\2\2"+
		"\u008c\u008d\b\n\1\2\u008d\u008e\5\b\5\2\u008e\u008f\b\n\1\2\u008f\u0090"+
		"\7\b\2\2\u0090\u0091\7\17\2\2\u0091\u0092\7\26\2\2\u0092\u0093\b\n\1\2"+
		"\u0093\23\3\2\2\2\u0094\u0095\7\t\2\2\u0095\u0096\7\26\2\2\u0096\u0097"+
		"\b\13\1\2\u0097\25\3\2\2\2\u0098\u0099\7\21\2\2\u0099\u009a\7(\2\2\u009a"+
		"\u009b\7\26\2\2\u009b\u009c\b\f\1\2\u009c\27\3\2\2\2\u009d\u009e\7\23"+
		"\2\2\u009e\u009f\5(\25\2\u009f\u00a0\7\26\2\2\u00a0\u00a1\b\r\1\2\u00a1"+
		"\31\3\2\2\2\u00a2\u00a3\5\36\20\2\u00a3\u00a4\5\34\17\2\u00a4\u00a5\b"+
		"\16\1\2\u00a5\33\3\2\2\2\u00a6\u00a7\b\17\1\2\u00a7\u00a8\7#\2\2\u00a8"+
		"\u00a9\b\17\1\2\u00a9\u00aa\5\36\20\2\u00aa\u00ab\5\34\17\2\u00ab\u00ae"+
		"\3\2\2\2\u00ac\u00ae\b\17\1\2\u00ad\u00a6\3\2\2\2\u00ad\u00ac\3\2\2\2"+
		"\u00ae\35\3\2\2\2\u00af\u00b0\5\"\22\2\u00b0\u00b1\5 \21\2\u00b1\u00b2"+
		"\b\20\1\2\u00b2\37\3\2\2\2\u00b3\u00b4\b\21\1\2\u00b4\u00b5\7\"\2\2\u00b5"+
		"\u00b6\b\21\1\2\u00b6\u00b7\5\"\22\2\u00b7\u00b8\5 \21\2\u00b8\u00bb\3"+
		"\2\2\2\u00b9\u00bb\b\21\1\2\u00ba\u00b3\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"!\3\2\2\2\u00bc\u00bd\7$\2\2\u00bd\u00be\5$\23\2\u00be\u00bf\b\22\1\2"+
		"\u00bf\u00c4\3\2\2\2\u00c0\u00c1\5$\23\2\u00c1\u00c2\b\22\1\2\u00c2\u00c4"+
		"\3\2\2\2\u00c3\u00bc\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c4#\3\2\2\2\u00c5"+
		"\u00c6\5(\25\2\u00c6\u00c7\5&\24\2\u00c7\u00c8\5(\25\2\u00c8\u00c9\b\23"+
		"\1\2\u00c9%\3\2\2\2\u00ca\u00cb\7\34\2\2\u00cb\u00d7\b\24\1\2\u00cc\u00cd"+
		"\7\35\2\2\u00cd\u00d7\b\24\1\2\u00ce\u00cf\7\36\2\2\u00cf\u00d7\b\24\1"+
		"\2\u00d0\u00d1\7\37\2\2\u00d1\u00d7\b\24\1\2\u00d2\u00d3\7 \2\2\u00d3"+
		"\u00d7\b\24\1\2\u00d4\u00d5\7!\2\2\u00d5\u00d7\b\24\1\2\u00d6\u00ca\3"+
		"\2\2\2\u00d6\u00cc\3\2\2\2\u00d6\u00ce\3\2\2\2\u00d6\u00d0\3\2\2\2\u00d6"+
		"\u00d2\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\'\3\2\2\2\u00d8\u00d9\5,\27\2"+
		"\u00d9\u00da\5*\26\2\u00da\u00db\b\25\1\2\u00db)\3\2\2\2\u00dc\u00dd\7"+
		"\27\2\2\u00dd\u00de\5,\27\2\u00de\u00df\b\26\1\2\u00df\u00e0\5*\26\2\u00e0"+
		"\u00e8\3\2\2\2\u00e1\u00e2\7\30\2\2\u00e2\u00e3\5,\27\2\u00e3\u00e4\b"+
		"\26\1\2\u00e4\u00e5\5*\26\2\u00e5\u00e8\3\2\2\2\u00e6\u00e8\b\26\1\2\u00e7"+
		"\u00dc\3\2\2\2\u00e7\u00e1\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8+\3\2\2\2"+
		"\u00e9\u00ea\5\60\31\2\u00ea\u00eb\5.\30\2\u00eb\u00ec\b\27\1\2\u00ec"+
		"-\3\2\2\2\u00ed\u00ee\7\31\2\2\u00ee\u00ef\5\60\31\2\u00ef\u00f0\b\30"+
		"\1\2\u00f0\u00f1\5.\30\2\u00f1\u00fe\3\2\2\2\u00f2\u00f3\7\32\2\2\u00f3"+
		"\u00f4\5\60\31\2\u00f4\u00f5\b\30\1\2\u00f5\u00f6\5.\30\2\u00f6\u00fe"+
		"\3\2\2\2\u00f7\u00f8\7\33\2\2\u00f8\u00f9\5\60\31\2\u00f9\u00fa\b\30\1"+
		"\2\u00fa\u00fb\5.\30\2\u00fb\u00fe\3\2\2\2\u00fc\u00fe\b\30\1\2\u00fd"+
		"\u00ed\3\2\2\2\u00fd\u00f2\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00fc\3\2"+
		"\2\2\u00fe/\3\2\2\2\u00ff\u0100\7\30\2\2\u0100\u0101\5\62\32\2\u0101\u0102"+
		"\b\31\1\2\u0102\u0107\3\2\2\2\u0103\u0104\5\62\32\2\u0104\u0105\b\31\1"+
		"\2\u0105\u0107\3\2\2\2\u0106\u00ff\3\2\2\2\u0106\u0103\3\2\2\2\u0107\61"+
		"\3\2\2\2\u0108\u0109\7)\2\2\u0109\u0112\b\32\1\2\u010a\u010b\7(\2\2\u010b"+
		"\u0112\b\32\1\2\u010c\u010d\7&\2\2\u010d\u010e\5(\25\2\u010e\u010f\7\'"+
		"\2\2\u010f\u0110\b\32\1\2\u0110\u0112\3\2\2\2\u0111\u0108\3\2\2\2\u0111"+
		"\u010a\3\2\2\2\u0111\u010c\3\2\2\2\u0112\63\3\2\2\2\16DQe\u0082\u00ad"+
		"\u00ba\u00c3\u00d6\u00e7\u00fd\u0106\u0111";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}