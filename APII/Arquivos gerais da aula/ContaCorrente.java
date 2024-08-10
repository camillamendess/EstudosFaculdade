package modelo;
public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(){
        super (0,0);
        this.limite=0;
    }

    public ContaCorrente (int numero, double saldo, double limite){
        super (numero, saldo);
        this.limite=limite;
    }

    @Override
    public String getTipo() {
        return "Conta Corrente";
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    @Override
    public String toString(){
        return getTipo() + "\n" + super.toString() + "\nLimite: " + limite;
    }
}