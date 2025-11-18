package AirplaneStore.Avioes;

import AirplaneStore.Enums.Arma;

import java.util.ArrayList;

public class AviaoCombate extends Aviao {

    private String paisOrigem;
    private boolean camuflagem;
    private ArrayList<Arma> arsenal;

    public AviaoCombate(int numSerie, String modelo, int anoFabrico, double peso, double compFuselagem, double envAsas, double altCauda, int numMotores, double autonomia, double velMax, double preco, String paisOrigem, boolean camuflagem) {
        super(numSerie, modelo, anoFabrico, peso, compFuselagem, envAsas, altCauda, numMotores, autonomia, velMax, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.arsenal = new ArrayList<Arma>();
    }

    public void addArma(Arma armaNova) {
        if (this.arsenal.size() < 3) {
            this.arsenal.add(armaNova);
            System.out.println(this.modelo + " carregado com " + armaNova);
        } else {
            System.out.println(this.modelo + " carregado até aos dentes. Não pode com mais nada!");
        }
    }

    public void usarArsenal(){
        System.out.println("VRUMMMMMMM - TATATATATATA - GRRRRR - BOOOOMMMMMMMMM");
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.print("País de Origem: " + this.paisOrigem + " | ");

        if (this.camuflagem) {
            System.out.println("Camuflado");
        } else {
            System.out.println("Sem camuflagem");
        }

        System.out.println("Arsenal: " + this.arsenal);
    }
}
