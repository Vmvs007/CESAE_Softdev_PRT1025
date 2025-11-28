package ZooCasting.Animais;

public class Leao extends Animal{

    public Leao(String nome, boolean genero, double peso, String cor) {
        super(nome, genero, peso, cor);
    }

    public void dormir20h(){
        System.out.println("Zzzzzzzzzzzzzzzzzzz");
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Roaaarrrr");
    }
}
