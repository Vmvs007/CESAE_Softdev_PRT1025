package Demonstracao;

public class Produto {
    protected String nome;
    protected double preco;
    protected double peso;

    public Produto(String nome, double preco, double peso) {
        this.nome = nome;
        this.preco = preco;
        this.peso = peso;
    }

    public void exibirDetalhes(){
        System.out.println("Produto: "+this.nome+" | Preço: "+this.preco+" € | Peso: "+this.peso+" Kg.");
    }
}
