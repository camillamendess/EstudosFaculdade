package visao;
import controle.ControleUsuario;
import controle.ControleLivro;

import java.util.Scanner;

import controle.ControleEmprestimo;
import modelo.Livro;
import modelo.Usuário;
import modelo.Emprestimo;

public class AppBiblioteca {
    
    public static String menu(){
        return "\n 1 - Cadastrar livro" +
        "\n 2 - Cadastrar usuário" +
        "\n 3 - Cadastrar empréstimo" +
        "\n 4 - Remover empréstimo" +
        "\n 5 - Listar empréstimo" +
        "\n 0 - Sair";
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        ControleEmprestimo controleEmprestimo = new ControleEmprestimo();
        ControleLivro controleLivro = new ControleLivro();
        ControleUsuario controleUsuario = new ControleUsuario();
        System.out.println("O que deseja fazer?");
        System.out.println(menu());
        int opcao = teclado.nextInt();

        while(opcao != 0){
            switch(opcao){
                case 1:{
                    System.out.println("Digite o titulo:");
                    String titulo = teclado.next();
                    System.out.println("Digite o código:");
                    int codigo = teclado.nextInt();
                    System.out.println("Digite a editora:");
                    String editora = teclado.next();
                    Livro livro = new Livro(titulo, codigo, editora);
                    controleLivro.addLivro(livro);
                    System.out.println(controleLivro.imprimir());
                    break;

                }
                case 2:{
                    System.out.println("Digite o usuário:");
                    String nome = teclado.next();
                    System.out.println("Digite o cpf:");
                    String cpf = teclado.next();
                    System.out.println("Digite o endereço:");
                    String address = teclado.next();
                    System.out.println("Digite a profissão:");
                    String job = teclado.next();
                    Usuário usuario = new Usuário(nome, cpf, address, job);
                    controleUsuario.addUsuario(usuario);
                    System.out.println(controleUsuario.imprimir());
                    break;
                }
                case 3:{
                    System.out.println("Digite o codigo do Emprestimo:");
                    long codigo = teclado.nextLong();
                    System.out.println("Digite a data de Emprestimo:");
                    String dataEmp = teclado.next();
                    System.out.println("Digite a data de Devolução:");
                    String dataDev = teclado.next();
                    Emprestimo emprestimo = new Emprestimo(codigo, dataEmp, dataDev);
                    controleEmprestimo.novoEmprestimo(emprestimo);
                    System.out.println(controleEmprestimo.imprimir());
                    break;
                }
                case 4:{
                    System.out.println("Digite o código do Emprestimo que quer remover:");
                    long codigo = teclado.nextLong();
                    controleEmprestimo.removerEmp(codigo);
                    System.out.println("Emprestimo removido.");
                    break;
                }
                case 5:{
                    System.out.println(controleEmprestimo.imprimir());
                }
                default:{
                    break;
                }
            }
            System.out.println("Deseja fazer outra coisa?");
            System.out.println(menu());
            opcao = teclado.nextInt();
        }
        teclado.close();
    }
}
