/*Escreva um programa que receba 3 n�meros e chame uma fun��o que calcule:
(a) a m�dia aritm�tica dos n�meros dados;
(b) a m�dia ponderada (pesos: 1, 3 e 6); e
(c) a m�dia harm�nica.
O programa principal deve mostrar os resultados.

RESTRI��ES:
� N�o utilize vari�veis globais.
� O programa deve permanecer perguntando ao usu�rio se quer calcular as m�dias de tr�s
valores at� que ele informe que n�o.*/

#include <iostream>
using namespace std;
#include <locale>

int calculaMedia(float, float, float, float&, float&, float&);

int main(){
	
	setlocale(LC_ALL,"Portuguese");
	
	float n1, n2, n3, mediaArit, mediaPond, mediaHarm;
	char s;
	
	cout << "Digite tr�s n�meros: ";
	cin >> n1 >> n2 >> n3;
	
	calculaMedia(n1,n2,n3,mediaArit, mediaPond, mediaHarm);
	
	cout << "\nMA = " << mediaArit << endl;
	cout << "MP = " << mediaPond << endl;
	cout << "MH = " << mediaHarm << endl;
	
	cout << "\nQuer calcular m�dias de novo? Digite S/N: ";
	cin >> s;
	
	while((s == 's') || (s == 'S')){
		cout << "\nDigite tr�s n�meros: ";
		cin >> n1 >> n2 >> n3;

		calculaMedia(n1,n2,n3,mediaArit, mediaPond, mediaHarm);

		cout << "\nMA = " << mediaArit << endl;
		cout << "MP = " << mediaPond << endl;
		cout << "MH = " << mediaHarm << endl;

		cout << "\nQuer calcular m�dias de novo? Digite S/N: ";
		cin >> s;
	}
	
}

int calculaMedia(float a, float b, float c, float& m1, float& m2, float& m3){
	
	m1 = (a+b+c)/3;
	m2 = ((a*1)+(b*3)+(c*6))/10;
	m3 = 3/((1/a)+(1/b)+(1/c));
	
}
