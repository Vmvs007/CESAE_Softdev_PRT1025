package FichaPratica_Extra_ArraysMatrizes;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[15];

        // Preencher o array principal
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira o valor para o índice [" + i + "]: ");
            numeros[i] = input.nextInt();
        }

        // Contar quantos são pares e quantos são ímpares
        int contPares = 0;
        int contImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contPares++;
            } else {
                contImpares++;
            }
        }

        // Criar os dois novos arrays com o tamanho certo
        int[] pares = new int[contPares];
        int[] impares = new int[contImpares];

        // Preencher os arrays pares e ímpares
        int p = 0; // índice para pares
        int q = 0; // índice para ímpares

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares[p] = numeros[i];
                p++;
            } else {
                impares[q] = numeros[i];
                q++;
            }
        }

        // Mostrar resultados
        System.out.println("\nArray original:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }

        System.out.println("\nArray de valores pares:");
        for (int i = 0; i < pares.length; i++) {
            System.out.println("pares[" + i + "] = " + pares[i]);
        }

        System.out.println("\nArray de valores ímpares:");
        for (int i = 0; i < impares.length; i++) {
            System.out.println("impares[" + i + "] = " + impares[i]);
        }

    }
}

