package controle;
import java.util.ArrayList;
import modelo.Disciplina;

public class ControleDisciplina {
    
    private ArrayList <Disciplina> disciplinas = new ArrayList <Disciplina>();

    public void cadastrarDisciplina (String nome, int codigo, int ch) throws Exception {
        if (nome!= null && codigo > 0 && ch > 0){
            Disciplina d = new Disciplina (nome, codigo, ch);
            disciplinas.add(d);
        } else {
            throw new Exception("Dados incorretos");
        }
    }

    public Disciplina pesquisarDisciplina (int codigo){
        Disciplina d = null;
        for (int i=0; i<disciplinas.size(); i++){
            if (codigo==disciplinas.get(i).getCodigo()){
                d= disciplinas.get(i);
                break;
            }
        }
        return d;
    }
    
    public String imprimir (int codigo){
        Disciplina d = pesquisarDisciplina (codigo);
        return d.imprimir();
    }
}