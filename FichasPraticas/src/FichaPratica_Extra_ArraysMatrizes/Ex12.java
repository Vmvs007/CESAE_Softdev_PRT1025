package FichaPratica_Extra_ArraysMatrizes;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr1 = new int[8];
        int[] arr2 = new int[8];

        // Preencher o primeiro array
        System.out.println("Preencher o primeiro array:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("arr1[" + i + "] = ");
            arr1[i] = input.nextInt();
        }

        // Preencher o segundo array
        System.out.println("\nPreencher o segundo array:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("arr2[" + i + "] = ");
            arr2[i] = input.nextInt();
        }

        // Contar quantos valores estão presentes em ambos os arrays
        int comuns = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    boolean jaContado = false;
                    // evitar duplicar valores iguais
                    for (int k = 0; k < i; k++) {
                        if (arr1[k] == arr1[i]) {
                            jaContado = true;
                            break;
                        }
                    }
                    if (!jaContado) {
                        comuns++;
                    }
                    break;
                }
            }
        }

        // Criar o novo array com o tamanho certo
        int[] intersecao = new int[comuns];

        // Preencher o array da interseção
        int p = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    boolean jaInserido = false;
                    // evitar duplicar o mesmo valor
                    for (int k = 0; k < p; k++) {
                        if (intersecao[k] == arr1[i]) {
                            jaInserido = true;
                            break;
                        }
                    }
                    if (!jaInserido) {
                        intersecao[p] = arr1[i];
                        p++;
                    }
                    break;
                }
            }
        }

        // Mostrar os resultados
        System.out.println("\nArray 1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }

        System.out.println("\nArray 2:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }

        System.out.println("\nValores comuns aos dois arrays:");
        if (intersecao.length == 0) {
            System.out.println("(nenhum valor em comum)");
        } else {
            for (int i = 0; i < intersecao.length; i++) {
                System.out.println("intersecao[" + i + "] = " + intersecao[i]);
            }
        }

    }
}
