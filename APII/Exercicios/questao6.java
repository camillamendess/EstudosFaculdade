import java.util.Scanner;

/*Altere o código da questão 5 para imprimir “Pode entrar” caso a condição seja
falsa.*/

public class questao6 {
    public static void main(String[] args){
        
        Scanner texto = new Scanner(System.in);
        int idade;
        System.out.println("Qual sua idade?");
        idade = texto.nextInt();

        if(idade < 18) {
            System.out.println("Não pode entrar!");
        }
        else{
            System.out.println("Pode entrar!");
        }
    }
}