public class TestaLista {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();
    
        lista.inserirInicio("primeiro");
        lista.inserirInicio("segundo");
        lista.inserirInicio("terceiro");
        lista.inserirFim("quarto");
        lista.inserirFim("quinto");
        lista.inserirFim("sexto");

        System.out.println("Primeiro elemento: " + lista.getPrimeiro());
    
        try {
            lista.remover("terceiro");
        } catch (ObjetoNaoEncontradoException e) {
            System.out.println("Elemento não encontrado");
        }
    
        // exibindo todos os elementos da lista
        ListaDuplamenteEncadeada<String>.Element ptr = lista.getHead();
        while (ptr != null) {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    
        // fazendo a lista vazia
        lista.fazVazia();
    }
    
}
