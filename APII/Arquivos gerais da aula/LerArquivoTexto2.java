import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/* Questão 10 - O programa faz o arquivo "aluno.txt" aparecer no terminal. */

public class LerArquivoTexto2 {
    public static void main(String[] args) {
        String nome;
        long matricula;
        File arquivo = new File ("aluno.txt");
        
        try (Scanner lerArq = new Scanner(new FileReader(arquivo))){
            while (lerArq.hasNext()){
            nome = lerArq.next();
            matricula = lerArq.nextLong();
            System.out.println(nome + " - " + matricula);
        }
    
        lerArq.close();
    
        } catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
}