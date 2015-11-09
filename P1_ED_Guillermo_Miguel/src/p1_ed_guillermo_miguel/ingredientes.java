package p1_ed_guillermo_miguel;
public class ingredientes {
    
    String nombre;
    String descripcion;

    public ingredientes() {
    }

    public ingredientes(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "ingredientes{" + "nombre=" + nombre + '}';
    }
}
