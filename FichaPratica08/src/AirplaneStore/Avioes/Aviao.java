package AirplaneStore.Avioes;

public class Aviao {
    protected int numSerie;
    protected String modelo;
    protected int anoFabrico;
    protected double peso;
    protected double compFuselagem;
    protected double envAsas;
    protected double altCauda;
    protected int numMotores;
    protected double autonomia;
    protected double velMax;
    protected double preco;

    /**
     * Método construtor para <b>Avião</b>
     *
     * @param numSerie      Número de série
     * @param modelo        Modelo do <b>Avião</b>
     * @param anoFabrico    Ano de Fabrico
     * @param peso          Peso (Kg.)
     * @param compFuselagem Comprimento da Fuselagem (m.)
     * @param envAsas       Envergadura das Asas (m.)
     * @param altCauda      Altura de Cauda (m.)
     * @param numMotores    Número Motores
     * @param autonomia     Autonomia (km.)
     * @param velMax        Velocidade Máxima (Km/h)
     * @param preco         Preço (€)
     */
    public Aviao(int numSerie, String modelo, int anoFabrico, double peso, double compFuselagem, double envAsas, double altCauda, int numMotores, double autonomia, double velMax, double preco) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.peso = peso;
        this.compFuselagem = compFuselagem;
        this.envAsas = envAsas;
        this.altCauda = altCauda;
        this.numMotores = numMotores;
        this.autonomia = autonomia;
        this.velMax = velMax;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirDetalhes() {
        System.out.println("\n*_*_*_*_*_*_*_*_* " + this.numSerie + " | " + this.modelo + " *_*_*_*_*_*_*_*_*");
        System.out.println(this.anoFabrico + " | " + this.peso + " Kg. | Num. Motorores: " + this.numMotores);
        System.out.println("Vel Máx: " + this.velMax + " Km/h | " + this.preco + " €");
    }
}
