package List.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

import List.OperacoesBasicas.Tarefa;

public class CarrinhoDeCompras{
    private List<Item> listaItem;

    public CarrinhoDeCompras() {
        this.listaItem = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItem.add(new Item(nome, quantidade, preco));
    }
    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();

        if (!listaItem.isEmpty()) {
            for (Item t : listaItem ) {
                if (t.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(t);
                }
            }
            listaItem.removeAll(itensParaRemover);
        }else{
            System.out.println("Carrinho vazio!");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        if (!listaItem.isEmpty()){
            for(Item item : listaItem){
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
        }
        else{
            throw new RuntimeException("O carrinho está vazio!");
        }
        return valorTotal;
    }

    public void exibirItens(){
        if (!listaItem.isEmpty()) {
            System.out.println(listaItem);
        }
        else{
            throw new RuntimeException("O carrinho está vazio!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
    
        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);
    
        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();
    
        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");
    
        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();
    
        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
      }
    
}