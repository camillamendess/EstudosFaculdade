//Fa�a um programa que pe�a um n�mero e mostre na tela se o valor � positivo ou negativo.

#include <iostream>
using namespace std;

int main(){
	
	int n;
	
	cout << "Digite um numero: " << endl;
	cin >> n;
	
	if (n > 0){
		cout << "� positivo!" << endl;
	}
	else{
		cout << "� negativo!" << endl;
	}
	
}
