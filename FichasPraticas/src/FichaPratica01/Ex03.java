package FichaPratica01;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int ladoA, ladoB, area, perimetro;

        // Ler lados
        System.out.print("Insira a largura: ");
        ladoA = input.nextInt();

        System.out.println("Insira a altura: ");
        ladoB = input.nextInt();

        // Calcular e apresentar o perimetro
        perimetro = ladoA + ladoA + ladoB + ladoB;
        System.out.println("Perímetro: " + perimetro);

        // Calcular e apresentar a área
        area = ladoA * ladoB;
        System.out.println("Área: " + area);

    }
}
