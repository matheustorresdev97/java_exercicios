package arrays_lists;

import java.util.Scanner;

public class QuantidadeNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Insira um número: ");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                contador++;
            }
        }

        System.out.println();
        System.out.println("Seu array possui " + contador + " números negativos");

        sc.close();
    }
}
