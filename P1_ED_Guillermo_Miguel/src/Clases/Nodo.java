package Clases;
public class Nodo {
    private Object object = null;
    Nodo next;
    
    public Nodo(Object object){
        this.object=object;
    }
    
    public Nodo(){
        
    }
            

    public Object getValue() {
        return object;
    }

    public void setValue(Object object) {
        this.object = object;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
