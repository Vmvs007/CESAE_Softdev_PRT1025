package FichaPratica05;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double[] comissoes = new double[12];
        double totalAnual = 0;

        // Preencher o vetor
        for (int i = 0; i < 12; i++) {
            System.out.print("Insira comissões no vetor[" + i + "]: ");
            comissoes[i] = input.nextInt();
        }

        // Calcular o total
        for (int i = 0; i < 12; i++) {
            totalAnual += comissoes[i];
        }

        System.out.println("Total Comissões Anuais: " + totalAnual + " €");
    }
}
