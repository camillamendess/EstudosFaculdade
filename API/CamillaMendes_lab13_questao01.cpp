/*Escreva uma função mm que receba um vetor inteiro v[0..n-1] e os endereços de duas variáveis
inteiras (dois ponteiros), digamos minimo e maximo, e deposite nessas variáveis o valor do menor e
do maior elemento do vetor. Escreva também uma função main que chame a função mm e mostre
minimo e maximo encontrados.*/

#include <iostream>
using namespace std;
#include <locale>

void mm(int*,int,int*,int*);

int main(){
	
	setlocale(LC_ALL,"Portuguese");
	
 	int tam = 12;
	int vetor[tam];
	int menor, maior;
	
	cout << "Digite números para o vetor: ";
	for (int i = 1; i<=tam; i++){
		cout << "\nV[" << i << "]: ";
		cin >> vetor[i];
	}
	
	cout << "\nO vetor: ";
	for (int i = 1; i<=tam; i++){
		cout << vetor[i] << " ";
	}
	cout << endl;
	
	mm(vetor,tam,&menor,&maior);

	cout << "\nO menor número do vetor: " << menor;
	cout << "\nO maior número do vetor: " << maior;
}

void mm(int *v, int t, int *menor, int *maior){
	*menor = v[1];
	*maior = v[1];
	for(int i = 1; i <= t; i++){
		if (*menor > *(v+i)){
			*menor = *(v+i);
		}
		if (*maior < *(v+i)){
			*maior = *(v+i);
		}
	}
}
