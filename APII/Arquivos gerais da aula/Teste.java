package conta;
import java.util.Scanner;

public class Teste {

    public static void main(String[] Arg){

        Scanner entrada = new Scanner(System.in);

        Conta c1 = new Conta();

        System.out.println("Digite o seu nome completo: ");
        c1.cliente = entrada.nextLine();

        System.out.println("Digite o número da sua conta: ");
        c1.numConta = entrada.nextInt();
        
        System.out.println("Digite o identificador: ");
        c1.identificador = entrada.nextInt();

        System.out.println("Qual o saldo atual da conta?");
        c1.saldo = entrada.nextDouble();
        
        
        System.out.println("\nO que você deseja fazer? Digite: \n 1 - Depositar\n 2 - Sacar\n 3 - Consultar o Saldo\n 4 - Transferir\n 5 - Ver dados da conta\n 0 - Encerrar");
        int num = entrada.nextInt();

        while (num != 0){
            switch(num){
                case 1:
                    c1.depositar();
                    break;
                case 2:
                    c1.sacar();
                    break;
                case 3:
                    c1.consultar();
                    break;
                case 4:
                    c1.transferir();
                    break;
                case 5:
                    c1.dadosConta();
                    break;
                default:
                break;
            }
            System.out.println("\nVocê deseja fazer algo novamente?\n 1 - Sim\n 2 - Não");
            int num2 = entrada.nextInt();
            if (num2 == 1){
                System.out.println("\nO que você deseja fazer? Digite: \n 1 - Depositar\n 2 - Sacar\n 3 - Consultar o Saldo\n 4 - Transferir\n 5 - Ver dados da conta\n 0 - Encerrar");
                num = entrada.nextInt();
            }
            else {
                break;
            }
        }

        System.out.println("Encerrado.");
        

        entrada.close();

    }
    
}
