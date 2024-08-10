/*Uma escola do fundamental quer usar um programa para ajudar seus alunos a calcular a área de figuras
geométricas. Para isto, o programa deve solicitar o tipo da figura (triângulo, retângulo, círculo, etc),
solicitar os dados necessários para calcular a área e então imprimir o valor da área calculada.*/

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        int tipo;
        float area, b, h, l1, l2, r;

        System.out.println("Qual o tipo da figura?");
        System.out.println("1 - Triângulo\n2 - Retângulo\n3 - Círculo\nDigite o número correspondente: ");
        tipo = teclado.nextInt();


        if (tipo == 1){

            System.out.println("Qual a base?");
            b = teclado.nextFloat();
            System.out.println("Qual a altura?");
            h = teclado.nextFloat();

            area = b*h/2;
            System.out.println("A área do triângulo é " + area);
        }

        if (tipo == 2){
            System.out.println("Qual o valor do lado menor?");
            l1 = teclado.nextFloat();
            System.out.println("Qual o valor do lado maior?");
            l2 = teclado.nextFloat();
            
            area = l1 * l2;
            System.out.println("A área do retangulo é " + area);

        }

        if (tipo == 3){
            System.out.println("Qual o valor do raio?");
            r = teclado.nextFloat();
            area = (float) (3.14 * Math.pow(r, 2));

            System.out.println("A área do círculo é " + area);
        }

        teclado.close();
    }
}

