package FichaPratica01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        double valor1, valor2, valor3, mediaAritmetica, mediaPonderada;

        // Ler valores
        System.out.print("Introduza o 1º valor: ");
        valor1 = input.nextDouble();

        System.out.print("Introduza o 2º valor: ");
        valor2 = input.nextDouble();

        System.out.print("Introduza o 3º valor: ");
        valor3 = input.nextDouble();

        // Média Aritmética
        mediaAritmetica = (valor1 + valor2 + valor3) / 3;
        System.out.println("Média Aritmética: " + mediaAritmetica);

        // Média Ponderada
        mediaPonderada = valor1 * 0.2 + valor2 * 0.3 + valor3 * 0.5;
        System.out.println("Média Ponderada: " + mediaPonderada);

    }
}
