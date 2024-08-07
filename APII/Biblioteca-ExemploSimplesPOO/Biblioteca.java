import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    // Listas para armazenar os livros e membros da biblioteca
    private List<Livro> livros;
    private List<Membro> membros;

    // Construtor para inicializar as listas
    public Biblioteca() {
        livros = new ArrayList<>();
        membros = new ArrayList<>();
    }

    // Método para adicionar um livro à biblioteca
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    // Método para adicionar um membro à biblioteca
    public void adicionarMembro(Membro membro) {
        membros.add(membro);
    }

    // Método para buscar um livro pelo ISBN
    public Livro buscarLivroPorIsbn(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null; // Retorna null se o livro não for encontrado
    }

    // Método para buscar um membro pelo ID
    public Membro buscarMembroPorId(String id) {
        for (Membro membro : membros) {
            if (membro.getId().equals(id)) {
                return membro;
            }
        }
        return null; // Retorna null se o membro não for encontrado
    }

    // Método para emprestar um livro a um membro
    public void emprestarLivro(String isbn, String membroId) {
        Livro livro = buscarLivroPorIsbn(isbn);
        Membro membro = buscarMembroPorId(membroId);

        if (livro != null && membro != null && livro.isDisponivel()) {
            livro.emprestar();
            membro.emprestarLivro();
        } else {
            System.out.println("Emprestimo não pode ser realizado.");
        }
    }

    // Método para devolver um livro de um membro
    public void devolverLivro(String isbn, String membroId) {
        Livro livro = buscarLivroPorIsbn(isbn);
        Membro membro = buscarMembroPorId(membroId);

        if (livro != null && membro != null && !livro.isDisponivel()) {
            livro.devolver();
            membro.devolverLivro();
        } else {
            System.out.println("Devolução não pode ser realizada.");
        }
    }
}
