/*Modifique o exercício anterior de forma que o conteúdo de vet1 seja copiado para vet2 de forma
invertida. Por exemplo:
vet1 = 1 5 0 4 9 5 3 8 6 7 vet2 = 7 6 8 3 5 9 4 0 5 1
O programa deve imprimir vet1 e vet2.*/

#include <iostream>
using namespace std;
#include <locale>
#include <iomanip>

int main(){

	setlocale(LC_ALL,"Portuguese");

	const int tam = 10;
	int vet1[tam], vet2[tam];

	cout << "Digite valores para o arranjo vet1: ";
	for (int i = 1; i<=tam; i++){
		cin >> vet1[i];
	}

	for(int i = tam, a = 1; i>=1; i--, a++){
			vet2[a] = vet1[i];
	}

	cout << endl;

	cout << "Vet1: ";
	for(int i = 1; i<=tam; i++){
		cout << vet1[i] << " ";
	}

	cout << endl << endl;

	cout << "Vet2: ";
	for(int i = 1; i<=tam; i++){
		cout << vet2[i] << " ";
	}




}
