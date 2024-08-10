package modelo;

public class Emprestimo {
    public long codigo;
    private String data_emprestimo;
    private String data_devolucao;
    private Livro livro;
    private Usuário usuario;

    public Emprestimo(long c, String d1, String d2){
        this.setCodigo(c);
        this.setData_emprestimo(d1);
        this.setData_devolucao(d2);
    }

    public void addLivro(Livro a){
        this.livro = a;
    }

    public void addUsuario(Usuário p){
        this.usuario = p;
    }

    public long getCodigo(){
        return this.codigo;
    }

    public void setCodigo(long c){
        this.codigo = c;
    }

    public String getData_emprestimo(){
        return this.data_emprestimo;
    }

    public void setData_emprestimo(String d){
        this.data_emprestimo = d;
    }

    public String getData_devolucao(){
        return this.data_devolucao;
    }

    public void setData_devolucao(String d2){
        this.data_devolucao = d2;
    }

    public Livro getLiv(){
        return this.livro;
    }

    public void setLiv(Livro a){
        this.livro = a;
    }

    public Usuário getUsuario(){
        return this.usuario;
    }

    public void setUsuario(Usuário p){
        this.usuario = p;
    }

    public String imprimir(){
        return "Código de emprestimo: " + this.getCodigo()
        + " \nData de empréstimo: " + this.getData_emprestimo()
        + " \nData de devolução: " + this.getData_devolucao() + "\n";
    }
}
