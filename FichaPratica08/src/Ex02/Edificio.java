package Ex02;

public class Edificio {
    private String nome;
    private String rua;
    private String cidade;
    private String corFachada;
    private int numAndares;
    private boolean garagem;

    public Edificio(String nome, String rua, String cidade, String corFachada, int numAndares, boolean garagem) {
        this.nome = nome;
        this.rua = rua;
        this.cidade = cidade;
        this.corFachada = corFachada;
        this.numAndares = numAndares;
        this.garagem = garagem;
    }

    public String getNome() {
        return nome;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCorFachada() {
        return corFachada;
    }

    public int getNumAndares() {
        return numAndares;
    }

    public boolean hasGaragem() {
        return garagem;
    }

    public void setCorFachada(String corFachada) {
        this.corFachada = corFachada;
    }
}
