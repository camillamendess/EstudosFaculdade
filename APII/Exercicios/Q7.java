//Alunos: Camilla, Deyvson, Guilherme
import java.util.Scanner;      
import javax.swing.JOptionPane;
public class Q7 {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[] vetor = new int[10];
        String lista = "";

        for (int i=0; i<10; i++){
            System.out.println("Digite um inteiro: ");
            vetor[i] = teclado.nextInt();
        }

        for(int i=0; i<10; i++){
            int x = vetor[i] % 2;
            if (x == 0){
                vetor[i] = 1;
            }
            else {
                vetor[i] = -1;
            }

            lista += vetor[i] + "\n";  
        }
       
        JOptionPane.showMessageDialog(null, "Os valores do vetor ficaram da seguinte forma: \n" + lista);
        
        teclado.close();
    }
}  