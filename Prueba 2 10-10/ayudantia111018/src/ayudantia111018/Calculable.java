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
public interface Calculable {
    public final double IVA=0.19;
    public final double DESCUENTO_BEBIDA=0.2;
    public final double DESCUENTO_MASA=0.1;
    
    public abstract double descuento();
    public abstract double obtenerTotalCompra();
    public abstract double totalFinal();
}
