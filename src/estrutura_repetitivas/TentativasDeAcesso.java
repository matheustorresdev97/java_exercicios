package estrutura_repetitivas;

import java.util.Scanner;

public class TentativasDeAcesso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Senha:");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Inválida. Tente Novamente.");
            System.out.println("Digite a Senha:");
            senha = sc.nextInt();

        }

        System.out.println("Acesso Permitido.");

        sc.close();
    }
}
