package Ex06;

public class Competicao {

    private String nomeCompeticao;
    private String pais;
    private Atleta[] listaParticipantes;

    public Competicao(String nomeCompeticao, String pais, int limiteInscritos) {
        this.nomeCompeticao = nomeCompeticao;
        this.pais = pais;
        this.listaParticipantes = new Atleta[limiteInscritos];
    }

    public void inscreverAtleta(Atleta atletaNovo) {
        for (int i = 0; i < this.listaParticipantes.length; i++) {
            if (this.listaParticipantes[i] == null) {
                this.listaParticipantes[i] = atletaNovo;
                return;
            }
        }
    }

    public void listarInscritos() {
        System.out.println("_____ " + this.nomeCompeticao + " | " + this.pais + " _____");

        for (int i = 0; i < this.listaParticipantes.length; i++) {
            if (this.listaParticipantes[i] != null) {
                this.listaParticipantes[i].exibirDetalhes();
            }
        }
    }

    public void atletasDaCasa() {

        System.out.println("_____ ATLETAS DA CASA | " + this.pais + " _____");

        for (int i = 0; i < this.listaParticipantes.length; i++) {
            if (this.listaParticipantes[i] != null && this.listaParticipantes[i].getPaisOrigem().equals(this.pais)) {
                this.listaParticipantes[i].exibirDetalhes();
            }
        }
    }


}
