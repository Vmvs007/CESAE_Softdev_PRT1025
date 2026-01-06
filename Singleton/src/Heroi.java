public class Heroi {

    private static Heroi instance;

    private String nome;
    private int vida;
    private int forca;

    private Heroi(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public static Heroi getInstance(String nome, int vida, int forca){
        if(instance==null){
            instance= new Heroi(nome,vida,forca);
        }

        return instance;
    }

    public static Heroi getInstance() {
        return instance;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void exibirDetalhes() {
        System.out.println(this.nome + " | Vida: " + this.vida + " | Força: " + this.forca);
    }
}
