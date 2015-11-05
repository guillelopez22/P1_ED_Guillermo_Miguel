package p1_ed_guillermo_miguel;
public class ordenes {
    int num_orden;
    String nombre;
    Lista patos;
    int total_pagar;
    int tiempo_total;

    public ordenes() {
    }

    public ordenes(int num_orden, String nombre, Lista patos, int total_pagar, int tiempo_total) {
        this.num_orden = num_orden;
        this.nombre = nombre;
        this.patos = patos;
        this.total_pagar = total_pagar;
        this.tiempo_total = tiempo_total;
    }

    public int getNum_orden() {
        return num_orden;
    }

    public void setNum_orden(int num_orden) {
        this.num_orden = num_orden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Lista getPatos() {
        return patos;
    }

    public void setPatos(Lista patos) {
        this.patos = patos;
    }

    public int getTotal_pagar() {
        return total_pagar;
    }

    public void setTotal_pagar(int total_pagar) {
        this.total_pagar = total_pagar;
    }

    public int getTiempo_total() {
        return tiempo_total;
    }

    public void setTiempo_total(int tiempo_total) {
        this.tiempo_total = tiempo_total;
    }

    @Override
    public String toString() {
        return "ordenes{" + "num_orden=" + num_orden + '}';
    }
}
