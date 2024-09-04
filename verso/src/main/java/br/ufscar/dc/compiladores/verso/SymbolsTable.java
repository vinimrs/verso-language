package br.ufscar.dc.compiladores.verso;

import java.util.ArrayList;
import java.util.HashMap;

// Classe que representa uma tabela de símbolos para o compilador Verso
public class SymbolsTable {
  public SymbolsTable.Types returnType;

  // Enumeração para os tipos de elementos na linguagem Verso
  public enum Types {
    PAGE, SECTION, HEADER, FOOTER, PARAGRAPH, IMAGE, LINK, STRING, INVALIDO, VOID
  }

  // Enumeração para as estruturas dos elementos na linguagem Verso
  public enum Structure {
    ELEMENT, ATTRIBUTE
  }

  // Classe interna que representa uma entrada na tabela de símbolos
  class SymbolsTableEntry {
    String name;
    Types tipo;
    Structure structure;

    public SymbolsTableEntry(String name, Types tipo, Structure structure) {
      this.name = name;
      this.tipo = tipo;
      this.structure = structure;
    }
  }

  // HashMap para armazenar as entradas da tabela de símbolos
  private HashMap<String, SymbolsTableEntry> Mtabela;
  // HashMap para armazenar os atributos associados a cada tipo de elemento
  private HashMap<String, ArrayList<SymbolsTableEntry>> Ttabela;

  // Construtor que inicializa a tabela de símbolos com o tipo de retorno
  public SymbolsTable(SymbolsTable.Types returnType) {
    Mtabela = new HashMap<>();
    Ttabela = new HashMap<>();
    this.returnType = returnType;
  }

  // Método para adicionar uma nova entrada na tabela de símbolos
  public void add(String name, Types tipo, Structure structure) {
    SymbolsTableEntry input = new SymbolsTableEntry(name, tipo, structure);
    Mtabela.put(name, input);
  }

  // Método para adicionar uma entrada existente na tabela de símbolos
  public void add(SymbolsTableEntry input) {
    Mtabela.put(input.name, input);
  }

  // Método para adicionar um atributo a um tipo de elemento
  public void add(String tipoName, SymbolsTableEntry input) {
    if (Ttabela.containsKey(tipoName)) {
      Ttabela.get(tipoName).add(input);
    } else {
      ArrayList<SymbolsTableEntry> list = new ArrayList<>();
      list.add(input);
      Ttabela.put(tipoName, list);
    }
  }

  // Método para verificar o tipo de um elemento
  public Types verify(String name) {
    if (Mtabela.containsKey(name))
      return Mtabela.get(name).tipo;
    else
      return null;
  }

  // Método para obter a estrutura de um elemento
  public Structure getStructure(String name) {
    return Mtabela.get(name).structure;
  }

  // Método para verificar se um elemento existe na tabela de símbolos
  public boolean exists(String name) {
    return Mtabela.containsKey(name);
  }

  // Método para obter as propriedades de um tipo de elemento (atributos)
  public ArrayList<SymbolsTableEntry> getTypeProperties(String name) {
    return Ttabela.get(name);
  }
}
