/*Escreva uma função que calcule e retorne a distância entre dois pontos (x1, y1) e (x2, y2). Todos os
números e valores de retorno devem ser do tipo float. Escreva um programa que receba as
coordenadas de dois pontos, chame a função e imprima a distância entre eles.*/

#include <iostream>
using namespace std;
#include <locale>
#include <cmath>

float calcula(float, float, float, float);

int main(){

	setlocale(LC_ALL,"Portuguese");
	
	float x1,x2,y1,y2, distancia;
	
	cout << "Digite as coordenadas de dois pontos: ";
	cout << "\nPrimeiro ponto: ";
	cin >> x1 >> y1;
	cout << "\nSegundo ponto: ";
	cin >> x2 >> y2;
	
	distancia = calcula(x1,y1,x2,y2);
	
	cout << "A distância é " << distancia;

}

float calcula(float x1, float y1, float x2, float y2){

	float d;
	
	d = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
	return d;
	
}

