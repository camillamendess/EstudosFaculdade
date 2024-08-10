import javax.swing.plaf.synth.SynthStyleFactory;

public class Aviao implements Voador, TransportadorDePessoas {

    @Override
    public void entramPessoas() {
        System.out.println("Entram pessoas");
        
    }

    @Override
    public void saemPessoas() {
        System.out.println("Saem pessoas");
    }

    @Override
    public void voa() {
        
    }

    @Override
    public void aterrissa() {
          
    }
    
}
