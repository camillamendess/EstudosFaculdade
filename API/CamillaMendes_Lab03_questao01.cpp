/*Faça um programa que leia um nome de usuário e a sua senha. O programa não deve aceitar a
senha igual ao nome do usuário. Caso o usuário entre com senha e nome iguais, deve mostrar
uma mensagem de erro e voltar a pedir as informações.
O programa deve dar até 10 chances ao usuário. Caso ele não entre com uma senha válida,
após 10 tentativas o programa deve emitir uma mensagem e encerrar.
DICA: Para ler e armazenar uma cadeia de caracteres, use o tipo string.*/

#include <iostream>
using namespace std;
#include <locale.h>

int main(){
	
	setlocale(LC_ALL,"Portuguese");
	 
	string nome("*******");
	string senha("*******");
	int cont = 1;

	cout << "Digite um nome de usuário com até 7 dígitos: " << endl;
	cin >> nome;
	cout << "Digite uma senha com até 7 dígitos: " << endl;
	cin >> senha;

	while(nome == senha){
		cout << "ERRO! Senhas iguais!\n";
		cout << "Digite um nome de usuário com até 6 dígitos: " << endl;
		cin >> nome;
		cout << "Digite uma senha com até 6 dígitos: " << endl;
		cin >> senha;
		cont++;
		if (cont == 10){
			cout << "Já foram 10 tentativas. Encerrando o programa!" << endl;
			return 0;
		}
	}
}
