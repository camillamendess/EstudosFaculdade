/*Fa�a uma fun��o chamada ePrimo que recebe como par�metro (pelo menos) um inteiro positivo n e
retorna true se n for primo, e false, caso contr�rio.
Fa�a uma fun��o chamada doisPrimos que recebe como par�metro (pelo menos) um inteiro
positivo m e retorna o maior n�mero primo que � menor do que m e o menor n�mero primo que �
maior do que m. Esta fun��o deve chamar ePrimo.
Fa�a um programa que pe�a ao usu�rio um n�mero inteiro positivo n e imprima os n�meros primos
mais pr�ximos dele (um maior e outro menor que ele).
OBSERVA��O: Fique � vontade para incluir outros par�metros para as fun��es.
RESTRI��ES:
� N�o utilize vari�veis globais.*/

#include <iostream>
using namespace std;
#include <locale>

bool ePrimo(int);
int doisPrimos(int, int&, int&);

int main(){
	
	setlocale(LC_ALL,"Portuguese");
	
	int n, x1, x2;
	
	cout << "\nDigite um n�mero inteiro: ";
	cin >> n;
	
	doisPrimos(n, x1, x2);
	
	if(n != 2){
		cout << endl;
		cout << x1 << " � o maior n�mero primo menor que " << n << endl;
		cout << x2 << " � o menor n�mero primo maior que " << n << endl;
	}
	else{
		cout << "\nN�o existe n�mero primo menor que " << n << endl;
		cout << x2 << " � o menor n�mero primo maior que " << n << endl;
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
