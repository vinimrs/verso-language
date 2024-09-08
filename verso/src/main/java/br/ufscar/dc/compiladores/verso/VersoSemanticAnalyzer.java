package br.ufscar.dc.compiladores.verso;

import br.ufscar.dc.compiladores.verso.VersoParser.*;

public class VersoSemanticAnalyzer extends VersoBaseVisitor<Object> {

  // Usamos StringBuilder para construir o HTML
  private StringBuilder html = new StringBuilder();

  Scope escoposAninhados = new Scope(SymbolsTable.Types.VOID);

  @Override
  public Object visitPage(PageContext ctx) {
    html.append("<!DOCTYPE html lang=\"pt-BR\">\n");
    html.append(HtmlCodeGenerator.getHtmlHeaderWithStyles());
    html.append("<body>\n");

    // Verifica se há ao menos um conteúdo na página
    if (ctx.content().isEmpty()) {
      VersoUtils.addSemanticError(ctx.start, "A página deve conter pelo menos um conteúdo");
    }

    super.visitPage(ctx); // Continue a visitação
    html.append("</body>\n");
    html.append("</html>\n");
    return html.toString();
  }

  @Override
  public Object visitSection(SectionContext ctx) {
    html.append("<section>\n");
    // Verifica se a seção contém conteúdos válidos
    if (ctx.content().isEmpty()) {
      VersoUtils.addSemanticError(ctx.start, "A seção " + ctx.getText() + " deve conter pelo menos um conteúdo");
    }

    super.visitSection(ctx); // Continue a visitação
    html.append("</section>\n");
    return null;
  }

  @Override
  public Object visitHeader(HeaderContext ctx) {
    html.append("<header>");

    if (ctx.text() == null || ctx.text().getText().isEmpty()) {
      VersoUtils.addSemanticError(ctx.start, "O cabeçalho deve conter texto");
    } else {
      html.append(ctx.text().getText());
    }

    html.append("</header>\n");
    return null;
  }

  @Override
  public Object visitFooter(FooterContext ctx) {
    html.append("<footer>");

    if (ctx.text() == null || ctx.text().getText().isEmpty()) {
      VersoUtils.addSemanticError(ctx.start, "O rodapé deve conter texto");
    } else {
      html.append(ctx.text().getText());
    }

    html.append("</footer>\n");
    return null;
  }

  @Override
  public Object visitParagraph(ParagraphContext ctx) {
    html.append("<p>");

    if (ctx.text() == null || ctx.text().getText().isEmpty()) {
      VersoUtils.addSemanticError(ctx.start, "O parágrafo deve conter texto");
    } else {
      html.append(ctx.text().getText());
    }

    html.append("</p>\n");
    return null;
  }

@Override
public Object visitImage(ImageContext ctx) {
    html.append("<img src=\"");

    // Verifica se o caminho da imagem é válido
    if (ctx.STRING() == null || ctx.STRING().getText().isEmpty()) {
        VersoUtils.addSemanticError(ctx.start, "A imagem deve conter um caminho válido");
    } else {
        html.append(ctx.STRING().getText().replace("\"", ""));
    }

    html.append("\"");

    // Verifica o atributo 'alt'
    if (ctx.attribute() != null) {
        AttributeContext attr = ctx.attribute();
        if (attr.getText().startsWith("alt")) {
            html.append(" alt=\"").append(attr.STRING().getText().replace("\"", "")).append("\"");
        }
    } else {
        // Se o atributo 'alt' não for encontrado, adiciona um erro semântico
        VersoUtils.addSemanticError(ctx.start, "O atributo 'alt' é obrigatório para imagens");
    }

    html.append(" />\n");
    return null;
}

@Override
public Object visitLink(LinkContext ctx) {
    html.append("<a href=\"");

    // Verifica se o caminho do link (href) é válido
    if (ctx.STRING() == null || ctx.STRING().getText().isEmpty()) {
      VersoUtils.addSemanticError(ctx.start, "O link deve conter uma URL válida (href)");
    } else {
      html.append(ctx.STRING().getText().replace("\"", ""));
    }

    html.append("\">");

    // Verifica se o link tem texto de ancoragem
    if (ctx.text() == null || ctx.text().getText().isEmpty()) {
      VersoUtils.addSemanticError(ctx.start, "O link deve conter um texto de ancoragem válido");
    } else {
      html.append(ctx.text().getText());
    }

    html.append("</a>\n");
    return null;
}

  public String getGeneratedHtml() {
    return html.toString();
  }
}
