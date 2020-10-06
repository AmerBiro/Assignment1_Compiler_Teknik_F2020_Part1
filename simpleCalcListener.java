// Generated from simpleCalc.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simpleCalcParser}.
 */
public interface simpleCalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(simpleCalcParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(simpleCalcParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NUMBER}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNUMBER(simpleCalcParser.NUMBERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NUMBER}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNUMBER(simpleCalcParser.NUMBERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARENTHESES}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPARENTHESES(simpleCalcParser.PARENTHESESContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARENTHESES}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPARENTHESES(simpleCalcParser.PARENTHESESContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SQRT}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSQRT(simpleCalcParser.SQRTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SQRT}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSQRT(simpleCalcParser.SQRTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code POWER}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPOWER(simpleCalcParser.POWERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code POWER}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPOWER(simpleCalcParser.POWERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MULTI_DEVI}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMULTI_DEVI(simpleCalcParser.MULTI_DEVIContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MULTI_DEVI}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMULTI_DEVI(simpleCalcParser.MULTI_DEVIContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADD_SUB}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterADD_SUB(simpleCalcParser.ADD_SUBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADD_SUB}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitADD_SUB(simpleCalcParser.ADD_SUBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinus(simpleCalcParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinus(simpleCalcParser.MinusContext ctx);
}