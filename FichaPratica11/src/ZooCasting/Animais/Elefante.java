package ZooCasting.Animais;

public class Elefante extends Animal{

    private double tamanhoTromba;

    public Elefante(String nome, boolean genero, double peso, String cor, double tamanhoTromba) {
        super(nome, genero, peso, cor);
        this.tamanhoTromba = tamanhoTromba;
    }

    public void comerTromba(){
        System.out.println("O elefante está a comer palha...");
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Ihhhhhhhhhhhhhhh iihhhhh iihhhhh");
    }
}
