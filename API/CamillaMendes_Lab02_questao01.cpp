/*Fa�a um programa que leia um nome de usu�rio e a sua senha. O programa n�o deve aceitar a
senha igual ao nome do usu�rio. Caso o usu�rio entre com senha e nome iguais, deve mostrar
uma mensagem de erro e voltar a pedir as informa��es.
DICA: Para ler e armazenar uma cadeia de caracteres, use o tipo string.*/

#include <iostream>
using namespace std;
#include <locale.h>
#include <string>

int main(){
	
	setlocale(LC_ALL, "Portuguese");
	
	string nome("Usuario");
	string senha("senhaaa");
	
	cout << "Digite um nome de usu�rio com at� 7 d�gitos: " << endl;
	cin >> nome;
	cout << "Digite uma senha com at� 7 d�gitos: " << endl;
	cin >> senha;
	
	while(nome == senha){
		cout << "ERRO! Senhas iguais!\n";
		cout << "Digite um nome de usu�rio com at� 6 d�gitos: " << endl;
		cin >> nome;
		cout << "Digite uma senha com at� 6 d�gitos: " << endl;
		cin >> senha;
	}
	
}

