package ZooCasting.Animais;

public class Animal {
    protected String nome;
    protected boolean genero;
    protected double peso;
    protected String cor;

    public Animal(String nome, boolean genero, double peso, String cor) {
        this.nome = nome;
        this.genero = genero;
        this.peso = peso;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public boolean isGenero() {
        return genero;
    }

    public double getPeso() {
        return peso;
    }

    public String getCor() {
        return cor;
    }

    public void fazerBarulho() {
        System.out.println("Barulho genérico");
    }
}
