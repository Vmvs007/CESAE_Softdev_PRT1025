package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.BibliotecaInput.*;
import static FichaPratica06.BibliotecaMatematica.*;

public class Demonstracao {


    public static void main(String[] args) {

        int numero1, numero2, total;


        numero1 = lerInteiroPositivo(); // 20
        System.out.println();
        numero2 = lerInteiroPositivo(); // 90

        total = moduloDiferencaInteira(numero1, numero2); // 70
        System.out.println("Total: " + total);

    }
}
