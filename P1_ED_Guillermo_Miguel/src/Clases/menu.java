package Clases;
public class menu {
    String nombre;
    String descrpcion;
    int precio;
    Lista ingrediente;
    int timpo;

    public menu() {
    }

    public menu(String nombre, String descrpcion, int precio, Lista ingrediente, int timpo) {
        this.nombre = nombre;
        this.descrpcion = descrpcion;
        this.precio = precio;
        this.ingrediente = ingrediente;
        this.timpo = timpo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescrpcion() {
        return descrpcion;
    }

    public void setDescrpcion(String descrpcion) {
        this.descrpcion = descrpcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Lista getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Lista ingrediente) {
        this.ingrediente = ingrediente;
    }

    public int getTimpo() {
        return timpo;
    }

    public void setTimpo(int timpo) {
        this.timpo = timpo;
    }

    @Override
    public String toString() {
        return "menu{" + "nombre=" + nombre + '}';
    }
}