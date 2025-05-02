/*******************************************************************************
* 10) Escrever um programa que leia dois números inteiros e mostre todos os 
* relacionamentos de ordem existentes entre eles. Os relacionamentos possíveis 
* são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.
*******************************************************************************/

package estrutura_sequencial;

import java.util.Scanner;

public class RelacionamentosNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primeiroN, segundoN;
        boolean igual = false, diferente = false, maior = false, menor = false, maiorOuIgual = false,
                menorOuIgual = false;

        System.out.print("Mostrador de relacionamentos\n\n");

        System.out.print("Digite o primeiro número:  ");
        primeiroN = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        segundoN = sc.nextInt();

        if (primeiroN == segundoN)
            igual = true;
        if (primeiroN != segundoN)
            diferente = true;
        if (primeiroN > segundoN)
            maior = true;
        if (primeiroN < segundoN)
            menor = true;
        if (primeiroN >= segundoN)
            maiorOuIgual = true;
        if (primeiroN <= segundoN)
            menorOuIgual = true;

        System.out.println("\nIgual = " + igual);
        System.out.println("Não Igual = " + diferente);
        System.out.println("Maior = " + maior);
        System.out.println("Menor = " + menor);
        System.out.println("Maior ou igual = " + maiorOuIgual);
        System.out.println("Menor ou igual = " + menorOuIgual);

        sc.close();
    }
}
