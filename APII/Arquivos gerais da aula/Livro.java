package modelo;

public class Livro{
    private int codigo;
    private String titulo;
    private String editora;
    private long issn;

    public Livro(int c, String t, String e, long ss){
        this.setCodigo(codigo);
        this.setTitulo(t);
        this.setEditora(e);
        this.setIssn(ss);
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setCodigo(int c){
        this.codigo = c;
    }

    public String getTitulo(){
        return this.titulo;
    }
    
    public void setTitulo(String t){
        this.titulo = t;
    }

    public String getEditora(){
        return this.editora;
    }

    public void setEditora(String e){
        this.editora = e;
    }

    public long getIssn(){
        return issn;
    }

    public void setIssn(long i){
        this.issn = i;
    }
}