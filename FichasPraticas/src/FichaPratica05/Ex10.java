package FichaPratica05;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[3][5];

        // Ler matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();

            }
        }

        // Apresentar matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t|\t");
            }
            System.out.println();
        }

        // Perguntar o numero da pesquisa
        int numPesquisa, contador = 0;

        System.out.print("\nInsira um número para pesquisar: ");
        numPesquisa = input.nextInt();

        // Pesquisar e contar repetições na matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                if (matriz[linha][coluna] == numPesquisa) {
                    // Encontramos uma repetição
                    contador++;
                }
            }
        }

        System.out.println("O número " + numPesquisa + " aparece " + contador + " vezes na matriz");

    }
}
