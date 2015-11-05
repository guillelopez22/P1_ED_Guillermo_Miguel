package Classes;
public class Nodo {
    
    private Object object;
    Nodo next;
    
    public Nodo(Object object){
        this.object=object;
    }
    
    public Nodo(){
        
    }
            

    public String getValue() {
        return object.toString();
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