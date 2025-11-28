package ZooCasting.Animais;

public class Hipopotamo extends Animal{

    private double envergaduraBoca;

    public Hipopotamo(String nome, boolean genero, double peso, String cor, double envergaduraBoca) {
        super(nome, genero, peso, cor);
        this.envergaduraBoca = envergaduraBoca;
    }

    public void banharLama(){
        if(super.nome.equals("Moto Moto")){
            System.out.println("I think Moto Moto likes you \uD83D\uDC40");
        }else{
            System.out.println("Tomar banho de lama");
        }

    }

    @Override
    public void fazerBarulho() {
        System.out.println("UHHHHHHHHHHHHHHHHHHHH");
    }
}
