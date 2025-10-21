package FichaPratica03;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        double num = 0, somatorio = 0, contador = 0, media;

        while (num != -1) {
            System.out.print("Insira um número: ");
            num = input.nextDouble();

            if (num != -1) {
                contador++;
                somatorio = somatorio + num;
            }
        }

        media = somatorio / contador;

        System.out.println("Média: " + media);

    }
}
