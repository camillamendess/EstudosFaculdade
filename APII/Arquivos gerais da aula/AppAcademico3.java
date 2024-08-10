package visao;
import java.util.Scanner;
import controle.ControleAluno;
import controle.ControleTurma;

public class AppAcademico3 {
    
    public static String menu(){
        return " 1 - Cadastrar Aluno\n" +
        " 2 - Cadastrar turma\n" +
        " 3 - Matricular Aluno\n" +
        " 4 - Listar alunos da Turma\n" +
        " 5 - Cadastrar Disciplina\n" +
        " 0 - Sair";
    }

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        ControleTurma cT = new ControleTurma();
        ControleAluno cA = new ControleAluno();
        int op;
        System.out.println(menu());
        op = teclado.nextInt();

        while (op!=0){
            switch (op){
                case 1:{ // cadastrar aluno
                    System.out.println("Digite o nome do aluno e a matricula: ");
                    String nome = teclado.next();
                    int mat = teclado.nextInt();
                    cA.cadastrarAluno(nome, mat);
                    System.out.println("Aluno cadastrado.");
                    break;
                }
                case 2:{ // cadastrar turma
                    System.out.println("Digite o código da turma e a disciplina");
                    int codigo = teclado.nextInt();
                    String disciplina = teclado.next();
                    cT.cadastrarTurma(codigo, disciplina);
                    System.out.println("Turma cadastrada.");
                    break;
                }
                case 3:{ // Matricular aluno
                    System.out.println("Digite a matricula do aluno e o codigo da turma: \n");
                    int mat = teclado.nextInt();
                    int cod = teclado.nextInt();
                    cT.matricularAluno(cA.pesquisarAluno(mat), cod);
                    break;

                }
                case 4:{

                }
            }
            System.out.println(menu());
            op = teclado.nextInt();
        }
        teclado.close();
    }
}
