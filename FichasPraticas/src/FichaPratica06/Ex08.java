package FichaPratica06;

import java.util.Scanner;

public class Ex08 {

    public static int[][] lerMatriz(int numLinhas, int numColunas) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[numLinhas][numColunas];


        // Ler matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();

            }
        }

        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {

        // Apresentar matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t|\t");
            }
            System.out.println();
        }
    }

    public static int somatorioMatrizes(int[][] matriz1, int[][] matriz2) {

        int somatorio = 0;

        for (int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz1[0].length; coluna++) {
                somatorio += matriz1[linha][coluna] + matriz2[linha][coluna];
            }
        }

        return somatorio;
    }


    public static void somarMatrizes(int[][] matriz1, int[][] matriz2) {

        int[][] matrizSoma = new int[matriz1.length][matriz1[0].length];

        // Preencher a matriz da soma
        for (int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz1[0].length; coluna++) {
                matrizSoma[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
            }
        }

        // Imprimir a matriz da soma
        imprimirMatriz(matrizSoma);
    }

    public static void main(String[] args) {

        System.out.println("____________________ MATRIZ 1 ____________________");
        int[][] matriz1 = lerMatriz(3, 3);
        imprimirMatriz(matriz1);

        System.out.println("\n\n____________________ MATRIZ 2 ____________________");
        int[][] matriz2 = lerMatriz(3, 3);
        imprimirMatriz(matriz2);

        System.out.println("\n\n____________________ SOMATORIO ____________________");
        System.out.println("Somatório: "+somatorioMatrizes(matriz1,matriz2));


        System.out.println("\n\n____________________ SOMA ____________________");
        somarMatrizes(matriz1,matriz2);
    }
}
