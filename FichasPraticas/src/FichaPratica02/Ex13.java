package FichaPratica02;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int horas, minutos;

        // Ler no formato 24H
        System.out.print("Horas: ");
        horas = input.nextInt();

        System.out.print("Minutos: ");
        minutos = input.nextInt();

        if (horas <= 12) {
            // AM
            System.out.println(horas + ":" + minutos + " AM");
        }else{
            //PM
            horas=horas-12;
            System.out.println(horas + ":" + minutos + " PM");
        }

    }
}
