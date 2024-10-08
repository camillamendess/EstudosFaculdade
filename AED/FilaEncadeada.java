public class FilaEncadeada implements Fila {
    private ListaEncadeada lista;
    private int count;

    public FilaEncadeada() {
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
    public Object getPrimeiro() throws ContainerVazioException, ListaVaziaException {
        if (count == 0){
            throw new ContainerVazioException();
        } else {
            return lista.getPrimeiro();
        }
    }
    @Override
    public void enfileirar(Object objeto) throws ContainerCheioException {
        lista.inserirFim(objeto);
        count ++;
    }
    @Override
    public Object desenfileirar() throws ContainerVazioException, ListaVaziaException, ObjetoNaoEncontradoException {
       if(count == 0){
        throw new ContainerVazioException();
       } else {
        Object result = lista.getPrimeiro();
        lista.extrair(result);
        --count;
        return result;
       }
    }
    

}