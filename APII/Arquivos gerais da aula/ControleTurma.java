package controle;
import modelo.Turma;
import modelo.Aluno;

public class ControleTurma {
    Turma turmas[] = new Turma[10];
    static int contTurma = 0;

    public void cadastrarTurma(int codigo, String disciplina){
        Turma t = new Turma(codigo, disciplina);
        turmas[contTurma] = t;
    }

    public Turma pesquisarTurma(int code){
        Turma t = null;
        for(int i = 0; i<contTurma; i++){
            if (code == turmas[i].getCodigo()){
                t = turmas[i];
            }
        }
        return t;
    }

    public void matricularAluno(Aluno a, int code){
        Turma t = null;
        for(int i = 0; i<contTurma; i++){
            if (code == turmas[i].getCodigo()){
                t = turmas[i];
                t.matricular(a);
            }
        }

        if (t.matricular(a) == true){
            System.out.println("Aluno matriculado: \n" + a.getNome());
        }
    }
}
