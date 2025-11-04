package FichaPratica06;

import java.util.Scanner;

public class Ex07 {

    public static void imprimirRetangulo(int linhas, int colunas, String caracter) {

        // Primeira Linha
        for (int i = 0; i < colunas; i++) {
            System.out.print(caracter);
        }

        System.out.println();

        // Linhas do meio
        for (int linhaAtual = 0; linhaAtual < linhas - 2; linhaAtual++) {

            System.out.print(caracter);

            for (int colunaAtual = 0; colunaAtual < colunas - 2; colunaAtual++) {
                System.out.print(" ");
            }

            System.out.print(caracter);

            System.out.println();
        }

        // Última linha
        for (int i = 0; i < colunas; i++) {
            System.out.print(caracter);
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nLinhas, nColunas;
        String caracter;

        System.out.print("Linhas: ");
        nLinhas= input.nextInt();

        System.out.print("Colunas: ");
        nColunas= input.nextInt();

        System.out.print("Caracter: ");
        caracter= input.next();

        imprimirRetangulo(nLinhas, nColunas, caracter);
    }

}
