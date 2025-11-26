package AirplaneStore.Avioes;

import AirplaneStore.Enums.Arma;

import java.util.ArrayList;

public class AviaoCombate extends Aviao {
    private String paisOrigem;
    private boolean camuflagem;
    private ArrayList<Arma> arsenal;

    public AviaoCombate(int numSerie, String modelo, int anoFabrico, double peso, double compFuselagem, double envAsas, double alturaCauda, int numMotores, double autonomia, double velMax, double preco, String paisOrigem, boolean camuflagem) {
        super(numSerie, modelo, anoFabrico, peso, compFuselagem, envAsas, alturaCauda, numMotores, autonomia, velMax, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.arsenal = new ArrayList<Arma>();
    }

    public void montarArma(Arma armaNova) {
        if (this.arsenal.size() < 3) {
            System.out.println(armaNova + " adicionada ao arsenal do " + super.modelo);
            this.arsenal.add(armaNova);
        } else {
            System.out.println("Arsenal do " + super.modelo + " já está lotado. " + armaNova + " não foi adicionada!");
        }
    }

    public void mostrarArsenal() {
        System.out.println("TRAAAAAAAAAAAAAA | BOOOOOOOOOOOOOOMMMMM | PSHHHHHHHHHHHHT");
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println(this.paisOrigem + " | Camuflagem: " + this.camuflagem);
        System.out.println(this.arsenal);
    }
}
