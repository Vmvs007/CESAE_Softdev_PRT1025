package ZooCasting;

import ZooCasting.Animais.Elefante;
import ZooCasting.Animais.Hipopotamo;
import ZooCasting.Animais.Leao;
import ZooCasting.Animais.Suricata;

public class Main {
    public static void main(String[] args) {

        Elefante trombas = new Elefante("Trombas", true, 1500, "Cinza", 2);

        Leao simba = new Leao("Simba", true, 350, "Amarelo");
        Leao nala = new Leao("Nala", false, 290, "Amarelo");

        Suricata timon = new Suricata("Timon", true, 1, "Castanho", 20);
        Suricata timone = new Suricata("Timone", false, 0.9, "Castanho Claro", 18);

        Hipopotamo popota = new Hipopotamo("Popota", false, 900, "Roxa", 1);
        Hipopotamo motomoto = new Hipopotamo("Moto Moto", true, 1600, "Cinzento", 2.5);


        Zoo logico = new Zoo("Lógico", "Porto");
        logico.adicionarAnimal(trombas);
        logico.adicionarAnimal(simba);
        logico.adicionarAnimal(nala);
        logico.adicionarAnimal(timon);
        logico.adicionarAnimal(timone);
        logico.adicionarAnimal(popota);
        logico.adicionarAnimal(motomoto);

        logico.diadia();
    }
}
