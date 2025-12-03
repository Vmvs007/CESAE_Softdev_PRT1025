import java.util.Scanner;

import static java.lang.Thread.sleep;

public class MainAudio {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("O programa começou");

        Audio.playMusic("AudioFiles/super_mario_theme.wav");

        Scanner input = new Scanner(System.in);

        sleep(3000);
        Audio.playMusic("AudioFiles/sonic_ring_effect.wav");

        System.out.println("Depois do sleep");


        System.out.println("Enter para fechar");
        input.nextLine();
    }
}