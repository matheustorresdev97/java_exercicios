package poo.banco_excecoes.banco;

public class ContaInativaException extends OperacaoBancariaException {

    public ContaInativaException(String message) {
        super(message);
    }

    public ContaInativaException(String message, Throwable cause) {
        super(message, cause);
    }

}