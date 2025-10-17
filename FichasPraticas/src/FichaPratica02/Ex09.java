package FichaPratica02;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int a, b, c;

        // Ler números
        System.out.print("Insira o 1º número: ");
        a = input.nextInt();

        System.out.print("Insira o 2º número: ");
        b = input.nextInt();

        System.out.print("Insira o 3º número: ");
        c = input.nextInt();

        // Apresentar o menor dos 3
        if (a < b && a < c) {
            System.out.println("Menor: " + a);
        }

        if (b < a && b < c) {
            System.out.println("Menor: " + b);
        }

        if (c < a && c < b) {
            System.out.println("Menor: " + c);
        }
    }
}
