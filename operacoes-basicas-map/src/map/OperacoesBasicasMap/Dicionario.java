package map.OperacoesBasicasMap;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> palavrasMap;

    public Dicionario() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        this.palavrasMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!palavrasMap.isEmpty()) {
            this.palavrasMap.remove(palavra);
        }
        else{
            throw new RuntimeException("Lista de palavras vazia!");
        }
    }

    public void exibirPalavras(){
        if (!palavrasMap.isEmpty()) {
            System.out.println(palavrasMap);
        }
        else{
            throw new RuntimeException("Lista de palavras vazia!");
        }
    }

    public String pesquisarPorPalavra(String palavra){
        String definicao = palavrasMap.get(palavra);
        if (definicao != null){
            return definicao;
        }
        return "Linguagem não enbcontrada!";        
    }
    
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
    
        // Adicionar palavras (linguagens de programação)
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");
    
        // Exibir todas as palavras
        dicionario.exibirPalavras();
    
        // Pesquisar palavras
        String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);
    
        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp);
    
        // Remover uma palavra
        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
      }
    
}
