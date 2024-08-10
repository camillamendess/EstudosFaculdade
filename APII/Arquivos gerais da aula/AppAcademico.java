public class AppAcademico{
    
   public static void main(String[] args){
        
        Aluno a1 = new Aluno("Camilla", 202011231);
        Aluno a2 = new Aluno("Caio", 202121211);
        
        
        System.out.println("Aluno: " + a1.getNome() + " \nMatricula: " + a1.getMatricula());
        System.out.println("Quantidade de alunos: " + a1.qtd);
        
    }
}