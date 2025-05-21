package arrays_lists;

import java.util.Scanner;

public class MaiorDaLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[15];
        int maiorValor = Integer.MIN_VALUE;
        int indiceMaior = -1;

        System.out.println("Digite 15 números inteiros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

            if (numeros[i] > maiorValor) {
                maiorValor = numeros[i];
                indiceMaior = i;
            }
        }

        System.out.println("O maior valor é " + maiorValor + " e está na posição (índice) " + indiceMaior + ".");

        sc.close();
    }
}
