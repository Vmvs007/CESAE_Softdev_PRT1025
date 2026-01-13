package DemonstracaoInterfaces;

public class Pato extends Animal implements AnimalTerrestre, AnimalAquatico, AnimalAereo{

    public Pato(String nome, double peso, String continente) {
        super(nome, peso, continente);
    }

    @Override
    public void barulho() {

    }

    @Override
    public void voar() {

    }

    @Override
    public void aterrar() {

    }

    @Override
    public void planar() {

    }

    @Override
    public void mergulhar() {

    }

    @Override
    public void nadar() {

    }

    @Override
    public void andar() {

    }

    @Override
    public void correr() {

    }
}
