public class Main {
    public static void main(String[] args) {

        Universo maria = Universo.getInstance(10, 150, 900);
        maria.exibirDetalhes();

        Universo manel = Universo.getInstance(50,500,2500);
        manel.exibirDetalhes();
    }
}
