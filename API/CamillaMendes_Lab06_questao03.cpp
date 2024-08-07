/*Fazer um programa que pergunta uma medida em metros e imprime o valor correspondente em
decímetros, centímetros e milímetros. Para cada unidade, o programa deve chamar uma função
distinta para fazer a conversão, isto é, uma função chamada decimetro, outra chamada
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
	cout << "\nDecímetros: " << decimetro(metros);
	cout << "\nCentímetros: " << centimetro(metros);
	cout << "\nMilímetros: " << milimetro(metros);

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
