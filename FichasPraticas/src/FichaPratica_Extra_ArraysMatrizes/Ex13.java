package FichaPratica_Extra_ArraysMatrizes;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[4][3]; // 4 linhas, 3 colunas

        // Ler os 12 números do utilizador
        System.out.println("Preencha a matriz 4x3 com números inteiros:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("matriz[" + i + "][" + j + "] = ");
                matriz[i][j] = input.nextInt();
            }
        }

        // Imprimir a matriz no formato gráfico
        System.out.println("\nMatriz 4x3:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t"); // "\t" dá espaçamento tipo tabela
            }
            System.out.println(); // muda de linha no fim de cada linha
        }

    }
}
