/*Escreva um programa que solicita 10 valores inteiros ao usuário, armazena esses valores em um
arranjo chamado vet1. Depois, copia o conteúdo desse arranjo para um segundo arranjo chamado
vet2. O programa deve imprimir os dois arranjos na tela.*/

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
	
	for(int i = 1; i<=tam; i++){
		vet2[i] = vet1[i];
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
