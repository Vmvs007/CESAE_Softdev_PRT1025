package FichaPratica02;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int opcao;

        // Apresentar as opções e ler a pretendida
        System.out.println("***** Menu do Programa *****");
        System.out.println("1. Criar");
        System.out.println("2. Atualizar");
        System.out.println("3. Eliminar");
        System.out.println("4. Sair");

        System.out.print("Opção: ");
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("\n***** Criar *****\n");
                break;

            case 2:
                System.out.println("\n***** Atualizar *****\n");
                break;

            case 3:
                System.out.println("\n***** Eliminar *****\n");
                break;

            case 4:
                break;

            default:
                System.out.println("\n***** Opção Não Reconhecida: " + opcao + " *****\n");
                break;
        }
    }
}
