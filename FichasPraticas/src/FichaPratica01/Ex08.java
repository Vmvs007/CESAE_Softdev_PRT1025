package FichaPratica01;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int totalSegundosAlbum = 0, minutosLidos, segundosLidos;

        // ______ Ler duração música 1 ______
        System.out.print("Introduza os minutos da música 1: ");
        minutosLidos = input.nextInt();

        System.out.print("Introduza os segundos da música 1: ");
        segundosLidos = input.nextInt();

        totalSegundosAlbum = totalSegundosAlbum + minutosLidos * 60 + segundosLidos;

        // ______ Ler duração música 2 ______
        System.out.print("Introduza os minutos da música 2: ");
        minutosLidos = input.nextInt();

        System.out.print("Introduza os segundos da música 2: ");
        segundosLidos = input.nextInt();

        totalSegundosAlbum = totalSegundosAlbum + minutosLidos * 60 + segundosLidos;

        // ______ Ler duração música 3 ______
        System.out.print("Introduza os minutos da música 3: ");
        minutosLidos = input.nextInt();

        System.out.print("Introduza os segundos da música 3: ");
        segundosLidos = input.nextInt();

        totalSegundosAlbum = totalSegundosAlbum + minutosLidos * 60 + segundosLidos;

        // ______ Ler duração música 4 ______
        System.out.print("Introduza os minutos da música 4: ");
        minutosLidos = input.nextInt();

        System.out.print("Introduza os segundos da música 4: ");
        segundosLidos = input.nextInt();

        totalSegundosAlbum = totalSegundosAlbum + minutosLidos * 60 + segundosLidos;

        // ______ Ler duração música 5 ______
        System.out.print("Introduza os minutos da música 5: ");
        minutosLidos = input.nextInt();

        System.out.print("Introduza os segundos da música 5: ");
        segundosLidos = input.nextInt();

        totalSegundosAlbum = totalSegundosAlbum + minutosLidos * 60 + segundosLidos;


        // ______________________________________________________-
        // Conversão hh:mm:ss

        // 20m 20s sem cada música, temos: 1h 41m 40s (6100s)

        int horas, minutos, segundos;

        horas = totalSegundosAlbum / 3600;
        minutos = (totalSegundosAlbum / 60) - (horas * 60);
        segundos = totalSegundosAlbum - (horas * 3600) - (minutos * 60);

        System.out.println("Duração do Álbum: " + horas + "h " + minutos + "m " + segundos + "s");

    }
}
