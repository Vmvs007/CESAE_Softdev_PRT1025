package Ex07;

public class Aluno {
    private String nome;
    private int idade;
    private String email;
    private String curso;
    private double media;

    public Aluno(String nome, int idade, String email, String curso, double media) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.curso = curso;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void felizAniversario() {
        this.idade++;
    }

    public boolean situacaoAprovacao() {
        if (this.media >= 9.5) {
            return true;
        } else {
            return false;
        }
    }

    public void exibirDetalhes() {
        System.out.println("\n_____ ALUNO _____");
        System.out.println(this.nome + " | " + this.email + " | Idade: " + this.idade);
        System.out.println(this.curso + " | Média: " + this.media);
    }
}
