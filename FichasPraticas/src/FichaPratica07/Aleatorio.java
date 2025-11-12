package FichaPratica07;

import java.util.Random;

public class Aleatorio {

    public static void main(String[] args) {

        // Criação do Random
        Random rd = new Random();

        System.out.println("_________________________");

        // rd.nextInt() - aleatório qualquer
        int aleatorio1 = rd.nextInt();
        System.out.println(aleatorio1);

        System.out.println("_________________________");

        // rd.nextInt(valor) - o número aleatório será entre 0 e valor (exclusive)

        // Neste caso, o aleatório será entre 0 e 29
        int aleatorio2 = rd.nextInt(30);
        System.out.println(aleatorio2);

        System.out.println("_________________________");

        // rd.nextInt(origem, fronteira) - o número aleatório será entre origem (inclusive) e fronteira (exclusive)

        // Neste caso, o aleatório será entre 100 e 109
        int aleatorio3 = rd.nextInt(100,110);
        System.out.println(aleatorio3);
    }
}
