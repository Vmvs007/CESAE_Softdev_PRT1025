package Ex01;

import java.util.ArrayList;

public class MusicPlayer {
    private String criador;
    private ArrayList<Musica> programacaoMusical;

    public MusicPlayer(String criador) {
        this.criador = criador;
        this.programacaoMusical = new ArrayList<Musica>();
    }

    public void adicionarMusica(Musica musicaNova) {
        this.programacaoMusical.add(musicaNova);
    }

    public void removerMusica(int indexRemover) {
        this.programacaoMusical.remove(indexRemover);
    }

    public void removerMusica(Musica musicaRemover) {
        this.programacaoMusical.remove(musicaRemover);
    }

    public void trocarMusica(int index1, int index2) {

        Musica musica1 = this.programacaoMusical.get(index1);
        Musica musica2 = this.programacaoMusical.get(index2);

        this.programacaoMusical.set(index1, musica2);
        this.programacaoMusical.set(index2, musica1);
    }

    public void limparProgramacao() {
        this.programacaoMusical.clear();
    }

    public void calcularDuracaoTotal() {
        int segundosTotais = 0;

        for (Musica musicaAtual : this.programacaoMusical) {
            segundosTotais += musicaAtual.getDuracaoSegundos();
        }

        int horas, minutos, segundos;

        horas = segundosTotais / 3600;
        minutos = (segundosTotais / 60)-(horas*60) ;
        segundos = segundosTotais-(horas*3600)-(minutos*60);

        System.out.println(horas + ":" + minutos + ":" + segundos);

    }

    public void imprimirRelatorio() {
        System.out.println("\n*_*_*_*_*_*_*_*_*_* PLAYLIST | " + this.criador + " *_*_*_*_*_*_*_*_*_*");

        for (Musica musicaAtual : this.programacaoMusical) {
            musicaAtual.exibirDetalhes();
        }

//        for (int i = 0; i < this.programacaoMusical.size(); i++) {
//            this.programacaoMusical.get(i).exibirDetalhes();
//        }
    }
}
