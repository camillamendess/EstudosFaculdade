package dados;
import modelo.Disciplina;
import java.io.*;
import java.util.*;

public class DisciplinaDados {

    public void cadastrarDisciplina(Disciplina d) throws FileNotFoundException, IOException{
        FileOutputStream fluxo = new FileOutputStream("disciplina.txt",true);
    	ObjectOutputStream gravarArq = new ObjectOutputStream(fluxo);
    	gravarArq.writeObject(d);
    	gravarArq.close();
    }

    public static ArrayList <Disciplina> listarDisciplina() throws IOException, ClassNotFoundException{
        ArrayList <Disciplina> disciplinas = new ArrayList <>();
    	FileInputStream fluxo = new FileInputStream("disciplina.txt");// lança FileNotFoundException
    	ObjectInputStream lerObj;
    	
    	while (fluxo.available() > 0){
    		lerObj = new ObjectInputStream (fluxo);
    		Disciplina p = (Disciplina) lerObj.readObject (); // lança ClassNotFoundException
    		disciplinas.add(p);
    		
        }
    	fluxo.close();

    	return disciplinas;
    }    
}
