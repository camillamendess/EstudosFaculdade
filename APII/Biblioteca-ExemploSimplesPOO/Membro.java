public class Membro {
  // Atributos privados para encapsulamento
  private String nome;
  private String id;
  private int livrosEmprestados;

  // Construtor para inicializar os atributos
  public Membro(String nome, String id) {
      this.nome = nome;
      this.id = id;
      this.livrosEmprestados = 0; // Inicialmente, o membro não tem livros emprestados
  }

  // Métodos getter para acessar os atributos privados
  public String getNome() {
    return nome;
  }
    // Métodos setter para modificar os atributos privados
  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public int getLivrosEmprestados() {
    return livrosEmprestados;
  }

  public void setLivrosEmprestados(int livrosEmprestados) {
    this.livrosEmprestados = livrosEmprestados;
  }

  // Método para incrementar o número de livros emprestados
  public void emprestarLivro() {
      livrosEmprestados++;
  }

  // Método para decrementar o número de livros emprestados
  public void devolverLivro() {
      livrosEmprestados--;
  }
}
