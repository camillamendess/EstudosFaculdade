/*Escreva uma fun��o mm que receba um vetor inteiro v[0..n-1] e os endere�os de duas vari�veis
inteiras (dois ponteiros), digamos minimo e maximo, e deposite nessas vari�veis o valor do menor e
do maior elemento do vetor. Escreva tamb�m uma fun��o main que chame a fun��o mm e mostre
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
	
	cout << "Digite n�meros para o vetor: ";
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

	cout << "\nO menor n�mero do vetor: " << menor;
	cout << "\nO maior n�mero do vetor: " << maior;
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
