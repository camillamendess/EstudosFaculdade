public class ListaEncadeada {

    private Element head;
    private Element tail;

    public ListaEncadeada(){}
        
    public final class Element{
        Object data;
        Element next;
        
        Element(Object d, Element n){
            this.data = d;
            this.next = n;
        }

        public void inserirDepois (Object item){
            next = new Element (item, next);
            if (tail == this){
                tail=next;
            }
        }

        public void inserirAntes(Object item){
            Element temp = new Element (item, this);
            if (this == head){
                head = temp;
            } else {
                Element prevPtr = head;
                while (prevPtr !=null && prevPtr.next != this){
                    prevPtr = prevPtr.next; 
                }
                prevPtr.next=temp;
            }
        }
        
        public Object getData(){ 
            return data;
        }
        
        public Element getNext(){ 
            return next;
        }
    }

    public void fazVazia(){
        head = null;
        tail = null;
    }

    public Element getHead(){
        return head; 
    }
        
    public Element getTail(){
        return tail; 
    }
        
    public boolean estaVazia(){
        return (head== null); 
    }

    public Object getPrimeiro() throws ListaVaziaException{
        if (head == null){
            throw new ListaVaziaException();
        }
        return head.data;
    }
        
    public Object getUltimo() throws ListaVaziaException{
       if (tail == null){
        throw new ListaVaziaException();
       }     
        return tail.data;
    }

    public void inserirInicio(Object item){
        Element temp = new Element (item, head);
        if (head == null){
            tail = temp;
        }
        head = temp;
    }

    public void inserirFim(Object item){
        Element temp = new Element(item, null);
        if (head == null){
            head = temp;
        } else {
            tail.next=temp;
        }
            tail = temp;
    }

    public void atribuir (ListaEncadeada l){
        if (l != this){
            this.fazVazia();
            for (Element ptr = l.head; ptr != null; ptr = ptr.next){
            this.inserirFim(ptr.data);
            }
        }
    }

    public void extrair(Object item) throws ObjetoNaoEncontradoException{
        Element ptr = head;
        Element prevPtr = null;
        while (ptr != null && ptr.data!= item){
            prevPtr= ptr;
            ptr = ptr.next; 
        }
        if (ptr == null){
            throw new ObjetoNaoEncontradoException();
        }
        if (ptr == head){
            head = ptr.next;
        } else {
            prevPtr.next=ptr.next;
        }
        if (ptr == tail){
            tail=prevPtr; 
        }
    }
}