package Demonstracao;

public class Eletronico extends Produto {

    private boolean garantia;

    public Eletronico(String nome, double preco, double peso, boolean garantia) {
        super(nome, preco, peso);
        this.garantia = garantia;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Eletrónico: " + this.nome + " | Preço: " + this.preco + " € | Peso: " + this.peso + " Kg. | Garantia: " + this.garantia);
    }
}
