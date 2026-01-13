package DemonstracaoInterfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<AnimalTerrestre> animaisDaTerra = new ArrayList<AnimalTerrestre>();
        ArrayList<AnimalAquatico> animaisDoMar = new ArrayList<AnimalAquatico>();

        Elefante dumbo = new Elefante("Dumbo",1500,"África");
        Crocodilo croc = new Crocodilo("Croc",500,"África",true);

        Golfinho golfy = new Golfinho("Golfy",400,"América");

        animaisDaTerra.add(dumbo);
        animaisDaTerra.add(croc);

        for (AnimalTerrestre animalTerrestreAtual: animaisDaTerra){
            animalTerrestreAtual.andar();
        }


        animaisDoMar.add(golfy);
        animaisDoMar.add(croc);

        for(AnimalAquatico animalAquaticoAtual : animaisDoMar){
            animalAquaticoAtual.mergulhar();
        }



    }
}
