package DemonstracaoInterfaces;

public class Crocodilo extends Animal implements AnimalTerrestre, AnimalAquatico {

    private boolean aguaSalgado;

    public Crocodilo(String nome, double peso, String continente, boolean aguaSalgado) {
        super(nome, peso, continente);
        this.aguaSalgado = aguaSalgado;
    }

    @Override
    public void barulho() {
        System.out.println("Brrrrrrrr");
    }

    @Override
    public void mergulhar() {

    }

    @Override
    public void nadar() {

    }

    @Override
    public void andar() {
        System.out.println("Crocodilo a andar deitado com patas pequenas");
    }

    @Override
    public void correr() {

    }
}
