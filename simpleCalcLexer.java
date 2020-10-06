// Generated from simpleCalc.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleCalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, NUMBER=9, 
		WHITESPACES=10, COMMENT=11, MULTILINECOMMENTS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "NUMBER", 
			"WHITESPACES", "COMMENT", "MULTILINECOMMENTS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'^'", "'sqrt('", "')'", "'*'", "'/'", "'+'", "'-'", "'('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "NUMBER", "WHITESPACES", 
			"COMMENT", "MULTILINECOMMENTS"
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


	public simpleCalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "simpleCalc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16^\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\6\n\61\n\n\r\n\16\n\62\3\n\3\n\6\n"+
		"\67\n\n\r\n\16\n8\5\n;\n\n\3\13\6\13>\n\13\r\13\16\13?\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\7\fH\n\f\f\f\16\fK\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r"+
		"U\n\r\f\r\16\rX\13\r\3\r\3\r\3\r\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\7\3\2\62;\4\2\13\f\"\"\3\2\f\f"+
		"\3\2\61\61\3\2,,\2d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7#\3\2\2\2"+
		"\t%\3\2\2\2\13\'\3\2\2\2\r)\3\2\2\2\17+\3\2\2\2\21-\3\2\2\2\23\60\3\2"+
		"\2\2\25=\3\2\2\2\27C\3\2\2\2\31N\3\2\2\2\33\34\7`\2\2\34\4\3\2\2\2\35"+
		"\36\7u\2\2\36\37\7s\2\2\37 \7t\2\2 !\7v\2\2!\"\7*\2\2\"\6\3\2\2\2#$\7"+
		"+\2\2$\b\3\2\2\2%&\7,\2\2&\n\3\2\2\2\'(\7\61\2\2(\f\3\2\2\2)*\7-\2\2*"+
		"\16\3\2\2\2+,\7/\2\2,\20\3\2\2\2-.\7*\2\2.\22\3\2\2\2/\61\t\2\2\2\60/"+
		"\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63:\3\2\2\2\64\66\7"+
		"\60\2\2\65\67\t\2\2\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\2"+
		"9;\3\2\2\2:\64\3\2\2\2:;\3\2\2\2;\24\3\2\2\2<>\t\3\2\2=<\3\2\2\2>?\3\2"+
		"\2\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\b\13\2\2B\26\3\2\2\2CD\7\61\2\2D"+
		"E\7\61\2\2EI\3\2\2\2FH\n\4\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2"+
		"JL\3\2\2\2KI\3\2\2\2LM\b\f\2\2M\30\3\2\2\2NO\7\61\2\2OP\7,\2\2PV\3\2\2"+
		"\2QR\7,\2\2RU\n\5\2\2SU\n\6\2\2TQ\3\2\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2"+
		"\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7,\2\2Z[\7\61\2\2[\\\3\2\2\2\\]\b\r"+
		"\2\2]\32\3\2\2\2\n\2\628:?ITV\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}