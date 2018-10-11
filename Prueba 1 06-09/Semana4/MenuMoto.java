
/**
 * Write a description of class MenuMoto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class MenuMoto
{
   public static void main(String[] args) 
    {
       Scanner leer=new Scanner(System.in);
       int opcion=0;
       String patente="";
       String marca="";
       String color="";
       int precio=0;   
       int descuento=0;
       int estanque=0;
       Moto obj=null;
       
       do
       {
            System.out.println("\f"); // limpia pantalla
            System.out.println("       MENU MOTO");
            System.out.println("       ================");
            System.out.println(" 1. Crear un Moto");
            System.out.println(" 2. Imprimir datos");
            System.out.println(" 3. Aplicar descuento");
            System.out.println(" 4. Cambiar color");
            System.out.println(" 5. Kilometros por estanque");
            System.out.println(" 6. Salir");
            System.out.println("");
            System.out.println("Ingrese su opción [1-6]:");
            opcion=leer.nextInt();
       
            switch(opcion)
            {
               case 1:{ //Crear moto
                         System.out.println("\f CREAR MOTO \n\n\n");
                   
                         System.out.println("Ingrese patente:");
                         patente=leer.next();                         
                         System.out.println("Ingrese marca:");
                         marca=leer.next();                         
                         System.out.println("Ingrese color:");
                         color=leer.next();                         
                         System.out.println("Ingrese precio:");
                         precio=leer.nextInt();       
                         System.out.println("Capacidad estanque:");
                         estanque=leer.nextInt(); 
                        
                         obj=new Moto(patente, marca, color, precio, estanque);
                            
                         System.out.println("\n\nMoto creada.....\n\n");
                         break;
                      }
                      
               case 2:{ 
                        System.out.println("\f LISTAR DATOS \n\n\n");
                         
                        if(obj!=null) //  !=  distindo de
                        {
                          obj.listarDatos();
                        }
                        else
                        {
                          System.out.println("Error, debe crear una moto...");
                        }
                        break;
                      }
                      
               case 3:{ 
                        System.out.println("\f APLICAR DESCUENTO \n\n\n");                        
                        System.out.println("Ingrese descuento:");
                        descuento=leer.nextInt();
                        obj.aplicarDescuento(descuento);
                        System.out.println("Precio="+obj.getPrecio());                        
                        break;
                      }                       
               case 4:{ 
                        System.out.println("\f CAMBIAR COLOR \n\n\n");                        
                        System.out.println("Ingrese color:");
                        color=leer.next();
                        obj.setColor(color);
                        System.out.println("Color="+obj.getColor());
                
                        break;
                      }                     
                      
               case 5: { 
                          
                          System.out.println("\f TOTAL KILOMETROS POR ESTANQUE \n\n\n");                        
                        
                          System.out.println("Total kilometros= "+
                                     obj.calcularKilometrosPorEstanque() );
                
                          break;
                       }       
                      
               case 6:break;
               
                      
               default:{
                         System.out.println("Error, opción está fuera del rango...");
                         break;
                       }            
            }          
            System.out.println("\n\nPresione letra y enter para continuar...");
            leer.next();
        }
        while(opcion != 6);
        
        System.out.println("Good bye...");
        
    }    
}
