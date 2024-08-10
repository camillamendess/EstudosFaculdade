public class Disciplina {
    String nome;
    long codigo;

    public Disciplina (String nome, long codigo){
		this.nome=nome;
        this.codigo=codigo;
	}

  	public String getNome(){
		return nome;
	}

  	public void setNome(String nome){
		this.nome = nome;
	}

  	public long getCodigo(){
		return codigo;
	}
	
  	public String imprimir (){
		return this.getNome() + ":" + this.getCodigo();
	}
}
