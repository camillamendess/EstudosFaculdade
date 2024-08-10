// Camilla, Deyvson, Guilherme
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int escolha;
        double celsius, fahrenheit; 
               
        System.out.println("-- ESCOLHA O TIPO DA CONVERSÃO --");
        System.out.println("-- 1) Celsius para Fahrenheit --");
        System.out.println("-- 2) Fahrenheit para Celsius --");    
        escolha = teclado.nextInt();     
        
        switch (escolha){
            case 1:
                System.out.println("-- Celsius para Fahrenheit --");
                System.out.print("Grau Celsius: ");
                celsius = teclado.nextDouble();
                System.out.println("Convertido de Celsius para Fahrenheit: " + ((celsius*1.8)+32));
                break;
            case 2:
                System.out.println("-- Fahrenheit para Celsius --");
                System.out.print("Grau Fahrenheint: ");
                fahrenheit = teclado.nextDouble();
                System.out.println("Convertido de Fahrenheit para Celsius: " + ((fahrenheit-32)/1.8));                
                break;
        }
        
        teclado.close();
    }
}

