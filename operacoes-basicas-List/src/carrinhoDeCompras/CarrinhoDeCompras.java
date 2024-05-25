package carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

import list.Tarefa;

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
    
}