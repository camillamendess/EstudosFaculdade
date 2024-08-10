public class FilaArray implements Fila{
    private Object []array;
    private int head, tail, count;

    public FilaArray (int tam){
        array = new Object [tam];
        head = 0;
        tail = tam-1;
        count = 0;
    }

    public void fazVazia(){
        while(count > 0){
            array[head] = null;
            ++head;
            if(head == array.length){
                head = 0;
            } else {
                --count;
            }
        }
    }

    @Override
    public boolean estaVazia() {
        return (count == 0);
    }

    @Override
    public Object getPrimeiro() throws ContainerVazioException, ListaVaziaException {
        if (count ==0){
            throw new ContainerVazioException();
        } else {
            return array [head];
        }
    }

    @Override
    public void enfileirar(Object objeto) throws ContainerCheioException {
        if(count == array.length){
            throw new ContainerCheioException();
        } else {
            ++tail;
        }

        if (tail == array.length){
            tail = 0;
        } else {
            array[tail] = objeto;
            ++count;
        }
    }

    @Override
    public Object desenfileirar() throws ContainerVazioException, ListaVaziaException, ObjetoNaoEncontradoException {
       Object result;
        if(count == 0){
        throw new ContainerVazioException();
       } else {
        result = array [head];
        array[head] = null;
        ++head;
       }

       if(head == array.length){
        head = 0;
        --count;
       }

       return result;
    }

}
