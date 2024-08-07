/*Fa�a um programa que pe�a dois n�meros, base e expoente, calcule e mostre o primeiro
n�mero elevado ao segundo. N�o utilize a fun��o de pot�ncia da linguagem.*/

#include <iostream>
using namespace std;
#include <locale.h>

int main(){
	
	setlocale(LC_ALL, "Portuguese");
	
	int base, exp;
	int pot;
	int cont = 2;
	
	cout << "Digite um n�mero para a base e o expoente: " << endl;
	cin >> base >> exp;
	
	if (exp == 0){
		cout << base << " elevado a " << exp << " � igual a " << "1";
		return 0;
	}
		
	if (exp == 1){
		cout << base << " elevado a " << exp << " � igual a " << base;
		return 0;
	}
	
	pot = base * base;
	
	while(cont < exp){
		pot = pot * base;
		cont++;
	}
	
	cout << base << " elevado a " << exp << " � igual a " << pot;
	return 0;
}
