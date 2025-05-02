package estrutura_condicional;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número, podendo ser negativo ou positivo: ");
        double x = sc.nextDouble();

        if (x < 0) {
            System.out.println("O número digitado é NEGATIVO.");
        }
        if (x == 0) {
            System.out.println("O número digitado é um número neutro, é 0.");
        } else {
            System.out.println("O número digitado é um número POSITIVO.");
        }

        sc.close();
    }
}
