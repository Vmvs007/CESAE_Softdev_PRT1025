package FichaPratica03;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int inicio, salto, limite;

        inicio = 0;

        System.out.print("Introduza o salto: ");
        salto = input.nextInt();

        System.out.print("Qual o limite: ");
        limite = input.nextInt();

        while (inicio <= limite) {
            System.out.println(inicio);
            inicio = inicio + salto;
        }
    }
}
