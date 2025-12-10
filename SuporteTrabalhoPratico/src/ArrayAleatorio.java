import java.util.ArrayList;
import java.util.Collections;

public class ArrayAleatorio {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Cão");
        lista.add("Gato");
        lista.add("Leopardo");
        lista.add("Hipopotamo");
        lista.add("Jaguar");
        lista.add("Leão");
        lista.add("Suricata");

        // Método para baralhar o Array
        Collections.shuffle(lista);

        System.out.println(lista);

        System.out.println();

        // Imprimir os 3 primeiros (serão 3 aleatórios)
        for (int i = 0; i < 3; i++) {
            System.out.println(lista.get(i));
        }
    }
}
