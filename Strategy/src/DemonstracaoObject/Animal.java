package DemonstracaoObject;

public class Animal {
    protected String nome;
    protected double peso;
    protected String continente;

    public Animal(String nome, double peso, String continente) {
        this.nome = nome;
        this.peso = peso;
        this.continente = continente;
    }

    public void comer() {
        System.out.println(this.nome + " comeu bem!");
    }

    @Override
    public String toString() {
        return this.nome + " | " + this.continente + " | Peso: " + this.peso + " Kg.";
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj) return true;

        if(!obj.getClass().getSimpleName().equals(this.getClass().getSimpleName())) return false;

        Animal outro = (Animal) obj;

        if (this.nome.equals(outro.nome) && this.peso == outro.peso) {
            return true;
        } else {
            return false;
        }
    }
}
