// Camilla, Deyvson, Guilherme
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int escolha = 3;
        double celsius, fahrenheit;  
         
        do{
            String menu = menu();
            System.out.println(menu);

            System.out.print("Escolha: ");
            escolha = teclado.nextInt();

            if (escolha == 1){
                
                System.out.print("Digite a temperatura em Celsius para converter em °F: ");
                celsius = teclado.nextDouble();

                double convertCemF = CelsiusparaFahrenheit(celsius);
                System.out.println("A temperatura convertida é = " + convertCemF + " °F");

            }

            if (escolha == 2){

                System.out.println("Digite a temperatura em Fahrenheit para converter em Celsius:");
                fahrenheit = teclado.nextDouble();

                double convertFemC = FahrenheitparaCelsius(fahrenheit);
                System.out.println("A temperatura convertida é = " + convertFemC + " °C");
            }
            
            if(escolha == 0){
                break;
            }
        }while(escolha != 0);
        
        teclado.close();
    }

    public static String menu(){
        return "Digite:\n" +
        "1 - Converter de Celsius para Fahrenheit \n" +
        "2 - Converter de Fahrenheit para Celsius \n"+
        "0 - para sair";
    }

    public static double CelsiusparaFahrenheit(double celsius) {
        return (celsius*1.8)+32;
    }

    public static double FahrenheitparaCelsius(double fahrenheit) {
        return (fahrenheit-32)/1.8;
    }
}

