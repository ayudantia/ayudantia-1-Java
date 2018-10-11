/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.Producto;

/**
 *
 * @author benja
 */
public class Arroz extends Producto {
    private String nombreProducto;

    public Arroz(String nombreProducto, String id, int precio, int stock) {
        super(id, precio, stock);
        setNombreProducto(nombreProducto);
    }

    
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        if (nombreProducto!= null){
            this.nombreProducto = nombreProducto;
        }
        else{
            System.out.println("Nombre no existe");
        }
    }
    
    public void aplicarDescuento(byte tipoDescuento)
   {
       if (tipoDescuento == 1){           
           
           
           
           precio=(int)(precio-(precio*DESCUENTO_VIP));
        }      
       if (tipoDescuento == 2){           
           precio=(int)(precio-(precio*DESCUENTO_NORMAL));
        }
   }

    @Override
    public String toString() {
        return  "Nombre Producto " + nombreProducto + " " + super.toString(); //llama todo lo de la clase padre
    }

    
    
}
