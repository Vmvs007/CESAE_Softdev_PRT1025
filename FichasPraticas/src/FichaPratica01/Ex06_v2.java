package FichaPratica01;

import java.util.Scanner;

public class Ex06_v2 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int valor1, valor2;

        // Ler valores
        System.out.print("Introduza o 1º valor: ");
        valor1 = input.nextInt();

        System.out.print("Introduza o 2º valor: ");
        valor2 = input.nextInt();

        // Trocar os valores

        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;


        // Apresentar os valores trocados
        System.out.println("_____ Valores Trocados _____");
        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);
    }
}
