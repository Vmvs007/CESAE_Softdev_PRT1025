package AirplaneStore.Avioes;

import AirplaneStore.Enums.CategoriaJato;
import AirplaneStore.Enums.Instalacao;

import java.util.ArrayList;

public class JatoParticular extends Aviao {

    private int lotacao;
    private double capacidadeBagagem;
    private CategoriaJato categoria;
    private ArrayList<Instalacao> comodidades;

    public JatoParticular(int numSerie, String modelo, int anoFabrico, double peso, double compFuselagem, double envAsas, double altCauda, int numMotores, double autonomia, double velMax, double preco, int lotacao, double capacidadeBagagem, CategoriaJato categoria) {
        super(numSerie, modelo, anoFabrico, peso, compFuselagem, envAsas, altCauda, numMotores, autonomia, velMax, preco);
        this.lotacao = lotacao;
        this.capacidadeBagagem = capacidadeBagagem;
        this.categoria = categoria;
        this.comodidades = new ArrayList<Instalacao>();
    }

    public void addInstalacao(Instalacao instalacaoNova) {
        this.comodidades.add(instalacaoNova);
    }

    public void exibirLuxo(){
        System.out.println("Reparem na qualidade deste menino.");
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Lotação: " + this.lotacao + " | Cap. Bagagem: " + this.capacidadeBagagem + " cm3");
        System.out.println("Comodidades: " + this.comodidades);
    }
}
