/*Escreva um programa para jogar par ou �mpar com o computador. O seu programa deve pedir ao
jogador para escolher entre par ou �mpar e em seguida escolher um n�mero entre 0 e 10. Em seguida,
um n�mero entre 0 e 10 deve ser gerado para representar a jogada do computador. O programa ent�o
deve dizer quem ganhou e perguntar se o jogador quer outra rodada. Caso ele informe que sim, o
processo se repete.
RESTRI��ES:
1. O programa deve chamar as seguintes fun��es:
 -> jogo
 - solicita ao jogador que escolha par ou �mpar (�p� ou �P� para par e �i� ou �I� para �mpar);
 - solicita ao jogador que escolha um inteiro;
 - chama a fun��o numero_computador.
 - verifica quem ganhou a rodada e retorna 'j' para jogador e 'c' para computador.
 -> numero_computador
 - gera um n�mero aleat�rio entre 0 e 10 e retorna esse n�mero.
2. N�o use qualquer vari�vel global.
3. Crie um projeto com as fun��es:
� main;
� jogo;
� numero_computador;
e um arquivo com o cabe�alho das fun��es. Observe que voc� dever� incluir (#include) o arquivo
de cabe�alhos em cada fun��o.*/

#include <iostream>
using namespace std;
#include <locale>
#include <cstdlib>
#include <ctime>

int numero_computador(int);
char jogo();

int main(){
	
	setlocale(LC_ALL,"Portuguese");
	srand(time(0));
	
	char sn;
	
	if (jogo() == 'j'){
		cout << "Voc�.";
	}
	else{
		cout << "Computador.";
	}

	cout << "\n\nMais uma rodada (S/N)? ";
	cin >> sn;
	
	while((sn == 's') || (sn == 'S')){
		
		if (jogo() == 'j'){
		cout << "Voc�.";
		}
		else{
			cout << "Computador.";
		}
		
		cout << "\n\nMais uma rodada (S/N)? ";
		cin >> sn;
	}
	
}

char jogo(){

	char p;
	int num1, num2, resultado;

	cout << "\n-----------------------------------------------------";
	cout << "\nPar ou Impar? \np para par\ni para impar: ";
	cin >> p;
	cout << "Digite sua jogada: ";
	cin >> num1;
	cout << "\n-----------------------------------------------------\n";

	cout << "\nSua escolha: ";

	if ((p == 'p') || (p == 'P')){
		cout << "PAR";
	}
	else{
		cout << "IMPAR";
	}

	cout << "\nSua Jogada: " << num1;
	num2 = numero_computador(num2);
	cout << "\nJogada do Computador: " << num2;

	cout << "\nResultado: ";

	resultado = num1 + num2;

	if (resultado % 2 == 0){
		cout << num1 << " + " << num2 << " = " << resultado << " que � PAR";
	}
	else{
		cout << num1 << " + " << num2 << " = " << resultado << " que � IMPAR";
	}

	cout << "\nVencedor da jogada: ";

	if(((p == 'p') || (p == 'P')) && (resultado % 2 == 0)){
		return 'j';
	}
	else{
		if (((p == 'i') || (p == 'I')) && (resultado % 2 != 0)){
			return 'j';
		}
		else{
			return 'c';
		}
	}

}

int numero_computador(int aleatorio){

	aleatorio = rand() % 10;
	return aleatorio;
}
