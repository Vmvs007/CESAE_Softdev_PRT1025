package ZooCasting.Animais;

public class Suricata extends Animal{

    private int quantidadeRiscas;

    public Suricata(String nome, boolean genero, double peso, String cor, int quantidadeRiscas) {
        super(nome, genero, peso, cor);
        this.quantidadeRiscas = quantidadeRiscas;
    }

    public void vigiar(){
        System.out.println("\uD83D\uDC40");
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Tsssscc Grsssss");
    }
}
