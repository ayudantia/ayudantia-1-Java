/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author benja
 */
public interface Calculable {
    
    double IVA = 0.19;
    double DESCUENTO_VIP = 0.2;
    double DESCUENTO_NORMAL= 0.1;
    
    
    
    public void aplicarDescuento(byte tipoDescuento);
    
}
