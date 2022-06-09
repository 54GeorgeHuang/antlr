// Generated from Rose.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RoseParser}.
 */
public interface RoseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RoseParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RoseParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoseParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RoseParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoseParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(RoseParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoseParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(RoseParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoseParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(RoseParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoseParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(RoseParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoseParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(RoseParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoseParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(RoseParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(RoseParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(RoseParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoseParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(RoseParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoseParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(RoseParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoseParser#read_statement}.
	 * @param ctx the parse tree
	 */
	void enterRead_statement(RoseParser.Read_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoseParser#read_statement}.
	 * @param ctx the parse tree
	 */
	void exitRead_statement(RoseParser.Read_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoseParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void enterWrite_statement(RoseParser.Write_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoseParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void exitWrite_statement(RoseParser.Write_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoseParser#arith_expression}.
	 * @param ctx the parse tree
	 */
	void enterArith_expression(RoseParser.Arith_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoseParser#arith_expression}.
	 * @param ctx the parse tree
	 */
	void exitArith_expression(RoseParser.Arith_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoseParser#arith_expression_}.
	 * @param ctx the parse tree
	 */
	void enterArith_expression_(RoseParser.Arith_expression_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RoseParser#arith_expression_}.
	 * @param ctx the parse tree
	 */
	void exitArith_expression_(RoseParser.Arith_expression_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RoseParser#arith_term}.
	 * @param ctx the parse tree
	 */
	void enterArith_term(RoseParser.Arith_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoseParser#arith_term}.
	 * @param ctx the parse tree
	 */
	void exitArith_term(RoseParser.Arith_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoseParser#arith_term_}.
	 * @param ctx the parse tree
	 */
	void enterArith_term_(RoseParser.Arith_term_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RoseParser#arith_term_}.
	 * @param ctx the parse tree
	 */
	void exitArith_term_(RoseParser.Arith_term_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RoseParser#arith_factor}.
	 * @param ctx the parse tree
	 */
	void enterArith_factor(RoseParser.Arith_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoseParser#arith_factor}.
	 * @param ctx the parse tree
	 */
	void exitArith_factor(RoseParser.Arith_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoseParser#arith_primary}.
	 * @param ctx the parse tree
	 */
	void enterArith_primary(RoseParser.Arith_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoseParser#arith_primary}.
	 * @param ctx the parse tree
	 */
	void exitArith_primary(RoseParser.Arith_primaryContext ctx);
}