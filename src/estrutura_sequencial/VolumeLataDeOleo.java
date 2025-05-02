/*****************************************************************************************************************
* Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
* 		V = 3.14159 * R * R * A
* 		Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
*****************************************************************************************************************/

package estrutura_sequencial;

import java.util.Scanner;

public class VolumeLataDeOleo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		double lata, altura, volume;

		System.out.print("Cálculo de volume de lata de óleo\n\n"); //Porque lata de óleo é especial
		
		
		System.out.print("Digite diâmeto da lata (em cm): ");
		lata = sc.nextDouble()/2;
		
		System.out.print("Digite a altura da lata (em cm): ");
		altura = sc.nextDouble();
		
		
		volume = Math.PI * lata * lata * altura;

		System.out.print("\n O volume da lata é de " + volume + " cm³\n");

        sc.close();
    }
}
