/*Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro
número elevado ao segundo. Não utilize a função de potência da linguagem.*/

#include <iostream>
using namespace std;
#include <locale.h>

int main(){
	
	setlocale(LC_ALL, "Portuguese");
	
	int base, exp;
	int pot;
	int cont = 2;
	
	cout << "Digite um número para a base e o expoente: " << endl;
	cin >> base >> exp;
	
	if (exp == 0){
		cout << base << " elevado a " << exp << " é igual a " << "1";
		return 0;
	}
		
	if (exp == 1){
		cout << base << " elevado a " << exp << " é igual a " << base;
		return 0;
	}
	
	pot = base * base;
	
	while(cont < exp){
		pot = pot * base;
		cont++;
	}
	
	cout << base << " elevado a " << exp << " é igual a " << pot;
	return 0;
}
