/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.Calculable;

/**
 *
 * @author benja
 */
public abstract class Producto implements Calculable{
    private String id;
    protected int precio;
    private int stock;

    public Producto(String id, int precio, int stock) {
        setId(id);
        setPrecio(precio);
        setStock(stock);
    }

    public void setId(String id) {
        if (id.length()==3)
        {
          this.id = id;
        }
        else{
            System.out.println("Error en el Id de la tarjeta");
        }
       
    }

    public void setPrecio(int precio)
    {
        if (precio>=100 && precio<=20000)
        {
            this.precio = precio;
    
        }
        else
        {
            System.out.println("Error en el precio no esta en los parametros");
        }
    }
    
    public void setStock(int stock) 
    {
        if (stock>0)
        {
            this.stock = stock;
        }
        else
        {
            System.out.println("error en el stock no puede ser numeros negativos o cero"); 
       }
    }

    public String getId() {
        return id;
    }

    public int getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public static double getIva() {
        return IVA;
    }

    public static double getDescuentoVIP() {
        return DESCUENTO_VIP;
    }

    public static double getDescuentoNormal() {
        return DESCUENTO_NORMAL;
    }

    @Override
    public String toString() {
        return "ID:" + id + ", Precio = $" + precio + ", stock =" + stock;
    }
    
    
    
}
