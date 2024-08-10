/*Crie um programa em Java que solicite a idade e o nome completo de uma pessoa e
imprima na tela estes dados.*/

import java.util.Scanner;
public class questao2 { 
    private static Scanner texto;
    public static void main(String[] args) {

      texto = new Scanner(System.in);
      String nome;
      int idade;
      System.out.println("Digite seu nome completo e sua idade: ");
      nome = texto.nextLine();
      idade = texto.nextInt();

      System.out.println("Nome = " + nome);
      System.out.println("Idade = " + idade);


  }
}