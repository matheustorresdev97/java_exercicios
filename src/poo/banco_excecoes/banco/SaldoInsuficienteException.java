package poo.banco_excecoes.banco;

public class SaldoInsuficienteException extends OperacaoBancariaException {

    public SaldoInsuficienteException(String message) {
        super(message);
    }

    public SaldoInsuficienteException(String message, Throwable cause) {
        super(message, cause);
    }

}