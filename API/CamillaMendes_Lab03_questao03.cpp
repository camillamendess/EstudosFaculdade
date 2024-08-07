/*O gasto mensal de uma empresa com combust�vel � controlado da seguinte maneira. Cada um
dos 15 ve�culos da frota � abastecido duas vezes por m�s. Sempre que um ve�culo � abastecido,
o motorista pega a nota fiscal no posto e entrega ao encarregado do setor de transporte. Ao
final do m�s, o encarregado soma todas as notas e divide o total pelo n�mero de ve�culos para
determinar o gasto m�dio por ve�culo em cada m�s.
Fa�a um programa para ajudar o encarregado nesta tarefa. O programa dever� ler o valor das
notasfiscais referentes �s compras de combust�vel do m�s e imprimir o gasto m�dio por ve�culo.*/

#include <iostream>
using namespace std;
#include <locale.h>

int main(){
	
	setlocale(LC_ALL, "Portuguese");
	
	float notaf1, notaf2, media;
	int veiculos[15];
	int soma1[15];
	int soma = 0;
	
	for(int i = 0; i<15; i++){
		cout << "Digite o valor da primeira nota fiscal do ve�culo " << i+1 << endl;
		cin >> notaf1;
		cout << "Digite o valor da segunda nota fiscal do ve�culo " << i+1 << endl;
		cin >> notaf2;
		
		soma1[i] = notaf1+notaf2;

	}
	
	for (int i = 0; i<15; i++){
		soma = soma + soma1[i];
	}
	
	media = soma/15;
	
	cout << "O gasto m�dio por ve�culo � igual a " << media;
	
}
