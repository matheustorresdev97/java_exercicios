package poo.seguradora;

import poo.seguradora.modelo.Caminhao;
import poo.seguradora.modelo.CarroParticular;
import poo.seguradora.modelo.ImovelResidencial;
import poo.seguradora.servico.ServicoPropostaSeguro;

public class App {
    public static void main(String[] args) {
        ServicoPropostaSeguro servicoPropostaSeguro = new ServicoPropostaSeguro();

        CarroParticular carro = new CarroParticular("HR-V", 2022, 150_000);
        Caminhao caminhao = new Caminhao("Actros", 2021, 780_000, 4);
        ImovelResidencial imovel = new ImovelResidencial(2_300_000, 320);

        servicoPropostaSeguro.emitir(carro);
        servicoPropostaSeguro.emitir(caminhao);
        servicoPropostaSeguro.emitir(imovel);
    }
}
