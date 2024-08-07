/*Faça um programa que verifique se uma letra digitada é vogal ou consoante.
DICA: Para testar mais de uma condição na estrutura de seleção, use um operador lógico que seja
adequado à sua necessidade (ou uma combinação deles).*/

#include <iostream>
using namespace std;

int main(){
	
	setlocale(LC_ALL,"Portuguese");

	char letra;
	
	cout << "Digite uma letra:" << endl;
	cin >> letra;
	
	if((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra =='u')){
		cout << "A letra " << letra << " é uma vogal!" << endl;
	}
	else{
		cout << "A letra " << letra << " é uma consoante!" << endl;
	}
}
