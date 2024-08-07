public class Livro {
  // Atributos privados para encapsulamento
  private String titulo;
  private String autor;
  private String isbn;
  private boolean disponivel;

  // Construtor para inicializar os atributos
  public Livro(String titulo, String autor, String isbn) {
    this.titulo = titulo;
    this.autor = autor;
    this.isbn = isbn;
    this.disponivel = true; // Inicialmente, o livro está disponível
  }

  // Métodos getter e setter para acessar e modificar os atributos privados
  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public boolean isDisponivel() {
    return disponivel;
  }

  public void setDisponivel(boolean disponivel) {
    this.disponivel = disponivel;
  }

  // Método para emprestar o livro
  public void emprestar() {
      if (disponivel) {
          disponivel = false; // Marca o livro como não disponível
          System.out.println(titulo + " foi emprestado.");
      } else {
          System.out.println(titulo + " não está disponível.");
      }
  }

  // Método para devolver o livro
  public void devolver() {
      disponivel = true; // Marca o livro como disponível
      System.out.println(titulo + " foi devolvido.");
  }
}
