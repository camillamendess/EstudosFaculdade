package modelo;

public class SaldoInsuficienteException extends Exception { // Quando herda diretamente de Exception, tem que tratar no main
    public SaldoInsuficienteException(double valor) {
        super("Saldo insuficiente para sacar o valor de: " + valor);
    }
}


