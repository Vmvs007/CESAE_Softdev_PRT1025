package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) throws FileNotFoundException {

        String nomeMaisVelho = "";
        int idadeMaisVelho = 0;

        File ficheiro = new File("Ficheiros/exercicio_06.txt");

        Scanner sc = new Scanner(ficheiro);

        while (sc.hasNextLine()) {

            String linha = sc.nextLine();

            String[] linhaSeparada = linha.split(",");

            if (Integer.parseInt(linhaSeparada[1]) > idadeMaisVelho) { // Encontramos alguém mais velho
                idadeMaisVelho = Integer.parseInt(linhaSeparada[1]);
                nomeMaisVelho = linhaSeparada[0];
            }

        }

        System.out.println("***** Pessoa mais velha *****");
        System.out.println(nomeMaisVelho + " com " + idadeMaisVelho + " anos!");


    }
}
