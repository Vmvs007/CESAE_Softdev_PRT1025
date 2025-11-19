package Ex05;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Joaquim", 32, "Porto", "quim@mail.pt", 911222333);
        Pessoa pessoa2 = new Pessoa("António", 20, "Lisboa", "tone@mail.pt", 922333444);
        Pessoa pessoa3 = new Pessoa("Joana", 25, "Porto", "joana@mail.pt", 933222111);
        Pessoa pessoa4 = new Pessoa("Luis", 40, "Braga", "luis@mail.pt", 911999888);

        Agenda minhaAgenda = new Agenda(20);

        minhaAgenda.adicionarContacto(pessoa1);
        minhaAgenda.adicionarContacto(pessoa2);
        minhaAgenda.adicionarContacto(pessoa3);
        minhaAgenda.adicionarContacto(pessoa4);

        minhaAgenda.pesquisarContactosCidade("Porto");
    }
}
