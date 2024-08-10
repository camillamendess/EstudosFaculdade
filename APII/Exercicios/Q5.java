import java.util.Scanner;      // importa a classe Scanner para receber os valores do usuário.

public class Q5 {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System .in); // instancia entrada
        final int CONST = 10;  // declara a variavel CONST

        double[] vetor = new double[CONST];  // cria um vetor double, recebendo CONST como o tamanho do array

        for(int i=0; i<CONST; i++){  // cria o laço para receber informações do teclado
            System.out.println("Digite o valor: "); // mensagem informando/solicitando o usuário digitar um valor
            vetor[i] = teclado.nextDouble(); // armazena o valor digitado pelo usuário a partir do índice 0
        }
        for(int i=0; i<CONST; i++){ // cria o laço para mostrar informações na tela
            System.out.println((i+1) + " - " + vetor[i]);    // imprime linha por linha do vetor, mostrando seus componentes.
        }
        // RESUMO: colhe dados do usuário, armazena num vetor do índice 0 ao 9 e informa sequencialmente os números como double
    }   
}