import modelo.Livro;
import modelo.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList <Produto> produtos = new ArrayList <>();
        String resultado = "";
        produtos.add(new Livro ("Java Como Programar", "Deitel", 1000, 300));
        produtos.add(new Produto("Lapis preto", 2));
        produtos.add(new Produto("Caneta azul", 3.5));
        produtos.add(new Livro ("A hora da estrela", "Clarice Lispector", 37.8, 120));
        
        
        for (int i=0; i<produtos.size(); i++){
            resultado = resultado + produtos.get(i).toString()+"\n--------\n";
            ((Livro)produtos.get(i)).ehGrande(); // O método ehGrande() é da classe Livro e é preciso especificar isso
        
        JOptionPane.showMessageDialog(null, resultado);
        }
    }
}
