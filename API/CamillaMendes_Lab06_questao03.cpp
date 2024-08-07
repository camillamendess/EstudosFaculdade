/*Fazer um programa que pergunta uma medida em metros e imprime o valor correspondente em
dec�metros, cent�metros e mil�metros. Para cada unidade, o programa deve chamar uma fun��o
distinta para fazer a convers�o, isto �, uma fun��o chamada decimetro, outra chamada
centimetro e outra chamada milimetro.*/

#include <iostream>
using namespace std;
#include <locale>

int decimetro(int);
int centimetro (int);
int milimetro(int);

int main(){
	
	setlocale(LC_ALL,"Portuguese");
	
	int metros;
	
	cout << "Qual a medida em metros? ";
	cin >> metros;
	cout << "\nDec�metros: " << decimetro(metros);
	cout << "\nCent�metros: " << centimetro(metros);
	cout << "\nMil�metros: " << milimetro(metros);

}

int decimetro(int d){
	return d*10;
}

int centimetro(int c){
	return c * 100;
}

int milimetro(int m){
	return m * 1000;
}
