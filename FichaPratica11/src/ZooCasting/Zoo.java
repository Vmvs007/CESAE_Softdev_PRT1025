package ZooCasting;

import ZooCasting.Animais.*;

import java.util.ArrayList;

public class Zoo {

    private String nome;
    private String pais;
    private ArrayList<Animal> animaisDoZoo;

    public Zoo(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
        this.animaisDoZoo = new ArrayList<Animal>();
    }

    public void adicionarAnimal(Animal animalNovo) {
        this.animaisDoZoo.add(animalNovo);
    }

    public void exaltar() {
        for (Animal animalAtual : this.animaisDoZoo) {
            animalAtual.fazerBarulho();
        }
    }

    public void diadia(){
        for (Animal animalAtual: this.animaisDoZoo){

            // ELEFANTE
            if(animalAtual instanceof Elefante){
                Elefante elefanteAtual  = (Elefante) animalAtual;
                elefanteAtual.comerTromba();
            }

            // LEAO
            if(animalAtual instanceof Leao){
               Leao leaoAtual = (Leao) animalAtual;
               leaoAtual.dormir20h();
            }

            // SURICATA
            if(animalAtual instanceof Suricata){
                ((Suricata) animalAtual).vigiar();
            }

            // HIPOPOTAMO
            if(animalAtual instanceof Hipopotamo){
                ((Hipopotamo) animalAtual).banharLama();
            }
        }
    }
}
