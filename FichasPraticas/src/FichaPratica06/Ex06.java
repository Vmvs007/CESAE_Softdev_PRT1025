package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.BibliotecaInput.lerInteiroPositivo;
import static FichaPratica06.BibliotecaVetores.*;

public class Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tamanhoVetor, opcao;

        System.out.println("********** Tamanho do Vetor **********");
        tamanhoVetor = lerInteiroPositivo();

        System.out.println("\n******************************");
        int[] vetor = preencherVetor(tamanhoVetor);


        do {
            System.out.println("\n********** Análise do Vetor **********");
            System.out.println("7. Maior Elemento");
            System.out.println("8. Menor Elemento");
            System.out.println("9. Crescente");
            System.out.println("0. Sair");

            System.out.print("\nOpção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 7: // Maior
                    System.out.println("\nMaior: " + maiorElemento(vetor));
                    break;

                case 8: // Menor
                    System.out.println("\nMenor: " + menorElemento(vetor));
                    break;

                case 9: // Crescente
                    if (crescente(vetor)) {
                        System.out.println("\nCrescente");
                    } else {
                        System.out.println("\nNão crescente");
                    }
                    break;

                case 0: // Sair
                    System.out.println("\nObrigado e até à próxima \uD83C\uDFC3\uD83D\uDEAA");
                    break;

                default:
                    System.out.println("❌ Opção Inválida ❌");
                    break;
            }


        } while (opcao != 0);
    }
}
