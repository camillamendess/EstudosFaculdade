/*Considere uma eleição presidencial com 4 candidatos. Ao votar, o eleitor informa, na urna
eletrônica, o número do seu candidato ou:
-> 0 para voto em branco; ou
-> qualquer número positivo para anular o voto.
O período de votação é finalizado quando o mesário digita um número negativo. Faça um
programa que mostre os resultados da eleição:
• O total de votos para cada candidato;
• O total de votos em branco;
• O total de votos nulos;*/

#include <iostream>
using namespace std;
#include <locale.h>

int main(){
	
	setlocale(LC_ALL,"Portuguese");
	
	int candidato = 1;
	int cand1 = 0;
	int cand2 = 0;
	int cand3 = 0;
	int cand4 = 0;
	int brancos = 0;
	int nulos = 0;
	
	cout << "Imforme o número do seu candidato: (1,2,3 ou 4)" << endl;
	cout << "0 para voto em branco, qualquer número positivo para anular o voto e um número negativo para finalizar a votação." << endl;
	cout << "Primeiro voto: " << endl;
	
	while(candidato >= 0){
		cin >> candidato;
		switch(candidato){
			case 0:
				brancos++;
				cout << "Próximo voto: " << endl;
				break;
			case 1:
				cand1++;
				cout << "Próximo voto: " << endl;
				break;
			case 2:
				cand2++;
				cout << "Próximo voto: " << endl;
				break;
			case 3:
				cand3++;
				cout << "Próximo voto: " << endl;
				break;
			case 4:
				cand4++;
				cout << "Próximo voto: " << endl;
				break;
			default:
				if(candidato < 0){
	 				break;
				}
				nulos++;
				cout << "Próximo voto: " << endl;
				break;
		}
	}
	
	cout << cand1 << " votos para o candidato 1." << endl;
	cout << cand2 << " votos para o candidato 2." << endl;
	cout << cand3 << " votos para o candidato 3." << endl;
	cout << cand4 << " votos para o candidato 4." << endl;
	cout << brancos << " votos brancos." << endl;
	cout << nulos << " votos nulos." << endl;
		
}
