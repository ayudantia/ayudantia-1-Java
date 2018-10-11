package basededatos;


/**
 * Write a description of class Ventas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import modelos.*;
public class Ventas
{
   private static ArrayList<Producto> ventasProductos=new ArrayList<>();
   
   public static boolean  agregar(Producto producto)
   {
        boolean estado=false;
        
        if(producto !=null )
        {
            ventasProductos.add(producto);
            estado=true;
            
        }
        return estado;    
   }
   
   public static ArrayList<Producto> listar()
   {
      return ventasProductos;
   }
   
   public static Producto buscar(String id)
   {
        Producto obj=null;
        
        for(Producto xx:ventasProductos)
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
        int p=0;        
        
        for(Producto xx:ventasProductos)
        {
            if(xx.getId().equals(id) )
            {
                ventasProductos.remove(p);  
                estado=true;
                break;            
            }
            p++;
        }
        return estado;
   }
   
   public static boolean modificar(Producto producto)
   {
        boolean estado=false;
        int p=0;        
        
        for(Producto xx:ventasProductos)
        {
            if(xx.getId().equals(producto.getId() ) )
            {
                ventasProductos.set(p,producto);
                estado=true;
                break;            
            }
            p++;
        }
        return estado;
    
   }
   
   public static Producto ventaMayor()
   {
        Producto obj=null;
        
        obj= ventasProductos.get(0);
        for(Producto xx:ventasProductos)
        {
           if(obj.getPrecio()< xx.getPrecio() )
           {
              obj=xx; 
           }
        }
       
        return obj;
   }
   

   
}
