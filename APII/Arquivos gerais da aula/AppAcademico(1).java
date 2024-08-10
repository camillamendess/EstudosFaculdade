package Academico;

public class AppAcademico{
    
    public static void main(String[] args){
        
        Aluno a1 = new Aluno("Camilla");
        Aluno a2 = new Aluno("Caio");
        Aluno a3 = new Aluno("Anna");
         
         
        System.out.println("Aluno: " + a1.getNome() + " \nMatricula: " + a1.getMatricula());
        System.out.println("\nAluno: " + a2.getNome() + " \nMatricula: " + a2.getMatricula());
        System.out.println("\nAluno: " + a3.getNome() + " \nMatricula: " + a3.getMatricula());
        System.out.print("\nQuantidade de alunos: " + a1.getQuantidadeAluno());
        
        
    }

}