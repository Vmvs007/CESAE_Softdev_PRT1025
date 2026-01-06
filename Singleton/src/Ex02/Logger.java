package Ex02;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private static Logger instance;

    private String nomeFicheiro;

    private Logger(String nomeFicheiro) {
        this.nomeFicheiro = nomeFicheiro;
    }

    public static Logger getInstance(String nomeFicheiro) {
        if (instance == null) {
            instance = new Logger(nomeFicheiro);
        }

        return instance;
    }

    public void log(String mensagemLog) throws IOException {
        FileWriter fw = new FileWriter(this.nomeFicheiro, true);
        fw.write(mensagemLog + "\n");
        fw.close();
    }
}
