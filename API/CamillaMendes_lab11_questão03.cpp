/*Escreva um programa que recebe 20 valores inteiros positivos e armazena 10 desses valores no
vetor A e 10 no vetor B. Em seguida, o programa deve chamar uma função que recebe os dois
vetores como argumentos e preenche um terceiro vetor C de acordo com os seguintes critérios:
• Ci deverá receber 1 quando Ai for maior que Bi ;
• Ci deverá receber 0 quando Ai for igual a Bi ;
• Ci deverá receber -1 quando Ai for menor que Bi .
Por fim, o programa principal deve imprimir A, B e C.*/

#include <iostream>
using namespace std;
#include <locale>
#include <iomanip>

int main(){
	
	setlocale(LC_ALL,"Portuguese");

	const int tam = 10;
	int A[tam], B[tam], C[tam];
	
	cout << "Digite valores para o vetor A e B: ";
	for (int i = 1; i<=10; i++){
		cin >> A[i];
	}
		
	for (int i = 1; i<=10; i++){
		cin >> B[i];
	}
	
	for (int i = 1; i<=tam; i++){
		if (A[i] > B[i]){
			C[i] = 1;
		}
		else{
			if (A[i] == B[i]){
				C[i] = 0;
			}
			else{
				C[i] = -1;
			}
		}
	}

	cout << "Vetor A: ";
	for(int i = 1; i<=tam; i++){
		cout << A[i] << " ";
	}
	cout << endl;
	
	cout << "Vetor B: ";
	for(int i = 1; i<=tam; i++){
		cout << B[i] << " ";
	}
	cout << endl;
	
	cout << "Vetor C: ";
	for(int i = 1; i<=tam; i++){
		cout << C[i] << " ";
	}
	cout << endl;
}
