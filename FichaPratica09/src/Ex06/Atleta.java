package Ex06;

public class Atleta {
    private String nome;
    private String modalidadeDesportiva;
    private double altura;
    private double peso;
    private String paisOrigem;
    private int rankingMundial;

    public Atleta(String nome, String modalidadeDesportiva, double altura, double peso, String paisOrigem, int rankingMundial) {
        this.nome = nome;
        this.modalidadeDesportiva = modalidadeDesportiva;
        this.altura = altura;
        this.peso = peso;
        this.paisOrigem = paisOrigem;
        this.rankingMundial = rankingMundial;
    }

    public String getNome() {
        return nome;
    }

    public String getModalidadeDesportiva() {
        return modalidadeDesportiva;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public int getRankingMundial() {
        return rankingMundial;
    }

    public void exibirDetalhes() {
        System.out.println(this.nome + " | " + this.modalidadeDesportiva + " | " + this.paisOrigem + " | Ranking: " + this.rankingMundial);
    }
}
