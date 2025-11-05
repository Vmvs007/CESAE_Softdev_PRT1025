package FichaPratica_Extra_ArraysMatrizes;

import java.util.Scanner;

public class Ex03 {
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

        // Pesquisa do valor no vetor
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valorPesquisa) {
                encontrado = true;
            }
        }

        // Resultado da pesquisa
        if (encontrado) {
            System.out.println("\nO valor " + valorPesquisa + " encontra-se no vetor.");
        } else {
            System.out.println("\nO valor " + valorPesquisa + " não foi encontrado no vetor.");
        }
    }
}
