/*Escreva um programa que receba 3 números e chame uma função que calcule:
(a) a média aritmética dos números dados;
(b) a média ponderada (pesos: 1, 3 e 6); e
(c) a média harmônica.
O programa principal deve mostrar os resultados.

RESTRIÇÕES:
• Não utilize variáveis globais.
• O programa deve permanecer perguntando ao usuário se quer calcular as médias de três
valores até que ele informe que não.*/

#include <iostream>
using namespace std;
#include <locale>

int calculaMedia(float, float, float, float&, float&, float&);

int main(){
	
	setlocale(LC_ALL,"Portuguese");
	
	float n1, n2, n3, mediaArit, mediaPond, mediaHarm;
	char s;
	
	cout << "Digite três números: ";
	cin >> n1 >> n2 >> n3;
	
	calculaMedia(n1,n2,n3,mediaArit, mediaPond, mediaHarm);
	
	cout << "\nMA = " << mediaArit << endl;
	cout << "MP = " << mediaPond << endl;
	cout << "MH = " << mediaHarm << endl;
	
	cout << "\nQuer calcular médias de novo? Digite S/N: ";
	cin >> s;
	
	while((s == 's') || (s == 'S')){
		cout << "\nDigite três números: ";
		cin >> n1 >> n2 >> n3;

		calculaMedia(n1,n2,n3,mediaArit, mediaPond, mediaHarm);

		cout << "\nMA = " << mediaArit << endl;
		cout << "MP = " << mediaPond << endl;
		cout << "MH = " << mediaHarm << endl;

		cout << "\nQuer calcular médias de novo? Digite S/N: ";
		cin >> s;
	}
	
}

int calculaMedia(float a, float b, float c, float& m1, float& m2, float& m3){
	
	m1 = (a+b+c)/3;
	m2 = ((a*1)+(b*3)+(c*6))/10;
	m3 = 3/((1/a)+(1/b)+(1/c));
	
}
