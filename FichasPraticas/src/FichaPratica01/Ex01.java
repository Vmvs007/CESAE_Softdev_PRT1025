package FichaPratica01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int num1, num2, soma;

        // Ler num1
        System.out.print("Introduza um numero: ");
        num1 = input.nextInt();

        // Ler num2
        System.out.print("Introduza outro numero: ");
        num2 = input.nextInt();

        // Calcular a soma
        soma = num1 + num2;

        // Apresentar o resultado
        System.out.println("Soma: " + soma);

    }
}
