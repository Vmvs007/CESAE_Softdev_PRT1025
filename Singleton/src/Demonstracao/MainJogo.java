package Demonstracao;

public class MainJogo {
    public static void main(String[] args) {

        Heroi quim = Heroi.getInstance("Quim", 100, 20);
        quim.exibirDetalhes();

        CampoTreino ct = new CampoTreino();
        ct.treinarHeroi();

        quim.exibirDetalhes();

        Aventura av = new Aventura();
        av.armadilha();

        quim.exibirDetalhes();

        Heroi joaquim = Heroi.getInstance("Joaquim", 200, 50);
        joaquim.exibirDetalhes();
    }
}
