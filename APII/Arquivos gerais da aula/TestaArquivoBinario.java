import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// 1 - Os dados são gravados em binário, impossivel ser lido por nós, humanos..

public class TestaArquivoBinario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList <Pessoa> pessoas = new ArrayList<>();
        String nome;
        char sexo;
        int idade;
        double peso;
        double altura;
        File arquivo = new File("teste.dat");
        FileInputStream arq2 = null;
        try{
            FileOutputStream arq = new FileOutputStream(arquivo);
            DataOutputStream gravarArq = new DataOutputStream(arq);
            
            System.out.println("\nDigite o nome: ");
            nome = ler.nextLine();
            System.out.println("\nDigite o sexo (F/M): ");
            sexo = ler.next().charAt(0);
            System.out.println("\nDigite a idade: ");
            idade = ler.nextInt();
            System.out.println("\nDigite o peso: ");
            peso = ler.nextDouble();
            System.out.println("\nDigite a altura: ");
            altura = ler.nextDouble();
            gravarArq.writeUTF(nome);
            gravarArq.writeChar(sexo);
            gravarArq.writeInt(idade);
            gravarArq.writeDouble(peso);
            gravarArq.writeDouble(altura);
            System.out.println("\nDados gravados com sucesso!");
            arq.close();;
            gravarArq.close();
        } catch (FileNotFoundException e){
            System.out.println("Erro: " + e.getMessage());
        } catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }

        try{
            arq2 = new FileInputStream(arquivo);
            DataInputStream gravarArq2 = new DataInputStream(arq2);
            nome = gravarArq2.readUTF();
            sexo = gravarArq2.readChar();
            idade = gravarArq2.readInt();
            peso = gravarArq2.readDouble();
            altura = gravarArq2.readDouble();
            gravarArq2.close();
            Pessoa p1 = new Pessoa(nome, sexo, idade, peso, altura);
            pessoas.add(p1);
            System.out.println(pessoas);


        } catch (Exception ex){
            System.out.println(ex.getMessage());
        } finally {
            try {
                arq2.close();
            } catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        ler.close();
    }
}