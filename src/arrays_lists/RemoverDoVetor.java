package arrays_lists;

import java.util.Scanner;

public class RemoverDoVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        boolean encontrado = false;

        System.out.println("Vetor original:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        System.out.print("Digite um número para remover do vetor: ");
        int numeroParaRemover = sc.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroParaRemover) {
                encontrado = true;

                for (int j = i; j < vetor.length - 1; j++) {
                    vetor[j] = vetor[j + 1];
                }
                break;
            }
        }

        if (encontrado) {
            System.out.println("Vetor após a remoção:");
            for (int i = 0; i < vetor.length - 1; i++) {
                System.out.print(vetor[i] + " ");
            }
        } else {
            System.out.println("Número não encontrado no vetor.");
        }

        sc.close();
    }
}
