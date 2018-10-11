
/**
 * Write a description of class Bebida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bebida extends Producto
{
    float litro;

    public Bebida( int id, String nombre, double precio, int cant, float litro) {
        super(id, nombre, precio, cant);
        this.litro = litro;
    }
 
    public Bebida() {
    }

    public float getLitro() {
        return litro;
    }

    public void setLitro(float litro) {
        this.litro = litro;
    }

    @Override
    public String toString() {
        return "Bebida{" + "litro=" + litro + ' ' + super.toString();
    }
    
    @Override
    public double descuento() {
       return precio * DESCUENTO_BEBIDA;
    }
    
    @Override
    public double obtenerTotalCompra() {
        return precio - descuento();
    }

    @Override
    public double totalFinal() {
        double total=0;       
       total=obtenerTotalCompra()*getCant();          
        return total;
    }
}
