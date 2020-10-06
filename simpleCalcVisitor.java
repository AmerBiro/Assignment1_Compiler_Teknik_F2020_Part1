// Generated from simpleCalc.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simpleCalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simpleCalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(simpleCalcParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NUMBER}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNUMBER(simpleCalcParser.NUMBERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PARENTHESES}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPARENTHESES(simpleCalcParser.PARENTHESESContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SQRT}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSQRT(simpleCalcParser.SQRTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code POWER}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPOWER(simpleCalcParser.POWERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MULTI_DEVI}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMULTI_DEVI(simpleCalcParser.MULTI_DEVIContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADD_SUB}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADD_SUB(simpleCalcParser.ADD_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(simpleCalcParser.MinusContext ctx);
}