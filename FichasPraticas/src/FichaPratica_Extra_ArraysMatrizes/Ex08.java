package FichaPratica_Extra_ArraysMatrizes;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Perguntar o tamanho e criar o array
        System.out.print("Qual o tamanho do array? ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Tamanho inválido.");
            input.close();
            return;
        }

        int[] arr = new int[n];

        // Preencher o array
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Insira o valor para o índice [" + i + "]: ");
            arr[i] = input.nextInt();
        }

        // Perguntar o novo valor e a posição onde inserir
        System.out.print("Novo valor a inserir: ");
        int novoValor = input.nextInt();

        System.out.print("Em que posição (0.." + n + ") quer colocar? ");
        int pos = input.nextInt();

        // Para inserção, permitem-se índices de 0 até n (n significa "acrescentar no fim")
        if (pos < 0 || pos > n) {
            System.out.println("Posição inválida para inserção.");
            input.close();
            return;
        }

        // Instanciar novo array com +1 posição
        int[] novoArr = new int[n + 1];

        // Copiar elementos até ao índice da inserção
        int k = 0; // índice para o novo array
        for (int i = 0; i < pos; i++) {
            novoArr[k] = arr[i];
            k++;
        }

        // Inserir o novo elemento
        novoArr[k] = novoValor;
        k++;

        // Continuar a copiar o resto dos elementos do array antigo
        for (int i = pos; i < arr.length; i++) {
            novoArr[k] = arr[i];
            k++;
        }

        // Mostrar resultado
        System.out.println("\nArray original:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        System.out.println("\nDepois da inserção de " + novoValor + " na posição " + pos + ":");
        for (int i = 0; i < novoArr.length; i++) {
            System.out.println("novoArr[" + i + "] = " + novoArr[i]);
        }

    }
}

