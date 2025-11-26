package AirplaneStore.Avioes;

import AirplaneStore.Enums.CategoriaJato;
import AirplaneStore.Enums.Instalacao;

import java.util.ArrayList;

public class JatoParticular extends Aviao {

    private int lotacao;
    private double capacidadeBagagem;
    private CategoriaJato categoria;
    private ArrayList<Instalacao> comodidades;

    public JatoParticular(int numSerie, String modelo, int anoFabrico, double peso, double compFuselagem, double envAsas, double alturaCauda, int numMotores, double autonomia, double velMax, double preco, int lotacao, double capacidadeBagagem, CategoriaJato categoria) {
        super(numSerie, modelo, anoFabrico, peso, compFuselagem, envAsas, alturaCauda, numMotores, autonomia, velMax, preco);
        this.lotacao = lotacao;
        this.capacidadeBagagem = capacidadeBagagem;
        this.categoria = categoria;
        this.comodidades = new ArrayList<Instalacao>();
    }

    public void montarInstalacao(Instalacao instalacaoNova) {
        this.comodidades.add(instalacaoNova);
        System.out.println("Instalação " + instalacaoNova + " montada no " + super.modelo);
    }

    public void removerInstalacao(Instalacao instalacaoRemovida) {
        this.comodidades.remove(instalacaoRemovida);
        System.out.println("Instalação " + instalacaoRemovida + " removida do " + super.modelo);
    }

    public void gabarJato() {
        System.out.println("Olhem só que maravilha! Este " + super.modelo + " é fantástico!");
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Capacidade Bagagem: " + this.capacidadeBagagem + " cm3 | Lotação: " + this.lotacao + " | " + this.categoria);
        System.out.println(this.comodidades);
    }
}
