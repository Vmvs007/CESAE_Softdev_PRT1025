package AirplaneStore;

import AirplaneStore.Avioes.AviaoCombate;
import AirplaneStore.Avioes.JatoParticular;
import AirplaneStore.Enums.Arma;
import AirplaneStore.Enums.CategoriaJato;
import AirplaneStore.Enums.Instalacao;

public class Main {
    public static void main(String[] args) {


        JatoParticular cessna = new JatoParticular(1200, "Cessna XPTO", 2020, 4500, 12.5, 5.75, 2, 2, 3500, 850, 10000, 12, 500, CategoriaJato.LIGHT_JET);
        cessna.montarInstalacao(Instalacao.WC);
        cessna.montarInstalacao(Instalacao.WIFI);
        cessna.montarInstalacao(Instalacao.SUITE);

        JatoParticular gulfstream = new JatoParticular(2350, "Gulstream F500", 2012, 5600, 22, 8.6, 3, 4, 6700, 980, 15000, 18, 1000, CategoriaJato.MIDSIZE_JET);
        gulfstream.montarInstalacao(Instalacao.WC);
        gulfstream.montarInstalacao(Instalacao.PARQUE_INFANTIL);
        gulfstream.montarInstalacao(Instalacao.TOMADAS);
        gulfstream.montarInstalacao(Instalacao.WIFI);

        JatoParticular boeing = new JatoParticular(4411, "747", 2018, 8900, 25, 12, 2.9, 4, 5000, 980, 20000, 120, 4800, CategoriaJato.HEAVY_JET);
        boeing.montarInstalacao(Instalacao.WC);
        boeing.montarInstalacao(Instalacao.WC);
        boeing.montarInstalacao(Instalacao.TOMADAS);
        boeing.montarInstalacao(Instalacao.WIFI);
        boeing.montarInstalacao(Instalacao.CINEMA);
        boeing.montarInstalacao(Instalacao.PISCINA);

        AviaoCombate f16 = new AviaoCombate(122, "F16", 2018, 700, 7.5, 4, 0.9, 2, 1200, 1400, 40000, "USA", false);
        f16.montarArma(Arma.METRALHADORAS);
        f16.montarArma(Arma.FOGUETES);

        AviaoCombate f22 = new AviaoCombate(133, "F22", 2022, 650, 7.8, 4.2, 1, 2, 1500, 1800, 45000, "USA", true);
        f22.montarArma(Arma.MISSEIS);
        f22.montarArma(Arma.TORPEDOS);
        f22.montarArma(Arma.FOGUETES);
        f22.montarArma(Arma.BOMBAS);


        System.out.println("____________________________");

        Catalogo comAsas = new Catalogo("Porto", "Com Asas - Airplane Store Lda.");
        comAsas.adquirirAviao(f16);
        comAsas.adquirirAviao(boeing);
        comAsas.adquirirAviao(cessna);
        comAsas.adquirirAviao(f22);
        comAsas.adquirirAviao(gulfstream);

        comAsas.exibirCatalogo();
    }
}
