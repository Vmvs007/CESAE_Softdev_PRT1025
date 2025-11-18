package Ex06;

public class Livro {
    private String titulo;
    private String autor;
    private String categoria;
    private int numPaginas;
    private String isbn;

    public Livro(String titulo, String autor, String categoria, int numPaginas, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.numPaginas = numPaginas;
        this.isbn = isbn;
    }

    public void exibirDetalhes() {
        System.out.println(this.titulo + " | " + this.autor + " | " + this.categoria + " | Núm. Páginas: " + this.numPaginas + " | ISBN: " + this.isbn);
    }
}
