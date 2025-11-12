package FichaPratica_Extra_ArraysMatrizes;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int[] elementos = new int[9];
        int k = 0;

        // Ler a matriz 3x3
        System.out.println("Preencha a matriz 3x3 com números inteiros (todos diferentes):");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("matriz[" + i + "][" + j + "] = ");
                matriz[i][j] = input.nextInt();
                elementos[k] = matriz[i][j];
                k++;
            }
        }

        // Ordenar o vetor "elementos" por ordem crescente (algoritmo simples)
        for (int i = 0; i < elementos.length - 1; i++) {
            for (int j = i + 1; j < elementos.length; j++) {
                if (elementos[i] > elementos[j]) {
                    int temp = elementos[i];
                    elementos[i] = elementos[j];
                    elementos[j] = temp;
                }
            }
        }

        // Segundo menor e segundo maior
        int segundoMenor = elementos[1];
        int segundoMaior = elementos[elementos.length - 2];

        // Mostrar matriz e resultados
        System.out.println("\nMatriz 3x3:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nSegundo menor elemento: " + segundoMenor);
        System.out.println("Segundo maior elemento: " + segundoMaior);

    }
}
