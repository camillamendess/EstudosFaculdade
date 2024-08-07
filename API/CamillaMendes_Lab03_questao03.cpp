/*O gasto mensal de uma empresa com combustível é controlado da seguinte maneira. Cada um
dos 15 veículos da frota é abastecido duas vezes por mês. Sempre que um veículo é abastecido,
o motorista pega a nota fiscal no posto e entrega ao encarregado do setor de transporte. Ao
final do mês, o encarregado soma todas as notas e divide o total pelo número de veículos para
determinar o gasto médio por veículo em cada mês.
Faça um programa para ajudar o encarregado nesta tarefa. O programa deverá ler o valor das
notasfiscais referentes às compras de combustível do mês e imprimir o gasto médio por veículo.*/

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
		cout << "Digite o valor da primeira nota fiscal do veículo " << i+1 << endl;
		cin >> notaf1;
		cout << "Digite o valor da segunda nota fiscal do veículo " << i+1 << endl;
		cin >> notaf2;
		
		soma1[i] = notaf1+notaf2;

	}
	
	for (int i = 0; i<15; i++){
		soma = soma + soma1[i];
	}
	
	media = soma/15;
	
	cout << "O gasto médio por veículo é igual a " << media;
	
}
