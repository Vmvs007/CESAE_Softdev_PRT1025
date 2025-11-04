package FichaPratica06;

import static FichaPratica06.BibliotecaInput.lerInteiroPositivo;

public class Ex02 {

    public static void imprimirAsteriscos(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {

        int quant = lerInteiroPositivo();

        imprimirAsteriscos(quant);

    }

}
