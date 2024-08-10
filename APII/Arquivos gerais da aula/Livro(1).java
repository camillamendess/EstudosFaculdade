package modelo;

public class Livro extends Produto {
    private int paginas;
    private String autor;

    public Livro(String name,String autor, double preco, int pag){
        super(name, preco);
        this.paginas = pag;
        this.autor = autor;
    }

    public boolean ehGrande(){
        boolean grande = false;
        if (this.getPaginas() > 200){
            grande = true;
        } 
        return grande;
    }

    public int getPaginas(){
        return this.paginas;
    }

    public void setPaginas(int p){
        this.paginas = p;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String a){
        this.autor = a;
    }

    public String toString(){
        return super.toString() +
        "\nPáginas: " + getPaginas()+
        "\nAutor: " + getAutor();
        }
}
