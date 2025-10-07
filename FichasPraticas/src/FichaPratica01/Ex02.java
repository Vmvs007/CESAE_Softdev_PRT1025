package FichaPratica01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int num1, num2, resultado;

        // Ler num1
        System.out.print("Introduza um número: ");
        num1 = input.nextInt();

        // Ler num2
        System.out.print("Introduza outro número: ");
        num2 = input.nextInt();

        // Soma
        resultado = num1 + num2;
        System.out.println("Soma: " + resultado);

        // Subtração
        resultado = num1 - num2;
        System.out.println("Subtração: " + resultado);

        // Multiplicação
        resultado = num1 * num2;
        System.out.println("Multiplicação: " + resultado);

        // Divisão
        resultado = num1 / num2;
        System.out.println("Divisão: " + resultado);


    }
}
