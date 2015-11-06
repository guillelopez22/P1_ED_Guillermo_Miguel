/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Nodo_Ingrediente {
    private ingredientes ingrediente = null;
    Nodo_Ingrediente next;
    
    public Nodo_Ingrediente(ingredientes ingrediente){
        this.ingrediente=ingrediente;
    }
    
    public Nodo_Ingrediente(){
        
    }
            

    public ingredientes getValue() {
        return ingrediente;
    }

    public void setValue(ingredientes ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Nodo_Ingrediente getNext() {
        return next;
    }

    public void setNext(Nodo_Ingrediente next) {
        this.next = next;
    }
}
