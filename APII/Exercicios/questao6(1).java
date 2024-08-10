/*Altere o código da questão 5 para imprimir “Pode entrar” caso a condição seja
falsa.*/

import java.util.Scanner;
public class questao6 {
    private static Scanner texto = new Scanner(System.in);

    public static void main(String[] args){
        
     int idade;
     System.out.println("Qual sua idade?");
     idade = texto.nextInt();
     
     System.out.println("Idade = " + idade);

     if(idade < 18) {
         System.out.println("Não pode entrar!");
        }
     else{
         System.out.println("Pode entrar!");
        }
   }
}