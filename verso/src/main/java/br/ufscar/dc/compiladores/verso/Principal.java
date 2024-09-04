package br.ufscar.dc.compiladores.verso;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class Principal {

  public static void main(String[] args) {

    try {
      // Cria um fluxo de caracteres a partir do arquivo de origem (args[0])
      CharStream input = CharStreams.fromFileName(args[0]);

      // Inicializa o lexer com o fluxo de caracteres
      VersoLexer lexer = new VersoLexer(input);

      // Cria um fluxo de tokens a partir do lexer
      CommonTokenStream tokens = new CommonTokenStream(lexer);

      // Inicializa o parser com o fluxo de tokens
      VersoParser parser = new VersoParser(tokens);

      // Abre o arquivo de destino para escrita (args[1])
      FileWriter writer = new FileWriter(args[1]);

      // Configura um listener personalizado para lidar com erros de análise
      MyCustomErrorListener errorListener = new MyCustomErrorListener(writer);
      parser.removeErrorListeners();
      parser.addErrorListener(errorListener);

      // Inicia o processo de análise
      VersoParser.PageContext arvore = parser.page();

      // Analisador semântico é criado e o programa visita os nós da árvore criada
      VersoSemanticAnalyzer as = new VersoSemanticAnalyzer();
      as.visitPage(arvore);
      String html = as.getGeneratedHtml();

      // Obtém o iterator de erros e imprime os erros
      Iterator<String> iterator = VersoUtils.errosSemanticos.iterator();
      while (iterator.hasNext()) {
        String err = iterator.next();
        writer.write(err + "\n");
      }

      // escrever os tokens para debug
      // for (Token token : tokens.getTokens()) {
      // writer.write(token.toString() + "\n");
      // }

      // Programa é finalizado
      writer.write(html + "\n");

      // Fecha o arquivo de destino
      writer.close();
    } catch (IOException ex) {
      // TODO: handle exception
    }
  }
}