package FichaPratica05;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[][] matriz = new int[10][2];

        // Ler vetor1
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Insira no vetor1[" + i + "]: ");
            vetor1[i] = input.nextInt();
        }

        System.out.println("______________________________");

        // Ler vetor2
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Insira no vetor2[" + i + "]: ");
            vetor2[i] = input.nextInt();
        }

        System.out.println("______________________________");

        // Preencher a matriz com os valores ve vetor1 e vetor2
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][0] = vetor1[i];
            matriz[i][1] = vetor2[i];
        }

        // Apresentar matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t|\t");
            }
            System.out.println();
        }
    }
}
