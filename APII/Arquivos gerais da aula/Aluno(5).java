class Aluno{
    
    private String nome;
    private static int estatico = 0;
    private int matricula;
    private static int qtd = 0;
    private int disc = 0;
    private String disciplinas[];
    
    public Aluno(String nome){
        this.nome = nome;
        estatico++;
        this.matricula = estatico;
        qtd++;
        disciplinas = new String[20];
    }

    public void cadastrarDisciplina(String disciplina){
        disciplinas[disc] = disciplina;
        disc++;
    }

    public void imprimirDisciplinas(){
        for(int i = 0; i<disc; i++){
            System.out.println(" - " + disciplinas[i]);
        }
    }

    public void imprimir(){
        System.out.println("Nome: " + this.getNome() + " \nMatrícula: " + this.getMatricula());  
    }

    public String[] getDisciplina(){
        return disciplinas; 
    }

    public int getQuantidadeAluno(){
        return qtd;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public long getMatricula(){
        return this.matricula;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
}