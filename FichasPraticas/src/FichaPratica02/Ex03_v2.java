package FichaPratica02;

import java.util.Scanner;

public class Ex03_v2 {

    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        double salarioAnual, impostos;

        // Ler salário
        System.out.print("Introduza o salário anual: ");
        salarioAnual = input.nextDouble();

        if (salarioAnual <= 15000) {
            impostos = salarioAnual * 0.2;
            System.out.println("Taxa de 20%: " + impostos);
        } else if (salarioAnual <= 20000) {
            impostos = salarioAnual * 0.3;
            System.out.println("Taxa de 30%: " + impostos);
        } else if (salarioAnual <= 25000) {
            impostos = salarioAnual * 0.35;
            System.out.println("Taxa de 35%: " + impostos);
        } else {
            impostos = salarioAnual * 0.4;
            System.out.println("Taxa de 40%: " + impostos);
        }


    }
}
