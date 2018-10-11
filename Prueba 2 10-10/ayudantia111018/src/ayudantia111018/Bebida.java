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
public class Bebida extends Producto{
    
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
       total=obtenerTotalCompra()*cant;          
        return total;
    }
}
