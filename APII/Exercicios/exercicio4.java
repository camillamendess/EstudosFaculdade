/*Alteração da questão anterior. Considerando que não há um número fixo de 50 funcionários, o
programa pergunta no início quantos funcionários a empresa possui e realiza o restante do processo.*/

import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int acimaMedia = 0;

        System.out.println("Quantos funcionarios a empresa possui?");
        num = teclado.nextInt();

        int[] vetor = new int[num];  

        
        for(int i=0; i<num; i++){                             
            System.out.println("Digite o salário do funcionario " + i);   
            vetor[i] = teclado.nextInt();             
        }

        for(int i=0; i<num; i++){    
            if(vetor[i] >= 1500){
                acimaMedia++;
            }
        }

        System.out.println(acimaMedia + " funcionarios ganham acima da média.");
    }
}
