package estrutura_repetitivas;

import java.util.Scanner;

public class NumerosInOutDoIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numerosLidos = 0;

        int in = 0;
        int out = 0;

        System.out.println("Quantos números serão lidos agora? ");
        int repeticoes = sc.nextInt();

        for (int i = 1; i <= repeticoes; i++) { 
                                               
            System.out.println("Digite um número: ");
            numerosLidos = sc.nextInt();

            if (10 >= numerosLidos || numerosLidos <= 20) {
                in = in + 1;
            } else {
                out = out + 1;
            }
        }

        System.out.println("Quantidade de Números In: " + in);
        System.out.println("Quantidade de Números Out: " + out);

        sc.close();
    }
}
