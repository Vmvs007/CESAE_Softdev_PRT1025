package FichaPratica05;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[3][3];

        // Ler matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();

            }
        }

        System.out.println();

        // Apresentar matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t|\t");
            }
            System.out.println();
        }

        int maior = matriz[0][0];
        int menor = matriz[0][0];

        System.out.println();

        // Encontrar o menor e o maior
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                // Se o meu elemento atual é maior que o "maior", fica no lugar dele
                if (matriz[linha][coluna] > maior) {
                    maior = matriz[linha][coluna];
                }

                // Se o meu elemento atual é menor que o "menor", fica no lugar dele
                if (matriz[linha][coluna] < menor) {
                    menor = matriz[linha][coluna];
                }
            }
        }

        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);

    }
}
