package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.Ex07.contarLinhasFicheiro;

public class Ex09 {

    public static String[][] ficheiroParaMatriz(String caminho) throws FileNotFoundException {

        // Declarar variáveis
        int linhaAtual = 0;

        // Contar as linhas do ficheiro (para saber quantas músicas temos)
        int contadorMusicas = contarLinhasFicheiro(caminho) - 1;

        // Criar a matriz à medida
        String[][] matrizCompleta = new String[contadorMusicas][4];

        File ficheiroMusicas = new File(caminho);
        Scanner sc = new Scanner(ficheiroMusicas);

        // Avançar o cabeçalho
        String linha = sc.nextLine();

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] linhaSeparada = linha.split(",");

            for (int coluna = 0; coluna < matrizCompleta[0].length; coluna++) {
                matrizCompleta[linhaAtual][coluna] = linhaSeparada[coluna];
            }

            linhaAtual++;
        }

        return matrizCompleta;
    }

}
