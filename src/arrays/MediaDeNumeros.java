package arrays;

import java.util.Scanner;

public class MediaDeNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[12];
        double sum = 0;

        System.out.println("Digite 12 números:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numbers[i] = sc.nextDouble();
            sum += numbers[i];
        }

        double average = sum / numbers.length;

        int countAboveAverage = 0;
        for (double number : numbers) {
            if (number > average) {
                countAboveAverage++;
            }
        }

        System.out.println("Média dos valores: " + average);
        System.out.println("Quantidade de números acima da média: " + countAboveAverage);

        sc.close();
    }
}
