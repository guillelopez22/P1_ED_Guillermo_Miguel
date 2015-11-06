package Clases;

public class Lista_Menu {

    Nodo_Menu head;

    public Lista_Menu() {
        head = new Nodo_Menu();
    }

    public void insert(menu menu, int pos) {
        Nodo_Menu newNodo = new Nodo_Menu(menu);
        Nodo_Menu newHead = head;
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
        Nodo_Menu n = newHead.getNext();
        newHead.setNext(newNodo);
        newNodo.setNext(n);
    }

    public void setHead(Nodo_Menu head) {
        this.head = head;
    }

    public int find(int num) {
        return 0;
    }

    public menu get(int pos) {
        Nodo_Menu temp = head;
        menu valor = temp.getValue();
        for (int i = 0; i < pos; i++) {
            temp = temp.getNext();
            valor = temp.getValue();

        }
        return valor;
    }

    public void delete(int pos) {
        Nodo_Menu temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.getNext();
        }
        Nodo_Menu temp2 = temp.getNext();
        temp.setNext(temp2.getNext());
    }

    public menu first() {
        return head.getValue();
    }

    public void Print_Lista() {
        Nodo_Menu temp = head;
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

    public int getSize() {
        int cont = 0;
        while (head.getNext() != null) {
            cont++;
        }
        return cont;
    }
}
