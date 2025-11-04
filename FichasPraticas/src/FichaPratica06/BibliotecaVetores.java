package FichaPratica06;

import java.util.Scanner;

public class BibliotecaVetores {

    public static int[] preencherVetor(int tamanho) {

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[tamanho];

        // Leitura de números para o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        return vetor;
    }


    /**
     * Função para encontrar o Maior Elemento do vetor
     * @param vetor Vetor a analisar
     * @return Maior elemento
     */
    public static int maiorElemento(int[] vetor) {
        int maior = vetor[0];

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;
    }


    public static int menorElemento(int[] vetor) {
        int menor = vetor[0];

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        return menor;
    }

    public static boolean crescente(int[] vetor) {

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] <= vetor[i - 1]) {
                return false;
            }
        }

        return true;
    }
}
