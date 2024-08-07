/*Escreva uma função recursiva de nome potência( ), que receba dois inteiros positivos, i e j, e retorne i
elevado a j.*/

#include <iostream>
using namespace std;
#include <locale>

int potencia(int, int);

int main(){
	
	setlocale(LC_ALL,"Portuguese");
	
	int base, exp;
	
	cout << "Digite um valor para a base: ";
	cin >> base;
	cout << "\nDigite um valor para o expoente: ";
	cin >> exp;
	cout << base << " elevado a " << exp << " = " << potencia(base,exp);
}

int potencia(int i, int j){
	if (j == 0){
		return 1;
	}
	else{
		return (i * potencia(i, j-1));
	}
}
