//Faça um programa que peça um número e mostre na tela se o valor é positivo ou negativo.

#include <iostream>
using namespace std;

int main(){
	
	int n;
	
	cout << "Digite um numero: " << endl;
	cin >> n;
	
	if (n > 0){
		cout << "É positivo!" << endl;
	}
	else{
		cout << "É negativo!" << endl;
	}
	
}
