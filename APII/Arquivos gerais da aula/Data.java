public class Data{
    private int dia;
    private int mes;
    private long ano;

    public Data(int dia, int mes, long ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia(){
        return this.dia;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public int getMes(){
        return this.mes;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public long getAno(){
        return this.ano;
    }

    public void setAno(long ano){
        this.ano = ano;
    }

    public boolean isBissexto(){
        
    }
}