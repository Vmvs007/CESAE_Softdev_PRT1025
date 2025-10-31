package FichaPratica05;

import java.util.Scanner;

public class Ex07 {
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

        int maiorPar = -1;

        // Encontrar o maior par
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) { // Se o número é par

                if (maiorPar == -1) {
                    maiorPar = vetor[i];
                }

                if (vetor[i] > maiorPar) {
                    maiorPar = vetor[i];
                }
            }
        }

        if (maiorPar == -1) {
            System.out.println("Não há pares");
        } else {
            System.out.println("Maior par: " + maiorPar);
        }


    }
}
