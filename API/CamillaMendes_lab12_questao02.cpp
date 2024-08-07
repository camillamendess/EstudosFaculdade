/*Implemente uma função buscaBinaria que receba um vetor e uma chave como argumentos; faça
uma busca binária no arranjo para encontrar a chave; e retorne sua posição no arranjo ou retorne
-1 se ela não for encontrada. Se quiser testar sua função, lembre que o vetor deve estar ordenado.*/

#include <iostream>
using namespace std;
#include <locale>
#include <cstdlib>
#include <ctime>

int buscaBinaria(int[], int, int, int);

int main(){
	
	setlocale(LC_ALL,"Portuguese");
	
	srand(time(0));

	int n, chave, aux;
	const int tam = 10;
	int i = 1;
	int vetor[tam];

	cout << "Digite 0 para iniciar a geração de números para o vetor: ";
	cin >> n;

	if (n == 0){
		for (int i = 1; i<=tam; i++){
			vetor[i] = 1 + rand() % 50;
		}
	}

	cout << "\nVetor: ";
	for(int i = 1; i<=tam; i++){
		cout << vetor[i] << " ";
	}
	
	for(int x = 1; x<=tam; x++){
		for(int y = x; y<=tam; y++){
			if(vetor[x] > vetor[y]){
				aux = vetor[x];
				vetor[x] = vetor[y];
				vetor[y] = aux;
			}
		}
	}
	
	cout << "\n\nVetor ordenado: ";
	for(int i = 1; i<=tam; i++){
		cout << vetor[i] << " ";
	}
	
	cout << "\n\nDigite uma chave para a busca binária no vetor: ";
	cin >> chave;
	
	buscaBinaria(vetor, chave, tam, i);
}

int buscaBinaria(int v[], int key, int fim, int inicio){
	int centro = (inicio+fim)/2;
	if (v[centro] == key){
		cout << "\nA chave está na posição " << centro;
	}
	else{
		if(v[centro] < key){
			inicio = centro+1;
			buscaBinaria(v,key,fim,inicio);
		}
  		if(v[centro] > key){
			buscaBinaria(v,key,centro,inicio);
		}
	}

}
