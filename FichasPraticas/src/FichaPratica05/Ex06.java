package FichaPratica05;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {


        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        boolean crescente = true;

        // Leitura de números para o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        // Perceber se é crescente
        for (int i = 1; i < vetor.length; i++) {

            if (vetor[i] <= vetor[i - 1]) {
                // Deixa de ser crescente
                crescente = false;
            }
        }

        if (crescente) {
            System.out.println("Crescente");
        } else {
            System.out.println("Não é crescente");
        }

    }
}
