package FichaPratica_Extra_ArraysMatrizes;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Perguntar o tamanho e criar o array
        System.out.print("Qual o tamanho do array? ");
        int n = input.nextInt();

        int[] arr = new int[n];

        // Preencher o array
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Insira o valor para o índice [" + i + "]: ");
            arr[i] = input.nextInt();
        }

        // Perguntar o valor a remover
        System.out.print("Qual o valor a remover? ");
        int valorRemover = input.nextInt();

        // Contar quantas ocorrências existem
        int ocorrencias = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valorRemover) {
                ocorrencias++;
            }
        }

        // Instanciar novo array sem essas posições
        int novoTamanho = arr.length - ocorrencias;
        int[] novoArr = new int[novoTamanho];

        // Copiar, pela ordem, apenas os elementos diferentes do valor a remover
        int j = 0; // índice do novo array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != valorRemover) {
                novoArr[j] = arr[i];
                j++;
            }
        }

        // Mostrar resultado
        System.out.println("\nArray original:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        System.out.println("\nOcorrências removidas de \"" + valorRemover + "\": " + ocorrencias);
        System.out.println("Array resultante:");
        for (int i = 0; i < novoArr.length; i++) {
            System.out.println("novoArr[" + i + "] = " + novoArr[i]);
        }

    }
}
