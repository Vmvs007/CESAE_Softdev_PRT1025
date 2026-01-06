package Demonstracao;

public class Comida extends Produto {

    private int anoValidade;

    public Comida(String nome, double preco, double peso, int anoValidade) {
        super(nome, preco, peso);
        this.anoValidade= anoValidade;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Comida: " + this.nome + " | Preço: " + this.preco + " € | Peso: " + this.peso + " Kg. | Validade: "+this.anoValidade);
    }
}
