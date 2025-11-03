package FichaPratica06;

import java.util.Scanner;

public class BibliotecaInput {


    public static int lerInteiroPositivo() {
        Scanner input = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Insira um número (inteiro e positivo): ");
            numero = input.nextInt();
        } while (numero < 0);

        return numero;
    }
}
