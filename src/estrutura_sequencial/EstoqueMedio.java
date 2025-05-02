package estrutura_sequencial;

import java.util.Scanner;

public class EstoqueMedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double qtdMin, qtdMax, estoqueMedio;

        System.out.println("Calculadora de Estoque Médio\n\n");

        System.out.print("Digite a quantidade mínima: ");
        qtdMin = sc.nextDouble();

        System.out.print("Digite a quantidade máxima: ");
        qtdMax = sc.nextDouble();

        estoqueMedio = (qtdMin + qtdMax) / 2;

        System.out.println("O estoque médio é: " + estoqueMedio);

        sc.close();
    }

}