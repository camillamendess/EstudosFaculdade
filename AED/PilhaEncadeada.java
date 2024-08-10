public class PilhaEncadeada implements Pilha {

    private ListaEncadeada lista;
    private int count;

    public PilhaEncadeada(){
        lista = new ListaEncadeada();    
        count = 0;
    }

    @Override
    public void fazVazia() {
        lista.fazVazia();
        count = 0;
    }
    
    @Override
    public boolean estaVazia() {
        return count == 0;
    }

    @Override
    public Object getTop() throws ContainerVazioException, ListaVaziaException {
        if (count == 0){
            throw new ContainerVazioException();
        } else {
            return lista.getPrimeiro();
        }
    }
    
    @Override
    public void push(Object o) {
        lista.inserirInicio(o);
        count ++;
    }

    @Override
    public Object pop() throws ContainerVazioException, ListaVaziaException, ObjetoNaoEncontradoException {
        if (count == 0){
            throw new ContainerVazioException();
        } else {
            Object result = lista.getPrimeiro();
            lista.extrair(result);
            count --;
            return result;
        }
    }

}