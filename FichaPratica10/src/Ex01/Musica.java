package Ex01;

public class Musica {
    private String titulo;
    private String genero;
    private String artista;
    private int duracaoSegundos;

    public Musica(String titulo, String genero, String artista, int duracaoSegundos) {
        this.titulo = titulo;
        this.genero = genero;
        this.artista = artista;
        this.duracaoSegundos = duracaoSegundos;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public void exibirDetalhes() {
        System.out.println(this.titulo + " | " + this.genero + " | " + this.artista + " | Duração: " + this.duracaoSegundos + " s.");
    }
}
