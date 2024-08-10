import java.util.Scanner;
public class AppAcademico{
    public static String menu(){
        return "\nDigite:\n" +
        "1 - Cadastrar aluno \n"+
        "2 - Adicionar disciplina \n"+
        "3 - Imprimir lista de disciplinas do aluno\n"+
        "4 - Imprimir dados de um aluno\n"+
        "0 - para sair";
    }
    public static void main(String[] args) {
        Aluno alunos[]= new Aluno[10];
        int contAluno=0;
        int op;
        Scanner teclado = new Scanner (System.in);
        System.out.println(menu());
        op = teclado.nextInt();
        while (op!=0 && contAluno<10){
            switch (op){
                case 1:{//Cadastrar Aluno
                    String nome;
                    System.out.print("Digite o nome do aluno: ");
                    nome = teclado.next();
                    alunos[contAluno]= new Aluno(nome);
                    contAluno++;
                    System.out.println("Aluno criada com sucesso!");
                    break;
                }
                case 2:{//Adicionar discipllina
                    System.out.print("Digite a matricula do aluno: ");
                    int matricula = teclado.nextInt();
                    System.out.print("Digite o nome da disciplina: ");
                    String disciplina = teclado.next();
                    alunos[matricula].cadastrarDisciplina(disciplina);
                    System.out.println("Disciplina adiciona com sucesso!");
                    break;
                }
                case 3:{//Imprimir lista de disciplinas
                    System.out.println("Deseja ver a lista de disciplinas de qual aluno? Digite a matricula:");
                    int mat = teclado.nextInt();
                    System.out.println("Disciplinas do aluno:");
                    alunos[mat].imprimirDisciplinas();
                    break;

                }
                case 4: {//Imprimir dados de um aluno
                    System.out.println("Deseja ver dados de qual aluno? Digite a matricula:");
                    int mat = teclado.nextInt();
                    System.out.println("Dados do aluno: ");
                    alunos[mat-1].imprimir();
                    break;
                }
            }
            System.out.println(menu());
            op = teclado.nextInt();
        }
        teclado.close();
    }
}