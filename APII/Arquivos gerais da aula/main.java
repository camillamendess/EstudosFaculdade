public class main {
    public static void main(String[] args){
        Data d = new Data(22,01,2001);
        System.out.println(d.getAno()); 
        System.out.println(d.getDia());
        System.out.println(d.getMes());
        d.setAno(2002);
        d.setMes(03);
        d.setDia(8);
        System.out.println("Data atualizada: " + d.getDia() + "/" + d.getMes() + "/" + d.getAno());

    }
}
