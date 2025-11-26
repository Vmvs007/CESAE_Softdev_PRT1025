package Ex03;

public class Marisco {
    private String especie;
    private double peso;
    private double precoKg;

    /**
     * Método construtor para <b>Marisco</b>
     * @param especie Espécie
     * @param peso Peso (Kg.)
     * @param precoKg Preço por Kg. (€)
     */
    public Marisco(String especie, double peso, double precoKg) {
        this.especie = especie;
        this.peso = peso;
        this.precoKg = precoKg;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecoKg() {
        return precoKg;
    }
}
