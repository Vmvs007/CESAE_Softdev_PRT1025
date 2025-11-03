package FichaPratica06;

public class BibliotecaMatematica {


    public static int moduloDiferencaInteira(int a, int b) {

        int resultado;

        if (a > b) {
            resultado = a - b;
        } else {
            resultado = b - a;
        }


        return resultado;
    }
}
