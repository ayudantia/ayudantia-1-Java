
/**
 * Write a description of class Pan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pan extends Producto
{
    private float kilo;

    public Pan(int id, String nombre, double precio, int cant,float kilo) {
        super(id, nombre, precio, cant); // constructor clase padre
        this.kilo = kilo;
    }

    public Pan() {
    }

    public float getKilo() {
        return kilo;
    }

    public void setKilo(float kilo) {
        this.kilo = kilo;
    }

    @Override
    public String toString() {
        return "Pan{" + "kilo=" + kilo + ' ' + super.toString();
    }
    
    // METODOS CUSTOM ( INTERFAZ CALCULABLE )
    
     @Override
    public double descuento() {
       return precio * DESCUENTO_MASA;
    }

    @Override
    public double obtenerTotalCompra() {
        return precio - descuento();
    }

    @Override
    public double totalFinal() {
        double total=0;       
        total=obtenerTotalCompra()*cant;        
        return total;
    }
}
