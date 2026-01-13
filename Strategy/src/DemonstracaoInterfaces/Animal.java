package DemonstracaoInterfaces;

public abstract class Animal {
    protected String nome;
    protected double peso;
    protected String continente;

    public Animal(String nome, double peso, String continente) {
        this.nome = nome;
        this.peso = peso;
        this.continente = continente;
    }

    abstract public void barulho();

    public void comer() {
        System.out.println(this.nome + " comeu bem!");
    }
}
