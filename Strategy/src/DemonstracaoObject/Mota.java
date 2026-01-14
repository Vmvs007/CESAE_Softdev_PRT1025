package DemonstracaoObject;

public class Mota {

    private String marca;
    private String modelo;
    private String categoriaMota;
    private int cc;
    private double consumoL100Km;

    public Mota(String marca, String modelo, String categoriaMota, int cc, double consumoL100Km) {
        this.marca = marca;
        this.modelo = modelo;
        this.categoriaMota = categoriaMota;
        this.cc = cc;
        this.consumoL100Km = consumoL100Km;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCategoriaMota() {
        return categoriaMota;
    }

    public int getCc() {
        return cc;
    }

    public double getConsumoL100Km() {
        return consumoL100Km;
    }
}
