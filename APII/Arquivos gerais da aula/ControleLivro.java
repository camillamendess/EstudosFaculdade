package controle;
import modelo.Livro;

public class ControleLivro {
    private Livro livro[];
    private int contLivro;

    public ControleLivro(){
        this.livro = new Livro[10];
        contLivro = 0;
    }

    public void addLivro(Livro l) {
        this.livro[contLivro] = l;
        this.contLivro++;
    }
}
