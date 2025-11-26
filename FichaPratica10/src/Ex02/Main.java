package Ex02;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoaA = new Pessoa("Joaquim", 32, 911222333, "quim@mail.pt");
        Pessoa pessoaB = new Pessoa("António", 8, 922333444, "tone@mail.pt");
        Pessoa pessoaC = new Pessoa("Joana", 25, 933222111, "joana@mail.pt");
        Pessoa pessoaD = new Pessoa("Luis", 40, 911999888, "luis@mail.pt");
        Pessoa pessoaE = new Pessoa("Maria", 15, 911999888, "luis@mail.pt");
        Pessoa pessoaF = new Pessoa("Jackson", 50, 923444555, "jack@mail.pt");
        Pessoa pessoaG = new Pessoa("Gabriel", 28, 999888777, "gabriel@mail.pt");

        Sorteio rifas = new Sorteio("Rifas Natal Associação Desportiva Freixo de Espada à Cinta", 5000);
        rifas.inscreverParticipante(pessoaA);
        rifas.inscreverParticipante(pessoaB);
        rifas.inscreverParticipante(pessoaC);
        rifas.inscreverParticipante(pessoaD);
        rifas.inscreverParticipante(pessoaE);
        rifas.inscreverParticipante(pessoaF);
        rifas.inscreverParticipante(pessoaG);

        System.out.println();

        rifas.imprimirParticipantes();

        System.out.println("\nGRANDIOSO/A VENCEDOR");
        Pessoa vencedorSorteio = rifas.sortear();
        vencedorSorteio.exibirDetalhes();


    }
}
