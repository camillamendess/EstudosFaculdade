/*Fa�a um programa que pe�a 50 n�meros inteiros positivos, calcule e mostre a quantidade de
n�meros pares e a quantidade de n�meros �mpares fornecidos. Use uma estrutura para-fa�a.
Ao final, mostre se h� mais n�meros pares ou �mpares (considere que pode haver a mesma
quantidade de pares e �mpares).*/

#include <iostream>
using namespace std;
#include <locale.h>

int main(){
	
	setlocale(LC_ALL,"Portuguese");
	
	int n[50];
	int par = 0;
	int impar = 0;
	
	cout << "Digite 50 n�meros inteiros positivos: " << endl;
	
	for(int i = 0; i<50; i++){
		cin >> n[i];
	}
	
	for(int i = 0; i<50; i++){
		if(n[i] % 2 == 0){
			par++;
		}
		else{
			impar++;
		}
	}
	cout << par << " n�meros pares." << endl;
	cout << impar << " n�meros �mpares." << endl;
	
	if (par>impar){
		cout << "H� mais n�meros pares!" << endl;
	}
	
	if(impar>par){
		cout << "H� mais n�meros �mpares!" << endl;
	}
	
	if(par == impar){
		cout << "Tem a mesma quantidade de n�meros pares e �mpares!" << endl;
	}
	
}
