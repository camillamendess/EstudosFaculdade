/*Fa�a um programa que leia um nome de usu�rio e a sua senha. O programa n�o deve aceitar a
senha igual ao nome do usu�rio. Caso o usu�rio entre com senha e nome iguais, deve mostrar
uma mensagem de erro e voltar a pedir as informa��es.
O programa deve dar at� 10 chances ao usu�rio. Caso ele n�o entre com uma senha v�lida,
ap�s 10 tentativas o programa deve emitir uma mensagem e encerrar.
DICA: Para ler e armazenar uma cadeia de caracteres, use o tipo string.*/

#include <iostream>
using namespace std;
#include <locale.h>

int main(){
	
	setlocale(LC_ALL,"Portuguese");
	 
	string nome("*******");
	string senha("*******");
	int cont = 1;

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
		cont++;
		if (cont == 10){
			cout << "J� foram 10 tentativas. Encerrando o programa!" << endl;
			return 0;
		}
	}
}
