/*
toda conta tem alguns atributos comuns a todas as contas criadas, são eles:
número da conta;
titular da conta (cliente/usuário);
saldo;
identificador de região (é um número inteiro que é exibido junto ao número da conta para identificá-la).*/

package conta;
import java.util.Scanner;

public class Conta {

    Scanner entrada = new Scanner(System.in);

    // atributos
    int numConta;
    String cliente;
    double saldo;
    int identificador;
    double valor;

    

    /*
    uma função para depositar um valor na conta;
    uma função para sacar um valor na conta;
    uma função para consultar o saldo da conta;
    uma função para transferir um valor de uma conta para outra;
    uma função que retorne uma string e descreva todas as informações importantes da conta.*/

    // métodos

    void depositar(){
        System.out.println("Quanto você deseja depositar? ");
        valor = entrada.nextDouble();
        System.out.println("Depositado " + valor + " em sua conta.");
        saldo = this.saldo + valor;
    }

    void sacar(){
        System.out.println("Quanto deseja sacar? ");
        valor = entrada.nextDouble();
        if (valor < this.saldo){
            System.out.println("Sacando R$" + valor);
            saldo = this.saldo - valor;
        }
        else {
            System.out.println("SALDO INSUFICIENTE");
        }
    }

    void consultar(){
        System.out.println("O saldo atual da conta é R$ " + this.saldo);
    } 

    void transferir(){

        Conta cNew = new Conta();

        System.out.println("Digite o nome completo do cliente: ");
        cNew.cliente = entrada.nextLine();

        System.out.println("Digite o número da conta de destino da transferência: ");
        cNew.numConta = entrada.nextInt();
        
        System.out.println("Digite o identificador da conta: ");
        cNew.identificador = entrada.nextInt();

        System.out.println("Qual o valor para transferir?");
        valor = entrada.nextDouble();

        if (valor < saldo){
            System.out.print("Foi transferido R$" + valor + " para: \nConta: ");
            System.out.println(cNew.numConta + " \nCliente: " + cNew.cliente + " \nIdentificador: " + cNew.identificador);
            saldo = this.saldo - valor;
            cNew.saldo = valor;
        }
        else {
            System.out.println("SALDO INSUFICIENTE!");
        }

    }

    void dadosConta(){
        System.out.println("Número da Conta: " + this.numConta);
        System.out.println("Cliente: " + this.cliente);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Identificador: " + this.identificador);
    }
}