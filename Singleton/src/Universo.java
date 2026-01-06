public class Universo {

    private static Universo instance;

    private int galaxias;
    private int estrelas;
    private int planetas;

    private Universo(int galaxias, int estrelas, int planetas) {
        this.galaxias = galaxias;
        this.estrelas = estrelas;
        this.planetas = planetas;
    }

    public static Universo getInstance(int galaxias, int estrelas, int planetas) {
        if (instance == null) {
            instance = new Universo(galaxias, estrelas, planetas);
        }

        return instance;
    }

    public void exibirDetalhes() {
        System.out.println("\nGaláxias: " + this.galaxias);
        System.out.println("Estrelas: " + this.estrelas);
        System.out.println("Planetas: " + this.planetas);
    }
}
