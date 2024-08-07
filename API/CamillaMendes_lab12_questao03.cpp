/*Implemente uma função bubbleSort para ordenar os elementos de um vetor. Inicialmente,
implemente o algoritmo original, executando n-1 passagens, comparando n-1 pares de elementos
em cada passagem.*/

#include <iostream>
using namespace std;
#include <locale>
#include <cstdlib>
#include <ctime>

int bubbleSort(int[],int);

int main(){
	
	setlocale(LC_ALL,"Portuguese");
	srand(time(0));

	const int tam = 10;
	int vetor[tam], x;

	cout << "Digite 0 para iniciar a geração de números para o vetor: ";
	cin >> x;

	if (x == 0){
		for (int i = 1; i<=tam; i++){
			vetor[i] = rand() % 20;
		}
	}

	cout << "\nVetor: ";
	for(int i = 1; i<=tam; i++){
		cout << vetor[i] << " ";
	}
	
	cout << "\nVetor ordenado: ";
	bubbleSort(vetor,tam);
	for(int i = 1; i<=tam; i++){
		cout << vetor[i] << " ";
	}

}

int bubbleSort(int v[], int a){
	int aux;
	for(int x = a; x>=1; x--){
		for (int y = a; y>=1; y--){
			if(v[y] < v[y-1]){
				aux = v[y];
				v[y] = v[y-1];
				v[y-1] = aux;
			}
		}
	}
}
