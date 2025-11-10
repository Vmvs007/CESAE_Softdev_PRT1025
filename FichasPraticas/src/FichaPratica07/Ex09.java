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

    public static void separadorGrafico() {
        System.out.println("\uD83C\uDFB5  \uD83C\uDFB5  \uD83C\uDFB5  \uD83C\uDFB5  \uD83C\uDFB5  \uD83C\uDFB5  \uD83C\uDFB5  \uD83C\uDFB5  \uD83C\uDFB5  \uD83C\uDFB5  \uD83C\uDFB5  \uD83C\uDFB5  \uD83C\uDFB5  \uD83C\uDFB5  \uD83C\uDFB5  \uD83C\uDFB5\n");
    }


    public static void pesquisarGenero(String[][] matrizMusicas, String generoPesquisa) {

        for (int linha = 0; linha < matrizMusicas.length; linha++) {

            if (matrizMusicas[linha][2].equals(generoPesquisa)) {
                // Encontramos uma música do Género certo, vamos imprimir
                System.out.print(matrizMusicas[linha][0] + "\t|\t");
                System.out.print(matrizMusicas[linha][1] + "\t|\t");
                System.out.println(matrizMusicas[linha][3] + "\t|\t");
            }

        }

    }


    public static void pesquisarArtista(String[][] matrizMusicas, String artistaPesquisa) {

        for (int linha = 0; linha < matrizMusicas.length; linha++) {

            if (matrizMusicas[linha][1].equals(artistaPesquisa)) {
                // Encontramos uma música do Género certo, vamos imprimir
                System.out.print(matrizMusicas[linha][0] + "\t|\t");
                System.out.print(matrizMusicas[linha][2] + "\t|\t");
                System.out.println(matrizMusicas[linha][3] + "\t|\t");
            }

        }

    }

    public static void maiorMusica(String[][] matrizMusicas) {

        int duracaoMaiorMusica = 0;
        int linhaMaiorMusica = 0;

        for (int linha = 0; linha < matrizMusicas.length; linha++) {

            String duracaoNaoTratada = matrizMusicas[linha][3]; // "6:06"
            String[] duracaoSeparada = duracaoNaoTratada.split(":"); // ["6"]["06"]

            int minutosMusicaAtual = Integer.parseInt(duracaoSeparada[0]); // 6
            int segundosMusicaAtual = Integer.parseInt(duracaoSeparada[1]); // 6

            int duracaoMusicaAtual = (minutosMusicaAtual * 60) + segundosMusicaAtual;

            if (duracaoMusicaAtual > duracaoMaiorMusica) {
                // A nossa música atual é maior que a "atual maior"
                duracaoMaiorMusica = duracaoMusicaAtual;
                // Temos de guardar a música "toda"
                linhaMaiorMusica = linha;
            }

        }

        // Imprimir a maior música
        System.out.print(matrizMusicas[linhaMaiorMusica][0] + "\t|\t");
        System.out.print(matrizMusicas[linhaMaiorMusica][1] + "\t|\t");
        System.out.print(matrizMusicas[linhaMaiorMusica][2] + "\t|\t");
        System.out.println(matrizMusicas[linhaMaiorMusica][3] + "\t|\t");


    }

    public static void musicasAcimaDuracao(String[][] matrizMusicas, int duracaoMinima) {


        for (int linha = 0; linha < matrizMusicas.length; linha++) {

            String duracaoNaoTratada = matrizMusicas[linha][3]; // "6:06"
            String[] duracaoSeparada = duracaoNaoTratada.split(":"); // ["6"]["06"]

            int minutosMusicaAtual = Integer.parseInt(duracaoSeparada[0]); // 6
            int segundosMusicaAtual = Integer.parseInt(duracaoSeparada[1]); // 6

            int duracaoMusicaAtual = (minutosMusicaAtual * 60) + segundosMusicaAtual;

            if (duracaoMusicaAtual >= duracaoMinima) {
                // A música tem o minimo de duração

                // Imprimir a música
                System.out.print(matrizMusicas[linha][0] + "\t|\t");
                System.out.print(matrizMusicas[linha][1] + "\t|\t");
                System.out.print(matrizMusicas[linha][2] + "\t|\t");
                System.out.println(matrizMusicas[linha][3] + "\t|\t");
            }

        }

    }

    public static void menu() throws FileNotFoundException {

        String[][] matrizMusicas = ficheiroParaMatriz("Ficheiros/exercicio_09.csv");

        Scanner input = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5 Programa de Análise da Playlist \uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5");
            System.out.println("1. Pesquisar por Género");
            System.out.println("2. Pesquisar por Artista");
            System.out.println("3. Maior Música");
            System.out.println("4. Pesquisar por Duração");
            System.out.println("5. Quantidade de Músicas");
            System.out.println("0. Sair");

            System.out.print("\nOpção: ");
            opcao = input.nextInt();

            separadorGrafico();

            System.out.println("");

            switch (opcao) {
                case 1: // Pesquisar por Género
                    System.out.println("\n\uD83C\uDFB5 Pesquisar por Género \uD83C\uDFB5");
                    System.out.print("Género a pesquisar: ");
                    input.nextLine();
                    String genero = input.nextLine();

                    pesquisarGenero(matrizMusicas, genero);
                    break;

                case 2: // Pesquisar por Artista
                    System.out.println("\n\uD83C\uDFB5 Pesquisar por Artista \uD83C\uDFB5");
                    System.out.print("Artista a pesquisar: ");
                    input.nextLine();
                    String artista = input.nextLine();

                    pesquisarArtista(matrizMusicas, artista);
                    break;

                case 3: // Maior Música
                    System.out.println("\n\uD83C\uDFB5 Maior Música \uD83C\uDFB5");
                    maiorMusica(matrizMusicas);
                    break;

                case 4: // Pesquisar por Duração
                    System.out.println("\n\uD83C\uDFB5 Pesquisar por Duração \uD83C\uDFB5");
                    int minutosInput, segundosInput;
                    System.out.print("Minutos Mínimos: ");
                    minutosInput = input.nextInt();

                    System.out.print("Segundos Mínimos: ");
                    segundosInput = input.nextInt();

                    int duracaoMinima = (minutosInput * 60) + segundosInput;

                    musicasAcimaDuracao(matrizMusicas, duracaoMinima);

                    break;

                case 5: // Quantidade de Músicas
                    System.out.println("\n\uD83C\uDFB5 Quantidade de Músicas \uD83C\uDFB5");
                    System.out.println(matrizMusicas.length);
                    break;

                case 0: // Sair
                    System.out.println("Obrigado e até à próxima \uD83C\uDFC3\uD83D\uDEAA");
                    break;

                default:
                    System.out.println("❌ Opção Inválida ❌");
                    break;
            }

        } while (opcao != 0);
    }


    public static void main(String[] args) throws FileNotFoundException {
        menu();
    }

}
