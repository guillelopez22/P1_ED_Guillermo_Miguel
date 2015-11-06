/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Nodo_Menu {
    private menu Menu = null;
    Nodo_Menu next;
    
    public Nodo_Menu(menu Menu){
        this.Menu=Menu;
    }
    
    public Nodo_Menu(){
        
    }
            

    public menu getValue() {
        return Menu;
    }

    public void setValue(menu Menu) {
        this.Menu = Menu;
    }

    public Nodo_Menu getNext() {
        return next;
    }

    public void setNext(Nodo_Menu next) {
        this.next = next;
    }
}
