package FichaPratica04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numeroSecreto, palpite, tentativas=0;

        // Ler numero secreto
        System.out.print("JOGADOR 1 - Insira um número (0-100): ");
        numeroSecreto = input.nextInt();

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        do {

            // Perguntar o palpite
            System.out.print("JOGADOR 2 - Qual o seu palpite: ");
            palpite = input.nextInt();

            tentativas++;

            if (palpite > numeroSecreto) {
                System.out.println("ERRADO: Muito alto!");
            }

            if (palpite < numeroSecreto) {
                System.out.println("ERRADO: Muito baixo!");
            }

        } while (palpite != numeroSecreto);

        System.out.println("PARABÉNS! Acertaste no número secreto: " + numeroSecreto);
        System.out.println("Foram necessárias: "+tentativas+" tentativas...");
    }
}
