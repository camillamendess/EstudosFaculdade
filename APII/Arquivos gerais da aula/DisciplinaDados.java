public class DisciplinaDados{

    public void cadastrarDisciplina(Disciplina d){
        FileOutputStream fileStream = new FileOutputStream("Disciplina.ser");
        ObjectOutputStream os = new ObjectOutputStream(fileStream);
        os.writeObject(d);
        os.close();
    }

    public Disciplina listarDisciplina(){
        FileInputStream fs = new FileInputStream(fileStream);
        ObjectInputStream os = new ObjectInputStream(fs);
        while(os.readObject()){
            
        }
    }

    public void cadastrarListaDisciplina (Disciplina d) throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList <Disciplina> disciplinas = new ArrayList();
        File arq = new File ("listaDisciplina.ser");
        if (arq.exists()){
            disciplinas = listarDisciplina2();
        }
        disciplinas.add(d);
        FileOutputStream fluxo = new FileOutputStream(arq);
        try (ObjectOutputStream gravarObj = new ObjectOutputStream(fluxo)) {
            gravarObj.writeObject(disciplinas);
        }
    }

    public ArrayList<Disciplina> listarListaDisciplina2() throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList <Disciplina> disciplinas;
        File arq = new File ("listaDisciplina.ser");
        FileInputStream fluxo = new FileInputStream(arq);
        ObjectInputStream lerObj = new ObjectInputStream(fluxo);
        disciplinas = (ArrayList<Disciplina>) lerObj.readObject();
        return disciplinas;
    } 
}