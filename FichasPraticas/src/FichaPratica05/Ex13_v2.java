package FichaPratica05;

import java.util.Scanner;

public class Ex13_v2 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[4][4];

        // Ler matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();

            }
        }

        System.out.println("__________________________________");

        // Apresentar matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t|\t");
            }
            System.out.println();
        }

        System.out.println("__________________________________");

        // Calcular a soma dos elementos da diagonal principal
        int somaDiagonal = 0;

        // Esta solução, só funciona se a matriz for quadrada (mesmo número de linhas e colunas)

        for (int i = 0; i < matriz.length; i++) {
            somaDiagonal += matriz[i][i];
        }

        System.out.println("Soma Diagonal Principal: " + somaDiagonal);

    }
}
