package estrutura_sequencial;

import java.util.Scanner;

public class ConverterDolarReal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cotacaoDolar, valorDolar, valorReal;

        System.out.print("Conversor de dólar em real\n\n");

        System.out.print("Digite a cotação do dolar: ");
        cotacaoDolar = sc.nextDouble();

        System.out.print("Digite o valor em dolar: ");
        valorDolar = sc.nextDouble();

        valorReal = cotacaoDolar * valorDolar;

        System.out.print("O Valor em reais é " + valorReal + "\n");

        sc.close();
    }
}
