package DemonstracaoObject;

public class Main {
    public static void main(String[] args) {

        Animal dumba = new Animal("Dumbo", 1500, "Ásia");
        Animal dumbo = new Animal("Dumbo", 1500, "África");
        Animal croc = new Animal("Croc", 500, "África");

        System.out.println(dumbo);

        if (dumbo.equals(dumba)) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }

    }
}
