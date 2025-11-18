package Ex01;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Joaquim",30,1.7);
        Pessoa pessoa2 = new Pessoa("António",40,1.66);

        System.out.println(pessoa1.getNome());

        System.out.println(pessoa2.getNome());
    }
}
