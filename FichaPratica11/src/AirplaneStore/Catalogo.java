package AirplaneStore;

import AirplaneStore.Avioes.Aviao;
import AirplaneStore.Avioes.AviaoCombate;
import AirplaneStore.Avioes.JatoParticular;

import java.util.ArrayList;

public class Catalogo {
    private String localizacaoLoja;
    private String nomeLoja;
    private ArrayList<Aviao> stock;

    public Catalogo(String localizacaoLoja, String nomeLoja) {
        this.localizacaoLoja = localizacaoLoja;
        this.nomeLoja = nomeLoja;
        this.stock = new ArrayList<Aviao>();
    }

    public void adquirirAviao(Aviao aviaoNovo) {
        this.stock.add(aviaoNovo);
    }

    public void venderAviao(Aviao aviaoVendido) {
        this.stock.remove(aviaoVendido);
    }

    public void exibirCatalogo() {
        System.out.println("******************** Bem-vindo/a à " + this.nomeLoja + " | " + this.localizacaoLoja + " ********************");
        for (Aviao aviaoAtual : this.stock) {
            aviaoAtual.exibirDetalhes();

            if (aviaoAtual instanceof JatoParticular) {
                JatoParticular jatoParticularAtual = (JatoParticular) aviaoAtual;
                jatoParticularAtual.gabarJato();
            }

            if (aviaoAtual instanceof AviaoCombate) {
                AviaoCombate aviaoCombateAtual = (AviaoCombate) aviaoAtual;
                aviaoCombateAtual.mostrarArsenal();
            }
        }
    }

}
