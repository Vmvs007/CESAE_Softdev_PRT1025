package FichaPratica_Extra_ArraysMatrizes;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matriz = new double[3][2];
        double soma = 0;
        double totalElementos = 0;

        // Ler a matriz 3x2
        System.out.println("Preencha a matriz 3x2 com números inteiros:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("matriz[" + i + "][" + j + "] = ");
                matriz[i][j] = input.nextDouble();

                soma += matriz[i][j];
                totalElementos++;
            }
        }

        // Calcular média
        double media =  soma / totalElementos;

        // Mostrar matriz e média
        System.out.println("\nMatriz 3x2:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nSoma dos elementos = " + soma);
        System.out.println("Média dos elementos = " + media);

        input.close();
    }
}
