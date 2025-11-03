package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex03.*;

public class Ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis;
        int numero, opcao;

        // Ler número
        System.out.print("Insira um número para ser analisado: ");
        numero = input.nextInt();


        do {

            System.out.println("\n\n********** Programa de Análise de um Número: " + numero + " **********");
            System.out.println("1. Par ou Ímpar");
            System.out.println("2. Positivo ou Negativo");
            System.out.println("3. Primo");
            System.out.println("4. Perfeito");
            System.out.println("5. Triangular");
            System.out.println("6. Trocar de Número");
            System.out.println("0. Sair");

            System.out.print("\nOpção: ");
            opcao = input.nextInt();

            System.out.println();

            switch (opcao) {
                case 1: // Par ou Impar

                    if (parImpar(numero)) {
                        System.out.println("Par");
                    } else {
                        System.out.println("Ímpar");
                    }

                    break;

                case 2: // Positivo ou Negativo

                    if (positivoNegativo(numero)) {
                        System.out.println("Positivo");
                    } else {
                        System.out.println("Negativo");
                    }
                    break;

                case 3: // Primo

                    if (primo(numero)) {
                        System.out.println("Primo");
                    } else {
                        System.out.println("Não Primo");
                    }
                    break;

                case 4: // Perfeito
                    

                    break;

                case 5: // Triangular
                    break;

                case 6: // Trocar de Número
                    System.out.print("Insira outro número para ser analisado: ");
                    numero = input.nextInt();
                    break;

                case 0: // Sair
                    System.out.println("Obrigado e até à próxima \uD83C\uDFC3\uD83D\uDEAA");
                    break;

                default:
                    System.out.println("❌ Opção Inválida ❌");
                    break;
            }

        } while (opcao != 0);
    }
}
