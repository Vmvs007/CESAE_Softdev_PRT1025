package FichaPratica06;

public class Ex03 {

    /**
     * Função que analisa um número e retorna se é par ou impar
     * @param num Número a ser analisado
     * @return true se par || false se ímpar
     */
    public static boolean parImpar(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Função que analisa um número e retorna se é positivo ou negativo
     * @param num Número a ser analisado
     * @return true se positivo || false se negativo
     */
    public static boolean positivoNegativo(int num) {
        if (num >= 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Função que analisa um número e retorna se é primo ou não
     * @param num Número a ser analisado
     * @return true se primo || false se não primo
     */
    public static boolean primo(int num) {
        for (int divisor = 2; divisor < num; divisor++) {
            if (num % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Função que analisa um número e retorna se é perfeito ou não
     * @param num Número a ser analisado
     * @return true se perfeito || false se não perfeito
     */
    public static boolean perfeito(int num){
        // TODO: Corpo da função incompleto
        return true;
    }

    /**
     * Função que analisa um número e retorna se é triangular ou não
     * @param num Número a ser analisado
     * @return true se triangular || false se não triangular
     */
    public static boolean triangular(int num){
        // TODO: Corpo da função incompleto
        return true;
    }
}
