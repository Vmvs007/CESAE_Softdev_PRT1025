package FichaPratica03;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int inicio, salto, limite;
        String mensagem;

        inicio = 1;

        System.out.print("Quantas vezes quer imprimir a mensagem: ");
        limite = input.nextInt();

        System.out.print("Mensagem: ");
        // Sempre que acontece um input.nextInt ou nextDouble ou next, antes do nextLine, temos de limpar o buffer
        // Limpeza de buffer
        input.nextLine();
        mensagem = input.nextLine();

        while (inicio <= limite) {
            System.out.println(mensagem);
            inicio = inicio + 1;
        }
    }
}
