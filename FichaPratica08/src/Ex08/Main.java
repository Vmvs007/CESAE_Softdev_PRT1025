package Ex08;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Água Vitalis 0.5L",1.5);
        Produto produto2 = new Produto("Batata Vermelha",0.55);
        Produto produto3 = new Produto("Bolachas TUC Presunto",2.15);

        produto1.exibirDetalhes();
        produto2.exibirDetalhes();
        produto3.exibirDetalhes();

        // ____________________________________________
        System.out.println();

        produto1.adquirirStock(10);
        produto2.adquirirStock(250);
        produto3.adquirirStock(2);

        System.out.println();

        produto1.exibirDetalhes();
        produto2.exibirDetalhes();
        produto3.exibirDetalhes();

        // ____________________________________________
        System.out.println();

        produto1.venderProduto(10);
        produto2.venderProduto(100);
        produto3.venderProduto(5);

        System.out.println();

        produto1.exibirDetalhes();
        produto2.exibirDetalhes();
        produto3.exibirDetalhes();

    }
}
