package modelo;

public class Usuário {
    private String name;
    private String cpf;
    private String endereco;
    private String profissao;

    public Usuário(String n, String cpf, String endereco, String profissao){
        this.setName(n);
        this.setCpf(cpf);
        this.setEndereco(endereco);
        this.setProfissao(profissao);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String n){
        this.name = n;
    }

    public String getCfp(){
        return this.cpf;
    }

    public void setCpf(String c){
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

    public String imprimir(){
        return "\nNome do Usuário: " + this.getName()
        + " \nCPF: " + this.getCfp()
        + " \nEndereço: " + this.getEndereco()
        + " \nProfissão: " + this.getProfissao();
    }
}
