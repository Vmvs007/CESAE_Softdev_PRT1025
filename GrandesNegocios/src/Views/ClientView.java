package Views;

import Controllers.ClientController;

import java.util.Scanner;

public class ClientView {

    private ClientController clientController;

    public ClientView() {
        this.clientController = new ClientController();
    }

    public void menu() {

        Scanner input = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n\n***** Bem-vind@ estimado cliente *****");
            System.out.println("1. Consultar Produtos");
            System.out.println("2. Consultar Produtos p/ Categoria");
            System.out.println("3. Consultar Produto Barato - Caro");
            System.out.println("0. Voltar");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // Consultar Produtos
                    break;

                case 2: // Consultar Produtos p/ Categoria
                    break;

                case 3: // Consultar Produto Barato - Caro
                    break;

                case 0: // Voltar
                    System.out.println("Até à proxima ⍈");
                    break;

                default:
                    System.out.println("❌ Opção Inválida: " + opcao + " ❌");
                    break;
            }
        } while (opcao != 0);

    }
}
