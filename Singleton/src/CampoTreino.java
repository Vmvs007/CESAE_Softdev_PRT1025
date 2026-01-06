public class CampoTreino {

    public CampoTreino() {
    }

    public void treinarHeroi() {
        Heroi heroi = Heroi.getInstance();
        System.out.println(heroi.getNome()+" esteve a treinar");
        heroi.setForca(heroi.getForca() + 10);
    }

    public void descansarHeroi() {
        Heroi heroi = Heroi.getInstance();
        System.out.println(heroi.getNome()+" esteve a descansar");
        heroi.setVida(heroi.getVida() + 25);
    }

}
