package controle;
import modelo.Aluno;

public class ControleAluno {
    Aluno alunos[] = new Aluno[50];
    static int contAluno =0;

    public void cadastrarAluno(String nome, int matricula){
        Aluno a = new Aluno(nome, matricula);
        alunos[contAluno] = a;
        contAluno++;
    }

    public Aluno pesquisarAluno(int mat){
        Aluno a = null;
        for (int i = 0; i<contAluno; i++){
            if(mat == alunos[i].getMatricula()){
                a = alunos[i];
            }
        }
        return a;
    }

    public String imprimirAluno(){
        String res = "";
        for(int i = 0; i < contAluno; i++){
          res += alunos[i].imprimir();
        }
        return res;
      }
      
}
    
