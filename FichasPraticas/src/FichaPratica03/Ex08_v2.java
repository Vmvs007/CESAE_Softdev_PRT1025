package FichaPratica03;

import java.util.Scanner;

public class Ex08_v2 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int numero, antecessor, sucessor;

        // Ler numero
        System.out.print("Insira um número: ");
        numero = input.nextInt();

        antecessor = numero - 5;
        sucessor = numero + 5;

        while (antecessor <= sucessor) {
            if (antecessor != numero) {
                System.out.println(antecessor);
            }
            antecessor++;
        }


    }
}
