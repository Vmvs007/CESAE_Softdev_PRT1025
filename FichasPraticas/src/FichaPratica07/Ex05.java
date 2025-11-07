package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex05 {

    public static int contarNumerosFicheiro(String caminho) throws FileNotFoundException {

        File ficheiroNumeros = new File(caminho);
        Scanner sc = new Scanner(ficheiroNumeros);

        int somatorio = 0;

        while (sc.hasNextInt()) {
            somatorio += sc.nextInt();
        }

        return somatorio;

    }

    public static void main(String[] args) throws FileNotFoundException {


        System.out.println("Somatório: " + contarNumerosFicheiro("Ficheiros/exercicio_05_1999.txt"));
    }
}
