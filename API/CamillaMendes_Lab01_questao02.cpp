/*Fa�a um programa que verifique se uma letra digitada � vogal ou consoante.
DICA: Para testar mais de uma condi��o na estrutura de sele��o, use um operador l�gico que seja
adequado � sua necessidade (ou uma combina��o deles).*/

#include <iostream>
using namespace std;

int main(){
	
	setlocale(LC_ALL,"Portuguese");

	char letra;
	
	cout << "Digite uma letra:" << endl;
	cin >> letra;
	
	if((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra =='u')){
		cout << "A letra " << letra << " � uma vogal!" << endl;
	}
	else{
		cout << "A letra " << letra << " � uma consoante!" << endl;
	}
}
