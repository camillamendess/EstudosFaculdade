/*Um posto está vendendo combustíveis com a seguinte tabela de descontos:
• Álcool:
o até 20 litros, desconto de 3% por litro
o acima de 20 litros, desconto de 5% por litro
• Gasolina:
o até 20 litros, desconto de 4% por litro
o acima de 20 litros, desconto de 6% por litro.
Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (Álcool ou
Gasolina), e calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da
gasolina é R$ 6,00 o preço do litro do álcool é R$ 5,50.*/

#include <iostream>
using namespace std;
#include <locale.h>

int main (){
	
	setlocale(LC_ALL,"Portuguese");
	
	float litros, valor;
	char tipo;
	
	cout << "Qual o tipo de combustivel? A = Álcool e G = Gasolina." << endl;
	cin >> tipo;
	cout << "Quantos litros?" << endl;
	cin >> litros;
	
	if (tipo == 'A'){
		
		if (litros <= 20){
			valor = 5.50 * (litros * 0.3);
		}
		if (litros > 20){
			valor = 5.50 * (litros * 0.5);
		}
	}

	
	if (tipo == 'G'){
		if(litros <= 20){
			valor = 6.00 * (litros * 0.4);
		}
		if (litros > 20){
			valor = 6.00 * (litros * 0.6);
		}
	}
	
	cout << "O valor a ser pago é " << valor;

}
