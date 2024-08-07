/*Fa�a um programa que receba o valor de tabela de um carro e n�mero de parcelas para
pagamento, e mostre qual o valor total a ser pago. Considere que:
� O pre�o final para compra � vista tem um desconto de 20%;
� A quantidade de parcelas pode ser: 6, 12, 18, 24 ou 30.
� Os percentuais de acr�scimo s�o de acordo com a tabela*/

#include <iostream>
using namespace std;
#include <locale.h>

int main(){
	
	setlocale(LC_ALL,"Portuguese");
	
	int parcelas;
	float valor, desconto, total;
	
	cout << "Digite o valor de tabela do carro e quantidade de parcelas para pagamento: " << endl;
	cout << "(A quantidade de parcelas pode ser: 1 (a v�sta), 6, 12, 18, 24 ou 30)." << endl;
	cin >> valor >> parcelas;
	
	switch(parcelas){
		case 1:
			cout << "Desconto de 20%." << endl;
			desconto = valor * 0.2;
			total = valor - desconto;
			cout << "O valor a ser pago � " << total << endl;
			break;
		case 6:
			cout << "Desconto de 3%." << endl;
			desconto = valor * 0.03;
			total = valor - desconto;
			cout << "O valor a ser pago � " << total << endl;
			break;
		case 12:
			cout << "Desconto de 6%." << endl;
			desconto = valor * 0.06;
			total = valor - desconto;
			cout << "O valor a ser pago � " << total << endl;
			break;
		case 18:
			cout << "Desconto de 10%." << endl;
			desconto = valor * 0.1;
			total = valor - desconto;
			cout << "O valor a ser pago � " << total << endl;
			break;
		case 24:
			cout << "Desconto de 15%." << endl;
			desconto = valor * 0.15;
			total = valor - desconto;
			cout << "O valor a ser pago � " << total << endl;
			break;
		case 30:
			cout << "Desconto de 20%." << endl;
			desconto = valor * 0.2;
			total = valor - desconto;
			cout << "O valor a ser pago � " << total << endl;
			break;
		default:
			cout << "Quantidade de parcelas inv�lida.";
	}
	
	
	 
}
