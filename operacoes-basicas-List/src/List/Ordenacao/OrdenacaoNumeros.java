package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    //atributos
    private List<Integer> numerosList;

    //cosntrutor
    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosOrdenadosAscendentes = new ArrayList<>(this.numerosList);
        Collections.sort(numerosOrdenadosAscendentes);
        return numerosOrdenadosAscendentes;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosOrdenadosDescendentes = new ArrayList<>(this.numerosList);
        numerosOrdenadosDescendentes.sort(Collections.reverseOrder());
        return numerosOrdenadosDescendentes;
    }

    public void exibirNumeros() {
        if (!numerosList.isEmpty()) {
          System.out.println(this.numerosList);
        } else {
          System.out.println("A lista está vazia!");
        }
      }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
    
        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);
    
        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();
    
        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());
    
        // Exibindo a lista
        numeros.exibirNumeros();
    
        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());
    
        // Exibindo a lista
        numeros.exibirNumeros();
      }

}
