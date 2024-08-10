//Alunos: Camilla, Deyvson, Guilherme
import java.util.Scanner;      // importa a classe Scanner para receber os valores do usuário.
import javax.swing.JOptionPane;
public class Q6 {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in); 
        final int CONST = 10;
          
        String j = "";
        double[] vetor = new double[CONST];  

        for(int i=0; i<CONST; i++){                             
            vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (i+1) + "valor: "));   
            j += vetor[i] + "\n";                   
        }

                                     
        JOptionPane.showMessageDialog(null, "Os valores digitados foram: \n" + j);     
        teclado.close();
    }   
}