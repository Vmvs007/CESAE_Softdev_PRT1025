package FichaPratica02;

import java.util.Scanner;

public class Ex01_v2 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int num1, num2;

        // Ler numeros
        System.out.print("Insira um número: ");
        num1 = input.nextInt();

        System.out.print("Insira outro número: ");
        num2 = input.nextInt();

        // Apresentar na consola o maior

        if (num1 == num2) {
            System.out.println("São iguais!");
        } else {

            if (num1 > num2) {
                System.out.println("Maior: " + num1);
            } else {
                System.out.println("Maior: " + num2);
            }


        }


    }
}
