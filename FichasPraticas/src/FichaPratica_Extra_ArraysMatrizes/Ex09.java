package FichaPratica_Extra_ArraysMatrizes;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[10];

        // Preencher o array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira o valor para o índice [" + i + "]: ");
            numeros[i] = input.nextInt();
        }

        // Ordenar por ordem crescente (algoritmo simples: bubble sort)
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }

        // Mostrar array ordenado
        System.out.println("\nArray ordenado por ordem crescente:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }

    }
}
