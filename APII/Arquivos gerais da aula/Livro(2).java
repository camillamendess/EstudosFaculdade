package modelo;

public class Livro{
    private int codigo;
    private String titulo;
    private String editora;
    private long issn;

    public Livro(String titulo, int codigo, String editora){
        this.setCodigo(codigo);
        this.setTitulo(titulo);
        this.setEditora(editora);
        this.issn = 0;
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

    public String imprimir(){
        return "\nTitulo: " + this.getTitulo()
        + "\nCódigo do Livro: " + this.getCodigo()
        + " \nEditora: " + this.getEditora()
        + " \nISSN: " + this.getIssn();
    }
}