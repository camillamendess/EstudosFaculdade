import java.util.ArrayList;
import java.util.Scanner;

class ZoologicoVirtual {
  
    static public void cicloDeVida(Animal animal){
      
      animal.nasca();
      animal.passeiePelaTela();
      animal.durma();
    }
    
    static public void main(String[] args) {

      ArrayList <Animal> animais = new ArrayList<Animal>();
      Scanner teclado = new Scanner(System.in);

      for(int i = 0; i<5; i++){
        System.out.println("Digite o tipo de animal: \n"
                            + "1 - Morcego\n"
                            + "2 - Zebra");

        int op = teclado.nextInt();
        if (op == 1){
            animais.add(new Morcego());
        }
        if (op == 2){
            animais.add(new Zebra(100+i, 100-i));
        }
      }

      for (int i = 0; i<animais.size(); i++){
          cicloDeVida(animais.get(i));
          animais.get(i).tipoAnimal();
      }

      teclado.close();
      
    }
  }