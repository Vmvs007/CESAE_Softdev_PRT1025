package Ex02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Logger loggerPrograma = Logger.getInstance("app_log.txt");
        loggerPrograma.log("Log 1: Variável x = 15");
        loggerPrograma.log("Log 2: Variável y = 20");

        Logger myLogger = Logger.getInstance("my_log.txt");
        myLogger.log("Log 3: Utilizar carregou no botão");
        myLogger.log("Log 4: Variável nome = Joaquim");

        loggerPrograma.log("Log 5: Objeto criado");

    }
}
