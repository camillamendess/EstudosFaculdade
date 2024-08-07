/*Faça uma função recursiva que calcule o M.D.C. (máximo divisor comum) entre dois valores fornecidos
pelo usuário observando a técnica abaixo. Por exemplo: m.d.c. de 12 e 20 é 4.*/

#include <iostream>
using namespace std;
#include <locale>

int mdc(int, int);

int main(){
	
	setlocale(LC_ALL,"Portuguese");
	
	int n1, n2;
	
	cout << "Digite dois números para calcular o mdc: ";
	cin >> n1 >> n2;
	cout << "O mdc de " << n1 << " e " << n2 << " é " << mdc(n1,n2);
}

int mdc(int x, int y){
	if(x == y){
		return x;
	}
	else{
		if (x > y){
			return mdc(x-y,y);
		}
		else{
			return mdc(y,x);
		}
	}
}
