/*Escreva uma função primo que receba como argumento um número inteiro positivo n e retorne true
se n for primo e false, caso contrário.
Escreva uma função divisor_primo que receba como argumento dois números inteiros positivos n e d
e retorne true se d é divisor de n e é primo, e false, caso contrário. Esta função deve usar a função
primo.
Escreva um programa que solicite a entrada de um número inteiro positivo n e mostre todos os divisores
de n que são primos. O programa principal deve chamar função divisor_primo.*/

#include <iostream>
using namespace std;
#include <locale>

bool primo(int);
bool divisor_primo(int, int);

int main(){
	
	setlocale(LC_ALL,"Portuguese");
	
	int n;

	cout << "\nDigite um número inteiro positivo: ";
	cin >> n;
	
	cout << "\nOs divisores primos de " << n << " = ";
	
	for(int i = 1; i<=n; i++){
		if(divisor_primo(n,i)){
 		  cout << i << " ";
		}
	}
	
}

bool primo(int n){
	int aux = 0;
	for (int i = 1; i<=n; i++){
		if (n % i == 0){
			aux++;
		}
	}
	
	if(aux == 2){
		return true;
	}
	else{
		return false;
	}
}

bool divisor_primo(int n, int d){
	if ( (primo(d)) && (n % d == 0)){
		return true;
	}
	else{
		return false;
	}
}
