package estrutura_sequencial;

import java.util.Scanner;

public class AnoEmDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idadeAnos, idadeMeses, idadeDias, idadeTotalDias;

        System.out.print("Calculadora de idade em dias\n\n");

        System.out.print("Digite os anos: ");
        idadeAnos = sc.nextInt();

        System.out.print("Digite os meses: ");
        idadeMeses = sc.nextInt();

        System.out.print("Digite os dias: ");
        idadeDias = sc.nextInt();

        idadeTotalDias = idadeAnos * 365 + idadeMeses * 30 + idadeDias;
        System.out.print("Idade total em dias = " + idadeTotalDias + "\n");

        sc.close();
    }
}
