package DemonstracaoObject;

public class MainMotores {
    public static void main(String[] args) {

        Carro ferrari = new Carro("Ferrari", "SF90", 900, 4000, 25);
        Mota bmw1000 = new Mota("BMW", "1000R", "Tour", 1000, 25);


        if(ferrari.equals(bmw1000)){
            System.out.println("Iguais");
        }else{
            System.out.println("Diferentes");
        }
    }
}
