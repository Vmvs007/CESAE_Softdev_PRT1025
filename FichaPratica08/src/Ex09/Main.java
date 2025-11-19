package Ex09;

public class Main {
    public static void main(String[] args) {

        Funcionario joaquim = new Funcionario("Joaquim", "quim@mail.pt", "IT", 5000);

        joaquim.exibirDetalhes();

        joaquim.aumentarSalario(10);

        System.out.println("________________________________");

        joaquim.exibirDetalhes();

    }
}
