package Clases;
public class Nodo_ordenes {
    ordenes orden = null;
    Nodo_ordenes next;

    public Nodo_ordenes(ordenes orden){
        this.orden=orden;
    }
    
    public Nodo_ordenes(){
        
    }
            

    public ordenes getValue() {
        return orden;
    }

    public void setValue(ordenes orden) {
        this.orden = orden;
    }

    public Nodo_ordenes getNext() {
        return next;
    }

    public void setNext(Nodo_ordenes next) {
        this.next = next;
    }
}
