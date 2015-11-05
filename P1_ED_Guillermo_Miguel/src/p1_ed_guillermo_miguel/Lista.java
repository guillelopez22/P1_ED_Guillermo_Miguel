package p1_ed_guillermo_miguel;
public class Lista {

    Nodo head;

    public Lista() {
        head = new Nodo();
    }

    public void insert(int num, int pos) {
        Nodo newNodo= new Nodo(num);
        Nodo newHead = head;
        int cont = 0;
        if(pos==0){
            newNodo.setNext(head);
            this.setHead(newNodo);
        }
        while (newHead.getNext()!=null) {
            newHead =newHead.getNext();
            cont++;
            if (cont == pos) {
                break;
            }
        }
        Nodo n = newHead.getNext();
        newHead.setNext(newNodo);
        newNodo.setNext(n);
    }
    
    public void setHead(Nodo head){
        this.head=head;
    }

    public int find(int num) {
        return 0;
    }

    public int get(int pos) {
        Nodo temp = head;
        int valor= temp.getValue();
        for(int i=0;i<pos;i++){
            temp=temp.getNext();
            if(i==pos){
                valor = temp.getValue();
            }
        }
        return valor;
    }

    public void delete(int pos) {
        Nodo temp = head;
        for (int i=1;i<pos-1;i++){
            temp = temp.getNext();
        }
        Nodo temp2 = temp.getNext();
        temp.setNext(temp2.getNext());
    }

    public int first() {
        return head.getValue();
    }
    
    public void Print_Lista(){        
        Nodo temp = head;
        int cont = 0;
        while(temp != null){
            if(cont == 0){
                System.out.print("[H]");
            }
            if(temp.getNext() != null){
                System.out.print("[" + temp.getValue() + "] - ");
                cont++;
            }else{
                System.out.print("[" + temp.getValue() + "]" );
                cont++;
            }
            temp = temp.next;
        }
        System.out.println("");
    } 
}