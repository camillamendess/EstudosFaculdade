public class Disciplina {
    private String name;
    private int code;

    public Disciplina(String name, int code){
        this.name = name;
        this.code = code;

    }

    public String getNome(){
        return name;
    }

    public void setNome(String name){
        this.name = name;
    }

    public int getCode(){
        return code;
    }

    public void setCode(int code){
        this.code = code;
    }

    public String imprimir(){
        return "Disciplina: " + getNome() + " - " + getCode();
    }
    
}
