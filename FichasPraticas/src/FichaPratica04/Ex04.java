package FichaPratica04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero;
        boolean primo=true;

        // Ler numero
        System.out.print("Insira um número: ");
        numero = input.nextInt();

        for (int divisor = 2; divisor < numero; divisor++) {
            if (numero % divisor == 0) {
                // Deixa de ser primo
                primo = false;
            }
        }


        if (primo) { // primo == true
            System.out.println("Primo");
        } else {
            System.out.println("Não primo");
        }

    }
}
