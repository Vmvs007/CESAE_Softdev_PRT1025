package FichaPratica_Extra_ArraysMatrizes;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[14]; // vetor com 14 posições

        System.out.println("=== Inserção de 14 números inteiros ===");

        // Leitura de números para o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        System.out.println("\n=== Números inseridos (ordem de inserção) ===");

        // Impressão do vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

    }
}

