

public class Main {
 public static void main(String[] args) {
   Array array1 = new Array(5,2);
   Array array2 = new Array(4,0);

   System.out.println("Array 1: Limite " + array1.getBase() + " Tamanho " + array1.getLength());
   System.out.println("Array 2: Limite " + array2.getBase() + " Tamanho " + array2.getLength());
   
   array1.assign(array2);

   System.out.println("Array1 depois do metodo assing:");
   System.out.println("Array 1: Limite " + array1.getBase() + " Tamanho " + array1.getLength());


 }   
}
