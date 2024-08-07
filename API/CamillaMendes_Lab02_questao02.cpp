//Faça um programa que calcule o mostre a média aritmética de n valores.

#include <iostream>
using namespace std;
#include <locale.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	
	int n, media, valores[n];
	int cont = 0;
	
	cout << "Digite um valor para n: " << endl;
	cin >> n;
	
	for (int i = 0; i<n; i++){
		cout << "Digite os valores de n: " << endl;
		cin >> valores[i];
	}
	
	for (int i = 0; i<n; i++){
		cont = cont + valores[i];
	}
	
	media = cont/n;
	
	cout << "A média aritmética é " << cont << " dividido por " << n << " que é igual a " << media << endl;

}
