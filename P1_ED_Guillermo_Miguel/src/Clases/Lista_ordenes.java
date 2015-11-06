package Clases;

public class Lista_ordenes {

    Nodo_ordenes head;

    public Lista_ordenes() {
        head = new Nodo_ordenes();
    }

    public void insert(ordenes orden, int pos) {
        Nodo_ordenes newNodo = new Nodo_ordenes(orden);
        Nodo_ordenes newHead = head;
        int cont = 0;
        if (pos == 0) {
            newNodo.setNext(head);
            this.setHead(newNodo);
        }
        while (newHead.getNext() != null) {
            newHead = newHead.getNext();
            cont++;
            if (cont == pos) {
                break;
            }
        }
        Nodo_ordenes n = newHead.getNext();
        newHead.setNext(newNodo);
        newNodo.setNext(n);
    }

    public void setHead(Nodo_ordenes head) {
        this.head = head;
    }

    public int find(int num) {
        return 0;
    }

    public ordenes get(int pos) {
        Nodo_ordenes temp = head;
        ordenes valor = temp.getValue();
        for (int i = 0; i < pos; i++) {
            temp = temp.getNext();

            valor = temp.getValue();

        }
        return valor;
    }

    public void delete(int pos) {
        Nodo_ordenes temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.getNext();
        }
        Nodo_ordenes temp2 = temp.getNext();
        temp.setNext(temp2.getNext());
    }

    public ordenes first() {
        return head.getValue();
    }

    public void Print_Lista() {
        Nodo_ordenes temp = head;
        int cont = 0;
        while (temp != null) {
            if (cont == 0) {
                System.out.print("[H]");
            }
            if (temp.getNext() != null) {
                System.out.print("[" + temp.getValue() + "] - ");
                cont++;
            } else {
                System.out.print("[" + temp.getValue() + "]");
                cont++;
            }
            temp = temp.next;
        }
        System.out.println("");
    }
}
