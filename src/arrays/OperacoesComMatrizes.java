package arrays;

import java.util.Scanner;

public class OperacoesComMatrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matriz1[][] = new int[2][2];
        int matriz2[][] = new int[2][2];
        int matriz3[][] = new int[2][2];

        int l = 0, c = 0, opcoes;
        String constante;

        for (l = 0; l < matriz1.length; l++) {
            for (c = 0; c < matriz1.length; c++) {
                System.out.println("Digite os valores da primeira matriz: ");
                matriz1[l][c] = sc.nextInt();
            }
        }

        for (l = 0; l < matriz2.length; l++) {
            for (c = 0; c < matriz2.length; c++) {
                System.out.println("Digite os valores da segunada matriz: ");
                matriz2[l][c] = sc.nextInt();
            }
        }

        System.out.println(
                "Escolha uma opção: \n1-Soma \n2-Subtração \n3-Adicionar uma constante as duas matrizes \n4-imprimir as matrizes");
        opcoes = sc.nextInt();

        if (opcoes == 1) {
            for (l = 0; l < matriz1.length; l++) {
                for (c = 0; c < matriz1.length; c++) {
                    matriz3[l][c] = matriz1[l][c] + matriz2[l][c];
                    System.out.println("A soma da matriz1 e a matriz2 é: " + matriz3[l][c]);
                }
            }
        }

        if (opcoes == 2) {
            for (l = 0; l < matriz1.length; l++) {
                for (c = 0; c < matriz1.length; c++) {
                    matriz3[l][c] = matriz1[l][c] - matriz2[l][c];
                    System.out.println("A subtração entre matriz1 e a matriz2 é: " + matriz3[l][c]);
                }
            }
        }

        if (opcoes == 3) {
            System.out.println("Digite uma constante: ");
            constante = sc.next();
            for (l = 0; l < matriz1.length; l++) {
                for (c = 0; c < matriz1.length; c++) {
                    System.out.println("A constante adicionada é: " + matriz3[l][c] + constante);
                }
            }
        }

        if (opcoes == 4) {
            for (l = 0; l < matriz1.length; l++) {
                for (c = 0; c < matriz1.length; c++) {
                    System.out.println("Os valores das matriz1 é:  " + matriz1[l][c]);
                }
            }

            for (l = 0; l < matriz2.length; l++) {
                for (c = 0; c < matriz2.length; c++) {
                    System.out.println("Os valores das matriz2 é:  " + matriz2[l][c]);
                }
            }
        }

        sc.close();
    }
}
