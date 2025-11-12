package FichaPratica_Extra_ArraysMatrizes;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[12];

        // Preencher o array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira o valor para o índice [" + i + "]: ");
            numeros[i] = input.nextInt();
        }

        // Descobrir quantos valores únicos existem
        int unicos = 0;

        for (int i = 0; i < numeros.length; i++) {
            boolean duplicado = false;

            // verificar se o elemento já apareceu antes
            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j]) {
                    duplicado = true;
                    break;
                }
            }

            if (!duplicado) {
                unicos++;
            }
        }

        // Criar o novo array com o tamanho certo
        int[] semDuplicados = new int[unicos];

        // Preencher o novo array apenas com valores únicos
        int k = 0;
        for (int i = 0; i < numeros.length; i++) {
            boolean duplicado = false;

            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j]) {
                    duplicado = true;
                    break;
                }
            }

            if (!duplicado) {
                semDuplicados[k] = numeros[i];
                k++;
            }
        }

        // Mostrar resultados
        System.out.println("\nArray original:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }

        System.out.println("\nArray sem duplicados:");
        for (int i = 0; i < semDuplicados.length; i++) {
            System.out.println("semDuplicados[" + i + "] = " + semDuplicados[i]);
        }

    }
}

