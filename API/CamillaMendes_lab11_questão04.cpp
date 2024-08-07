/*Faça um programa em C++ que receba um inteiro positivo n e gere n*n números inteiros positivos
aleatórios entre 1 e 50 (inclusive) e os armazene em uma matriz An×n. Escreva também as
seguintes funções (considere a possibilidade das funções receberem outros argumentos além dos
citados abaixo, como, por exemplo, as dimensões da matriz):

• imprimeMatriz – imprime a matriz A, linha por linha, de modo que os elementos de cada
coluna sejam alinhados pelo lado direito e entre cada dois elementos de uma mesma linha
exista, pelo menos, dois espaços em branco.

• duplicaMatriz – cria uma matriz B, tal que B = 2 * A, onde A é uma matriz de inteiros.

• multiplicaDiagonal – recebe como argumentos uma matriz quadrada de inteiros e um
inteiro positivo k; e multiplica os elementos da diagonal principal da matriz por k.

• inverteDiagonal – recebe como argumentos uma matriz quadrada de inteiros e inverte
os elementos da diagonal de cima para baixo, isto é, o elemento da primeira linha, vai para a
última linha; o elemento da segunda linha, vai para a penúltima e assim sucessivamente.

O seu programa, após criar a matriz A, deverá:
1. Imprimir a matriz A (usando a função imprimeMatriz);
2. Criar a matriz B (usando a função duplicaMatriz);
3. Receber um inteiro positivo do teclado e passá-lo como argumento para a função
multiplicaDiagonal junto com a matriz A.
4. Imprimir a matriz A (usando a função imprimeMatriz);
5. Imprimir a matriz B (usando a função imprimeMatriz).
6. Passar a matriz B como argumento para a função inverteDiagonal.
7. Imprimir a matriz B (usando a função imprimeMatriz).*/

#include <iostream>
using namespace std;
#include <locale>
#include <iomanip>
#include <cstdlib>
#include <ctime>

void imprimeMatriz(int[][20], int);
void duplicaMatriz(int[][20], int[][20], int);
void multiplicaDiagonal(int[][20], int, int);

int main(){
	
	setlocale(LC_ALL,"Portuguese");
	srand(time(0));
	
	const int tam = 20;
	int A[tam][tam], B[tam][tam];
	int n, n1;
	
	cout << "Digite um número para a dimensão das matrizes: ";
	cin >> n;
	
	for(int i = 1; i<=n; i++){
		for(int j = 1; j<=n; j++){
			A[i][j] = rand() % 50;
		}
	}
	cout << "\nMatriz A: \n";
	imprimeMatriz(A,n);
	duplicaMatriz(A, B, n);
	
	cout << "\nDigite um número para multiplicar a diagonal princinpal da matriz A: ";
	cin >> n1;

	multiplicaDiagonal(A,n,n1);

	cout << "\nMatriz A com a diagonal multiplicada por " << n1 << ":\n";
	imprimeMatriz(A,n);
	
	cout << "\nMatriz B (A multiplicada por 2): \n";
	imprimeMatriz(B,n);
}

void imprimeMatriz(int matriz[][20], int a){
    for(int i=1; i<=a; i++){
        for(int j=1; j<=a; j++)
            cout << setw(4)<< matriz[i][j];
        cout << endl;
    }
}

void duplicaMatriz(int matrizA[][20], int matrizB[][20], int a){
	
	for(int i = 1; i <= a; i++){
		for(int j=1; j<=a; j++){
			matrizB[i][j] = matrizA[i][j] * 2;
		}
	}
}

void multiplicaDiagonal(int m[][20], int a, int b){

	for(int i = 1; i <= a; i++){
		for(int j = 1; j <= a; j++){
			if(i == j){
				m[i][j] = m[i][j] * b;
			}
		}
	}
}

	
	
