package poo.folha_pagamento2;

import poo.folha_pagamento2.rh.Funcionario;
import poo.folha_pagamento2.rh.Holerite;
import poo.folha_pagamento2.rh.Programador;

public class App {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("João", 40);
        System.out.println(funcionario1);
        Holerite holerite1 = funcionario1.gerarHolerite(180, "jul/2022");
        holerite1.imprimir();

        System.out.println();

        Programador programador1 = new Programador("Maria", 80);
        programador1.setValorBonus(1000);
        System.out.println(programador1);
        Holerite holerite2 = programador1.gerarHolerite(180, "jul/2022");
        holerite2.imprimir();
    }
}
