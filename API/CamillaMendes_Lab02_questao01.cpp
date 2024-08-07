/*Faça um programa que leia um nome de usuário e a sua senha. O programa não deve aceitar a
senha igual ao nome do usuário. Caso o usuário entre com senha e nome iguais, deve mostrar
uma mensagem de erro e voltar a pedir as informações.
DICA: Para ler e armazenar uma cadeia de caracteres, use o tipo string.*/

#include <iostream>
using namespace std;
#include <locale.h>
#include <string>

int main(){
	
	setlocale(LC_ALL, "Portuguese");
	
	string nome("Usuario");
	string senha("senhaaa");
	
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
	}
	
}

