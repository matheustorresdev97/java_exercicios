package estrutura_sequencial;

import java.util.Scanner;

public class ConverteFahrParaCelsios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.print("Conversor de temperatura: Graus Fahrenheit -> Graus Celsius\n\n");

        System.out.print("Digite a temperatura em Fahrenheit: ");
        fahrenheit = sc.nextDouble();

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.print("\n A medida convertida é " + celsius + "ºC\n");

        sc.close();
    }
}
