public class Zebra implements Animal{
	private int listras;
	private double peso;
  
	public  Zebra ( int l , double p ){
		listras  = l ; 	// cria uma zebra com l listras
		peso = p; 		// e peso p
	}
  
	public void nasca(){
		System.out.println(" Nasce mais uma zebra ");
	}
  
	public void passeiePelaTela(){
		System.out.println(" Galopa pelo campo");
	}
  
	public void durma(){
		System.out.println(" Dorme em pé ");
	}
	public  double peso(){
		return peso ;
	}

    public String tipoAnimal(){
        return "Zebra";
    }
  
	// nada impede que sejam implementados métodos adicionais 
  
	public void contaListras(){
		System.out.println (" Esta zebra tem " + listras + " listras " ) ;
	} 
}