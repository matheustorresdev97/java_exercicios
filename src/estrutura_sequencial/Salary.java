package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int registration;
        double hours, valuehour;

        System.out.println("Qual é o seu número de registro?");
        registration = sc.nextInt();
        System.out.println("Quantas horas você trabalhou?");
        hours = sc.nextDouble();
        System.out.println("Quanto você ganha por hora?");
        valuehour = sc.nextDouble();

        double salary = (hours * valuehour);

        System.out.println();
        System.out.println("Registration: " + registration);
        System.out.printf("Total Salary: U$ %.2f %n", salary);

        sc.close();
    }
}
