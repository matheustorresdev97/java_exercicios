package estrutura_sequencial;

import java.util.Scanner;

public class ConverteCelsiosParaFahr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.print("Conversor de temperatura: Graus Celsios -> Fahrenheit\n\n");

        System.out.print("Digite a temperatura em Celsius: ");
        celsius = sc.nextDouble();

        fahrenheit = (9 * celsius + 160) / 5;

        System.out.print("\n A medida convertida é " + fahrenheit + "ºF\n");

        sc.close();
    }
}
