/*Em uma empresa, há tabelas com o quanto foi gasto em cada mês. Para fechar o
balanço do primeiro trimestre, precisamos somar o gasto total. Sabendo que, em
Janeiro, foram gastos 15000,00 reais, em Fevereiro, 23000,00 reais e em Março,
17000 reais, faça um programa que calcule e imprima o gasto total no trimestre.*/

class trimestre { 
    public static void main(String[] args, int i) {
        int janeiro = 15000;
        int fevereiro = 23000;
        int marco = 17000;
        int total;
        total = janeiro + fevereiro + marco;

        System.out.println("O total de Gastos no trimestre foi " + total);
    }
}