/*Altere o programa de conversão de Celsius(C) e Fahrenheit(F) para incluir também a escala Kelvin (K).
Este programa deve conter conversores entre as três escalas de temperatura (Celsius, Fahrenheit e Kelvin).*/

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int escolha = 3;
        double celsius, fahrenheit, kelvin; 

        String menu = menu();
        System.out.println(menu);

        System.out.print("Digite o número: ");
        escolha = teclado.nextInt();
         
        while(escolha != 0){

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

            if (escolha == 3){

                System.out.println("Digite a temperatura em Celsius para converter em Kelvin: ");
                celsius = teclado.nextDouble();

                double convertCemK = CelsiusParaKelvin(celsius);
                System.out.println("A temperatura convertida é " + convertCemK + " K ");
            }

            if (escolha == 4){

                System.out.println("Digite a temperatura em Kelvin para converter em Celsius: ");
                kelvin = teclado.nextDouble();

                double convertKemC = KelvinParaCelsius(kelvin);
                System.out.println("A temperatura convertida é " + convertKemC + " °C ");
            }

            if (escolha == 5){

                System.out.println("Digite a temperatura em Fahrenheit para converter em Kelvin: ");
                fahrenheit = teclado.nextDouble();

                double convertFemK = FahrenheitParaKelvin(fahrenheit);
                System.out.println("A temperatura convertida é " + convertFemK + " K ");

            }

            if (escolha == 6){

                System.out.println("Digite a temperatura em Kelvin para converter em Fahrenheit: ");
                kelvin = teclado.nextDouble();

                double convertKemF = KelvinParaFahrenheit(kelvin);
                System.out.println("A temperatura convertida é " + convertKemF + " °F ");
            }
            
            if(escolha == 0){
                break;
            }
            
            System.out.print("Deseja fazer outra conversão? S/s = Sim, N/n = Não \n");
            char sn = teclado.next().charAt(0);

            if ((sn == 's') || (sn == 'S')){
                
                menu = menu();
                System.out.println(menu);

                System.out.print("Digite o número: ");
                escolha = teclado.nextInt();
            }
            else{
                break;
            }


        }
        
        teclado.close();
    }


    public static String menu(){
        return "Digite:\n" +
        "1 - Converter de Celsius para Fahrenheit \n" +
        "2 - Converter de Fahrenheit para Celsius \n"+
        "3 - Converter de Celsius para Kelvin \n" +
        "4 - Converter de Kelvin para Celsius \n" +
        "5 - Converter de Fahrenheit para Kelvin \n" +
        "6 - Converter de Kelvin para Fahrenheit \n" +
        "0 - Para encerrar";
    }

    public static double CelsiusparaFahrenheit(double celsius) {
        return (celsius*1.8)+32;
    }

    public static double FahrenheitparaCelsius(double fahrenheit) {
        return (fahrenheit-32)/1.8;
    }

    public static double CelsiusParaKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double KelvinParaCelsius(double kelvin){
        return kelvin - 273.15;
    }

    public static double FahrenheitParaKelvin(double fahrenheit){
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public static double KelvinParaFahrenheit(double kelvin){
        return (kelvin - 273.15) * 9/5 + 32;
    }

}
