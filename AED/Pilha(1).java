/*  uma pilha é uma estrutura linear de dados que pode ser acessada
somente por uma de suas extremidades para inserir e remover dados. 
LIFO (last in, first out), o último elemento inserido é o primeiro a ser
removido da pilha */

public interface Pilha{
    void fazVazia();
    boolean estaVazia();
    Object getTop() throws ContainerVazioException, ListaVaziaException;
    void push(Object o);
    Object pop() throws ContainerVazioException, ListaVaziaException, ObjetoNaoEncontradoException;
}

