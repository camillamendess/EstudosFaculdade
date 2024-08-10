public class Turma {
  
	private int codigo;
    Disciplina disciplina;
    private Aluno alunos[];
    static int numeroMaximoAluno;
    private int cont=0;

	public Turma (int codigo, String disciplina){
		Disciplina d = new Disciplina(disciplina, codigo);
		this.codigo = codigo;
		this.disciplina = d;
		numeroMaximoAluno = 10;
		alunos = new Aluno[numeroMaximoAluno];
	 } 
	 
	 public void matricular(Aluno a){
		 if (cont<numeroMaximoAluno){
			 alunos[cont]=a;
			 cont++;
		 }
	 }
	 
	 public String imprimir(){
		 return getCodigo()+ " - " + getDisciplina() + "\nAlunos matriculados: " + getQtdAluno();
	 }
  
  	public int getQtdAluno(){
      return cont;
	}
	  
	public int getNumMaxAluno(){
      return numeroMaximoAluno;
	}
  
	public int getCodigo() {
      return codigo;
	}
  
	public void setCodigo(int codigo) {
      this.codigo = codigo;
	}
  
	public Disciplina getDisciplina(){
      return disciplina;
	}

  	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
  
	public Aluno[] getAlunos(){
        return alunos;
	}
	
  	public void setAlunos(Aluno[] alunos) {
	    this.alunos = alunos;
	}
}
