package Ex03;

public class Main {
    public static void main(String[] args) {

        Peixe sardinhas = new Peixe("Sardinha", 10, 7.25);
        Peixe peixeEspada = new Peixe("Peixe Espada", 100, 15);
        Peixe dourada = new Peixe("Dourada", 50, 10);
        Peixe robalo = new Peixe("Robalo", 25, 12.5);

        Marisco lagosta = new Marisco("Lagosta", 10, 120);
        Marisco camarao = new Marisco("Camarão", 5, 19.9);
        Marisco ameijoa = new Marisco("Ameijoa", 25, 25);

        BarcoPesca barco = new BarcoPesca("Amor de Mãe", "Branco e Azul", 1975, 2, 100, Marca.WOOLRIDGE);
        barco.pescarPeixe(sardinhas);
        barco.pescarPeixe(peixeEspada);

        barco.pescarMarisco(lagosta);
        barco.pescarMarisco(ameijoa);

        barco.largarPeixe(sardinhas);

        barco.pescarPeixe(dourada);


        barco.exibirDetalhes();

    }
}
