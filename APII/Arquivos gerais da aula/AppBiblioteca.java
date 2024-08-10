package visao;
import controle.ControleUsuario;
import controle.ControleLivro;
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
        "\n 5 - Listar empréstimo";
    }

    public static void main(String[] args){
        System.out.println(menu());
    }
}
