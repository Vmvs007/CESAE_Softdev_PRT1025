package FichaPratica_Extra_ArraysMatrizes;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        // Ler a matriz 3x3
        System.out.println("Preencha a matriz 3x3 com números inteiros:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("matriz[" + i + "][" + j + "] = ");
                matriz[i][j] = input.nextInt();
            }
        }

        // Inicializar maior e menor com o primeiro elemento
        int maior = matriz[0][0];
        int menor = matriz[0][0];

        // Percorrer toda a matriz para encontrar maior e menor
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        // Mostrar matriz e resultados
        System.out.println("\nMatriz 3x3:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMaior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);

    }
}

