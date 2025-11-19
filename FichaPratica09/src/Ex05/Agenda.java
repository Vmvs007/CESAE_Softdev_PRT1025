package Ex05;

public class Agenda {
    private int anoCriacao = 2025;
    private Pessoa[] contactos;

    public Agenda(int quantidadeContactos) {
        this.contactos = new Pessoa[quantidadeContactos];
    }

    public void adicionarContacto(Pessoa pessoaNova) {

        for (int i = 0; i < this.contactos.length; i++) {
            if (this.contactos[i] == null) {
                this.contactos[i] = pessoaNova;
                return;
            }
        }
    }

    public void pesquisarContactosCidade(String cidadePesquisa) {
        System.out.println("\n_____ AGENDA: " + cidadePesquisa + " _____");

        for (int i = 0; i < this.contactos.length; i++) {

            if (this.contactos[i] != null ) {

                if(this.contactos[i].getCidade().equals(cidadePesquisa)){
                    this.contactos[i].exibirDetalhes();
                }

            }
        }
    }

    public void exibirDetalhes() {
        System.out.println("\n_____ AGENDA _____");
        System.out.println("Data Criação: " + this.anoCriacao + "\n");

        for (int i = 0; i < this.contactos.length; i++) {

            if (this.contactos[i] != null) {
                this.contactos[i].exibirDetalhes();
            } else {
                return;
            }


        }

    }
}
