/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Nodo_Pila {
    private Pila pila = null;
    Nodo_Pila next;
    
    public Nodo_Pila(Pila pila){
        this.pila=pila;
    }
    
    public Nodo_Pila(){
        
    }
            

    public Pila getValue() {
        return pila;
    }

    public void setValue(Pila pila) {
        this.pila = pila;
    }

    public Nodo_Pila getNext() {
        return next;
    }

    public void setNext(Nodo_Pila next) {
        this.next = next;
    }
}
