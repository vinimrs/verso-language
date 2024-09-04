package br.ufscar.dc.compiladores.verso;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

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

      // Inicia o processo de análise
      VersoParser.PageContext arvore = parser.page();

      // Analisador semântico é criado e o programa visita os nós da árvore criada
      VersoSemanticAnalyzer as = new VersoSemanticAnalyzer();
      as.visitPage(arvore);

      // Obtém o iterator de erros e imprime os erros
      Iterator<String> iterator = VersoUtils.errosSemanticos.iterator();
      while (iterator.hasNext()) {
        String err = iterator.next();
        writer.write(err + "\n");
      }

      // Programa é finalizado
      writer.write("Fim da compilacao" + "\n");

      // Fecha o arquivo de destino
      writer.close();
    } catch (IOException ex) {
      // TODO: handle exception
    }
  }
}