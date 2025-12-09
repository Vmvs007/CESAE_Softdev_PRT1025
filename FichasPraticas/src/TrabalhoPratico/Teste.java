package TrabalhoPratico;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0, i2 = 0, menu, loja = 0, n1, n2;
        double total1 = 0, total2 = 0;
        String login_nome = "", login_passe;

        int stk1l1 = 0, stk2l1 = 0, stk3l1 = 0, stk4l1 = 0;
        int stk1l2 = 0, stk2l2 = 0, stk3l2 = 0, stk4l2 = 0;
        int codigo1, codigo2, codigo3, codigo4;
        double preco1, preco2, preco3, preco4;
        String nome1, nome2, nome3, nome4;
        String cat1, cat2, cat3, cat4;

        //"stk1l1" (para stock/numero do produto/L+ numero da loja)  e "cat" para categoria
        //variaveis separadas para melhor visibilidade


        //defenir os produtos e os respetivos dados

        codigo1 = 1;
        nome1 = "Bolachas";
        cat1 = "Comida";
        preco1 = 2.99;

        codigo2 = 2;
        nome2 = "Chocolate";
        cat2 = "Comida";
        preco2 = 5.99;

        codigo3 = 3;
        nome3 = "Coca Cola";
        cat3 = "Bebida";
        preco3 = 4.99;

        codigo4 = 4;
        nome4 = "Pepsi";
        cat4 = "Bebida";
        preco4 = 4.89;


        while (i == 0) {

            //ciclo while para o login * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *

            while (i2 == 0) {
                System.out.print("Username: ");
                login_nome = input.next();

                //switch case para diferenciar a loja1 da loja2

                switch (login_nome) {
                    case "loja1":
                        System.out.print("Password1: ");
                        login_passe = input.next();

                        //swicth case para comparar a string da password com a correta

                        switch (login_passe) {
                            case "123":
                                loja = 1;

                                //i++ para sair da fase de login

                                i2++;
                                break;
                            default:
                                System.out.println("Password Errada");
                                break;
                        }
                        break;

                    case "loja2":
                        System.out.println("Password2: ");
                        login_passe = input.next();

                        //swicth case para comparar a string da password com a correta

                        switch (login_passe) {
                            case "456":
                                loja = 2;

                                //i++ para sair da fase de login

                                i2++;
                                break;
                            default:
                                System.out.println("Password Errada");
                                break;
                        }
                        break;

                    case "sair":

                        //return para acabar o programa

                        return;

                    default:
                        System.out.println("Dados errados ");
                        break;
                }
            }

            //fim do login * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *


            //ciclo while para repetir o menu depois de cada operação * * * * * * * * * * * * * * * * * * * * * *

            while (i2 == 1) {

                //valor total das 2 lojas (vai ser usado depois)

                total1 = (stk1l1 * preco1) + (stk2l1 * preco2) + (stk3l1 * preco3) + (stk4l1 * preco4);
                total2 = (stk1l2 * preco1) + (stk2l2 * preco2) + (stk3l2 * preco3) + (stk4l2 * preco4);


                System.out.println("----------------------------------------");
                System.out.println("User " + login_nome);
                System.out.println("------------------MENU------------------");
                System.out.println("1__________________Consultar Informações");
                System.out.println("2_______________________________Adquirir");
                System.out.println("3_________________________________Vender");
                System.out.println("4_______________________Transferir Stock");
                System.out.println("5_____________Simular Venda (loja atual)");
                System.out.println("6_________Simular Venda (todas as lojas)");
                System.out.println("7___________________Loja com Maior Valor");
                System.out.println("8_________________________________Logout");
                System.out.println("----------------------------------------");
                System.out.print("=> ");
                menu = input.nextInt();


                //as opçoes do menu

                switch (menu) {
                    case 1:

                        //variável loja determina qual loja o user está momento, e os stocks dos produtos a ver e/ou modificar

                        if (loja == 1) {
                            System.out.println("Código: " + codigo1 + " / Nome: " + nome1 + " / Categoria: " + cat1 + " / Preço:" + preco1 + " / Stock: " + stk1l1);
                            System.out.println("Código: " + codigo2 + " / Nome: " + nome2 + " / Categoria: " + cat2 + " / Preço:" + preco2 + " / Stock: " + stk2l1);
                            System.out.println("Código: " + codigo3 + " / Nome: " + nome3 + " / Categoria: " + cat3 + " / Preço:" + preco3 + " / Stock: " + stk3l1);
                            System.out.println("Código: " + codigo4 + " / Nome: " + nome4 + " / Categoria: " + cat4 + " / Preço:" + preco4 + " / Stock: " + stk4l1);
                        }
                        if (loja == 2) {
                            System.out.println("Código: " + codigo1 + " / Nome: " + nome1 + " / Categoria: " + cat1 + " / Preço:" + preco1 + " / Stock: " + stk1l2);
                            System.out.println("Código: " + codigo2 + " / Nome: " + nome2 + " / Categoria: " + cat2 + " / Preço:" + preco2 + " / Stock: " + stk2l2);
                            System.out.println("Código: " + codigo3 + " / Nome: " + nome3 + " / Categoria: " + cat3 + " / Preço:" + preco3 + " / Stock: " + stk3l2);
                            System.out.println("Código: " + codigo4 + " / Nome: " + nome4 + " / Categoria: " + cat4 + " / Preço:" + preco4 + " / Stock: " + stk4l2);
                        }
                        break;

                    case 2:
                        if (loja == 1) {
                            System.out.println("Qual o produto a modificar? (Código 1 / 2 / 3 / 4)");
                            System.out.print("=> ");
                            n1 = input.nextInt();
                            System.out.println("Quanto quer adicionar ao stock?");
                            System.out.print("=> ");
                            n2 = input.nextInt();

                            switch (n1) {
                                case 1:

                                    //adicionar o numero escolhido ao stock do produto 1 da loja 1

                                    stk1l1 = stk1l1 + n2;
                                    System.out.println("Adicionado com sucesso!");
                                    break;
                                case 2:

                                    //adicionar o numero escolhido ao stock do produto 2 da loja 1

                                    stk2l1 = stk2l1 + n2;
                                    System.out.println("Adicionado com sucesso!");
                                    break;
                                case 3:
                                    stk3l1 = stk3l1 + n2;
                                    System.out.println("Adicionado com sucesso!");
                                    break;
                                case 4:
                                    stk4l1 = stk4l1 + n2;
                                    System.out.println("Adicionado com sucesso!");
                                    break;
                                default:
                                    System.out.println("Produto Inválido");
                                    break;
                            }
                        }
                        if (loja == 2) {
                            System.out.println("Qual o produto a modificar? (Código 1 / 2 / 3 / 4)");
                            System.out.print("=> ");
                            n1 = input.nextInt();
                            System.out.println("Quanto quer adicionar ao stock?");
                            System.out.print("=> ");
                            n2 = input.nextInt();
                            switch (n1) {
                                case 1:

                                    //adicionar o numero escolhido ao stock do produto 1 da loja 2

                                    stk1l2 = stk1l2 + n2;
                                    System.out.println("Adicionado com sucesso!");
                                    break;
                                case 2:

                                    //adicionar o numero escolhido ao stock do produto 2 da loja 2

                                    stk2l2 = stk2l2 + n2;
                                    System.out.println("Adicionado com sucesso!");
                                    break;
                                case 3:
                                    stk3l2 = stk3l2 + n2;
                                    System.out.println("Adicionado com sucesso!");
                                    break;
                                case 4:
                                    stk4l2 = stk4l2 + n2;
                                    System.out.println("Adicionado com sucesso!");
                                    break;
                                default:
                                    System.out.println("Produto Inválido");
                                    break;
                            }
                        }
                        break;

                    case 3:
                        if (loja == 1) {
                            System.out.println("Qual o produto para vender? (Código 1 / 2 / 3 / 4)");
                            System.out.print("=> ");
                            n1 = input.nextInt();
                            System.out.println("Quanto quer vender?");
                            System.out.print("=> ");
                            n2 = input.nextInt();

                            switch (n1) {
                                case 1:
                                    if (stk1l1 < n2) {

                                        //se o stock do produto 1 da loja 1 for menor do que o numero escolhido, não faz nada

                                        System.out.println("Não existe stock suficiente!");
                                    } else {

                                        //se for maior ou igual, subtrai o numero do stock

                                        stk1l1 = stk1l1 - n2;
                                        System.out.println("Vendido com sucesso!");
                                    }
                                    break;
                                case 2:
                                    if (stk2l1 < n2) {
                                        System.out.println("Não existe stock suficiente!");
                                    } else {
                                        stk2l1 = stk2l1 - n2;
                                        System.out.println("Vendido com sucesso!");
                                    }
                                    break;
                                case 3:
                                    if (stk3l1 < n2) {
                                        System.out.println("Não existe stock suficiente!");
                                    } else {
                                        stk3l1 = stk3l1 - n2;
                                        System.out.println("Vendido com sucesso!");
                                    }
                                    break;
                                case 4:
                                    if (stk4l1 < n2) {
                                        System.out.println("Não existe stock suficiente!");
                                    } else {
                                        stk4l1 = stk4l1 - n2;
                                        System.out.println("Vendido com sucesso!");
                                    }
                                    break;
                                default:
                                    System.out.println("Produto Inválido");
                                    break;
                            }
                        }
                        if (loja == 2) {
                            System.out.println("Qual o produto para vender? (Código 1 / 2 / 3 / 4)");
                            System.out.print("=> ");
                            n1 = input.nextInt();
                            System.out.println("Quanto quer vender?");
                            System.out.print("=> ");
                            n2 = input.nextInt();

                            switch (n1) {
                                case 1:
                                    if (stk1l2 < n2) {

                                        //se o stock do produto 1 da loja 2 for menor do que o numero escolhido, não faz nada

                                        System.out.println("Não existe stock suficiente!");
                                    } else {

                                        //se for maior ou igual, subtrai o numero do stock

                                        stk1l2 = stk1l2 - n2;
                                        System.out.println("Vendido com sucesso!");
                                    }
                                    break;
                                case 2:
                                    if (stk2l2 < n2) {
                                        System.out.println("Não existe stock suficiente!");
                                    } else {
                                        stk2l2 = stk2l2 - n2;
                                        System.out.println("Vendido com sucesso!");
                                    }
                                    break;
                                case 3:
                                    if (stk3l2 < n2) {
                                        System.out.println("Não existe stock suficiente!");
                                    } else {
                                        stk3l2 = stk3l2 - n2;
                                        System.out.println("Vendido com sucesso!");
                                    }
                                    break;
                                case 4:
                                    if (stk4l2 < n2) {
                                        System.out.println("Não existe stock suficiente!");
                                    } else {
                                        stk4l2 = stk4l2 - n2;
                                        System.out.println("Vendido com sucesso!");
                                    }
                                    break;
                                default:
                                    System.out.println("Produto Inválido");
                                    break;
                            }
                        }
                        break;

                    case 4:

                        //mostrar os stocks das 2 lojas

                        System.out.println("Código: " + codigo1 + " / Nome: " + nome1 + " / Categoria: " + cat1 + " / Preço:" + preco1 + " / Stock Loja 1: " + stk1l1 + " / Stock Loja 2 " + stk1l2);
                        System.out.println("Código: " + codigo2 + " / Nome: " + nome2 + " / Categoria: " + cat2 + " / Preço:" + preco2 + " / Stock Loja 1: " + stk2l1 + " / Stock Loja 2 " + stk2l2);
                        System.out.println("Código: " + codigo3 + " / Nome: " + nome3 + " / Categoria: " + cat3 + " / Preço:" + preco3 + " / Stock Loja 1: " + stk3l1 + " / Stock Loja 2 " + stk3l2);
                        System.out.println("Código: " + codigo4 + " / Nome: " + nome4 + " / Categoria: " + cat4 + " / Preço:" + preco4 + " / Stock Loja 1: " + stk4l1 + " / Stock Loja 2 " + stk4l2);

                        //mostrar qual user está para não confundir no momento de trocar

                        System.out.println("Está no User " + login_nome + ".\nQual produto deseja transferir para a outra loja? (Código 1 / 2 / 3 / 4)");
                        System.out.print("=> ");
                        n1 = input.nextInt();
                        System.out.println("Quantos produtos deseja transferir?");
                        System.out.print("=> ");
                        n2 = input.nextInt();

                        if (loja == 1) {
                            switch (n1) {
                                case 1:
                                    if (stk1l1 < n2) {

                                        //se o stock do produto 1 da loja 1 for menor que o numero para transferir, não faz nada

                                        System.out.println("Não existe stock suficiente!");
                                    } else {

                                        //se for maior ou igual, retira o numero do stock 1 da loja 1 e adiciona ao stock 1 da loja 2

                                        stk1l1 = stk1l1 - n2;
                                        stk1l2 = stk1l2 + n2;
                                        System.out.println("Transferido com sucesso!");
                                    }
                                    break;

                                case 2:
                                    if (stk2l1 < n2) {
                                        System.out.println("Não existe stock suficiente!");
                                    } else {
                                        stk2l1 = stk2l1 - n2;
                                        stk2l2 = stk2l2 + n2;
                                        System.out.println("Transferido com sucesso!");
                                    }
                                    break;

                                case 3:
                                    if (stk3l1 < n2) {
                                        System.out.println("Não existe stock suficiente!");
                                    } else {
                                        stk3l1 = stk3l1 - n2;
                                        stk3l2 = stk3l2 + n2;
                                        System.out.println("Transferido com sucesso!");
                                    }
                                    break;

                                case 4:
                                    if (stk4l1 < n2) {
                                        System.out.println("Não existe stock suficiente!");
                                    } else {
                                        stk4l1 = stk4l1 - n2;
                                        stk4l2 = stk4l2 + n2;
                                        System.out.println("Transferido com sucesso!");
                                    }
                                    break;

                                default:
                                    System.out.println("Produto Inválido");
                                    break;
                            }
                        }

                        if (loja == 2) {
                            switch (n1) {
                                case 1:
                                    if (stk1l2 < n2) {

                                        //se o stock do produto 1 da loja 2 for menor que o numero para transferir, não faz nada

                                        System.out.println("Não existe stock suficiente!");
                                    } else {

                                        //se for maior ou igual, retira o numero do stock 1 da loja 2 e adiciona ao stock 1 da loja 1

                                        stk1l2 = stk1l2 - n2;
                                        stk1l1 = stk1l1 + n2;
                                        System.out.println("Transferido com sucesso!");
                                    }
                                    break;

                                case 2:
                                    if (stk2l2 < n2) {
                                        System.out.println("Não existe stock suficiente!");
                                    } else {
                                        stk2l2 = stk2l2 - n2;
                                        stk2l1 = stk2l1 + n2;
                                        System.out.println("Transferido com sucesso!");
                                    }
                                    break;

                                case 3:
                                    if (stk3l2 < n2) {
                                        System.out.println("Não existe stock suficiente!");
                                    } else {
                                        stk3l2 = stk3l2 - n2;
                                        stk3l1 = stk3l1 + n2;
                                        System.out.println("Transferido com sucesso!");
                                    }
                                    break;

                                case 4:
                                    if (stk4l2 < n2) {
                                        System.out.println("Não existe stock suficiente!");
                                    } else {
                                        stk4l2 = stk4l2 - n2;
                                        stk4l1 = stk4l1 + n2;
                                        System.out.println("Transferido com sucesso!");
                                    }
                                    break;

                                default:
                                    System.out.println("Produto Inválido");
                                    break;
                            }
                        }
                        break;

                    case 5:

                        //o total de cada loja já foi feito acima

                        if (loja == 1) {
                            System.out.println("O valor de todo o stock existente do User " + login_nome + " é " + total1);
                        }
                        if (loja == 2) {
                            System.out.println("O valor de todo o stock existente do User " + login_nome + " é " + total2);
                        }
                        break;

                    case 6:

                        total1 = total1 + total2;
                        System.out.println("O valor de todo o stock existente de todas as lojas é " + total1);
                        break;

                    case 7:

                        if (total1 > total2) {
                            System.out.println("A loja com maior valor é a loja1.");
                        } else if (total2 > total1) {
                            System.out.println("A loja com maior valor é a loja2.");
                        } else {
                            System.out.println("As duas lojas têem o mesmo valor.");
                        }
                        break;

                    case 8:

                        //dá o valor 0 é vari´vel i2, o que faz o while do login começar outra vez

                        i2 = 0;
                        break;

                    default:
                        System.out.println("Opção Inválida");
                        break;
                }
            }
            //fim do menu  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        }
    }
}