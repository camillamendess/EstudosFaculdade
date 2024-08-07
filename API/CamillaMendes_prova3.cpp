/*Fa�a um programa em C++ que receba dois inteiros positivos m e n e gere m*n n�meros inteiros
positivos aleat�rios entre 1 e 30 (inclusive) e os armazene em uma matriz Am�n. Escreva tamb�m
as seguintes fun��es (considere a possibilidade de as fun��es receberem outros argumentos al�m
dos citados abaixo, como, por exemplo, as dimens�es da matriz):

imprimeMatriz � imprime uma matriz de inteiros A, linha por linha, de modo que os
elementos de cada coluna sejam alinhados pelo lado direito; entre cada dois elementos de
uma mesma linha exista, pelo menos, quatro espa�os em branco; e entre as linhas seja
impressa uma linha formada por tracinhos como mostrado abaixo.

multiplicaLinha � recebe como argumentos:
o uma matriz de inteiros;
o um inteiro positivo, l, representando uma linha da matriz; e
o um inteiro k;
e multiplica os elementos da linha l da matriz por k, substituindo toda a linha pelos
respectivos elementos calculados em cada coluna.

ajustaMatriz � recebe como argumentos:
o uma matriz de inteiros; e
o um inteiro k, 1 <= k <= 10;
e altera a matriz substituindo cada elemento A[i][j] que � m�ltiplo de 3 por A[i][j]*k.

O seu programa, ap�s criar a matriz A, dever�:
1. Imprimir a matriz A (usando a fun��o imprimeMatriz);
2. Receber um inteiro positivo do teclado representando uma linha da matriz e um fator
multiplicativo inteiro; e pass�-los como argumentos para a fun��o multiplicaLinha junto com
a matriz A.
3. Imprimir a matriz A atualizada (usando a fun��o imprimeMatriz);
4. Ajustar a matriz usando a fun��o ajustaMatriz;
5. Imprimir a matriz A atualizada (usando a fun��o imprimeMatriz);*/

#include <iostream>
using namespace std;
#include <locale>
#include <cstdlib>
#include <ctime>
#include <iomanip>

void imprimeMatriz(int[][10], int, int);
void multiplicaLinha(int[][10], int, int, int);
void ajustaMatriz(int[][10],int, int, int);

int main(){
	
	setlocale(LC_ALL,"Portuguese");
	srand(time(0));
	
	int m, n, linha, num, num2;
	int A[10][10];
	
	cout << "Digite o n�mero para a quantidade de linhas e colunas da matriz A: ";
	cin >> m >> n;
	
	for(int i = 1; i<=m; i++){
		for(int j = 1; j<=n; j++){
			A[i][j] = 1 + rand() % 30;
		}
	}
	
	cout << "\nMatriz A: \n";
	imprimeMatriz(A, m, n);
	
	cout << "\nDigite uma linha da matriz A e um n�mero para multiplicar essa linha: ";
	cin >> linha >> num;
	multiplicaLinha(A, linha, num, n);
	cout << "\nMatriz A com linha " << linha << " multiplicada por " << num << ":\n";
	imprimeMatriz(A, m, n);
	
	cout << "\nDigite outro n�mero para multiplicar os m�ltiplos de 3 da matriz A: \n";
	cin >> num2;
	ajustaMatriz(A,num2,m,n);
	
	cout << "\nMatriz A com n�meros m�ltiplos de 3 multiplicados por " << num2 << ":\n";
	imprimeMatriz(A, m, n);
	
}

void imprimeMatriz(int m[][10], int l, int c){
	
	for(int i = 1; i<=l; i++){
		for(int j = 1; j<=c; j++){
			cout << m[i][j] << setw(5);
		}
		cout << "\n------------------------\n";
	}
}

void multiplicaLinha(int m[][10], int l, int k, int n){

	for(int i = 1; i<=l; i++){
		for(int j = 1; j<=n; j++){
			if(i == l){
				m[i][j] = m[i][j] * k;
			}
		}
	}
}

void ajustaMatriz(int ma[][10], int k, int m, int n){
	
	for(int i = 1; i<=m; i++){
		for(int j = 1; j<=n; j++){
			if (ma[i][j] % 3 == 0){
				ma[i][j] = ma[i][j] * k;
			}
		}
	}
}


