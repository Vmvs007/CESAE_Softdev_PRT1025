package Ex02;

public class Main {
    public static void main(String[] args) {

        // Instanciar o Edificio
        Edificio cesae = new Edificio("Edificio CESAE", "Rua de Círiaco Cardoso", "Porto", "Branco", 3, true);

        // Imprimir as informações
        System.out.println("\n***** " + cesae.getNome() + " *****");
        System.out.println(cesae.getRua() + " " + cesae.getCidade());
        System.out.println(cesae.getCorFachada() + " | Num. Andares: " + cesae.getNumAndares());
        if (cesae.hasGaragem()) {
            System.out.println("Tem garagem");
        } else {
            System.out.println("Não tem garagem");
        }

        // Pintar a fachada
        cesae.setCorFachada("Azul");


        // Imprimir as informações
        System.out.println("\n***** " + cesae.getNome() + " *****");
        System.out.println(cesae.getRua() + " " + cesae.getCidade());
        System.out.println(cesae.getCorFachada() + " | Num. Andares: " + cesae.getNumAndares());
        if (cesae.hasGaragem()) {
            System.out.println("Tem garagem");
        } else {
            System.out.println("Não tem garagem");
        }
    }
}
