package FichaPratica01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        double raio, area, pi = 3.14;

        // Ler raio
        System.out.print("Introduza o raio: ");
        raio = input.nextDouble();

        // Calcular e apresentar a área
        area = pi * raio * raio;
        System.out.println("Área: " + area);
    }
}
