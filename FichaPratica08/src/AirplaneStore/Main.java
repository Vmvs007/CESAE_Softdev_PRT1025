package AirplaneStore;

import AirplaneStore.Avioes.Aviao;
import AirplaneStore.Avioes.AviaoCombate;
import AirplaneStore.Avioes.JatoParticular;
import AirplaneStore.Enums.Arma;
import AirplaneStore.Enums.CategoriaJato;
import AirplaneStore.Enums.Instalacao;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        JatoParticular partyPlane = new JatoParticular(111, "Gulfstream 700", 2015, 900, 7.5, 4, 1.2, 2, 1200, 890, 15000, 8, 500, CategoriaJato.LIGHT_JET);
        partyPlane.addInstalacao(Instalacao.WC);
        partyPlane.addInstalacao(Instalacao.JACUZZI);
        partyPlane.addInstalacao(Instalacao.COCKTAIL_BAR);

        JatoParticular boeing = new JatoParticular(712, "Boeing 747", 2023, 10500, 32, 15.5, 3.2, 4, 6500, 1050, 90000, 120, 6000, CategoriaJato.HEAVY_JET);
        boeing.addInstalacao(Instalacao.ESCRITORIO);
        boeing.addInstalacao(Instalacao.WC);
        boeing.addInstalacao(Instalacao.WC);
        boeing.addInstalacao(Instalacao.TOMADAS);
        boeing.addInstalacao(Instalacao.WIFI);


        AviaoCombate f16 = new AviaoCombate(12, "F16", 2019, 750, 5.5, 2, 1.2, 2, 2500, 2300, 150000, "USA", false);
        f16.addArma(Arma.METRALHADORA);
        f16.addArma(Arma.BOMBAS);
        f16.addArma(Arma.TORPEDOS);
        f16.addArma(Arma.FOGUETES);

        AviaoCombate ac130 = new AviaoCombate(1, "AC130", 1999, 4500, 12.8, 3.8, 2, 4, 5000, 900, 30000, "Ásia", true);
        ac130.addArma(Arma.NAPALM);


        AirplaneStore nineEleven = new AirplaneStore("Nine Eleven Airplanes Inc.");
        nineEleven.addAviao(partyPlane);
        nineEleven.addAviao(boeing);
        nineEleven.addAviao(f16);
        nineEleven.addAviao(ac130);

        nineEleven.listarCatalogo();

    }
}
