package Views;

import Controllers.AdminController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdminView {

    private AdminController adminController;

    public AdminView() throws FileNotFoundException {
        this.adminController = new AdminController();
    }

    public void menu() {

        Scanner input = new Scanner(System.in);
        int opcao;
        do {

            System.out.println("\n\n***** Bem-vind@ Exmo. Patrão *****");
            System.out.println("1. Produto Mais Vendido - Unidades");
            System.out.println("2. Produto Mais Vendido - Valor €");
            System.out.println("3. Melhor Venda - Unidades");
            System.out.println("4. Melhor Venda - Valor");
            System.out.println("5. Total Vendas");
            System.out.println("6. Média Vendas");
            System.out.println("0. Voltar");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // Produto Mais Vendido - Unidades
                    break;

                case 2: // Produto Mais Vendido - Valor €
                    break;

                case 3: // Melhor Venda - Unidades
                    break;

                case 4: // Melhor Venda - Valor
                    break;

                case 5: // Total Vendas
                    printTotalSales();
                    break;

                case 6: // Média Vendas
                    printAverageSales();
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

    public void printTotalSales() {
        System.out.println("\n*** Total Vendas ***");
        System.out.println(this.adminController.totalSalesValue() + " €");

    }

    public void printAverageSales() {
        System.out.println("\n*** Média Vendas ***");
        System.out.println(this.adminController.averageSales() + " €");
    }
}
