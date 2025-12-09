import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Audio {

    // Clip visível em toda a classe para poder ser parado noutro método
    private static Clip clip;

    /**
     * Método para correr ficheiros áudio durante a execução do programa
     * @param caminho Caminho para o ficheiro áudio
     */
    public static void playMusic(String caminho) {
        try {
            File audio = new File(caminho);
            if (audio.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(audio);
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
            } else {
                // Poderias aqui mostrar uma mensagem a informar que o ficheiro não foi encontrado
            }
        } catch (Exception e) {
            System.out.println("Erro ao reproduzir áudio: " + e.getMessage());
        }
    }

    /**
     * Método para parar a reprodução do áudio
     */
    public static void stopMusic() {
        try {
            if (clip != null && clip.isRunning()) {
                clip.stop();   // pára o áudio
                clip.close();  // liberta recursos
            }
        } catch (Exception e) {
            System.out.println("Erro ao parar áudio: " + e.getMessage());
        }
    }
}
