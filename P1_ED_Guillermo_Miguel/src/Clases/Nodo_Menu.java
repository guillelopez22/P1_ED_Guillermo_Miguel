package Clases;
public class Nodo_Menu {
    Orden menu = null;
    Nodo_Menu next;

    public Nodo_Menu(Orden menu){
        this.menu=menu;
    }
    
    public Nodo_Menu(){
        
    }
            

    public Orden getValue() {
        return menu;
    }

    public void setValue(Orden menu) {
        this.menu = menu;
    }

    public Nodo_Menu getNext() {
        return next;
    }

    public void setNext(Nodo_Menu next) {
        this.next = next;
    }    
}
