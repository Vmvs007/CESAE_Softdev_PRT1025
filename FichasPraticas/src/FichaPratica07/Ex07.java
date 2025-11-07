package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex07 {

    public static int contarLinhasFicheiro(String caminho) throws FileNotFoundException {

        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        int contadorLinhas = 0;

        while (sc.hasNextLine()) {
            contadorLinhas++;
            sc.nextLine();
        }

        return contadorLinhas;

    }

    public static int contarPalavrasFicheiro(String caminho) throws FileNotFoundException {

        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        int contadorPalavras = 0;

        while (sc.hasNext()) {
            contadorPalavras++;
            sc.next();
        }

        return contadorPalavras;
    }

}
