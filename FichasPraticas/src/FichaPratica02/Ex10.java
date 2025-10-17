package FichaPratica02;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int num1, num2, resultado;
        String operacao;

        // Ler números
        System.out.print("Insira um número: ");
        num1 = input.nextInt();

        System.out.print("Insira outro número: ");
        num2 = input.nextInt();

        // Ler operação
        System.out.print("Operação ( + - * / ): ");
        operacao = input.next();

        if (operacao.equals("+") ) {
            resultado = num1 + num2;
            System.out.println("Soma: " + resultado);
        }

        if (operacao.equals("-")) {
            resultado = num1 - num2;
            System.out.println("Subtração: " + resultado);
        }


    }
}
