/*Faça uma função que recebe, por parâmetro, a hora de início e a hora de término de um jogo, ambas
subdivididas em 2 valores distintos: horas e minutos. A função deve retornar, também por parâmetro,
a duração do jogo em horas e minutos, considerando que o tempo máximo de duração de um jogo é
de 24 horas e que o jogo pode começar em um dia e terminar no outro.*/

#include <iostream>
using namespace std;
#include <locale>

int tempo(int, int, int, int, int, int);

int main(){
	
	setlocale(LC_ALL,"Portuguese");
	
	int horas1, horas2, minutos1, minutos2, horatotal, minutototal;
	
	cout << "\nDigite a hora de inicio em formato de hora:minutos\nHoras:";
	cin >> horas1;
	cout << "\nMinutos:";
	cin >> minutos1;
	
	
	cout << "\nDigite a hora de término em formato de hora:minutos\nHoras:";
	cin >> horas2;
	cout << "\nMinutos:";
	cin >> minutos2;
	
	cout << "\nTempo de duração do jogo: ";
	tempo(horas1, horas2, minutos1, minutos2, horatotal, minutototal);
	

}

int tempo(int hora1, int hora2, int minuto1, int minuto2, int horatotal, int minutototal){
	
	int inicio = (hora1*60) + minuto1;
	int termino = (hora2*60) + minuto2;
	
	if((termino > inicio)){
		horatotal = hora2 - hora1;
		minutototal = minuto2 - minuto1;
	}
	else {
		if ((termino < inicio)){
			horatotal = (23 - hora1) + hora2;
			minutototal = (60 - minuto1) + minuto2;
		}
	}
	
 cout << horatotal << "h " << minutototal << "min ";

}
