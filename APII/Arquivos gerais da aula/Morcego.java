public class Morcego implements Animal {
  
	public void nasca(){
		System.out.println ( " Nasce um lindo morcego " ) ;
	}
  
	public void passeiePelaTela ( )
	{
		System.out.println ( " Voa de um lado para o outro " ) ;
	}
  
	public void durma(){
		System.out.println ( " Dorme de ponta cabeça " ) ;
	}
  
	public double peso(){
		return 1.5; 
	}

    public String tipoAnimal(){
        return "Morcego";
    }
}