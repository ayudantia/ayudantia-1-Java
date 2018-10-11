/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayudantia111018;

/**
 *
 * @author benja
 */
public abstract class Producto implements Calculable{    
    private int id;
    private String nombre;
    protected double precio;
    protected int cant;

    public Producto(int id, String nombre, double precio, int cant) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
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
        this.precio = precio;
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
