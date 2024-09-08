// Generated from /home/bessa/Documents/UFSCAR/Compiladores/verso-language/verso/src/main/antlr4/br/ufscar/dc/compiladores/verso/Verso.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class VersoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, PAGE=6, SECTION=7, HEADER=8, FOOTER=9, 
		PARAGRAPH=10, IMAGE=11, LINK=12, ALT=13, HREF=14, STRING=15, TEXT=16, 
		WS=17, ERRO=18;
	public static final int
		RULE_layout = 0, RULE_page = 1, RULE_content = 2, RULE_section = 3, RULE_header = 4, 
		RULE_footer = 5, RULE_paragraph = 6, RULE_image = 7, RULE_link = 8, RULE_attribute = 9, 
		RULE_text = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"layout", "page", "content", "section", "header", "footer", "paragraph", 
			"image", "link", "attribute", "text"
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

	@Override
	public String getGrammarFileName() { return "Verso.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VersoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LayoutContext extends ParserRuleContext {
		public PageContext page() {
			return getRuleContext(PageContext.class,0);
		}
		public TerminalNode EOF() { return getToken(VersoParser.EOF, 0); }
		public LayoutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layout; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VersoListener ) ((VersoListener)listener).enterLayout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VersoListener ) ((VersoListener)listener).exitLayout(this);
		}
	}

	public final LayoutContext layout() throws RecognitionException {
		LayoutContext _localctx = new LayoutContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_layout);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			page();
			setState(23);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PageContext extends ParserRuleContext {
		public TerminalNode PAGE() { return getToken(VersoParser.PAGE, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VersoListener ) ((VersoListener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VersoListener ) ((VersoListener)listener).exitPage(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_page);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(PAGE);
			setState(26);
			match(T__0);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8064L) != 0)) {
				{
				{
				setState(27);
				content();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContentContext extends ParserRuleContext {
		public SectionContext section() {
			return getRuleContext(SectionContext.class,0);
		}
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public FooterContext footer() {
			return getRuleContext(FooterContext.class,0);
		}
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VersoListener ) ((VersoListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VersoListener ) ((VersoListener)listener).exitContent(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_content);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SECTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				section();
				}
				break;
			case HEADER:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				header();
				}
				break;
			case FOOTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				footer();
				}
				break;
			case PARAGRAPH:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				paragraph();
				}
				break;
			case IMAGE:
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				image();
				}
				break;
			case LINK:
				enterOuterAlt(_localctx, 6);
				{
				setState(40);
				link();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SectionContext extends ParserRuleContext {
		public TerminalNode SECTION() { return getToken(VersoParser.SECTION, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VersoListener ) ((VersoListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VersoListener ) ((VersoListener)listener).exitSection(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(SECTION);
			setState(44);
			match(T__0);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8064L) != 0)) {
				{
				{
				setState(45);
				content();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode HEADER() { return getToken(VersoParser.HEADER, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VersoListener ) ((VersoListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VersoListener ) ((VersoListener)listener).exitHeader(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(HEADER);
			setState(54);
			match(T__0);
			setState(55);
			text();
			setState(56);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FooterContext extends ParserRuleContext {
		public TerminalNode FOOTER() { return getToken(VersoParser.FOOTER, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public FooterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_footer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VersoListener ) ((VersoListener)listener).enterFooter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VersoListener ) ((VersoListener)listener).exitFooter(this);
		}
	}

	public final FooterContext footer() throws RecognitionException {
		FooterContext _localctx = new FooterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_footer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(FOOTER);
			setState(59);
			match(T__0);
			setState(60);
			text();
			setState(61);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParagraphContext extends ParserRuleContext {
		public TerminalNode PARAGRAPH() { return getToken(VersoParser.PARAGRAPH, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public ParagraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paragraph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VersoListener ) ((VersoListener)listener).enterParagraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VersoListener ) ((VersoListener)listener).exitParagraph(this);
		}
	}

	public final ParagraphContext paragraph() throws RecognitionException {
		ParagraphContext _localctx = new ParagraphContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_paragraph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(PARAGRAPH);
			setState(64);
			match(T__0);
			setState(65);
			text();
			setState(66);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImageContext extends ParserRuleContext {
		public TerminalNode IMAGE() { return getToken(VersoParser.IMAGE, 0); }
		public TerminalNode STRING() { return getToken(VersoParser.STRING, 0); }
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VersoListener ) ((VersoListener)listener).enterImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VersoListener ) ((VersoListener)listener).exitImage(this);
		}
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_image);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(IMAGE);
			setState(69);
			match(T__2);
			setState(70);
			match(STRING);
			setState(71);
			match(T__3);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALT || _la==HREF) {
				{
				setState(72);
				attribute();
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class LinkContext extends ParserRuleContext {
		public TerminalNode LINK() { return getToken(VersoParser.LINK, 0); }
		public TerminalNode STRING() { return getToken(VersoParser.STRING, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VersoListener ) ((VersoListener)listener).enterLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VersoListener ) ((VersoListener)listener).exitLink(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(LINK);
			setState(76);
			match(T__2);
			setState(77);
			match(STRING);
			setState(78);
			match(T__3);
			setState(79);
			match(T__0);
			setState(80);
			text();
			setState(81);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode ALT() { return getToken(VersoParser.ALT, 0); }
		public TerminalNode STRING() { return getToken(VersoParser.STRING, 0); }
		public TerminalNode HREF() { return getToken(VersoParser.HREF, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VersoListener ) ((VersoListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VersoListener ) ((VersoListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attribute);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALT:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(ALT);
				setState(84);
				match(T__4);
				setState(85);
				match(STRING);
				}
				break;
			case HREF:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(HREF);
				setState(87);
				match(T__4);
				setState(88);
				match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(VersoParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(VersoParser.TEXT, i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VersoListener ) ((VersoListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VersoListener ) ((VersoListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				match(TEXT);
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
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
		"\u0004\u0001\u0012a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001d\b\u0001\n"+
		"\u0001\f\u0001 \t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002*\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003/\b\u0003\n\u0003\f\u0003"+
		"2\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"J\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tZ\b\t\u0001"+
		"\n\u0004\n]\b\n\u000b\n\f\n^\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0000_\u0000\u0016\u0001\u0000"+
		"\u0000\u0000\u0002\u0019\u0001\u0000\u0000\u0000\u0004)\u0001\u0000\u0000"+
		"\u0000\u0006+\u0001\u0000\u0000\u0000\b5\u0001\u0000\u0000\u0000\n:\u0001"+
		"\u0000\u0000\u0000\f?\u0001\u0000\u0000\u0000\u000eD\u0001\u0000\u0000"+
		"\u0000\u0010K\u0001\u0000\u0000\u0000\u0012Y\u0001\u0000\u0000\u0000\u0014"+
		"\\\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0002\u0001\u0000\u0017\u0018"+
		"\u0005\u0000\u0000\u0001\u0018\u0001\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0005\u0006\u0000\u0000\u001a\u001e\u0005\u0001\u0000\u0000\u001b\u001d"+
		"\u0003\u0004\u0002\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d \u0001"+
		"\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001"+
		"\u0000\u0000\u0000\u001f!\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000"+
		"\u0000!\"\u0005\u0002\u0000\u0000\"\u0003\u0001\u0000\u0000\u0000#*\u0003"+
		"\u0006\u0003\u0000$*\u0003\b\u0004\u0000%*\u0003\n\u0005\u0000&*\u0003"+
		"\f\u0006\u0000\'*\u0003\u000e\u0007\u0000(*\u0003\u0010\b\u0000)#\u0001"+
		"\u0000\u0000\u0000)$\u0001\u0000\u0000\u0000)%\u0001\u0000\u0000\u0000"+
		")&\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000"+
		"\u0000*\u0005\u0001\u0000\u0000\u0000+,\u0005\u0007\u0000\u0000,0\u0005"+
		"\u0001\u0000\u0000-/\u0003\u0004\u0002\u0000.-\u0001\u0000\u0000\u0000"+
		"/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000"+
		"\u000013\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000034\u0005\u0002"+
		"\u0000\u00004\u0007\u0001\u0000\u0000\u000056\u0005\b\u0000\u000067\u0005"+
		"\u0001\u0000\u000078\u0003\u0014\n\u000089\u0005\u0002\u0000\u00009\t"+
		"\u0001\u0000\u0000\u0000:;\u0005\t\u0000\u0000;<\u0005\u0001\u0000\u0000"+
		"<=\u0003\u0014\n\u0000=>\u0005\u0002\u0000\u0000>\u000b\u0001\u0000\u0000"+
		"\u0000?@\u0005\n\u0000\u0000@A\u0005\u0001\u0000\u0000AB\u0003\u0014\n"+
		"\u0000BC\u0005\u0002\u0000\u0000C\r\u0001\u0000\u0000\u0000DE\u0005\u000b"+
		"\u0000\u0000EF\u0005\u0003\u0000\u0000FG\u0005\u000f\u0000\u0000GI\u0005"+
		"\u0004\u0000\u0000HJ\u0003\u0012\t\u0000IH\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000J\u000f\u0001\u0000\u0000\u0000KL\u0005\f\u0000\u0000"+
		"LM\u0005\u0003\u0000\u0000MN\u0005\u000f\u0000\u0000NO\u0005\u0004\u0000"+
		"\u0000OP\u0005\u0001\u0000\u0000PQ\u0003\u0014\n\u0000QR\u0005\u0002\u0000"+
		"\u0000R\u0011\u0001\u0000\u0000\u0000ST\u0005\r\u0000\u0000TU\u0005\u0005"+
		"\u0000\u0000UZ\u0005\u000f\u0000\u0000VW\u0005\u000e\u0000\u0000WX\u0005"+
		"\u0005\u0000\u0000XZ\u0005\u000f\u0000\u0000YS\u0001\u0000\u0000\u0000"+
		"YV\u0001\u0000\u0000\u0000Z\u0013\u0001\u0000\u0000\u0000[]\u0005\u0010"+
		"\u0000\u0000\\[\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\u0015\u0001\u0000\u0000"+
		"\u0000\u0006\u001e)0IY^";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}