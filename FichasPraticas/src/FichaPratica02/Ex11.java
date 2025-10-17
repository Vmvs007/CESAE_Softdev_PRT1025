package FichaPratica02;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        double saldo, montante;

        // Ler saldo e o movimento
        System.out.print("Introduza o saldo: ");
        saldo = input.nextDouble();

        // 1000 para depositar 1000€ || -1000 para levantar 1000€
        System.out.println("Valor a depositar/levantar: ");
        montante = input.nextDouble();

        if (saldo + montante >= 0) {
            // Movimento válido
            saldo = saldo + montante;
            System.out.println("Movimento efetuado com sucesso.");
        } else {
            // Movimento inválido
            System.out.println("Movimento inválido! Saldo insuficiente.");
        }

        System.out.println("Saldo Atual: " + saldo);

    }
}
