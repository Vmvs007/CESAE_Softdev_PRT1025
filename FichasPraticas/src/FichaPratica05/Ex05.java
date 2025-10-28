package FichaPratica05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];


        // Leitura de números para o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        int somatorio = 0;

        // Calcular a soma
        for (int i = 0; i < vetor.length; i++) {
            somatorio += vetor[i];
        }

        int media = somatorio / vetor.length;

        System.out.println("Média: " + media);

    }
}
