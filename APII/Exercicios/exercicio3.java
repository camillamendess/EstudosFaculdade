/*Uma empresa precisa realizar uma estatística do salário de seus funcionários. Para isto precisa de um
programa que leia uma lista contendo os salários dos funcionários da empresa, e imprima quantos
funcionários ganham salário acima da média. Sabe-se que a empresa possui 50 funcionários. Defina a
constante NUM_FUNCIONARIO para guardar a quantidade de funcionários da empresa.*/

import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int NUM_FUNCIONARIO = 50;
        int acimaMedia = 0;

        int[] vetor = new int[NUM_FUNCIONARIO];  

        
        for(int i=0; i<NUM_FUNCIONARIO; i++){                             
            System.out.println("Digite o salário:");   
            vetor[i] = teclado.nextInt();             
        }

        for(int i=0; i<NUM_FUNCIONARIO; i++){     // como eu não sabia a média, decidi que seria R$ 1500 
            if(vetor[i] >= 1500){
                acimaMedia++;
            }
        }

        System.out.println(acimaMedia + " funcionarios ganham acima da média.");
    }
}
