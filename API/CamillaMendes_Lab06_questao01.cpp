/*Faça uma função que recebe um valor inteiro e verifica se o valor é positivo, negativo ou zero. A
função deve retornar 1 para valores positivos, -1 para negativos e 0 para o valor 0.
Escreva um programa que receba n valoresinteiros do teclado. Para cada valor de n, chame a função
e imprima uma mensagem a respeito do sinal do número lido (<0, >0 ou =0).*/

#include <iostream>]
using namespace std;
#include <locale.h>

int verifica(int);

int main(){
	
	setlocale(LC_ALL,"Portuguese");
	
	int num, n, valor;
	
	cout << "Digite um valor inteiro para a quantidade de números: ";
	cin >> n;
	
	for(int i = 1; i<=n; i++){
		cout << "\nDigite um número inteiro: ";
		cin >> num;
		valor = verifica(num);
		
		if(valor == 1){
			cout << "\n>0\n";
		}
		if(valor == 0){
			cout << "\n=0\n";
		}
		if(valor == -1){
			cout << "\n<0\n";
		}
		
	}
	
}

int verifica(int n){
	
	if(n > 0){
		return 1;
	}
	else{
		if(n == 0){
			return 0;
		}
		else{
			if(n < 0){
				return -1;
			}
		}
	}
}
