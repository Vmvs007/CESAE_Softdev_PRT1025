package Ex08;

public class Produto {
    private String nome;
    private double preco;
    private int stock = 0;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getStock() {
        return stock;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void adquirirStock(int novoStock) {
        this.stock += novoStock;
        System.out.println("Stock adquirido com sucesso.");
    }

    public void venderProduto(int quantidadeVenda) {
        if (this.stock >= quantidadeVenda) {
            this.stock -= quantidadeVenda;

            double totalVenda = quantidadeVenda * this.preco;

            System.out.println("Venda efetuada com sucesso. Total: " + totalVenda + " €");
        } else {
            System.out.println("Venda recusada. Ruptura de stock.");
        }

    }

    public void exibirDetalhes() {
        System.out.println(this.nome + " | " + this.preco + " € | Stock: " + this.stock);
    }
}
