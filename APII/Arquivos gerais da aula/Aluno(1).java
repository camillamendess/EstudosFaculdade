package Academico;

class Aluno{
    
    String nome;
    static int estatico = 0;
    int matricula;
    static int qtd = 0;
    int disc = 0;
    String disciplinas[];
    static String disciplina;
    
    public Aluno(String nome){
        this.nome = nome;
        estatico++;
        this.matricula = estatico;
        qtd++;
    }

    public int getQuantidadeAluno(){
        return qtd;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public long getMatricula(){
        return matricula;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
}