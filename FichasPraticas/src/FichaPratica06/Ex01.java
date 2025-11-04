package FichaPratica06;

import java.util.Scanner;

public class Ex01 {

    public static void fazerBarulho(String animal) {

        switch (animal) {
            case "Cão":
                System.out.println("Au au au");
                break;

            case "Gato":
                System.out.println("Miau miau");
                break;

            case "Peixe":
                System.out.println("Glub");
                break;

            case "Vaca":
                System.out.println("Muuuuuu");
                break;

            case "Porco":
                System.out.println("Oinc oinc oinc");
                break;

            default:
                System.out.println("Barulho desconhecido");
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String animalEscolhido;

        System.out.print("Insira um animal: ");
        animalEscolhido = input.next();

        fazerBarulho(animalEscolhido);

    }

}
