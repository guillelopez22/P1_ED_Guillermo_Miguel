package Clases;

public class Pila {

    Nodo_Ingrediente tos;
    Nodo_Ingrediente head;
    int size = 0;

    public void push(ingredientes ingredientes) {
        Nodo_Ingrediente newNodo = new Nodo_Ingrediente();
        if (tos == null) {
            tos = newNodo;
        } else {
            newNodo.next = tos;
            tos = newNodo;
        }
        size++;
    }

    public ingredientes pop() {
        ingredientes ingredientes;
        if (tos == null) {
            return null;
        }
        ingredientes = tos.getValue();
        tos = tos.next;
        size--;
        return ingredientes;
    }

    public ingredientes tos() {

        if (tos == null) {
            return null;
        } else {
            return tos.getValue();
        }
    }

}
