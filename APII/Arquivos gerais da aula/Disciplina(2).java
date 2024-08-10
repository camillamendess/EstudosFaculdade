import dados.DisciplinaDados;
import java.io.IOException;
import java.util.ArrayList;

/* 1-b) Significa que esse objeto pode ser serialiazado, ou seja, os objetos dessa clase poderão
 ser gravados em um arquivo. */

public class Disciplina implements Serializable {
    private String nome;
    private int codigo;
    private int cargaHoraria;

    public Disciplina (){}

    public Disciplina (String nome){
        this.nome=nome;
    }
    
    public Disciplina (String nome, int codigo, int ch){
        this.nome=nome;
        this.codigo=codigo;
        this.cargaHoraria=ch;
    }

    public void cadastrarDisciplina(Disciplina d) throws IOException {
        DisciplinaDados dd = new DisciplinaDados();
        dd.cadastrarDisciplina(d);
    }

    public ArrayList<Disciplina> listarDisciplina() throws IOException{
        DisciplinaDados dd = new DisciplinaDados();
        return dd.listarDisciplina();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }
    
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String imprimir(){
        return "Nome: " + this.getNome() + "\nCodigo: " + this.getCodigo() + 
        "\nCarga horaria: " + this.getCargaHoraria();
    }
}