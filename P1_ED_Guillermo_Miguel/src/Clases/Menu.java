package Clases;
public class Menu {
    String nombre;
    String descrpcion;
    int precio;
    Lista_Ingrediente ingrediente;
    int timpo;

    public Menu() {
    }

    public Menu(String nombre, String descrpcion, int precio, Lista_Ingrediente ingrediente, int timpo) {
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

    public Lista_Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Lista_Ingrediente ingrediente) {
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
        return nombre;
    }
}