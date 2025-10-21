package FichaPratica03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int quantidadeVezes, contadorVezes = 1;
        int numeroAtual, numeroAnterior;
        boolean crescente = true;

        // Ler quantidade
        System.out.print("Quantos números deseja inserir: ");
        quantidadeVezes = input.nextInt();

        System.out.print("Insira um número: ");
        numeroAnterior = input.nextInt();

        while (contadorVezes < quantidadeVezes) {
            // Perguntar numero
            System.out.print("Insira um número: ");
            numeroAtual = input.nextInt();

            if (numeroAtual <= numeroAnterior) {
                // Se esta condição se cumprir, a sequência nunca mais é crescente
                crescente=false;

            }

            numeroAnterior = numeroAtual;
            contadorVezes++;
        }

        if(crescente==true){
            System.out.println("Crescente");
        }else{
            System.out.println("Não crescente");
        }

    }
}
