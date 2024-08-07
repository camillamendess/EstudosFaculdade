/*Faça um programa que receba o valor de tabela de um carro e número de parcelas para
pagamento, e mostre qual o valor total a ser pago. Considere que:
• O preço final para compra à vista tem um desconto de 20%;
• A quantidade de parcelas pode ser: 6, 12, 18, 24 ou 30.
• Os percentuais de acréscimo são de acordo com a tabela*/

#include <iostream>
using namespace std;
#include <locale.h>

int main(){
	
	setlocale(LC_ALL,"Portuguese");
	
	int parcelas;
	float valor, desconto, total;
	
	cout << "Digite o valor de tabela do carro e quantidade de parcelas para pagamento: " << endl;
	cout << "(A quantidade de parcelas pode ser: 1 (a vísta), 6, 12, 18, 24 ou 30)." << endl;
	cin >> valor >> parcelas;
	
	switch(parcelas){
		case 1:
			cout << "Desconto de 20%." << endl;
			desconto = valor * 0.2;
			total = valor - desconto;
			cout << "O valor a ser pago é " << total << endl;
			break;
		case 6:
			cout << "Desconto de 3%." << endl;
			desconto = valor * 0.03;
			total = valor - desconto;
			cout << "O valor a ser pago é " << total << endl;
			break;
		case 12:
			cout << "Desconto de 6%." << endl;
			desconto = valor * 0.06;
			total = valor - desconto;
			cout << "O valor a ser pago é " << total << endl;
			break;
		case 18:
			cout << "Desconto de 10%." << endl;
			desconto = valor * 0.1;
			total = valor - desconto;
			cout << "O valor a ser pago é " << total << endl;
			break;
		case 24:
			cout << "Desconto de 15%." << endl;
			desconto = valor * 0.15;
			total = valor - desconto;
			cout << "O valor a ser pago é " << total << endl;
			break;
		case 30:
			cout << "Desconto de 20%." << endl;
			desconto = valor * 0.2;
			total = valor - desconto;
			cout << "O valor a ser pago é " << total << endl;
			break;
		default:
			cout << "Quantidade de parcelas inválida.";
	}
	
	
	 
}
