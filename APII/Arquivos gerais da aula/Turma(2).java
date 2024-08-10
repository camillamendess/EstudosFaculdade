package modelo;

public class Turma {
    private int codigo;
    private String disciplina;
    private Aluno alunos[];
    private int numeroMaximoAluno;
    private int cont=0;

    public Turma (int codigo, String disciplina){
        this.codigo = codigo;
        this.disciplina = disciplina;
    }
    public Turma (int codigo, String disciplina, int numeroMaximoAluno){
        this.codigo = codigo;
        this.disciplina = disciplina;
    }

    public String imprimir(){
        return getCodigo() + " - " + getDisciplina() + "\nAlunos matriculados:\n" + getQuatAluno();
    }

    public int getQuatAluno(){
        return this.cont;
    }

    public int getNumMaxAluno(){
        return this.numeroMaximoAluno;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getDisciplina(){
        return this.disciplina;
    }

    public void setDisciplina(String disc){
        this.disciplina = disc;
    }

    public Aluno[] getAlunos(){
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public boolean matricular(Aluno a){
        Aluno aluno[] = new Aluno[10];
        boolean matriculado = false;
        for (int i = 0; i<cont; i++){
            if (aluno[i] == a){
                matriculado = true;
                break;
            } 
        }
        return matriculado;
    }
}