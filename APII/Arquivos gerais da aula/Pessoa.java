public class Pessoa {
    private String nome;
    private char sexo;
    private int idade;
    private double peso;
    private double altura;
    
    public Pessoa(String nome, char sexo, int idade, double peso, double altura) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa [altura=" + altura + ", idade=" + idade + ", nome=" + nome + ", peso=" + peso + ", sexo=" + sexo
                + "]";
    }

    
}
