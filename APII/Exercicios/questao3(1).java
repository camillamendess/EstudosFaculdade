/*Em uma empresa, há tabelas com o quanto foi gasto em cada mês. Para fechar o
balanço do primeiro trimestre, precisamos somar o gasto total. Sabendo que, em
Janeiro, foram gastos 15000,00 reais, em Fevereiro, 23000,00 reais e em Março,
17000 reais, faça um programa que calcule e imprima o gasto total no trimestre.*/

public class questao3 { 
    public static void main (String[] args) {
        int jan = 15000;
        int fev = 23000;
        int mar = 17000;
        int total = jan + fev + mar;

        System.out.println("O total de Gastos no trimestre foi " + total);
    }
}