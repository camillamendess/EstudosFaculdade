class Aluno{
    
    String nome;
    long matricula;
    static int qtd = 0;
    
    public Aluno(String nome, long matricula){
        this.nome = nome;
        this.matricula = matricula;
        qtd++;
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
    
    public void setMatricula(long matricula){
        this.matricula = matricula;
    }
    
}