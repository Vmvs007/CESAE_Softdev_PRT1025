package Ex10;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("PT5000004445443255", "Joaquim");
        ContaBancaria conta2 = new ContaBancaria("PT5000112233446644", "António");
        ContaBancaria conta3 = new ContaBancaria("PT5000998822114400", "Joana");

        conta1.exibirDetalhes();
        conta2.exibirDetalhes();
        conta3.exibirDetalhes();

        System.out.println("____________________________________________________________________________");

        conta1.depositar(50);
        conta2.depositar(200);

        conta1.exibirDetalhes();
        conta2.exibirDetalhes();
        conta3.exibirDetalhes();

        System.out.println("____________________________________________________________________________");

        conta1.levantar(20);
        conta3.levantar(300);

        conta1.exibirDetalhes();
        conta2.exibirDetalhes();
        conta3.exibirDetalhes();

        System.out.println("____________________________________________________________________________");

        conta2.transferencia(conta3, 15);

        conta1.exibirDetalhes();
        conta2.exibirDetalhes();
        conta3.exibirDetalhes();
    }
}
