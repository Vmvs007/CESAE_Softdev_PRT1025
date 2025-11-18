package Ex04;

public class Circulo {
    private String cor;
    private double raio;

    public Circulo(String cor, double raio) {
        this.cor = cor;
        this.raio = raio;
    }

    public double perimetro() {
        return 2 * 3.14 * this.raio;
    }

    public double area() {
        return 3.14 * this.raio * this.raio;
    }
}
