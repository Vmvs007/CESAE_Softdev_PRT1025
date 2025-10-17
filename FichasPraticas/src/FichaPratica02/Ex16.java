package FichaPratica02;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int valor, notas;

        // Ler valor
        System.out.print("Insira o valor a levantar: ");
        valor = input.nextInt();

        if(valor%5==0){

        // Notas 200
        notas = valor / 200;
        System.out.println("Notas de 200€: " + notas);
        valor = valor % 200;

        // Notas 100
        notas = valor / 100;
        System.out.println("Notas de 100€: " + notas);
        valor = valor % 100;

        // Notas 50
        notas = valor / 50;
        System.out.println("Notas de  50€: " + notas);
        valor = valor % 50;

        // Notas 20
        notas = valor / 20;
        System.out.println("Notas de  20€: " + notas);
        valor = valor % 20;

        // Notas 10
        notas = valor / 10;
        System.out.println("Notas de  10€: " + notas);
        valor = valor % 10;

        // Notas 5
        notas = valor / 5;
        System.out.println("Notas de   5€: " + notas);

        }else{
            System.out.println("Valor não é múltiplo de 5€. Não tem trocos!");
        }

    }
}
