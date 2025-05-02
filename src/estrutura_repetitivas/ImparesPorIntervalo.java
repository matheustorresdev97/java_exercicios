package estrutura_repetitivas;

import java.util.Scanner;

public class ImparesPorIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor inteiro de X: ");
        int X = sc.nextInt();

        for (int i = 0; i <= X; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }

        }

        sc.close();
    }
}
