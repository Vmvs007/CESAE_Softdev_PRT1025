package TrabalhoPratico;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.Ex07.contarLinhasFicheiro;

public class Demonstracao {

    public static int contarColunas(String caminho) throws FileNotFoundException {

        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        String linha = sc.nextLine();
        String[] linhaSeparada = linha.split(";");

        return linhaSeparada.length;

    }

    public static String[][] ficheiroParaMatriz(String caminho) throws FileNotFoundException {

        // Declarar variáveis
        int linhaAtual = 0;

        // Criar a matriz à medida
        String[][] matrizCompleta = new String[contarLinhasFicheiro(caminho) - 1][contarColunas(caminho)];

        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        // Avançar o cabeçalho
        String linha = sc.nextLine();

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] linhaSeparada = linha.split(";");

            for (int coluna = 0; coluna < matrizCompleta[0].length; coluna++) {
                matrizCompleta[linhaAtual][coluna] = linhaSeparada[coluna];
            }

            linhaAtual++;
        }

        return matrizCompleta;
    }

    public static String[] habitatsUnicos(String[][] matrizAnimais) {

        String[] arrayHabitatsTotal = new String[matrizAnimais.length];
        int indexDisponivel = 0;

        // Este ciclo itera para cada animal da matriz
        for (int linhaAnimais = 0; linhaAnimais < matrizAnimais.length; linhaAnimais++) {

            boolean encontrei = false;

            // matrizAnimais[linhaAnimais][3] é o habitat do animal atual

            // Este ciclo itera para cada habitat do meu array sem duplicados
            for (int habitatAtual = 0; habitatAtual < arrayHabitatsTotal.length; habitatAtual++) {
                if (matrizAnimais[linhaAnimais][3].equals(arrayHabitatsTotal[habitatAtual])) {
                    encontrei = true;
                }
            }

            if (!encontrei) { // encontrei == false
                arrayHabitatsTotal[indexDisponivel] = matrizAnimais[linhaAnimais][3];
                indexDisponivel++;
            }

        }

        int quantidadeDeHabitats = indexDisponivel;

        // Limpeza - colocar o array à medida
        String[] arrayHabitatsMedida = new String[quantidadeDeHabitats];

        for (int i = 0; i < arrayHabitatsMedida.length; i++) {
            arrayHabitatsMedida[i] = arrayHabitatsTotal[i];
        }

        return arrayHabitatsMedida;

    }

    public static int numeroAnimaisHabitat(String[][] matrizAnimais, String habitat) {

        int contagemAnimais = 0;

        for (int linha = 0; linha < matrizAnimais.length; linha++) {
            if (matrizAnimais[linha][3].equals(habitat)) {
                contagemAnimais++;
            }
        }
        return contagemAnimais;
    }

    public static String[] animaisDeUmHabitat(String[][] matrizAnimais, String habitat) {
        String[] animaisDoHabitat = new String[matrizAnimais.length];
        int indexDisponivel = 0;

        for (int linhaAnimal = 0; linhaAnimal < matrizAnimais.length; linhaAnimal++) {
            if (matrizAnimais[linhaAnimal][3].equals(habitat)) {
                // Encontramos um animal deste Habitat
                animaisDoHabitat[indexDisponivel] = matrizAnimais[linhaAnimal][0];
                indexDisponivel++;
            }
        }

        int quantidadeAnimais = indexDisponivel;

        String[] animaisDoHabitatMedida = new String[quantidadeAnimais];

        for (int i = 0; i < animaisDoHabitatMedida.length; i++) {
            animaisDoHabitatMedida[i] = animaisDoHabitat[i];
        }

        return animaisDoHabitatMedida;
    }

    public static int interacoesAnimal(String[][] matrizInteracoes, String idAnimal) {
        int contagemInteracoes = 0;

        for (int linhaInteracao = 0; linhaInteracao < matrizInteracoes.length; linhaInteracao++) {

            if (matrizInteracoes[linhaInteracao][3].equals(idAnimal)) {
                // Contar a interação
                contagemInteracoes++;
            }
        }
        return contagemInteracoes;
    }

    public static double rendimentosAnimal(String[][] matrizInteracoes, String idAnimal) {
        double rendimentoTotal = 0;

        for (int linhaInteracao = 0; linhaInteracao < matrizInteracoes.length; linhaInteracao++) {

            if (matrizInteracoes[linhaInteracao][3].equals(idAnimal)) {
                // Incrementar ao rendimento
                rendimentoTotal += Double.parseDouble(matrizInteracoes[linhaInteracao][5]);
            }
        }
        return rendimentoTotal;
    }

    public static void estatisticasPorHabitat(String[][] matrizAnimais, String[][] matrizInteracoes) {

        String[] habitatsSemDuplicados = habitatsUnicos(matrizAnimais);

        for (int i = 0; i < habitatsSemDuplicados.length; i++) {
            System.out.println("\nHabitat: " + habitatsSemDuplicados[i]);
            System.out.println("  Nº de Animais: " + numeroAnimaisHabitat(matrizAnimais, habitatsSemDuplicados[i]));

            int numInteracoesTotal = 0;
            double receitaTotal = 0;

            String[] idsAnimaisHabitatAtual = animaisDeUmHabitat(matrizAnimais, habitatsSemDuplicados[i]);

            for (int indexAnimal = 0; indexAnimal < idsAnimaisHabitatAtual.length; indexAnimal++) {
                numInteracoesTotal += interacoesAnimal(matrizInteracoes, idsAnimaisHabitatAtual[indexAnimal]);
                receitaTotal += rendimentosAnimal(matrizInteracoes, idsAnimaisHabitatAtual[indexAnimal]);

            }

            System.out.println("  Nº de Interações: " + numInteracoesTotal);
            System.out.println("  Receita Associada: " + receitaTotal + " €");


        }
    }

    public static String nomeAnimal(String[][] matrizAnimais, String idAnimal) {
        for (int linha = 0; linha < matrizAnimais.length; linha++) {
            if (matrizAnimais[linha][0].equals(idAnimal)) {
                return matrizAnimais[linha][1];
            }
        }

        return "N/A";
    }

    public static String especieAnimal(String[][] matrizAnimais, String idAnimal) {
        for (int linha = 0; linha < matrizAnimais.length; linha++) {
            if (matrizAnimais[linha][0].equals(idAnimal)) {
                return matrizAnimais[linha][2];
            }
        }

        return "N/A";
    }

    public static void imprimirAnimaisHabitat(String[][] matrizAnimais) {
        String[] habitatsSemDuplicados = habitatsUnicos(matrizAnimais);

        for (int i = 0; i < habitatsSemDuplicados.length; i++) {
            System.out.println("\n***** " + habitatsSemDuplicados[i] + " *****");

            String[] idsAnimaisHabitatAtual = animaisDeUmHabitat(matrizAnimais, habitatsSemDuplicados[i]);
            for (int indexAnimal = 0; indexAnimal < idsAnimaisHabitatAtual.length; indexAnimal++) {
                System.out.print(nomeAnimal(matrizAnimais,idsAnimaisHabitatAtual[indexAnimal]));
                System.out.print(" | ");
                System.out.println(especieAnimal(matrizAnimais,idsAnimaisHabitatAtual[indexAnimal]));
            }

            System.out.println();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        String[][] matrizAnimais = ficheiroParaMatriz("Ficheiros/animais.csv");
        String[][] matrizClientes = ficheiroParaMatriz("Ficheiros/clientes.csv");
        String[][] matrizInteracoes = ficheiroParaMatriz("Ficheiros/interacoes.csv");

        // estatisticasPorHabitat(matrizAnimais, matrizInteracoes);

        imprimirAnimaisHabitat(matrizAnimais);
    }

}
