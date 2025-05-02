/*******************************************************************************
*  Escreva um programa que leia um número inteiro e exiba o seu módulo.
*   O módulo de um número x é:
*   x se x é maior ou igual a zero
*   x * (-1) se x é menor que zero
*******************************************************************************/

package estrutura_sequencial;

import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, moduloNumero;

        System.out.print("Módulo de Número\n\n"); 

        System.out.print("Digite um número inteiro:  ");
        n = sc.nextInt();

        moduloNumero = (n < 0) ? moduloNumero = n * (-1) : n;

        System.out.print("O módulo do número é " + moduloNumero + "\n");

        sc.close();

    }
}
