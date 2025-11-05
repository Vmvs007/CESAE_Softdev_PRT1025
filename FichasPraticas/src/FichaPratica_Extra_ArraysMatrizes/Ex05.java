package FichaPratica_Extra_ArraysMatrizes;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[12];

        System.out.println("=== Preenchimento do vetor ===");

        // Leitura de números para o vetor (teu padrão)
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        System.out.println("\n=== Valores duplicados encontrados ===");
        boolean encontrouDuplicados = false;

        // Para cada posição i, só mostramos o valor se:
        // 1) ainda não apareceu antes (0..i-1)
        // 2) existir pelo menos uma repetição à frente (i+1..fim)
        for (int i = 0; i < vetor.length; i++) {

            // (1) verificar se já apareceu antes
            boolean jaApareceuAntes = false;
            for (int k = 0; k < i; k++) {
                if (vetor[k] == vetor[i]) {
                    jaApareceuAntes = true;
                    break;
                }
            }
            if (jaApareceuAntes) {
                continue; // salta para o próximo i para não repetir o mesmo valor
            }

            // (2) verificar se aparece à frente
            boolean repeteAFrente = false;
            for (int k = i + 1; k < vetor.length; k++) {
                if (vetor[k] == vetor[i]) {
                    repeteAFrente = true;
                    break;
                }
            }

            if (repeteAFrente) {
                System.out.println("Valor duplicado: " + vetor[i]);
                encontrouDuplicados = true;
            }
        }

        if (!encontrouDuplicados) {
            System.out.println("Não existem valores duplicados no vetor.");
        }

        input.close();
    }
}
