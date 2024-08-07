/*Faça um programa que peça 50 números inteiros positivos, calcule e mostre a quantidade de
números pares e a quantidade de números ímpares fornecidos. Use uma estrutura para-faça.
Ao final, mostre se há mais números pares ou ímpares (considere que pode haver a mesma
quantidade de pares e ímpares).*/

#include <iostream>
using namespace std;
#include <locale.h>

int main(){
	
	setlocale(LC_ALL,"Portuguese");
	
	int n[50];
	int par = 0;
	int impar = 0;
	
	cout << "Digite 50 números inteiros positivos: " << endl;
	
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
	cout << par << " números pares." << endl;
	cout << impar << " números ímpares." << endl;
	
	if (par>impar){
		cout << "Há mais números pares!" << endl;
	}
	
	if(impar>par){
		cout << "Há mais números ímpares!" << endl;
	}
	
	if(par == impar){
		cout << "Tem a mesma quantidade de números pares e ímpares!" << endl;
	}
	
}
