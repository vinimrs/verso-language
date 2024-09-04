package br.ufscar.dc.compiladores.verso;

import br.ufscar.dc.compiladores.verso.VersoParser.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.antlr.v4.runtime.Token;

public class VersoSemanticAnalyzer extends VersoBaseVisitor<Object> {

    Scope escoposAninhados = new Scope(SymbolsTable.Types.VOID);

    @Override
    public Object visitPage(PageContext ctx) {
        // Verifica se há ao menos um conteúdo na página
        if (ctx.content().isEmpty()) {
            VersoUtils.addSemanticError(ctx.start, "A página deve conter pelo menos um conteúdo");
        }
        return super.visitPage(ctx);
    }

    @Override
    public Object visitSection(SectionContext ctx) {
        // Verifica se a seção contém conteúdos válidos
        if (ctx.content().isEmpty()) {
            VersoUtils.addSemanticError(ctx.start, "A seção deve conter pelo menos um conteúdo");
        }
        return super.visitSection(ctx);
    }

    @Override
    public Object visitHeader(HeaderContext ctx) {
        // Verifica se o cabeçalho contém texto
        if (ctx.text() == null || ctx.text().getText().isEmpty()) {
            VersoUtils.addSemanticError(ctx.start, "O cabeçalho deve conter texto");
        }
        return super.visitHeader(ctx);
    }

    @Override
    public Object visitFooter(FooterContext ctx) {
        // Verifica se o rodapé contém texto
        if (ctx.text() == null || ctx.text().getText().isEmpty()) {
            VersoUtils.addSemanticError(ctx.start, "O rodapé deve conter texto");
        }
        return super.visitFooter(ctx);
    }

    @Override
    public Object visitParagraph(ParagraphContext ctx) {
        // Verifica se o parágrafo contém texto
        if (ctx.text() == null || ctx.text().getText().isEmpty()) {
            VersoUtils.addSemanticError(ctx.start, "O parágrafo deve conter texto");
        }
        return super.visitParagraph(ctx);
    }

    @Override
    public Object visitImage(ImageContext ctx) {
        // Verifica se a imagem contém um caminho válido
        if (ctx.STRING() == null || ctx.STRING().getText().isEmpty()) {
            VersoUtils.addSemanticError(ctx.start, "A imagem deve conter um caminho válido");
        }
        // Verifica se o texto alternativo está presente
        if (ctx.attribute() != null && ctx.attribute().STRING() == null) {
            VersoUtils.addSemanticError(ctx.start, "O atributo 'alt' deve conter um texto válido");
        }
        return super.visitImage(ctx);
    }

    @Override
    public Object visitLink(LinkContext ctx) {
        // Verifica se o link contém uma URL válida e texto
        if (ctx.STRING() == null || ctx.STRING().getText().isEmpty()) {
            VersoUtils.addSemanticError(ctx.start, "O link deve conter uma URL válida");
        }
        if (ctx.text() == null || ctx.text().getText().isEmpty()) {
            VersoUtils.addSemanticError(ctx.start, "O link deve conter um texto de ancoragem válido");
        }
        return super.visitLink(ctx);
    }

    // Método genérico para adicionar erros semânticos
    private void addSemanticError(Token token, String message) {
        int line = token.getLine();
        int charPositionInLine = token.getCharPositionInLine();
        System.err.println("Erro semântico na linha " + line + ":" + charPositionInLine + " - " + message);
    }
}
