package Ex03;

public class Main {
    public static void main(String[] args) {

//        String[] dietaTrombas = new String[3];
//        dietaTrombas[0]="Erva";
//        dietaTrombas[1]="Palha";
//        dietaTrombas[2]="Fruta";
//
//        Animal trombas = new Animal("Trombas","Elefante","África do Sul",3500,dietaTrombas,ClasseAnimal.MAMIFERO);

        Animal trombas = new Animal("Trombas", "Elefante", "África do Sul", 3500, new String[]{"Erva", "Palha", "Fruta"}, ClasseAnimal.MAMIFERO);
        Animal jubas = new Animal("Jubas", "Leão", "África do Sul", 350, new String[]{"Bife", "Chouriço"}, ClasseAnimal.MAMIFERO);

        trombas.exibirDetalhes();
        jubas.exibirDetalhes();

        System.out.println("____________________________________________");

        trombas.comer("Bife", 500);
        jubas.comer("Bife", 1500);

        System.out.println("____________________________________________");

        trombas.exibirDetalhes();
        jubas.exibirDetalhes();

        System.out.println("____________________________________________");
    }
}
