package arrays_lists;

import java.util.Scanner;

public class OrganizaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[6];
        int i, somaP = 0, somaI = 0;

        System.out.println("Digite os números inteiros: ");
        for (i = 0; i < 6; i++) {
            num[i] = sc.nextInt();

            if (num[i] % 2 == 0) {
                somaP += num[i];
            } else {
                somaI += num[i];
            }

            sc.close();
        }
        System.out.print("Os números pares são: ");
        for (i = 0; i < 6; i++) {
            if (num[i] % 2 == 0) {
                System.out.print(num[i] + ";");
            }

        }
        System.out.print("\nOs números impares são: ");
        for (i = 0; i < 6; i++) {
            if (num[i] % 2 != 0) {
                System.out.print(num[i] + ";");
            }
        }

        System.out.println("\nA soma dos numeros pares é: " + somaP);
        System.out.println("A soma dos numeros impares é: " + somaI);

               sc.close();
    }
}
