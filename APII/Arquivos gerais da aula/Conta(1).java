package modelo;

import java.util.ArrayList;

public abstract class Conta {
    ArrayList<Conta> contas = new ArrayList<>();
    private int numero;
    private double saldo;

    public Conta(){
        this.numero=0;
        this.saldo=0;
    }
    public Conta(int numero, double saldo){
        this.numero=numero;
        this.saldo=saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException(valor);
            }
    }

    public void adicionarConta(){
        
    }

    public Conta pesquisarConta(int num){
        Conta a = null;
        for(int i = 0; i<contas.size(); i++){
            if (num == contas.get(i).getNumero()){
                a = contas.get(i);
            } 
        }
        return a;
    }

    public void depositar(double valor){
        if (valor < 0){
            saldo += valor;
        } else {
            throw new IllegalArgumentException("Valor de depósito inválido");
        }
    }

    public abstract String getTipo();

    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString(){
        return "Numero: " + numero +
        "\nSaldo: " + saldo;
    }
    }