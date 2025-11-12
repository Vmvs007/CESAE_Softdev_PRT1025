package FichaPratica_Extra_ArraysMatrizes;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int[][] soma = new int[3][3];

        // Ler matriz A
        System.out.println("Preencha a primeira matriz (3x3):");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                System.out.print("matrizA[" + i + "][" + j + "] = ");
                matrizA[i][j] = input.nextInt();
            }
        }

        // Ler matriz B
        System.out.println("\nPreencha a segunda matriz (3x3):");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                System.out.print("matrizB[" + i + "][" + j + "] = ");
                matrizB[i][j] = input.nextInt();
            }
        }

        // Criar matriz soma (elemento a elemento)
        for (int i = 0; i < soma.length; i++) {
            for (int j = 0; j < soma[0].length; j++) {
                soma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // Mostrar as três matrizes
        System.out.println("\nMatriz A:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriz B:");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                System.out.print(matrizB[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriz Soma (A + B):");
        for (int i = 0; i < soma.length; i++) {
            for (int j = 0; j < soma[0].length; j++) {
                System.out.print(soma[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
