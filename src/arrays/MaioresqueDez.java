package arrays;

import java.util.Scanner;

public class MaioresqueDez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double matriz[][] = new double[3][3];
        int l, c, cont = 0;

        for (l = 0; l < 3; l++) {
            for (c = 0; c < 3; c++) {
                System.out.println("Digite os valores da Matriz: ");
                matriz[l][c] = sc.nextDouble();

                if (matriz[l][c] > 10) {
                    cont++;
                }
            }
        }
        System.out.println("existem " + cont + " valores maiores que 10");

        sc.close();
    }
}
