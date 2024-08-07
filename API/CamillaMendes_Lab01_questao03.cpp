/*Um posto est� vendendo combust�veis com a seguinte tabela de descontos:
� �lcool:
o at� 20 litros, desconto de 3% por litro
o acima de 20 litros, desconto de 5% por litro
� Gasolina:
o at� 20 litros, desconto de 4% por litro
o acima de 20 litros, desconto de 6% por litro.
Escreva um algoritmo que leia o n�mero de litros vendidos e o tipo de combust�vel (�lcool ou
Gasolina), e calcule e imprima o valor a ser pago pelo cliente sabendo-se que o pre�o do litro da
gasolina � R$ 6,00 o pre�o do litro do �lcool � R$ 5,50.*/

#include <iostream>
using namespace std;
#include <locale.h>

int main (){
	
	setlocale(LC_ALL,"Portuguese");
	
	float litros, valor;
	char tipo;
	
	cout << "Qual o tipo de combustivel? A = �lcool e G = Gasolina." << endl;
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
	
	cout << "O valor a ser pago � " << valor;

}
