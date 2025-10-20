package FichaPratica03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int inicio, salto, limite;

        System.out.print("Inicio: ");
        inicio = input.nextInt();

        salto = 1;

        System.out.print("Qual o limite: ");
        limite = input.nextInt();

        while (inicio <= limite) {
            System.out.println(inicio);
            inicio = inicio + salto;
        }
    }
}
