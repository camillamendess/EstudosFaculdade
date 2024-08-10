// O código nos mostra um menu e a opção 1 cadastra o aluno

import java.util.Scanner;

public class AppAcademico2{
  
	public static String menu(){
		return "Digite:\n" +
		"1 - Cadastrar aluno \n" +
		"2 - Cadastrar turma \n" +
		"3 - Matricular aluno \n" +
		"4 - Listar alunos da turma\n" +
		"5 - Cadastrar disciplina \n" +
		"0 - para sair";
	}
	
  	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
      	int op;
		final int NUM_ALUNOS = 10; // Essa linha indica a variavel de número máximo do array
        final int NUM_TURMAS = 4;
      	Turma turmas[] = new Turma[NUM_TURMAS];
		Aluno alunos[] = new Aluno[NUM_ALUNOS];
		int contAluno = 0;
      	int contTurmas = 0;
		System.out.println(menu());
		op = teclado.nextInt();
		while (op!=0){
			switch (op){
				case 1:{ // Cadastrar aluno
				    System.out.println("Digite o nome do aluno"); 
				    String nome = teclado.next(); 
				    Aluno a = new Aluno (nome); // instancia um novo objeto toda vez que cadastra um novo aluno
				    alunos[contAluno]=a;        // aumenta o número de alunos, incrementando um a mais dentro do array Alunos 
				    contAluno++;
				    System.out.println("Aluno cadastrado: \n" + a.imprimir() + "\n");
				    break;
				}
              	case 2:{ // Cadastrar turma
                    System.out.println("Digite o código e disciplina da turma");
                    int codigo = teclado.nextInt();
                    String disciplina = teclado.next();
                    Turma t = new Turma (codigo, disciplina);
                    turmas[contTurmas] = t;
                    contTurmas++;
                    System.out.println("Turma cadastrada: \n" + t.imprimir() + "\n");
                    break;                  
                }
                case 3:{ // Matricular aluno
                                       
                }
				case 4:{ // Listar alunos da turma
					System.out.println("Lista de alunos: ");
					for (int i = 0; i<contAluno; i++){
						System.out.println((i+1) + " - " + alunos[i].getNome() + "\n");
					}
				}
				case 5:{ // Cadastrar Disciplina
					System.out.println("Digite o nome da disciplina e codigo");
					String nome = teclado.next();
					Long codigo = teclado.nextLong();
					Disciplina d = new Disciplina(nome, codigo);
					System.out.println("Disciplina " + d.getCodigo() + " - " + d.getNome() + " cadastrada");
				}
				default:{
					break;
				}
               
			}
          
		System.out.println(menu());
		op = teclado.nextInt();
		}

		teclado.close();
	}
}