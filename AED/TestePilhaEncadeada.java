public class TestePilhaEncadeada {

    public static void main(String[] args) {
        PilhaEncadeada pilha = new PilhaEncadeada();

        // Adicionar elementos na pilha
        pilha.push(2);
        pilha.push(4);
        pilha.push(8);
        pilha.push(10);

        // Teste de pilha vazia
        System.out.println("A pilha está vazia? " + pilha.estaVazia()); // Deve imprimir false

        // Topo da pilha
        try {
            System.out.println("Topo da pilha: " + pilha.getTop()); // Deve imprimir 10
        } catch (ContainerVazioException | ListaVaziaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Remover elementos da pilha
        try {
            System.out.println("Elemento removido: " + pilha.pop()); // Deve imprimir 10
            System.out.println("Elemento removido: " + pilha.pop()); // Deve imprimir 8
            System.out.println("Elemento removido: " + pilha.pop()); // Deve imprimir 4
            System.out.println("Elemento removido: " + pilha.pop()); // Deve imprimir 2
        } catch (ContainerVazioException | ListaVaziaException | ObjetoNaoEncontradoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Testa a pilha vazia novamente
        System.out.println("A pilha está vazia? " + pilha.estaVazia()); // Deve imprimir true
    }

}
