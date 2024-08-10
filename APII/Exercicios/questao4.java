/*Adicione código (sem alterar as linhas que já existem) na classe anterior para
imprimir a média mensal de gasto, utilize a variável mediaMensal junto com uma
mensagem. Concatene a String com o valor usando o operador.*/

 public class questao4 { 
    public static void main(String[] args) {
        int janeiro = 15000;
        int fevereiro = 23000;
        int marco = 17000;
        int total;
        total = janeiro + fevereiro + marco;
        int mediaMensal = (total/3);
 
    
        System.out.println("O total de Gastos no trimestre foi " + total);
        System.out.println("A média mensal é " + mediaMensal);
    }
}