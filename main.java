import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException{

	// we expect exactly one argument: the name of the input file
	if (args.length!=1) {
	    System.err.println("\n");
	    System.err.println("Simple calculator\n");
	    System.err.println("=================\n\n");
	    System.err.println("Please give as input argument a filename\n");
	    System.exit(-1);
	}
	String filename=args[0];

	// open the input file
	CharStream input = CharStreams.fromFileName(filename);
	    //new ANTLRFileStream (filename); // depricated
	
	// create a lexer/scanner
	simpleCalcLexer lex = new simpleCalcLexer(input);
	
	// get the stream of tokens from the scanner
	CommonTokenStream tokens = new CommonTokenStream(lex);
	
	// create a parser
	simpleCalcParser parser = new simpleCalcParser(tokens);
	
	// and parse anything from the grammar for "start"
	ParseTree parseTree = parser.start();

	// Construct an interpreter and run it on the parse tree
	Interpreter interpreter = new Interpreter();
	Double result=interpreter.visit(parseTree);
	System.out.println("The result is:\t" + result);
    }
}

// We write an interpreter that implements interface
// "simpleCalcVisitor<T>" that is automatically generated by ANTLR
// This is parameterized over a return type "<T>" which is in our case
// simply a Double.

class Interpreter extends AbstractParseTreeVisitor<Double> implements simpleCalcVisitor<Double> {
	
	//
    public Double visitStart(simpleCalcParser.StartContext ctx){
		return visit(ctx.e);
	};
	
	public Double visitPOWER(simpleCalcParser.POWERContext ctx){
		double dw = Math.pow(visit(ctx.e1), visit(ctx.e2));
		return dw;
	};

	public Double visitSQRT(simpleCalcParser.SQRTContext ctx){
		double sq = Math.sqrt(visit(ctx.e1));
		return sq;
	};


	//
	public Double visitPARENTHESES(simpleCalcParser.PARENTHESESContext ctx){
		return visit(ctx.e);
	};

	//
	public Double visitNUMBER(simpleCalcParser.NUMBERContext ctx){
		return Double.parseDouble(ctx.c.getText());
	};

	//
	public Double visitMULTI_DEVI(simpleCalcParser.MULTI_DEVIContext ctx){
		if((ctx.op.getText().equals("*"))){
			return visit(ctx.e1) * visit(ctx.e2);
		} else return visit(ctx.e1) / visit(ctx.e2);
	};

	//
	public Double visitADD_SUB(simpleCalcParser.ADD_SUBContext ctx){
		if(ctx.op.getText().equals("+"))
			return visit(ctx.e1) + visit(ctx.e2);
		 else return visit(ctx.e1) - visit(ctx.e2);
	};

	//
	public Double visitMinus(simpleCalcParser.MinusContext ctx){
		if (ctx.op.getText().equals("+"))
			return visit(ctx.e);
		else
			return -visit(ctx.e);
		};



}
