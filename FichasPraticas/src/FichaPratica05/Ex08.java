package FichaPratica05;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int nLinhas=3, nColunas=5;
        int[][] matriz = new int[nLinhas][nColunas];

        // Ler matriz
        for (int linha = 0; linha < nLinhas; linha++) {
            for (int coluna = 0; coluna < nColunas; coluna++) {
                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();

            }

        }
    }
}
