/* Camilla Novaes Mendes - 202011231
 * João Paulo Sandes Brito - 202110811
 */

import java.util.Random;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Loterica {

    public static void main(String[] args) throws Exception {
        // Instanciar as duas filas
        FilaEncadeada FilaNormal = new FilaEncadeada();
        FilaEncadeada FilaIdoso = new FilaEncadeada();

        // Adicionar pessoa a fila correspondente
        try {
            File arquivoEntrada = new File("Clientes.txt");
            Scanner scanner = new Scanner(arquivoEntrada);

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] campos = linha.split(" ");

                if ((Integer.parseInt(campos[1])) >= 60) {
                    System.out.println("Idoso:" + campos[0]);
                    FilaIdoso.enfileirar(campos[0]);
                } else {
                    System.out.println("Normal:" + campos[0]);
                    FilaNormal.enfileirar(campos[0]);
                }

            }

            scanner.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo.");
            e.printStackTrace();
        }

        // Começar a atender
        while (true) {
            if (!FilaIdoso.estaVazia()) {
                // Chama um idoso para atendimento se a fila preferencial nao estiver vazia
                String pessoa = (String) FilaIdoso.desenfileirar();
                Random gerador = new Random();
                double t = gerador.nextDouble();
                System.out.println("Atendimento Preferencial" + pessoa + " por " + t + " s");
                try {
                    Thread.sleep((int) t * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } else {
                if (!FilaNormal.estaVazia()) {
                    // Chama uma pessoa para atendimento se a fila preferencial estiver vazia
                    String pessoa = (String) FilaNormal.desenfileirar();
                    Random gerador = new Random();
                    double t = gerador.nextDouble();
                    System.out.println("Atendimento " + pessoa + " por " + t + " s");
                    try {
                        Thread.sleep((int) t * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else{
                    break; // se nao tiver mais pessoas na fila para de antender
                }

            }

        }

    }
}
