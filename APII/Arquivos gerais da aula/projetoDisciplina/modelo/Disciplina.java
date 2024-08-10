package modelo;
import java.io.IOException;
import dados.DisciplinaDados;
import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private int codigo;
    private int cargaHoraria;

    public Disciplina (){}

    public Disciplina (String nome){
        this.nome = nome;
    }

    public Disciplina (String nome, int codigo, int ch){
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = ch;
    }

    public void cadastrarDisciplina(Disciplina d) throws IOException {
        DisciplinaDados dd = new DisciplinaDados();
        dd.cadastrarDisciplina(d);
    }

    public static ArrayList <Disciplina> listarDisciplina() throws ClassNotFoundException, IOException{
        return DisciplinaDados.listarDisciplina(); 
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
        return "Nome: " + this.getNome() + "\nCodigo: " + this.getCodigo() + "\nCarga horaria: "
        + this.getCargaHoraria();
    }
}