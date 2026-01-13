package DemonstracaoInterfaces;

public class Elefante extends Animal implements AnimalTerrestre{


    public Elefante(String nome, double peso, String continente) {
        super(nome, peso, continente);
    }

    @Override
    public void barulho() {

    }

    @Override
    public void andar() {
        System.out.println("Elefante a andar em pé com patas compridas");
    }

    @Override
    public void correr() {

    }
}
