/*Sua organiza��o acaba de contratar um estagi�rio para trabalhar no Suporte de Inform�tica, com a inten��o de
fazer um levantamento nas sucatas encontradas nesta �rea. A primeira tarefa dele � testar todos os cerca de
200 teclados que se encontram l�, testando e anotando o estado de cada um, para verificar o que se pode
aproveitar deles.
Foi requisitado que voc� desenvolva um programa para registrar este levantamento. O programa dever�
receber um n�mero indeterminado de entradas, cada uma contendo: um n�mero de identifica��o do teclado e
o tipo de defeito:
1 necessita da substitui��o de teclas;
2 necessita de limpeza;
3 necessita troca do cabo ou conector;
4 quebrado ou inutilizado.
5 funcionando normalmente.
Uma identifica��o igual a zero encerra a entrada.*/

#include <iostream>
using namespace std;
#include <locale.h>

int main(){
	
	setlocale(LC_ALL,"Portuguese");
	
	int n;
	int quant = 0;
	int subs = 0;
	int limpeza = 0;
	int troca = 0;
	int quebrado = 0;
	int funcionando = 0;
	
	cout << "Digite o defeito do teclado: " << endl;
	cin >> n;
	
	
	while(n != 0){
		
		switch(n){
			case 1:
				subs++;
				quant++;
				cout << "Digite o defeito do teclado: " << endl;
				cin >> n;
				break;
			case 2:
				limpeza++;
				quant++;
				cout << "Digite o defeito do teclado: " << endl;
				cin >> n;
				break;
			case 3:
				troca++;
				quant++;
				cout << "Digite o defeito do teclado: " << endl;
				cin >> n;
				break;
			case 4:
				quebrado++;
				quant++;
				cout << "Digite o defeito do teclado: " << endl;
				cin >> n;
				break;
			case 5:
				funcionando++;
				quant++;
				cout << "Digite o defeito do teclado: " << endl;
				cin >> n;
				break;
		}
	}
		
		cout << "\nQuantidade de teclados: " << quant << endl;
		cout << "\nSitua��o                          " << "Quantidade  " << " Percentual    " << endl;
		cout << "1- requer troca de teclas             " << subs <<       "           "<< (subs*100)/quant << endl;
		cout << "2- requer limpeza                     " << limpeza <<    "           "<< (limpeza*100)/quant << endl;
		cout << "3- requer troca de cabo/conector      " << troca <<      "           "<< (troca*100)/quant << endl;
		cout << "4- quebrado ou inutilizado            " << quebrado <<   "           "<< (quebrado*100)/quant << endl;
		cout << "5- funcionando normalmente            " << funcionando <<"           "<< (funcionando*100)/quant << endl;
		
}

		

