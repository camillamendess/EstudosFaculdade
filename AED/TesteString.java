public class TesteString{
    public static void main (String arg[]){
        String s1="Camilla";
        String s2="Camilla";
        if (s1==s2){
         System.out.println("s1 igual a s2"); 
        }
        s1 = s1 + "Mendes"; // Ao adicionar mais coisas, cria-se um novo endereço na memória
        s2 = s2 + "Mendes";
        if (s1==s2) // Com isso, o sinal de igualdade não dará verdadeiro, pois ele verifica o endereço da variável
           System.out.println("s1 e s2 sao os mesmos objetos");
        else
           System.out.println("s1 e s2 NAO sao os mesmos objetos");
   
         if (s1.equals(s2)) // Já o método equals será verdadeiro, pois ele avalia o conteúdo(valor) da variável
             System.out.println("s1 e s2 sao iguais");
         else
             System.out.println("s1 e s2 sao os mesmos objetos");
    }
}