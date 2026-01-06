package Demonstracao;

public class Ferramenta extends Produto{
    public Ferramenta(String nome, double preco, double peso) {
        super(nome, preco, peso);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Ferramenta: " + this.nome + " | Preço: " + this.preco + " € | Peso: " + this.peso + " Kg.");
    }
}
