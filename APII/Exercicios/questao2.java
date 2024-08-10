/*Crie um programa em Java que solicite a idade e o nome completo de uma pessoa e
imprima na tela estes dados.*/

import java.util.Scanner;
public class IdadeNome { 
    public static void main(String[] args) {

      Scanner texto = new Scanner(System.in);
      String nome;
      int idade;
      System.out.println("Digite seu nome completo e sua idade: ");
      nome = texto.nextLine();
      idade = texto.nextInt();

      System.out.println("Idade = " + idade);
      System.out.println("Nome = " + nome);


  }
}