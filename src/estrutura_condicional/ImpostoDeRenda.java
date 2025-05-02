package estrutura_condicional;

import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu salário?");
        double salario = sc.nextDouble();

        if (salario >= 0 && salario <= 2000) { // PARTE 1: ISENTA
            System.out.println("O imposto de renda para esse salário é ISENTO.");
        }

        else if (salario <= 3000) { // PARTE 2: APLICA 8 %
            double imposto = ((salario - 2000) * 0.08);
            System.out.printf("O imposto de renda para esse salário é: R$ %.2f %n", imposto);
        }

        else if (salario <= 4500) { // PARTE 3 = APLICA 18 %
            double imposto = ((salario - 3000) * 0.18) + (1000 * 0.08);
            System.out.printf("O imposto de renda para esse salarío é: R$ %.2f %n", imposto);
        }

        else if (salario > 4500) { // PARTE 4 = APLICA 28 %
            double imposto = ((salario - 4500) * 0.28) + (1500 * 0.18) + (1000 * 0.08);
            System.out.printf("O imposto de renda para esse salarío é: R$ %.2f %n", imposto);
        }

        sc.close();
    }
}
