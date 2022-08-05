package Produto;

public class Produto {
    public String nome;
    public Double preço;
    public int quantidade;
    public int adicionarProdutos; 

    public double valorTotalEmEstoque() {
        return preço * quantidade;
    }
    public void adicionarProdutos(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade){
        this.quantidade -= quantidade;
    }
    public String toString() { 
        return nome + ", $ " + preço + ", " + quantidade + " unidades, valor total do estoque: $" + valorTotalEmEstoque();
    }
}
