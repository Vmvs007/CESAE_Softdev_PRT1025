package FichaPratica07;

import java.util.Scanner;

public class Menus {

    public static void consultarEstatiscasAtracoesMenu() {
        Scanner input = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n\n-*-*-*-*-*- CONSULTAR ESTATÍSTICAS ATRAÇÕES -*-*-*-*-*-");
            System.out.println("1. Montanha-Russa Cobra");
            System.out.println("2. Carrossel Macacos");
            System.out.println("3. Elevador Girafa");
            System.out.println("4. Parque Aquático Baleia");
            System.out.println("0. Voltar");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {

                case 1: // Montanha-Russa Cobra
                    System.out.println("\nMontanha-Russa Cobra");
                    break;

                case 2: // Carrossel Macacos
                    System.out.println("\nCarrossel Macacos");
                    break;

                case 3: // Elevador Girafa
                    System.out.println("\nElevador Girafa");
                    break;

                case 4: // Parque Aquático Baleia
                    System.out.println("\nParque Aquático Baleia");
                    break;

                case 0: // Voltar
                    break;

                default:
                    System.out.println("\nOpção Inválida");
                    break;
            }

        } while (opcao != 0);
    }


    public static void menuAdmin() {

        Scanner input = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n\n-*-*-*-*-*- MENU ADMIN -*-*-*-*-*-");
            System.out.println("1. Consultar Vendas");
            System.out.println("2. Pesquisar Clientes");
            System.out.println("3. Estatísticas Atrações");
            System.out.println("4. ...");
            System.out.println("5. ...");
            System.out.println("0. Voltar");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {

                case 1: // Consultar Vendas
                    System.out.println("\nConsultar Vendas");
                    break;

                case 2: // Pesquisar Clientes
                    System.out.println("\nPesquisar Clientes");
                    break;

                case 3: // Estatísticas Atrações
                    consultarEstatiscasAtracoesMenu();
                    break;

                case 4: // ...
                    break;

                case 5: // ...
                    break;

                case 0: // Voltar
                    break;

                default:
                    System.out.println("\nOpção Inválida");
                    break;
            }

        } while (opcao != 0);
    }

    public static void menuStaff() {

        Scanner input = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n\n-*-*-*-*-*- MENU STAFF -*-*-*-*-*-");
            System.out.println("1. Consultar Manutenções");
            System.out.println("2. Marcar Férias");
            System.out.println("3. Justificar Faltas");
            System.out.println("4. ...");
            System.out.println("0. Voltar");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {

                case 1: // Consultar Manutenções
                    break;

                case 2: // Marcar Férias
                    break;


                case 3: // Justificar Faltas
                    break;

                case 4: // ...
                    break;

                case 0: // Voltar
                    break;

                default:
                    System.out.println("\nOpção Inválida");
                    break;
            }

        } while (opcao != 0);

    }

    public static void menuCliente() {


        Scanner input = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n\n-*-*-*-*-*- MENU CLIENTE -*-*-*-*-*-");
            System.out.println("1. Consultar Atrações Disponíveis");
            System.out.println("2. Ver Mapa do Parque");
            System.out.println("3. Reservar Bilhetes");
            System.out.println("4. Marcar Transfers");
            System.out.println("0. Voltar");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {

                case 1: // Consultar Atrações Disponíveis
                    // consultarAtracoesDisponiveis();
                    break;

                case 2: // Ver Mapa do Parque
                   //  mapaParque();
                    break;

                case 3: // Reservar Bilhetes
                    break;

                case 4: // Marcar Transfers
                    break;

                case 0: // Voltar
                    break;

                default:
                    System.out.println("\nOpção Inválida");
                    break;
            }

        } while (opcao != 0);

    }


    public static void menuLogin() {

        Scanner input = new Scanner(System.in);

        int opcaoLogin;
        String username, password;

        do {

            System.out.println("\n\n-*-*-*-*-*- MENU LOGIN -*-*-*-*-*-");
            System.out.println("1. ADMIN");
            System.out.println("2. STAFF");
            System.out.println("3. CLIENTE");
            System.out.println("0. SAIR");

            System.out.print("Tipo de Utilizador: ");
            opcaoLogin = input.nextInt();

            switch (opcaoLogin) {

                case 1: // ADMIN

                    System.out.print("\nUsername: ");
                    username = input.next();

                    System.out.print("Password: ");
                    password = input.next();

                    if (username.equals("admin") && password.equals("123")) {
                        // Login válido
                        menuAdmin();
                    } else {
                        System.out.println("Login incorreto");
                    }

                    break;

                case 2: // STAFF

                    System.out.print("\nUsername: ");
                    username = input.next();

                    System.out.print("Password: ");
                    password = input.next();

                    if (username.equals("staff") && password.equals("abc")) {
                        // Login válido
                        menuStaff();

                    } else {
                        System.out.println("Login incorreto");
                    }
                    break;

                case 3: // CLIENTE
                    menuCliente();
                    break;

                case 0: // SAIR
                    System.out.println("\nObrigado! Volte sempre...");
                    break;

                default:
                    System.out.println("\nOpção Inválida");
                    break;
            }

        } while (opcaoLogin != 0);
    }


    public static void main(String[] args) {
        menuLogin();
    }

}
