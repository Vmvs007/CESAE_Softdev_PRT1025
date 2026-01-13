package DemonstracaoInterfaces;

public class Golfinho extends Animal implements AnimalAquatico{

    public Golfinho(String nome, double peso, String continente) {
        super(nome, peso, continente);
    }

    @Override
    public void barulho() {

    }


    @Override
    public void mergulhar() {

    }

    @Override
    public void nadar() {

    }
}
