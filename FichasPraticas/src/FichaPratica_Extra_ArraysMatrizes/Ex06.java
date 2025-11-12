package FichaPratica_Extra_ArraysMatrizes;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o tamanho do array? ");
        int tamanho = input.nextInt();

        int[] numeros = new int[tamanho];

        // Leitura dos valores
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira o valor para o índice [" + i + "]: ");
            numeros[i] = input.nextInt();
        }

        System.out.println("\nValores inseridos (pela ordem de inserção):");

        // Impressão dos valores
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("números[" + i + "] = " + numeros[i]);
        }

    }
}
