
/**
 * CRUD  Create Read Update Delete  
 * (MANTENEDOR)
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class RegistroComputador
{
   private static ArrayList<Computador> computadores=new ArrayList<Computador>();
    
   
   public static boolean agregar(Computador obj)
   {
      boolean estado=false;
      //Para agregar un computador a la colección
      //debe cumplir dos reglas. Que el objeto "obj" NO
      //esté vacio y que no exita en la colección
      if(obj!=null && buscar(obj.getId())==null )
      {
          computadores.add(obj);
          estado=true;//agregado
      }
      
      return estado;
   }
   
   public static Computador buscar(int id)
   {
      Computador obj=null;      
      for(Computador xx:computadores)
      {
          if(xx.getId()== id)  
          {
             obj=xx; 
             break;
          }
      }      
      return obj;
   }
   
   
   public static Computador buscar2(int id)
   {
       for(Computador c: computadores)
       {
           if(c.getId() == id)
           {
               return c;               
            }
    }
    return null;
    }
    
   public static boolean modificar(Computador obj)
   {
      boolean estado=false;
      int i=0;      
      for(Computador xx:computadores)
      {
          if(xx.getId()== obj.getId())  
          {
             computadores.set(i, obj) ;
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
      for(Computador xx:computadores)
      {
          if(xx.getId()== id)  
          {
             computadores.remove(xx);
             estado=true; //Eliminado
             break;
          }
      }      
      return estado;
   }
   
   
   
   
   
   
   public static ArrayList<Computador> obtenerDatos()
   {
       return computadores; 
   }
}
