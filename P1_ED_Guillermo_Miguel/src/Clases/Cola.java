package Clases;

public class Cola {

    private Nodo_ordenes inicio;
    private Nodo_ordenes termino;

    public Cola() {
        inicio = null;
        termino = null;
    }

    public void insertar(ordenes ordenes) {
        Nodo_ordenes i = new Nodo_ordenes(ordenes);
        i.setNext(null);
        if (inicio == null & termino == null) {
            inicio = i;
            termino = i;
        }
        termino.setNext(i);
        termino = termino.getNext();
    }

    public ordenes extraer() {
        ordenes dato = inicio.getValue();
        inicio = inicio.getNext();
        return dato;
    }

    public boolean estaVacia() {
        boolean cola = false;
        if (inicio == null & termino == null) {
            cola = true;
            System.out.println("Las ordenes estan vacia");
        } else {
            System.out.println("Las ordenes no estan vacia");
            cola = false;
        }
        return cola;
    }

    public int contar() {
        int contador = 0;
        Nodo_ordenes c = this.inicio;
        while (c != null) {
            contador++;
            c = c.getNext();
        }
        System.out.println("Numero de datos en la cola: " + contador);
        return contador;
    }

    public String toString() {
        Nodo_ordenes c = this.inicio;
        String s = "";
        while (c != null) {
            s = s + c.toString();
            c = c.getNext();
        }
        return s;
    }
}
