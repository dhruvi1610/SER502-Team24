// Generated from GJGrammar.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GJGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, DIGITS=15, BOOL=16, STR=17, 
		ADDITION=18, SUBTRACTION=19, MULTIPLY=20, DIVIDE=21, AND=22, OR=23, Lessthan=24, 
		GreaterThan=25, LessEqual=26, GreaterEqual=27, NotEqual=28, Equals=29, 
		QUESTIONMARK=30, COLON=31, IDENTIFIER=32, WS=33, Comment=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "DIGITS", "BOOL", "STR", 
			"ADDITION", "SUBTRACTION", "MULTIPLY", "DIVIDE", "AND", "OR", "Lessthan", 
			"GreaterThan", "LessEqual", "GreaterEqual", "NotEqual", "Equals", "QUESTIONMARK", 
			"COLON", "IDENTIFIER", "WS", "Comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'ank'", "'tark'", "'vakya'", "'('", "')'", "'jo'", 
			"'bas'", "'nahitoh'", "'toh'", "'sudhi'", "'batav'", "'='", null, null, 
			null, "'+'", "'-'", "'*'", "'/'", "'&&'", "'||'", "'<'", "'>'", "'<='", 
			"'>='", "'!='", "'=='", "'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "DIGITS", "BOOL", "STR", "ADDITION", "SUBTRACTION", 
			"MULTIPLY", "DIVIDE", "AND", "OR", "Lessthan", "GreaterThan", "LessEqual", 
			"GreaterEqual", "NotEqual", "Equals", "QUESTIONMARK", "COLON", "IDENTIFIER", 
			"WS", "Comment"
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


	public GJGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GJGrammar.g4"; }

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
		"\u0004\u0000\"\u00df\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0005\u000e\u0080\b\u000e\n\u000e\f\u000e\u0083"+
		"\t\u000e\u0001\u000e\u0003\u000e\u0086\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u008c\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u0090\b\u0010\n\u0010\f\u0010\u0093\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u00bc\b\u001f\n\u001f\f\u001f\u00bf\t\u001f"+
		"\u0001 \u0004 \u00c2\b \u000b \f \u00c3\u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0001!\u0005!\u00cc\b!\n!\f!\u00cf\t!\u0001!\u0001!\u0001!\u0001!\u0005"+
		"!\u00d5\b!\n!\f!\u00d8\t!\u0001!\u0001!\u0003!\u00dc\b!\u0001!\u0001!"+
		"\u0001\u00d6\u0000\"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f"+
		"\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014"+
		")\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e"+
		"=\u001f? A!C\"\u0001\u0000\u0007\u0001\u000019\u0001\u000009\u0003\u0000"+
		"09AZaz\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \u0002"+
		"\u0000\n\n\r\r\u00e7\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000"+
		"A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0001E\u0001"+
		"\u0000\u0000\u0000\u0003G\u0001\u0000\u0000\u0000\u0005I\u0001\u0000\u0000"+
		"\u0000\u0007M\u0001\u0000\u0000\u0000\tR\u0001\u0000\u0000\u0000\u000b"+
		"X\u0001\u0000\u0000\u0000\rZ\u0001\u0000\u0000\u0000\u000f\\\u0001\u0000"+
		"\u0000\u0000\u0011_\u0001\u0000\u0000\u0000\u0013c\u0001\u0000\u0000\u0000"+
		"\u0015k\u0001\u0000\u0000\u0000\u0017o\u0001\u0000\u0000\u0000\u0019u"+
		"\u0001\u0000\u0000\u0000\u001b{\u0001\u0000\u0000\u0000\u001d\u0085\u0001"+
		"\u0000\u0000\u0000\u001f\u008b\u0001\u0000\u0000\u0000!\u008d\u0001\u0000"+
		"\u0000\u0000#\u0097\u0001\u0000\u0000\u0000%\u0099\u0001\u0000\u0000\u0000"+
		"\'\u009b\u0001\u0000\u0000\u0000)\u009d\u0001\u0000\u0000\u0000+\u009f"+
		"\u0001\u0000\u0000\u0000-\u00a2\u0001\u0000\u0000\u0000/\u00a5\u0001\u0000"+
		"\u0000\u00001\u00a7\u0001\u0000\u0000\u00003\u00a9\u0001\u0000\u0000\u0000"+
		"5\u00ac\u0001\u0000\u0000\u00007\u00af\u0001\u0000\u0000\u00009\u00b2"+
		"\u0001\u0000\u0000\u0000;\u00b5\u0001\u0000\u0000\u0000=\u00b7\u0001\u0000"+
		"\u0000\u0000?\u00b9\u0001\u0000\u0000\u0000A\u00c1\u0001\u0000\u0000\u0000"+
		"C\u00db\u0001\u0000\u0000\u0000EF\u0005{\u0000\u0000F\u0002\u0001\u0000"+
		"\u0000\u0000GH\u0005}\u0000\u0000H\u0004\u0001\u0000\u0000\u0000IJ\u0005"+
		"a\u0000\u0000JK\u0005n\u0000\u0000KL\u0005k\u0000\u0000L\u0006\u0001\u0000"+
		"\u0000\u0000MN\u0005t\u0000\u0000NO\u0005a\u0000\u0000OP\u0005r\u0000"+
		"\u0000PQ\u0005k\u0000\u0000Q\b\u0001\u0000\u0000\u0000RS\u0005v\u0000"+
		"\u0000ST\u0005a\u0000\u0000TU\u0005k\u0000\u0000UV\u0005y\u0000\u0000"+
		"VW\u0005a\u0000\u0000W\n\u0001\u0000\u0000\u0000XY\u0005(\u0000\u0000"+
		"Y\f\u0001\u0000\u0000\u0000Z[\u0005)\u0000\u0000[\u000e\u0001\u0000\u0000"+
		"\u0000\\]\u0005j\u0000\u0000]^\u0005o\u0000\u0000^\u0010\u0001\u0000\u0000"+
		"\u0000_`\u0005b\u0000\u0000`a\u0005a\u0000\u0000ab\u0005s\u0000\u0000"+
		"b\u0012\u0001\u0000\u0000\u0000cd\u0005n\u0000\u0000de\u0005a\u0000\u0000"+
		"ef\u0005h\u0000\u0000fg\u0005i\u0000\u0000gh\u0005t\u0000\u0000hi\u0005"+
		"o\u0000\u0000ij\u0005h\u0000\u0000j\u0014\u0001\u0000\u0000\u0000kl\u0005"+
		"t\u0000\u0000lm\u0005o\u0000\u0000mn\u0005h\u0000\u0000n\u0016\u0001\u0000"+
		"\u0000\u0000op\u0005s\u0000\u0000pq\u0005u\u0000\u0000qr\u0005d\u0000"+
		"\u0000rs\u0005h\u0000\u0000st\u0005i\u0000\u0000t\u0018\u0001\u0000\u0000"+
		"\u0000uv\u0005b\u0000\u0000vw\u0005a\u0000\u0000wx\u0005t\u0000\u0000"+
		"xy\u0005a\u0000\u0000yz\u0005v\u0000\u0000z\u001a\u0001\u0000\u0000\u0000"+
		"{|\u0005=\u0000\u0000|\u001c\u0001\u0000\u0000\u0000}\u0081\u0007\u0000"+
		"\u0000\u0000~\u0080\u0007\u0001\u0000\u0000\u007f~\u0001\u0000\u0000\u0000"+
		"\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0086\u0001\u0000\u0000\u0000"+
		"\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0086\u00050\u0000\u0000\u0085"+
		"}\u0001\u0000\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u001e"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0005H\u0000\u0000\u0088\u008c\u0005"+
		"a\u0000\u0000\u0089\u008a\u0005N\u0000\u0000\u008a\u008c\u0005a\u0000"+
		"\u0000\u008b\u0087\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000"+
		"\u0000\u008c \u0001\u0000\u0000\u0000\u008d\u0091\u0005\"\u0000\u0000"+
		"\u008e\u0090\u0007\u0002\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000"+
		"\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000"+
		"\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0095\u0005\"\u0000\u0000\u0095"+
		"\u0096\u0005\n\u0000\u0000\u0096\"\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0005+\u0000\u0000\u0098$\u0001\u0000\u0000\u0000\u0099\u009a\u0005-"+
		"\u0000\u0000\u009a&\u0001\u0000\u0000\u0000\u009b\u009c\u0005*\u0000\u0000"+
		"\u009c(\u0001\u0000\u0000\u0000\u009d\u009e\u0005/\u0000\u0000\u009e*"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0005&\u0000\u0000\u00a0\u00a1\u0005"+
		"&\u0000\u0000\u00a1,\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005|\u0000"+
		"\u0000\u00a3\u00a4\u0005|\u0000\u0000\u00a4.\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0005<\u0000\u0000\u00a60\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005"+
		">\u0000\u0000\u00a82\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005<\u0000"+
		"\u0000\u00aa\u00ab\u0005=\u0000\u0000\u00ab4\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0005>\u0000\u0000\u00ad\u00ae\u0005=\u0000\u0000\u00ae6\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0005!\u0000\u0000\u00b0\u00b1\u0005=\u0000"+
		"\u0000\u00b18\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005=\u0000\u0000\u00b3"+
		"\u00b4\u0005=\u0000\u0000\u00b4:\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005"+
		"?\u0000\u0000\u00b6<\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005:\u0000"+
		"\u0000\u00b8>\u0001\u0000\u0000\u0000\u00b9\u00bd\u0007\u0003\u0000\u0000"+
		"\u00ba\u00bc\u0007\u0004\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0001\u0000\u0000\u0000\u00be@\u0001\u0000\u0000\u0000\u00bf"+
		"\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c2\u0007\u0005\u0000\u0000\u00c1"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0006 \u0000\u0000\u00c6B\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0005/\u0000\u0000\u00c8\u00c9\u0005/\u0000"+
		"\u0000\u00c9\u00cd\u0001\u0000\u0000\u0000\u00ca\u00cc\b\u0006\u0000\u0000"+
		"\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000\u0000"+
		"\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000"+
		"\u00ce\u00dc\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0005/\u0000\u0000\u00d1\u00d2\u0005*\u0000\u0000\u00d2\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d5\t\u0000\u0000\u0000\u00d4\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00da\u0005"+
		"*\u0000\u0000\u00da\u00dc\u0005/\u0000\u0000\u00db\u00c7\u0001\u0000\u0000"+
		"\u0000\u00db\u00d0\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0006!\u0000\u0000\u00deD\u0001\u0000\u0000\u0000\n"+
		"\u0000\u0081\u0085\u008b\u0091\u00bd\u00c3\u00cd\u00d6\u00db\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}