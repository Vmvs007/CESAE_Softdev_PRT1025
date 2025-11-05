package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex03 {

    /**
     * Função para copiar o conteudo de um ficheiro para outro
     * @param caminhoOrigem Caminho Ficheiro Original - Conteúdo a ser copiado
     * @param caminhoDestino Camihno Ficheiro Destino - Vai receber o conteúdo
     * @throws FileNotFoundException Caso o Ficheiro Original não exista
     */
    public static void copiarFicheiro(String caminhoOrigem, String caminhoDestino) throws FileNotFoundException {

        File ficheiroOrigem = new File(caminhoOrigem);
        File ficheiroDestino = new File(caminhoDestino);

        Scanner sc = new Scanner(ficheiroOrigem);
        PrintWriter pw = new PrintWriter(ficheiroDestino);

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            pw.println(linha);
        }

        pw.close();

    }


    public static void main(String[] args) throws FileNotFoundException {

        copiarFicheiro("Ficheiros/exercicio_03_Alternativa01.txt","Ficheiros/exercicio_03_COPIA.txt");
    }
}
