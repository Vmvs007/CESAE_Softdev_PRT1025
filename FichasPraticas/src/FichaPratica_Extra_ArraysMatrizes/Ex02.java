package FichaPratica_Extra_ArraysMatrizes;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10]; // vetor com 10 posições

        System.out.println("=== Inserção de 10 números inteiros ===");

        // Leitura de números para o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        System.out.println("\n=== Números inseridos (ordem inversa) ===");

        // Impressão do vetor na ordem inversa
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}
