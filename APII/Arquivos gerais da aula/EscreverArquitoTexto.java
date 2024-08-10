import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/* Questão 8 - Não, os dados antigos não continuam no arquivo e os novos ficam no lugar. Ao modificar o FileWriter colocando
o true, os dados antigos continuam no arquivo, mesmo ao adicionar novos dados.*/

public class EscreverArquitoTexto {
    public static void main(String[] args) {
    String nome;
    long matricula;
    File arquivo = new File("aluno.txt");
    FileWriter fw = null;
    BufferedWriter gravarArq = null;
    BufferedReader br = null;

    try{ // Escrever
        fw = new FileWriter(arquivo, true); 
        gravarArq = new BufferedWriter(fw);
        int op = 1;
        while (op !=0){
            nome = JOptionPane.showInputDialog("Digite o nome do aluno");
            matricula = Long.parseLong(JOptionPane.showInputDialog("Digite a matricula do aluno"));
            gravarArq.write (nome);
            gravarArq.write("\t " + matricula);
            gravarArq.newLine();
            gravarArq.flush();
            op = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar outro aluno?\n 1 - sim \n 0 - não"));
        }
    } catch (IOException e){
        JOptionPane.showMessageDialog(null,e.getMessage());
    } finally {
        try {
            if (gravarArq!=null){
                gravarArq.close();
            }
    } catch (IOException e){
        JOptionPane.showMessageDialog(null,e.getMessage());
    }

    // Aparecer na tela

    try(FileReader fr = new FileReader(arquivo)){
        br = new BufferedReader(fr);
        while(br.ready()){
            String linha = br.readLine();
            JOptionPane.showMessageDialog(null, linha);
        }
        fr.close();
        br.close();
    } catch (IOException ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
    }
}
}