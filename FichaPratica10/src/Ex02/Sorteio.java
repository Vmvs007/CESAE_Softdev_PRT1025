package Ex02;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {

    private String nome;
    private double premio;
    private ArrayList<Pessoa> listaParticipantes;

    public Sorteio(String nome, double premio) {
        this.nome = nome;
        this.premio = premio;
        this.listaParticipantes = new ArrayList<Pessoa>();
    }

    public void inscreverParticipante(Pessoa participanteNovo) {
        if (participanteNovo.getIdade() >= 18) {
            this.listaParticipantes.add(participanteNovo);
            System.out.println("Inscrição efetuada com sucesso: " + participanteNovo.getNome());
        } else {
            System.out.println("Inscrição recusada. " + participanteNovo.getNome() + " é menor de idade com " + participanteNovo.getIdade() + " anos.");
        }

    }

    public Pessoa sortear() {
        Random rd = new Random();

        int indexVencedor = rd.nextInt(this.listaParticipantes.size());

        return this.listaParticipantes.get(indexVencedor);
    }

    public void imprimirParticipantes() {
        System.out.println("__________  " + this.nome + " | Grande Prémio de " + this.premio + " €  __________");
        for (Pessoa pessoaAtual : this.listaParticipantes) {
            pessoaAtual.exibirDetalhes();
        }
    }
}
