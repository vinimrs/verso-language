// Generated from /home/bessa/Documents/UFSCAR/Compiladores/verso-language/verso/src/main/antlr4/br/ufscar/dc/compiladores/verso/Verso.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VersoParser}.
 */
public interface VersoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VersoParser#layout}.
	 * @param ctx the parse tree
	 */
	void enterLayout(VersoParser.LayoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link VersoParser#layout}.
	 * @param ctx the parse tree
	 */
	void exitLayout(VersoParser.LayoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link VersoParser#page}.
	 * @param ctx the parse tree
	 */
	void enterPage(VersoParser.PageContext ctx);
	/**
	 * Exit a parse tree produced by {@link VersoParser#page}.
	 * @param ctx the parse tree
	 */
	void exitPage(VersoParser.PageContext ctx);
	/**
	 * Enter a parse tree produced by {@link VersoParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(VersoParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VersoParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(VersoParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VersoParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(VersoParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VersoParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(VersoParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VersoParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(VersoParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link VersoParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(VersoParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link VersoParser#footer}.
	 * @param ctx the parse tree
	 */
	void enterFooter(VersoParser.FooterContext ctx);
	/**
	 * Exit a parse tree produced by {@link VersoParser#footer}.
	 * @param ctx the parse tree
	 */
	void exitFooter(VersoParser.FooterContext ctx);
	/**
	 * Enter a parse tree produced by {@link VersoParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterParagraph(VersoParser.ParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link VersoParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitParagraph(VersoParser.ParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link VersoParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(VersoParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link VersoParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(VersoParser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link VersoParser#link}.
	 * @param ctx the parse tree
	 */
	void enterLink(VersoParser.LinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link VersoParser#link}.
	 * @param ctx the parse tree
	 */
	void exitLink(VersoParser.LinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link VersoParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(VersoParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VersoParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(VersoParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VersoParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(VersoParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link VersoParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(VersoParser.TextContext ctx);
}