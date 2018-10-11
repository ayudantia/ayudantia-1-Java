
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
   public static void main(String[] args)
   {
     Computador obj1=new NoteBook(1000,"epson",(byte) 8,
                   350000, 10,true);
                   
     Computador obj2=new Escritorio (1001,"HP",(byte) 4,
                   280000, 20,true); 
                   
     Computador obj3=new Escritorio (1001,"HP",(byte) 4,
                   480000, 20,true); 
     
      System.out.println("total compra= "+obj1.obtenerTotalCompra());
      System.out.println("Descuento= "+obj1.descuento());             
      System.out.println("Total final= "+obj1.totalFinal());
      //**************************
      
      
      //Agregar objetos a la colección
      RegistroComputador.agregar(obj1);
      RegistroComputador.agregar(obj2);
      RegistroComputador.agregar(obj2);
      RegistroComputador.agregar(obj2);
      RegistroComputador.agregar(obj1);
      
      //Foreach
      for(Computador xx :RegistroComputador.obtenerDatos())
      {
          System.out.println(xx.toString());
      }
      
      
      //foreach
      int pce=0;
      for(Computador xx :RegistroComputador.obtenerDatos())
      {
         // System.out.println(xx.toString());
          
          if(xx instanceof Escritorio)
          {
             pce++; 
          }
          
      }
      System.out.println("La cantidad de PC de escritorio son "+pce);
     
      //***********************
      
      Computador computador=RegistroComputador.buscar(1000);
      if( computador !=null)
      {
          System.out.println("Existe---"+computador.toString());
      }
      else
      {
           System.out.println("Error, computador no existe");
      }
      
      
      
      
      //**********Eliminar
      
      if(RegistroComputador.eliminar(1000)==true)
      {
         System.out.println("Eliminado...");
      }
      else
      {
        System.out.println("Id no existe...");
      }
      
      
      
      
      
      if(RegistroComputador.modificar(obj3)==true)
      {
         System.out.println("Ok, datos modificados...");
         //Foreach
         for(Computador xx :RegistroComputador.obtenerDatos())
         {
             System.out.println(xx.toString());
         }
      }
      else
      {
        System.out.println("Id no existe...");
      }
      
      
      
   }
}
/*if(obj2 instanceof NoteBook)
     {
        System.out.println("si, es un notebook");
        
     }
     else
     {
         System.out.println("NO, no un notebook");
     }*/