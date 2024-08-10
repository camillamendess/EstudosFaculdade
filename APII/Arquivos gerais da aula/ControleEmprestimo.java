package controle;
import modelo.Emprestimo;
import modelo.Livro;
import modelo.Usuário;

public class ControleEmprestimo {
    private Emprestimo emprestimos[];
    private int contEmprestimo;
    private ControleUsuario usuarios;
    private ControleLivro livros;

    public ControleEmprestimo(){
        this.emprestimos = new Emprestimo[10];
        contEmprestimo = 0;
        this.usuarios = new ControleUsuario();
        this.livros = new ControleLivro();
        
    }

    public void novoEmprestimo(Emprestimo e){
        this.emprestimos[this.contEmprestimo] = e;
        this.contEmprestimo++;
        
    }

    public void adicionarUsuario(Usuário u){
        this.usuarios.addUsuario(u);
    }

    public void adicionarLivro(Livro l){
        this.livros.addLivro(l);
    }

    public Emprestimo pesquisarEmp(int cod){
        Emprestimo a = null;
        for (int i = 0; i < contEmprestimo; i++){
            if (cod == emprestimos[i].getCodigo()){
                a = emprestimos[i];
                break;
            }
        }
        return a;
    }

    public void removerEmp(long cod){
        for (int i = 0; i < this.contEmprestimo; i++){
            if (this.emprestimos[i].getCodigo() == cod){
                this.emprestimos[i] = this.emprestimos[this.contEmprestimo];
                this.contEmprestimo--;
            }
        }
    }

    public String imprimir(){
        String res = " ";
        for (int i = 0; i < this.contEmprestimo; i++){
            res += emprestimos[i].imprimir() + "\n";
        }
        return res;
    }
}
