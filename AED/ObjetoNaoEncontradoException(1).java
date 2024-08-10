public class ObjetoNaoEncontradoException extends Exception {
    
    public ObjetoNaoEncontradoException() {
        super("O objeto não foi encontrado.");
    }
    
    public ObjetoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
    
}
