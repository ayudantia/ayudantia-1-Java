/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayudantia111018;

import java.util.ArrayList; //recuerden IMPORTAR ArrayList

/**
 *
 * @author benja
 */
public class RegistroProducto {
    private static ArrayList<Producto> productos=new ArrayList<Producto>();
    
   
    public static boolean agregar(Producto obj)
   {
      boolean estado=false;
      if(obj!=null && buscar(obj.getId())==null )
      {
          productos.add(obj);
          estado=true;
      }
      
      return estado;
   }
   
   public static Producto buscar(int id)
   {
      Producto obj=null;      
      for(Producto xx:productos)
      {
          
          if(xx.getId()== id)  
          {
             obj=xx; 
             break;
          }
      }      
      return obj;
   }
   
   //metodo real
   public static Producto buscar2(int id)
   {
       for(Producto c: productos)
       {
           if(c.getId() == id)
           {
               return c;               
            }
    }
    return null;
    }
    
   public static boolean modificar(Producto obj)
   {
      boolean estado=false;
      int i=0;  // variable auxiliar o contador    
      for(Producto xx:productos)
      {
          if(xx.getId()== obj.getId())  
          {
             productos.set(i, obj) ;
             estado=true;
             break;
          }
         i++; 
      }      
      return estado;
   }
   
   public static boolean eliminar(int id)
   {
      boolean estado=false;    
      int cont = 0;
      for(Producto xx:productos)
      {
          if(xx.getId()== id)  
          {
             productos.remove(cont);
             estado=true; //Eliminado
             break;
          }
          cont++;
      }      
      return estado;
   }
   
   public static ArrayList<Producto> obtenerDatos()
   {
       return productos; 
   }
    
}
