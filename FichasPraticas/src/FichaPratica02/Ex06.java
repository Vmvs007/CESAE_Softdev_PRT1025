package FichaPratica02;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int num1, num2;

        // Ler números
        System.out.print("Introduza um número: ");
        num1 = input.nextInt();

        System.out.print("Introduza outro número: ");
        num2 = input.nextInt();

        if (num1 < num2) {
            System.out.println(num2 + " " + num1);
        } else {
            System.out.println(num1 + " " + num2);
        }
    }
}
