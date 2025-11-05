package FichaPratica_Extra_ArraysMatrizes;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10]; // vetor com 10 posições

        System.out.println("=== Preenchimento do vetor ===");

        // Leitura de números para o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        System.out.print("\nInsira o valor que pretende pesquisar: ");
        int valorPesquisa = input.nextInt();

        boolean encontrado = false;

        System.out.println("\n=== Resultado da pesquisa ===");

        // Pesquisa do valor e impressão dos índices encontrados
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valorPesquisa) {
                System.out.println("O valor " + valorPesquisa + " foi encontrado no índice [" + i + "]");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("O valor " + valorPesquisa + " não foi encontrado no vetor.");
        }

    }
}
