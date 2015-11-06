package Clases;
public class Nodo_Menu {
    menu menu = null;
    Nodo_Menu next;

    public Nodo_Menu(menu menu){
        this.menu=menu;
    }
    
    public Nodo_Menu(){
        
    }
            

    public menu getValue() {
        return menu;
    }

    public void setValue(menu menu) {
        this.menu = menu;
    }

    public Nodo_Menu getNext() {
        return next;
    }

    public void setNext(Nodo_Menu next) {
        this.next = next;
    }    
}
