
/**
 * Abstract class Producto - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Producto implements Calculable {    
    private int id;
    private String nombre;
    protected double precio;
    protected int cant;

    public Producto(int id, String nombre, double precio, int cant) {
        this.id = id;
        this.nombre = nombre;
        setPrecio(precio);    //this.precio = precio;
        this.cant = cant;
    }

    public Producto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio>0){
            this.precio = precio;
        }
        else {
            System.out.println("Error: precio debe ser mayor a cero");
        }
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", cant=" + cant + '}';
    }
      
    
}
