package Demonstracao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Loja store = new Loja("Online Store");
        int opcao;

        do {
            System.out.println("\n\n***** MENU " + store.getNome() + " *****");
            System.out.println("1. Adicionar Produtos");
            System.out.println("2. Listar Produtos");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    store.acrescentarProduto();
                    break;

                case 2:
                    System.out.println("___ Inventário ___");
                    store.listarProdutos();
                    break;

                case 0:
                    System.out.println("A terminar programa...");
                    break;

                default:
                    System.out.println("Opção Inválida!");
            }

        } while (opcao != 0);

    }
}
