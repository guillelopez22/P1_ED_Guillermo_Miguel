package lista_enlazada;
public class Nodo {
    
    private int value;
    Nodo next;
    
    public Nodo(int value){
        this.value=value;
    }
    
    public Nodo(){
        
    }
            

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
    

}