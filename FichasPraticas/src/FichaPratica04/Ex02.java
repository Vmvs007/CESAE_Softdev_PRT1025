package FichaPratica04;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int opcao;

        do {

            // Apresentar as opções
            System.out.println("\n********** Menu do Programa **********");
            System.out.println("1. Criar");
            System.out.println("2. Atualizar");
            System.out.println("3. Eliminar");
            System.out.println("4. Sair");

            // Ler opção
            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // CRIAR
                    System.out.println("\n***** CRIAR *****");
                    System.out.println("Nome Utilizador: ");
                    System.out.println("Password: ");
                    break;

                case 2: // ATUALIZAR
                    System.out.println("\n***** ATUALIZAR *****");
                    System.out.println("Nova Password: ");
                    System.out.println("Confirme Password: ");
                    break;

                case 3: // ELIMINAR
                    System.out.println("\n***** ELIMINAR *****");
                    System.out.println("Nome Utilizador: ");
                    System.out.println("Password: ");
                    break;

                case 4: // SAIR
                    System.out.println("A encerrar o programa...");
                    break;

                default:
                    System.out.println("Opção Inválida: " + opcao);
            }

            // Ciclo que imprime 50 enters
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }

        } while (opcao != 4);

    }
}
