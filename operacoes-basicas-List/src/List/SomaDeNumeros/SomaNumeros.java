package List.SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //atributos
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        if (!numeros.isEmpty()){
            for(Integer n : numeros){
                soma+= n;
            }
        }
        else{
            System.out.println("A lista de numeros está vazia!");
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()){
            for(Integer n : numeros){
                if (n >= maiorNumero){
                    maiorNumero = n;
                }
            }
        }
        else{
            System.out.println("A lista de numeros está vazia!");
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()){
            for(Integer n : numeros){
                if (n <= menorNumero){
                    menorNumero = n;
                }
            }
        }
        else{
            System.out.println("A lista de numeros está vazia!");
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        if (!numeros.isEmpty()){
            System.out.println(numeros);
        }
        else{
            System.out.println("A lista de numeros está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();
    
        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);
    
        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();
    
        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());
    
        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());
    
        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
      }
    
    
}
