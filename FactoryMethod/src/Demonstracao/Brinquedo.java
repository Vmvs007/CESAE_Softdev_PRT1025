package Demonstracao;

public class Brinquedo extends Produto{

    public Brinquedo(String nome, double preco, double peso) {
        super(nome, preco, peso);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Roupa: " + this.nome + " | Preço: " + this.preco + " € | Peso: " + this.peso + " Kg.");
    }
}
