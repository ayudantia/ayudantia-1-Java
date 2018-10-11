/**
 * Write a description of class MenuPerro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class MenuPerro
{
   public static void main(String[] args) 
    {
       Scanner leer=new Scanner(System.in);
       int opcion=0;
       int chipId=0;
       String nombre="";
       Fecha fechaNac=null;
       String raza="";
       double edad=0;
       char sexo=' ';
       boolean vacunado=false;
       String vacunaTexto="";
       int precio=0;   
       int descuento=0;
       int estanque=0;
       Perro obj=null;
       byte dia=0;
       byte mes=0;
       short anio=0;
       
       do
       {
            System.out.println("\f"); // limpia pantalla
            System.out.println("       MENU MOTO");
            System.out.println("       ================");
            System.out.println(" 1. Crear un Perro");
            System.out.println(" 2. Imprimir datos");
            System.out.println(" 3. Determinar año nacimiento");
            System.out.println(" 4. Estado de Vacuna");
            System.out.println(" 5. Salir");
            System.out.println("");
            System.out.println("Ingrese su opción [1-5]:");
            opcion=leer.nextInt();
       
            switch(opcion)
            {
               case 1:{ //Crear Perro
                         System.out.println("\f CREAR PERRO \n\n\n");
                   
                         System.out.println("Ingrese Chip ID:");
                         chipId=leer.nextInt();                         
                         System.out.println("Ingrese nombre:");
                         nombre=leer.next();                         
                         System.out.println("Ingrese fecha de nacimiento:");
                         System.out.println("Ingrese dia:");                         
                         dia=leer.nextByte();
                         System.out.println("Ingrese mes:");                         
                         mes=leer.nextByte();                         
                         System.out.println("Ingrese año:");                         
                         anio=leer.nextShort();
                         
                         System.out.println("Ingrese raza:");
                         raza=leer.next();       
                         System.out.println("Ingrese edad:");
                         edad=leer.nextDouble(); 
                         System.out.println("Ingrese sexo (m o h:");
                         sexo=leer.next().charAt(0);
                         System.out.println("Esta vacunado (Si o No):");
                         vacunaTexto=leer.next();                 
                         if(vacunaTexto.toLowerCase().equals("si"))
                            vacunado=true;
                         else 
                            vacunado=false;   
                            
                         fechaNac=new Fecha(dia,mes,anio);   
                         
                         obj=new Perro(chipId, nombre, fechaNac, raza,
                                        edad, sexo, vacunado);
                                       
                        
                            
                         System.out.println("\n\nMoto creada.....\n\n");
                         break;
                      }
                      
               case 2:{ //Listar
                        System.out.println("\f LISTAR DATOS \n\n\n");
                         
                        if(obj!=null) //  !=  distindo de
                        {
                          obj.listarDatos();
                        }
                        else
                        {
                          System.out.println("Error, debe crear un perro...");
                        }
                        break;
                      }
                      
               case 3:{ //
                         System.out.println("\f LISTAR DATOS \n\n\n");
                         
                          System.out.println("Ingrese año actual:");
                          int anioActual=leer.nextInt();  
                          
                          System.out.println("Año nacimiento="+obj.anioNacimiento(anioActual) );
                         
                         break;
                      }                       
               case 4:{ //
                        System.out.println("\f CAMBIAR ESTADO VACUNA \n\n\n");                        
                        
                         System.out.println("Esta vacunado (Si o No):");
                         vacunaTexto=leer.next();                 
                         if(vacunaTexto.toLowerCase().equals("si"))
                            vacunado=true;
                         else 
                            vacunado=false;  
                            
                         obj.setVacunado(vacunado);
                         
                        break;
                      }                     
                      
               case 5: { 
                          
                         
                          break;
                       }       
                      
                              
                      
               default:{
                         System.out.println("Error, opción está fuera del rango...");
                         break;
                       }            
            }          
            System.out.println("\n\nPresione letra y enter para continuar...");
            leer.next();
        }
        while(opcion != 5);
        
        System.out.println("Good bye...");
        
    }    
}
