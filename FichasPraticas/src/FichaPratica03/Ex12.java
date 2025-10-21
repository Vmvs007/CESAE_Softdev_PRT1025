package FichaPratica03;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int numIntroduzido = 1, intervalo_00_25 = 0, intervalo_26_50 = 0, intervalo_51_75 = 0, intervalo_76_100 = 0;

        while (numIntroduzido >= 0) {
            System.out.print("Introduza um número: ");
            numIntroduzido = input.nextInt();

            if (numIntroduzido >= 0 && numIntroduzido <= 25) {
                intervalo_00_25++;
            }

            if (numIntroduzido >= 26 && numIntroduzido <= 50) {
                intervalo_26_50++;
            }

            if (numIntroduzido >= 51 && numIntroduzido <= 75) {
                intervalo_51_75++;
            }

            if (numIntroduzido >= 76 && numIntroduzido <= 100) {
                intervalo_76_100++;
            }

        }

        System.out.println(" [00,25]:" + intervalo_00_25);
        System.out.println(" [26,50]:" + intervalo_26_50);
        System.out.println(" [51,75]:" + intervalo_51_75);
        System.out.println("[76,100]:" + intervalo_76_100);
    }
}
