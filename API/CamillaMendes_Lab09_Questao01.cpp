/*Faça uma função chamada ePrimo que recebe como parâmetro (pelo menos) um inteiro positivo n e
retorna true se n for primo, e false, caso contrário.
Faça uma função chamada doisPrimos que recebe como parâmetro (pelo menos) um inteiro
positivo m e retorna o maior número primo que é menor do que m e o menor número primo que é
maior do que m. Esta função deve chamar ePrimo.
Faça um programa que peça ao usuário um número inteiro positivo n e imprima os números primos
mais próximos dele (um maior e outro menor que ele).
OBSERVAÇÃO: Fique à vontade para incluir outros parâmetros para as funções.
RESTRIÇÕES:
• Não utilize variáveis globais.*/

#include <iostream>
using namespace std;
#include <locale>

bool ePrimo(int);
int doisPrimos(int, int&, int&);

int main(){
	
	setlocale(LC_ALL,"Portuguese");
	
	int n, x1, x2;
	
	cout << "\nDigite um número inteiro: ";
	cin >> n;
	
	doisPrimos(n, x1, x2);
	
	if(n != 2){
		cout << endl;
		cout << x1 << " é o maior número primo menor que " << n << endl;
		cout << x2 << " é o menor número primo maior que " << n << endl;
	}
	else{
		cout << "\nNão existe número primo menor que " << n << endl;
		cout << x2 << " é o menor número primo maior que " << n << endl;
	}
	
}

int doisPrimos(int m, int& menorAntes, int& menorDepois){
	
	for (int i = 0; i<m; i++){
		if(ePrimo(i)){
			menorAntes = i;
		}
	}
	
	for (int i = m+10; i>m; i--){
		if(ePrimo(i)){
			menorDepois = i;
			if (i < menorDepois){
				menorDepois = i;
			}
		}
	}
	
}

bool ePrimo(int n){
	int cont = 0;
	for(int i = 1; i<=n; i++){
		if(n % i == 0){
			cont++;
		}
	}
	if(cont == 2){
		return true;
	}
	else{
		return false;
	}
}
