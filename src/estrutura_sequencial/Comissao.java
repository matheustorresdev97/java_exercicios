package estrutura_sequencial;

import java.util.Scanner;

/*************************************************************************
 * 3) Faça um programa para pagamento de comissão de vendedores de peças,
 * levando-se em consideração que sua comissão será de 5% do total da venda
 * e que você tem os seguintes dados:
 * - Identificação do vendedor
 * - Código da peça
 * - Preço unitário da peça
 * - Quantidade vendida
 * 
 *************************************************************************/

public class Comissao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Programa para pagamento de comissão de vendedores de peças.\n\n"); // Why so specific?!

        int idVendedor, idPeca;
        float precoPeca, qtd, valorComissao, porcentagem = 0.05f;

        System.out.print("Digite a identificação do vendedor: ");
        idVendedor = sc.nextInt();

        System.out.print("Digite o ID da Peça: ");
        idPeca = sc.nextInt();

        System.out.print("Digite o preço unitário da peça: ");
        precoPeca = sc.nextFloat();

        System.out.print("Digite a quantidade de peças vendidas: ");
        qtd = sc.nextFloat();

        valorComissao = (precoPeca * qtd) * porcentagem;

        System.out.printf("O vendedor de id, " + idVendedor + "vendeu a peça " + idPeca
                + "O valor da comissão é de %.2f reais.\n", valorComissao);

        sc.close();
    }
}
