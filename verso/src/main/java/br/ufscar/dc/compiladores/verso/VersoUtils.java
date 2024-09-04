package br.ufscar.dc.compiladores.verso;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import br.ufscar.dc.compiladores.verso.VersoParser.*; // Importa as classes geradas pelo ANTLR

public class VersoUtils {
  public static List<String> errosSemanticos = new ArrayList<>();

  // Adiciona um erro semântico à lista e informa a linha onde foi encontrado,
  // dado um token e a mensagem como parâmetros
  public static void addSemanticError(Token t, String mensagem) {
    int linha = t.getLine();
    errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
  }

  // Verifica o tipo de um símbolo presente em uma SymbolsTable considerando um
  // elemento de layout (por exemplo, uma seção ou parágrafo)
  public static SymbolsTable.Types verifyType(Scope escopos, PageContext ctx) {
    return SymbolsTable.Types.PAGE;
  }

  public static SymbolsTable.Types verifyType(Scope escopos, SectionContext ctx) {
    return SymbolsTable.Types.SECTION;
  }

  public static SymbolsTable.Types verifyType(Scope escopos, HeaderContext ctx) {
    return SymbolsTable.Types.HEADER;
  }

  public static SymbolsTable.Types verifyType(Scope escopos, FooterContext ctx) {
    return SymbolsTable.Types.FOOTER;
  }

  public static SymbolsTable.Types verifyType(Scope escopos, ParagraphContext ctx) {
    return SymbolsTable.Types.PARAGRAPH;
  }

  public static SymbolsTable.Types verifyType(Scope escopos, ImageContext ctx) {
    return SymbolsTable.Types.IMAGE;
  }

  public static SymbolsTable.Types verifyType(Scope escopos, LinkContext ctx) {
    return SymbolsTable.Types.LINK;
  }

  // Verifica o tipo de um símbolo presente em uma SymbolsTable considerando um
  // atributo de um elemento (por exemplo, 'alt' em uma imagem ou 'href' em um
  // link)
  public static SymbolsTable.Types verifyType(Scope escopos, AttributeContext ctx) {
    SymbolsTable.Types ret = null;

    if (ctx.getText().startsWith("alt")) {
      ret = SymbolsTable.Types.STRING;
    } else if (ctx.getText().startsWith("href")) {
      ret = SymbolsTable.Types.STRING;
    } else {
      ret = SymbolsTable.Types.INVALIDO;
    }

    return ret;
  }

  // Verifica o tipo de um símbolo presente em uma SymbolsTable considerando uma
  // string de identificador
  public static SymbolsTable.Types verifyType(Scope escopos, String nomeVar) {
    SymbolsTable.Types type = null;
    for (SymbolsTable SymbolsTable : escopos.getStack()) {
      type = SymbolsTable.verify(nomeVar);
      if (type != null) {
        break;
      }
    }
    return type;
  }

  // Verifica a estrutura de um símbolo presente em uma SymbolsTable considerando
  // uma string de identificador
  public static SymbolsTable.Structure verifyStructure(Scope escopos, String nomeVar) {
    SymbolsTable.Structure structure = null;
    for (SymbolsTable SymbolsTable : escopos.getStack()) {
      structure = SymbolsTable.getStructure(nomeVar);
      if (structure != null) {
        break;
      }
    }
    return structure;
  }

  // Converte uma string para o tipo correspondente na tabela de símbolos
  public static SymbolsTable.Types getType(String val) {
    SymbolsTable.Types tipo = null;
    switch (val.toLowerCase()) {
      case "page":
        tipo = SymbolsTable.Types.PAGE;
        break;
      case "section":
        tipo = SymbolsTable.Types.SECTION;
        break;
      case "header":
        tipo = SymbolsTable.Types.HEADER;
        break;
      case "footer":
        tipo = SymbolsTable.Types.FOOTER;
        break;
      case "paragraph":
        tipo = SymbolsTable.Types.PARAGRAPH;
        break;
      case "image":
        tipo = SymbolsTable.Types.IMAGE;
        break;
      case "link":
        tipo = SymbolsTable.Types.LINK;
        break;
      default:
        tipo = SymbolsTable.Types.INVALIDO;
        break;
    }
    return tipo;
  }
}
