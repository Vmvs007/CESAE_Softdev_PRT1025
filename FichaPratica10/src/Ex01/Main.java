package Ex01;

public class Main {
    public static void main(String[] args) {

        Musica m1 = new Musica("The Scientist", "Rock Alternativo", "Coldplay", 260);
        Musica m2 = new Musica("Garagem da Vizinha", "Pimba", "Quim Barreiros", 300);
        Musica m3 = new Musica("Evidencias", "Sertanejo", "Chitão", 180);
        Musica m4 = new Musica("Californication", "Rock", "Red Hot Chilli Peppers", 220);
        Musica m5 = new Musica("Sonho de Menino", "Heavy Metal", "Tony Carreira", 360);
        Musica m6 = new Musica("Sinfonia de Beethoven", "Clássica", "Beethoven", 4000);

        MusicPlayer mp = new MusicPlayer("Turma Softdev");
        mp.adicionarMusica(m2);
        mp.adicionarMusica(m3);
        mp.adicionarMusica(m4);
        mp.adicionarMusica(m5);
        mp.adicionarMusica(m1);
        mp.adicionarMusica(m6);


        mp.calcularDuracaoTotal();

    }
}
