import java.io.FileNotFoundException;

public class MainAscii {
    public static void main(String[] args) throws FileNotFoundException {

        FileTools.printFile("AsciiFiles/castle.txt");

        System.out.println("\n");

        FileTools.printFile("AsciiFiles/dino.txt");
    }
}
