package Ex01;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int anoFabrico;
    private int potenciaCV;
    private int cc;
    private TipoCombustivel combustivel;
    private double consumoL100Km;

    public Carro(String marca, String modelo, String cor, int anoFabrico, int potenciaCV, int cc, TipoCombustivel combustivel, double consumoL100Km) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.potenciaCV = potenciaCV;
        this.cc = cc;
        this.combustivel = combustivel;
        this.consumoL100Km = consumoL100Km;
    }

    public Carro corrida(Carro adversario) {

        if (this.potenciaCV > adversario.potenciaCV) {
            // Ganha o meu carro
            return this;
        } else if (this.potenciaCV < adversario.potenciaCV) {
            // Ganha o adversario
            return adversario;
        } else {
            // Empate - PotenciaCv

            if (this.cc > adversario.cc) {
                // Ganha o meu carro
                return this;
            } else if (this.cc < adversario.cc) {
                // Ganha o adversario
                return adversario;
            } else {

                // Empate - cc

                if (this.anoFabrico > adversario.anoFabrico) {
                    // Ganha o meu carro
                    return this;
                } else if (this.anoFabrico < adversario.anoFabrico) {
                    // Ganha o adversario
                    return adversario;
                } else {
                    // Empate
                    return null;
                }

            }


        }

    }

    public void ligar() {
        System.out.println("O " + this.marca + " " + this.modelo + " " + this.cor + " está ligado.");
    }

    public void exibirDetalhes() {
        System.out.println(this.marca + " | " + this.modelo + " | " + this.cor + " | " + this.anoFabrico);
    }
}
