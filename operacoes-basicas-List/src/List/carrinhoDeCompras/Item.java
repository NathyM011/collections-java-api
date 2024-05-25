package List.carrinhoDeCompras;

public class Item {
    private String nome;
    private int quantidade;
    private double preco;

    public Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }


    @Override
    public String toString() {
        return "Item [nome=" + nome + "]";
    }


    public String getNome() {
        return nome;
    }


    public int getQuantidade() {
        return quantidade;
    }


    public double getPreco() {
        return preco;
    }

    
    
}
