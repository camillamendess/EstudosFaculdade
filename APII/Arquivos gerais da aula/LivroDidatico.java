package modelo;

public class LivroDidatico extends Livro {
    String disciplina;

    public LivroDidatico(String disc, String name, String autor, double preco, int pag){
        super(name, autor, preco, pag);
        this.disciplina = disc;
    }

    public String getDisciplina(){
        return this.disciplina;
    }

    public void setDisciplina(String disc){
        this.disciplina = disc;
    }

    public boolean ehCaro(){
        boolean caro = false;
        if(getPreco() > 200){
            caro = true;
        }
        return caro;
    }
}
