package modelo;

public class Usuário {
    private String name;
    private int cpf;
    private String endereco;
    private String profissao;

    public Usuário(String name, int cpf, String address, String job){
        this.setName(name);
        this.setCpf(cpf);
        this.setEndereco(address);
        this.setProfissao(job);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String n){
        this.name = n;
    }

    public int getCfp(){
        return this.cpf;
    }

    public void setCpf(int c){
        this.cpf = c;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setEndereco(String e){
        this.endereco = e;
    }

    public String getProfissao(){
        return this.profissao;
    }

    public void setProfissao(String p){
        this.profissao = p;
    }
}
