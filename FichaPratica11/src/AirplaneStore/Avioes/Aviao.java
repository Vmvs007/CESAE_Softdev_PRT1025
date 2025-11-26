package AirplaneStore.Avioes;

public class Aviao {
    protected int numSerie;
    protected String modelo;
    protected int anoFabrico;
    protected double peso;
    protected double compFuselagem;
    protected double envAsas;
    protected double alturaCauda;
    protected int numMotores;
    protected double autonomia;
    protected double velMax;
    protected double preco;

    public Aviao(int numSerie, String modelo, int anoFabrico, double peso, double compFuselagem, double envAsas, double alturaCauda, int numMotores, double autonomia, double velMax, double preco) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.peso = peso;
        this.compFuselagem = compFuselagem;
        this.envAsas = envAsas;
        this.alturaCauda = alturaCauda;
        this.numMotores = numMotores;
        this.autonomia = autonomia;
        this.velMax = velMax;
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println("\n______________________________ " + this.numSerie + " | " + this.modelo + " | " + this.anoFabrico + " ______________________________");
        System.out.println("Peso: " + this.peso + " Kg. | Autonomia: " + this.autonomia + " Km. | Vel. Máx: " + this.velMax + " Km/h | Preço: " + this.preco + " €");
    }
}
