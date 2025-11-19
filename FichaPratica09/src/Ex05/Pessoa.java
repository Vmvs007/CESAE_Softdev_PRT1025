package Ex05;

public class Pessoa {
    private String nome;
    private int idade;
    private String cidade;
    private String email;
    private int telemovel;

    public Pessoa(String nome, int idade, String cidade, String email, int telemovel) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.email = email;
        this.telemovel = telemovel;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEmail() {
        return email;
    }

    public int getTelemovel() {
        return telemovel;
    }

    public void exibirDetalhes() {
        System.out.println(this.nome + " | " + this.email + " | " + this.telemovel + " | " + this.cidade);
    }
}
