package FichaPratica02;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int a, b, c;
        String opcao;

        // Ler números
        System.out.print("Insira o 1º número: ");
        a = input.nextInt();

        System.out.print("Insira o 2º número: ");
        b = input.nextInt();

        System.out.print("Insira o 3º número: ");
        c = input.nextInt();

        // Ler ordem
        System.out.print("Crescente (C) ou Decrescente (D): ");
        opcao = input.next();

        switch (opcao) {

            case "C": // Crescente

                if (a < b && a < c) { // A ... ...

                    if (b < c) { // A B C
                        System.out.println(a + " " + b + " " + c);
                    } else { // A C B
                        System.out.println(a + " " + c + " " + b);
                    }
                }

                if (b < a && b < c) { // B ... ...

                    if (a < c) { // B A C
                        System.out.println(b + " " + a + " " + c);
                    } else { // B C A
                        System.out.println(b + " " + c + " " + a);
                    }
                }

                if (c < a && c < b) { // C ... ...

                    if (a < b) { // C A B
                        System.out.println(c + " " + a + " " + b);
                    } else { // C B A
                        System.out.println(c + " " + b + " " + a);
                    }
                }

                break;

            case "D": // Decrescente

                if (a < b && a < c) { // ... ... A

                    if (b < c) { // C B A
                        System.out.println(c + " " + b + " " + a);
                    } else { // B C A
                        System.out.println(b + " " + c + " " + a);
                    }
                }

                if (b < a && b < c) { // ... ... B

                    if (a < c) { // C A B
                        System.out.println(c + " " + a + " " + b);
                    } else { // A C B
                        System.out.println(a + " " + c + " " + b);
                    }
                }

                if (c < a && c < b) { // ... ... C

                    if (a < b) { // B A C
                        System.out.println(b + " " + a + " " + c);
                    } else { // A B C
                        System.out.println(a + " " + b + " " + c);
                    }
                }

                break;

            default:
                System.out.println("Operação não reconhecida: " + opcao);
                break;
        }


    }
}
