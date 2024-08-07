/*Escreva um programa para jogar par ou ímpar com o computador. O seu programa deve pedir ao
jogador para escolher entre par ou ímpar e em seguida escolher um número entre 0 e 10. Em seguida,
um número entre 0 e 10 deve ser gerado para representar a jogada do computador. O programa então
deve dizer quem ganhou e perguntar se o jogador quer outra rodada. Caso ele informe que sim, o
processo se repete.
RESTRIÇÕES:
1. O programa deve chamar as seguintes funções:
 -> jogo
 - solicita ao jogador que escolha par ou ímpar (‘p’ ou ‘P’ para par e ‘i’ ou ‘I’ para ímpar);
 - solicita ao jogador que escolha um inteiro;
 - chama a função numero_computador.
 - verifica quem ganhou a rodada e retorna 'j' para jogador e 'c' para computador.
 -> numero_computador
 - gera um número aleatório entre 0 e 10 e retorna esse número.
2. Não use qualquer variável global.
3. Crie um projeto com as funções:
• main;
• jogo;
• numero_computador;
e um arquivo com o cabeçalho das funções. Observe que você deverá incluir (#include) o arquivo
de cabeçalhos em cada função.*/

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
		cout << "Você.";
	}
	else{
		cout << "Computador.";
	}

	cout << "\n\nMais uma rodada (S/N)? ";
	cin >> sn;
	
	while((sn == 's') || (sn == 'S')){
		
		if (jogo() == 'j'){
		cout << "Você.";
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
		cout << num1 << " + " << num2 << " = " << resultado << " que é PAR";
	}
	else{
		cout << num1 << " + " << num2 << " = " << resultado << " que é IMPAR";
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
