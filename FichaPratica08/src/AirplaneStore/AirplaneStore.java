package AirplaneStore;

import AirplaneStore.Avioes.Aviao;
import AirplaneStore.Avioes.AviaoCombate;
import AirplaneStore.Avioes.JatoParticular;

import java.util.ArrayList;

public class AirplaneStore {

    private String nomeLoja;
    private ArrayList<Aviao> catalogo;

    public AirplaneStore(String nomeLoja) {
        this.nomeLoja = nomeLoja;
        this.catalogo = new ArrayList<Aviao>();
    }

    public void addAviao(Aviao aviaoNovo) {
        this.catalogo.add(aviaoNovo);
    }

    public void venderAviao(Aviao aviaoVendido) {
        this.catalogo.remove(aviaoVendido);
    }

    public double calcularTotalCatalogo() {
        double total = 0;

//        for (int i = 0; i < this.catalogo.size(); i++) {
//            total += this.catalogo.get(i).getPreco();
//        }

        for (Aviao aviaoAtual : this.catalogo) {
            total += aviaoAtual.getPreco();
        }

        return total;
    }


    public void listarCatalogo() {
        System.out.println("\n*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_* " + this.nomeLoja + " *_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");

        for (Aviao aviaoAtual : this.catalogo) {
            aviaoAtual.exibirDetalhes();

            if(aviaoAtual instanceof JatoParticular){
                JatoParticular jatoAtual = (JatoParticular) aviaoAtual;
                jatoAtual.exibirLuxo();
            }

            if(aviaoAtual instanceof AviaoCombate){
                AviaoCombate aviaoCombateAtual = (AviaoCombate) aviaoAtual;
                aviaoCombateAtual.usarArsenal();

            }

        }

        System.out.println("\nTotal do Catálogo: " + this.calcularTotalCatalogo() + " €");
    }
}
