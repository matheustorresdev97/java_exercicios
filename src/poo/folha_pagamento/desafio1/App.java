package poo.folha_pagamento.desafio1;

public class App {
    public static void main(String[] args) {
        FolhaPagamento folhaPagamento = new FolhaPagamento();

        double salarioDevido = folhaPagamento.calcularSalario(160, 10,
                51.8, 60.5);

        System.out.printf("Salário devido: R$ %.2f%n", salarioDevido);
    }
}
