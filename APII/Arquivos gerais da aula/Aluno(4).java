package modelo;

public class Aluno {
    private String nome;
    private int matricula;
    private static int cont = 0;

    public Aluno(String nome, int matricula){
        this.nome = nome;
        matricula = ++cont;
        this.matricula = matricula;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public String imprimir(){
        return this.getMatricula() + ": " + this.getNome();
    }
}
