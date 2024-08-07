/*Escreva um programa para jogar par ou �mpar com o computador. O seu programa deve pedir ao
jogador para escolher entre par ou �mpar e em seguida escolher um n�mero entre 0 e 10. Em seguida,
um n�mero entre 0 e 10 deve ser gerado para representar a jogada do computador. O programa ent�o
deve dizer quem ganhou e perguntar se o jogador quer outra rodada. Caso ele informe que sim, o
processo se repete. Um placar tamb�m deve ser mantido e apresentado pelo programa.
RESTRI��ES:
1. O programa deve chamar as seguintes fun��es:
-> jogo
- solicita ao jogador que escolha par ou �mpar (0 para par e 1 para �mpar);
- solicita ao jogador que escolha um inteiro;
- chama a fun��o numero_computador.
- verifica quem ganhou a rodada e retorna 'j' para jogador e 'c' para computador.
-> numero_computador
- gera um n�mero aleat�rio entre 0 e 10 e retorna esse n�mero.
-> placar
- recebe o ganhador da rodada (j ou c), atualiza e mostra o placar.
2. N�o use qualquer vari�vel global.
DICA: use vari�veis est�ticas em placar.*/

#include <iostream>
using namespace std;
#include <locale>
#include <cstdlib>
#include <ctime>

int numero_computador(int);
char jogo();
void placar(char);

int main(){
	
	setlocale(LC_ALL,"Portuguese");
	srand(time(0));
	
	char sn, x;
	
	x = jogo();
	
	if (x == 'j'){
		cout << "Voc�.\n";
	}
	else{
		cout << "Computador.\n";
	}

	placar(x);

	cout << "\n\nMais uma rodada (S/N)? ";
	cin >> sn;
	
	while((sn == 's') || (sn == 'S')){

		x = jogo();
		
		if (x == 'j'){
		cout << "Voc�.\n";
		}
		else{
			cout << "Computador.\n";
		}

		placar(x);
		
		cout << "\n\nMais uma rodada (S/N)? ";
		cin >> sn;
	}
	
}

char jogo(){

	char p, x;
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
		x = 'j';
	}
	else{
		if (((p == 'i') || (p == 'I')) && (resultado % 2 != 0)){
			x = 'j';
		}
		else{
			x = 'c';
		}
	}
	
	return x;

}

int numero_computador(int aleatorio){

	aleatorio = rand() % 10;
	return aleatorio;
}

void placar(char aux){
	
	static int j = 0;
	static int c = 0;
	if(aux == 'j'){
		j++;
	}
	else{
		c++;
	}
	
	cout << "\n=============== PLACAR =================";
	cout << "\n     Voc�: " << j << "         Computador: " << c << endl;
	cout << "========================================\n";
	
	
}
