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
public class Pan extends Producto{
    
    private float kilo;

    public Pan(int id, String nombre, double precio, int cant,float kilo) {
        super(id, nombre, precio, cant);
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
