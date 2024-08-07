public class Main {
    public static void main(String[] args) {
        // Criação de uma nova biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Criação de novos livros
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "123456789");
        Livro livro2 = new Livro("Harry Potter", "J.K. Rowling", "987654321");

        // Criação de novos membros
        Membro membro1 = new Membro("Alice", "001");
        Membro membro2 = new Membro("Bob", "002");

        // Adicionando livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        // Adicionando membros à biblioteca
        biblioteca.adicionarMembro(membro1);
        biblioteca.adicionarMembro(membro2);

        // Emprestando livros
        biblioteca.emprestarLivro("123456789", "001");
        biblioteca.emprestarLivro("987654321", "002");

        // Devolvendo livros
        biblioteca.devolverLivro("123456789", "001");
        biblioteca.devolverLivro("987654321", "002");
    }
}
