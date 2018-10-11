/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDeDatos;

import modelo.Producto;
import java.util.ArrayList;
/**
 *
 * @author benja
 */
public class Ventas {
    public static ArrayList<Producto> ventasProducto = new ArrayList<>(); 
//objeto que almacena de tipo producto
            
            
    public static boolean Agregar(Producto producto){
        boolean estado = false;
        if (producto!=null && buscar(producto.getId())==null){
            ventasProducto.add(producto);
            estado= true;
        }        
        return estado;
    }
    
      public static ArrayList<Producto> listar() //almacena un elemento de tipo object, es antiguo y abstracto. es cualquier cosa
   {
      return ventasProducto;
   }
   
   public static Producto buscar(String id)
   {
        Producto obj=null;
        
        for(Producto xx:ventasProducto)
        {
            if(xx.getId().equals(id) )
            {
                obj=xx;
                break;            
            }
        }
        return obj;
   }
   
   
   public static boolean eliminar(String id)
   {
        boolean estado=false;
        int cont=0;        
        
        for(Producto xx:ventasProducto)
        {
            if(xx.getId().equals(id) )
            {
                ventasProducto.remove(cont);  
                estado=true;
                break;            
            }
            cont++;
        }
        return estado;
   }
   
   public static boolean modificar(Producto producto)
   {
        boolean estado=false;
        int cont=0;        
        
        for(Producto xx:ventasProducto)
        {
            if(xx.getId().equals(producto.getId() ) )
            {
                ventasProducto.set(cont,producto);
                estado=true;
                break;            
            }
            cont++;
        }
        return estado;
    
   }
   
   public static Producto ventaMayor()
   {
        Producto obj=null;
        
        obj= ventasProducto.get(0);
        for(Producto xx:ventasProducto)
        {
           if(obj.getPrecio()< xx.getPrecio() )
           {
              obj=xx; 
           }
        }
       
        return obj;
   }
    
     public static Producto ventaMenor()
   {
        Producto obj=null;
        
        obj= ventasProducto.get(0);
        for(Producto xx:ventasProducto)
        {
           if(obj.getPrecio()> xx.getPrecio() )
           {
              obj=xx; 
           }
        }
       
        return obj;
   }
}
