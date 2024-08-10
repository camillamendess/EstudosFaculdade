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
      this.numeroMaximoAluno = numeroMaximoAluno;
	}
	
  	public String imprimir(){
		return getCodigo() + " - " + getDisciplina() + "\nAlunos matriculados: " +
		getQtdAluno();
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
  
	public String getDisciplina(){
      return disciplina;
	}

  	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
  
	public Aluno[] getAlunos(){
      return alunos;
	}
	
  	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
}