package estrutura_sequencial;

import java.util.Scanner;

/*****************************************************************************************************************
 * 5) Efetuar o cálculo da quantidade de litros de combustível gasta em uma
 * viagem, utilizando um automóvel que faz
 * 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto
 * na viagem e a velocidade média.
 * Desta forma, será possível obter a distância percorrida com a fórmula
 * DISTANCIA = TEMPO * VELOCIDADE.
 * Tendo o valor da distância, basta calcular a quantidade de litros de
 * combustível utilizada na viagem com a
 * fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os
 * valores da velocidade média,
 * tempo gasto, a distância percorrida e a quantidade de litros utilizada na
 * viagem. Dica: trabalhe com valores reais.
 *****************************************************************************************************************/

public class VelocidadeMedia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double velocidadeMedia, tempoGasto, autonomia = 12;
        double distancia, litrosUsados;

        System.out.print("Programa de cálculo da quantidade de litros de combustível gasta em uma viagem\n\n");

        System.out.print("Por favor, digita o tempo que você gastou em sua viagem (horas): ");
        tempoGasto = sc.nextDouble();

        System.out.print("Por favor, agora digite o Velocidade Média em que você fez o percurso (Km/h): ");
        velocidadeMedia = sc.nextDouble();

        distancia = velocidadeMedia * tempoGasto;
        litrosUsados = distancia / autonomia;

        System.out.print("\n\n\nResultados:\n\n");
        System.out.print("Velocidade média = " + velocidadeMedia + " Km/h\n");
        System.out.print("Tempo gasto = " + tempoGasto + " horas\n");
        System.out.print("Distancia Percorrida = " + distancia + " Km\n");
        System.out.print("Quantidade de Combustível utilizado: " + litrosUsados + " litros\n");

        sc.close();
    }
}
