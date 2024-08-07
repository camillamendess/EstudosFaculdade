/*Implemente uma função pesquisaLinear que receba um vetor e uma chave como argumentos;
faça uma pesquisa linear no arranjo para encontrar a chave; e retorne sua posição no arranjo ou

retorne -1 se ela não for encontrada. Faça um programa que gere 50 números inteiros e armazene-
os num vetor. Chame a função pesquisaLinear para encontrar uma chave dada.*/

#include <iostream>
using namespace std;
#include <locale>
#include <cstdlib>
#include <ctime>

int pesquisaLinear(int[], int);

int main(){
	
	setlocale(LC_ALL,"Portuguese");
	srand(time(0));
	
	int n, chave;
	const int tam = 50;
	int vetor[tam];
	
	cout << "Digite 0 para iniciar a geração de números para o vetor: ";
	cin >> n;
	
	if (n == 0){
		for (int i = 1; i<=tam; i++){
			vetor[i] = rand() % 100;
		}
	}
	
	cout << "Vetor: ";
	for(int i = 1; i<=tam; i++){
		cout << vetor[i] << " ";
	}
	
	cout << "\nDigite um chave para pesquisar dentro do vetor: ";
	cin >> chave;
	
	pesquisaLinear(vetor,chave);
}

int pesquisaLinear(int v[], int a){
	
	int cont = 0;
	for(int i = 1; i<=50; i++){
		if(v[i] == a){
			cont++;
		}
	}
	
	if(cont == 1){
		for(int i = 1; i<=50; i++){
			if(v[i] == a){
				cout << "\nA chave " << a << " está na posição " << i << " do vetor";
			}
		}
	}
	
	if(cont > 1){
		cout << "\nA chave " << a << " está nas posições ";
		for(int i = 1; i<=50; i++){
			if(v[i] == a){
				cout << i << " ";
			}
		}
		cout << "do vetor";
	}
	
	if(cont == 0){
		cout << "-1";
	}
	
}
