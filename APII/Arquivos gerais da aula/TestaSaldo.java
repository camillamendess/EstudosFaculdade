import java.util.ArrayList;
import java.util.Scanner;

import modelo.Conta;
import modelo.ContaCorrente;

public class TestaSaldo {

    public static String menu(){
        return "1 - Depositar" +
        "\n2 - Sacar" +
        "\n3 - Consultar Saldo" +
        "\n4 - Adicionar Conta" +
        "\n5 - Excluir Conta" +
        "\n0 - Sair";
    }

    public static void main(String[] args) throws Exception {
        /*Conta c1 = new ContaCorrente();
        c1.sacar(200);*/

        Scanner entrada = new Scanner(System.in); 
        System.out.println("O que deseja fazer?");
        int op = entrada.nextInt();
        while(op != 0){
            switch(op){
                case 1:{
                    System.out.println("Qual o número da conta?");
                    int num = entrada.nextInt();
                    Conta c1 = new ContaCorrente();
                    System.out.println("Qual o valor?");
                    double valor = entrada.nextDouble();
                    c1.depositar(valor);
                    break;
                }
                case 2:{
                    System.out.println("Qual o valor?");
                    double valor = entrada.nextDouble();
                    Conta c1 = new ContaCorrente();
                    c1
                }
            }
        }
        
    }
}
