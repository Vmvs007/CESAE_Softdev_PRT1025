package Demonstracao;

public class Aventura {

    public Aventura() {
    }

    public void armadilha(){
        Heroi heroi = Heroi.getInstance();
        System.out.println("Caiste na armadilha");
        heroi.setVida(heroi.getVida()-30);
    }
}
