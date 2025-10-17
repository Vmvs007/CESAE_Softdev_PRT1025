package FichaPratica02;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int num;

        // Ler num
        System.out.print("Introduza un número: ");
        num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("É par");
        }else{
            System.out.println("É impar");
        }

    }
}
