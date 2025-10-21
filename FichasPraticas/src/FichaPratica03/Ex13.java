package FichaPratica03;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int inicio, limite;

        System.out.print("Qual o inicio: ");
        inicio = input.nextInt();


        System.out.print("Qual o limite: ");
        limite = input.nextInt();

        while (inicio <= limite) {
            if (inicio % 5 == 0) {
                System.out.println(inicio);
            }

            inicio++;
        }
    }
}