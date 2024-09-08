// Generated from /home/bessa/Documents/UFSCAR/Compiladores/verso-language/verso/src/main/antlr4/br/ufscar/dc/compiladores/verso/Verso.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class VersoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, PAGE=6, SECTION=7, HEADER=8, FOOTER=9, 
		PARAGRAPH=10, IMAGE=11, LINK=12, ALT=13, HREF=14, STRING=15, TEXT=16, 
		WS=17, ERRO=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "PAGE", "SECTION", "HEADER", 
			"FOOTER", "PARAGRAPH", "IMAGE", "LINK", "ALT", "HREF", "STRING", "TEXT", 
			"WS", "ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "'='", "'page'", "'section'", "'header'", 
			"'footer'", "'paragraph'", "'image'", "'link'", "'alt'", "'href'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "PAGE", "SECTION", "HEADER", "FOOTER", 
			"PARAGRAPH", "IMAGE", "LINK", "ALT", "HREF", "STRING", "TEXT", "WS", 
			"ERRO"
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


	public VersoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Verso.g4"; }

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
		"\u0004\u0000\u0012\u008a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000em\b\u000e\n\u000e\f\u000ep\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0004\u000fu\b\u000f\u000b\u000f\f\u000fv\u0001\u000f"+
		"\u0001\u000f\u0004\u000f{\b\u000f\u000b\u000f\f\u000f|\u0001\u000f\u0005"+
		"\u000f\u0080\b\u000f\n\u000f\f\u000f\u0083\t\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012\u0001\u0000\u0004\u0003\u0000\n\n\r\r"+
		"\"\"\u0003\u000009AZaz\u0003\u0000\t\n\r\r  \u0004\u0000!!$$@@{~\u008f"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000"+
		"\u0000\u0003\'\u0001\u0000\u0000\u0000\u0005)\u0001\u0000\u0000\u0000"+
		"\u0007+\u0001\u0000\u0000\u0000\t-\u0001\u0000\u0000\u0000\u000b/\u0001"+
		"\u0000\u0000\u0000\r4\u0001\u0000\u0000\u0000\u000f<\u0001\u0000\u0000"+
		"\u0000\u0011C\u0001\u0000\u0000\u0000\u0013J\u0001\u0000\u0000\u0000\u0015"+
		"T\u0001\u0000\u0000\u0000\u0017Z\u0001\u0000\u0000\u0000\u0019_\u0001"+
		"\u0000\u0000\u0000\u001bc\u0001\u0000\u0000\u0000\u001dh\u0001\u0000\u0000"+
		"\u0000\u001ft\u0001\u0000\u0000\u0000!\u0084\u0001\u0000\u0000\u0000#"+
		"\u0088\u0001\u0000\u0000\u0000%&\u0005{\u0000\u0000&\u0002\u0001\u0000"+
		"\u0000\u0000\'(\u0005}\u0000\u0000(\u0004\u0001\u0000\u0000\u0000)*\u0005"+
		"(\u0000\u0000*\u0006\u0001\u0000\u0000\u0000+,\u0005)\u0000\u0000,\b\u0001"+
		"\u0000\u0000\u0000-.\u0005=\u0000\u0000.\n\u0001\u0000\u0000\u0000/0\u0005"+
		"p\u0000\u000001\u0005a\u0000\u000012\u0005g\u0000\u000023\u0005e\u0000"+
		"\u00003\f\u0001\u0000\u0000\u000045\u0005s\u0000\u000056\u0005e\u0000"+
		"\u000067\u0005c\u0000\u000078\u0005t\u0000\u000089\u0005i\u0000\u0000"+
		"9:\u0005o\u0000\u0000:;\u0005n\u0000\u0000;\u000e\u0001\u0000\u0000\u0000"+
		"<=\u0005h\u0000\u0000=>\u0005e\u0000\u0000>?\u0005a\u0000\u0000?@\u0005"+
		"d\u0000\u0000@A\u0005e\u0000\u0000AB\u0005r\u0000\u0000B\u0010\u0001\u0000"+
		"\u0000\u0000CD\u0005f\u0000\u0000DE\u0005o\u0000\u0000EF\u0005o\u0000"+
		"\u0000FG\u0005t\u0000\u0000GH\u0005e\u0000\u0000HI\u0005r\u0000\u0000"+
		"I\u0012\u0001\u0000\u0000\u0000JK\u0005p\u0000\u0000KL\u0005a\u0000\u0000"+
		"LM\u0005r\u0000\u0000MN\u0005a\u0000\u0000NO\u0005g\u0000\u0000OP\u0005"+
		"r\u0000\u0000PQ\u0005a\u0000\u0000QR\u0005p\u0000\u0000RS\u0005h\u0000"+
		"\u0000S\u0014\u0001\u0000\u0000\u0000TU\u0005i\u0000\u0000UV\u0005m\u0000"+
		"\u0000VW\u0005a\u0000\u0000WX\u0005g\u0000\u0000XY\u0005e\u0000\u0000"+
		"Y\u0016\u0001\u0000\u0000\u0000Z[\u0005l\u0000\u0000[\\\u0005i\u0000\u0000"+
		"\\]\u0005n\u0000\u0000]^\u0005k\u0000\u0000^\u0018\u0001\u0000\u0000\u0000"+
		"_`\u0005a\u0000\u0000`a\u0005l\u0000\u0000ab\u0005t\u0000\u0000b\u001a"+
		"\u0001\u0000\u0000\u0000cd\u0005h\u0000\u0000de\u0005r\u0000\u0000ef\u0005"+
		"e\u0000\u0000fg\u0005f\u0000\u0000g\u001c\u0001\u0000\u0000\u0000hn\u0005"+
		"\"\u0000\u0000im\b\u0000\u0000\u0000jk\u0005\"\u0000\u0000km\u0005\"\u0000"+
		"\u0000li\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mp\u0001\u0000"+
		"\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000oq\u0001"+
		"\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qr\u0005\"\u0000\u0000r\u001e"+
		"\u0001\u0000\u0000\u0000su\u0007\u0001\u0000\u0000ts\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000"+
		"\u0000\u0000w\u0081\u0001\u0000\u0000\u0000xz\u0005 \u0000\u0000y{\u0007"+
		"\u0001\u0000\u0000zy\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000"+
		"|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u0080\u0001\u0000"+
		"\u0000\u0000~\u0080\u0005.\u0000\u0000\u007fx\u0001\u0000\u0000\u0000"+
		"\u007f~\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081"+
		"\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082"+
		" \u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0007\u0002\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0006\u0010\u0000\u0000\u0087\"\u0001\u0000\u0000\u0000\u0088\u0089\u0007"+
		"\u0003\u0000\u0000\u0089$\u0001\u0000\u0000\u0000\u0007\u0000lnv|\u007f"+
		"\u0081\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}