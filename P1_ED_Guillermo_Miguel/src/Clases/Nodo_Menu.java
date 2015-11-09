package Clases;
public class Nodo_Menu {
    Menu menu = null;
    Nodo_Menu next;

    public Nodo_Menu(Menu menu){
        this.menu=menu;
    }
    
    public Nodo_Menu(){
        
    }
            

    public Menu getValue() {
        return menu;
    }

    public void setValue(Menu menu) {
        this.menu = menu;
    }

    public Nodo_Menu getNext() {
        return next;
    }

    public void setNext(Nodo_Menu next) {
        this.next = next;
    }    
}
