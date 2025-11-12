package FichaPratica_Extra_ArraysMatrizes;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedir as dimensões da matriz
        System.out.print("Quantas linhas terá a matriz? ");
        int linhas = input.nextInt();

        System.out.print("Quantas colunas terá a matriz? ");
        int colunas = input.nextInt();

        // Criar a matriz com as dimensões indicadas
        int[][] matriz = new int[linhas][colunas];

        // Ler os valores da matriz
        System.out.println("\nPreencha a matriz com números inteiros:");
        for (int i = 0; i < matriz.length; i++) {              // percorre linhas
            for (int j = 0; j < matriz[0].length; j++) {       // percorre colunas
                System.out.print("matriz[" + i + "][" + j + "] = ");
                matriz[i][j] = input.nextInt();
            }
        }

        // Criar matriz transposta (colunas viram linhas)
        int[][] transposta = new int[colunas][linhas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        // Mostrar matriz original
        System.out.println("\nMatriz original (" + linhas + "x" + colunas + "):");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Mostrar matriz transposta
        System.out.println("\nMatriz transposta (" + colunas + "x" + linhas + "):");
        for (int i = 0; i < transposta.length; i++) {
            for (int j = 0; j < transposta[0].length; j++) {
                System.out.print(transposta[i][j] + "\t");
            }
            System.out.println();
        }

    }
}

