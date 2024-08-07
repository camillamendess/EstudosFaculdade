/*Escreva um programa que encontre o menor inteiro positivo n que satisfaça as seguintes
condições:
n/3 = i inteiros e resto 2, para um i qualquer;
n/5 = j inteiros e resto 3, para um j qualquer;
n/7 = k inteiros e resto 4, para um k qualquer.
RESTRIÇÕES: Use uma estrutura while cuja condição seja sempre true e um comando break
para sair da repetição quando n for encontrado:
while(true){
comandos...
}*/

#include <iostream>
using namespace std;
#include <locale.h>

int main(){
	
	setlocale(LC_ALL,"Portuguese");
	
	int n = 1;
	int menor;
	
	while(n % 3 < 2){
		n++;
		if (n % 3 == 2){
			menor = n;
		}
	}
	
	while (n % 5 < 3){
		n++;
		if (n % 5 == 3){
			if(n < menor){
				menor = n;
			}
		}
	}
	
	while (n % 7 < 4){
		n++;
		if(n % 7 == 4){
			if(n < menor){
				menor = n;
			}
		}
	}
	
	cout << "O menor é " << menor;
}
