package DemonstracaoObject;

import java.util.Objects;

public class Carro {

    private String marca;
    private String modelo;
    private int cv;
    private int cc;
    private double consumoL100Km;

    public Carro(String marca, String modelo, int cv, int cc, double consumoL100Km) {
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.cc = cc;
        this.consumoL100Km = consumoL100Km;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCv() {
        return cv;
    }

    public int getCc() {
        return cc;
    }

    public double getConsumoL100Km() {
        return consumoL100Km;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setConsumoL100Km(double consumoL100Km) {
        this.consumoL100Km = consumoL100Km;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        // if (this.getClass() != obj.getClass() && !obj.getClass().getSimpleName().equals("Mota")) return false;

        if (obj instanceof Carro) {
            Carro outro = (Carro) obj;
            return this.consumoL100Km == outro.consumoL100Km;

        } else if (obj instanceof Mota) {
            Mota outro = (Mota) obj;
            return this.consumoL100Km == outro.getConsumoL100Km();

        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(consumoL100Km);
    }
}
