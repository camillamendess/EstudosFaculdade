package visao;
import java.util.ArrayList;
import javax.swing.*;
import controle.ControleDisciplina;
import modelo.Disciplina;


public class Principal {
    public static String menu(){
        return "Digite:\n" +
        "1 - Cadastrar disciplina \n" +
        "2 - Pesquisar disciplina\n"+
        "3 - Listar disciplinas \n" +
        "0 - para sair";
    }
    public static void main(String[] args) {
        ControleDisciplina cd = new ControleDisciplina();
        int op;
        op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
       
        while (op!=0){
            switch (op){
                case 1:{ //cadastrar disciplina
                    String nome = JOptionPane.showInputDialog("Digite o nome da disciplina");
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da disciplina"));
                    int ch = Integer.parseInt(JOptionPane.showInputDialog("Informe a carga horária da disciplina"));
                    
                    try {
                        cd.cadastrarDisciplina(nome, codigo, ch);
                        JOptionPane.showMessageDialog(null,"Disciplina cadastrada !!!");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null,e.getMessage());
                    }
                    break;
                }
       
        
                case 2:{ //Pesquisar disciplina
                    int codigo;
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da disciplina"));
                    try {
                        JOptionPane.showMessageDialog(null,cd.pesquisarDisciplina(codigo).imprimir());
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null,e.getMessage());
                    }  
                break;

                }
        
                case 3: {//Listar disciplinas
                    try { 
                        ArrayList <Disciplina> disciplinas = Disciplina.listarDisciplina();
                        String res = "";
                        for(int i = 0; i < disciplinas.size();i++) {
            	            res += disciplinas.get(i).imprimir() + "\n";
                        }
                        JOptionPane.showMessageDialog(null,res);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null,e.getMessage());
                    }
                    break;  
                }    
            }     
            op = Integer.parseInt(JOptionPane.showInputDialog(menu()));       
        }   
    }
}
