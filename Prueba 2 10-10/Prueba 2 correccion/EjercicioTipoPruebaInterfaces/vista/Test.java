package vista;


/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import modelos.*;
import basededatos.*;

public class Test
{
    public static void main(String[] args)
    {
        Arroz obj1=new Arroz("aaa","001",900,20);
        Arroz obj2=new Arroz("bbb","002",850,18);
        Arroz obj3=new Arroz("ccc","003",950,25);
        Arroz obj4=new Arroz("ddd","004",770,10);
        Arroz obj5=new Arroz("eee","005",930,20);
        Pan   obj6=new Pan  ("fff","006",710,5);
        Pan   obj7=new Pan  ("ggg","007",810,35);
        Pan   obj8=new Pan  ("hhh","008",890,15);
        Pan   obj9=new Pan  ("iii","009",899,13);
        Pan   obj10=new Pan ("jjj","010",799,5);
        
        Ventas.agregar(obj1);
        Ventas.agregar(obj2);
        Ventas.agregar(obj3);
        Ventas.agregar(obj4);
        Ventas.agregar(obj5);
        Ventas.agregar(obj6);
        Ventas.agregar(obj7);
        Ventas.agregar(obj8);
        Ventas.agregar(obj9);
        Ventas.agregar(obj10);
        
        //Comprobar...
        //for(Producto producto:Ventas.listar())
        //{
        //   System.out.println(producto.toString());
        //}
        //****************
        
        //****  3   ***
        
        Producto obj=Ventas.buscar("006");
        
        if(obj!=null)
        {
            System.out.println("Encontrado: "+obj.toString());
        }
        else
        {
            System.out.println("Error, producto no existe...");
        }
        
        //********    4    ************
        if(Ventas.eliminar("006")==true )
        {
            System.out.println("Eliminado....");
            //listar();
        }
        else
        {
            System.out.println("Id no Existe...");
        }
        
        // ******   5   *********
        Pan   modificado=new Pan ("jjj","010",999,35);
        Ventas.modificar(modificado);
        listar();
        
        //********  6   ***********
        int suma=0;
        for(Producto producto:Ventas.listar())
         {
            System.out.println(producto.toString());
            suma=suma+producto.getPrecio();
         }
         System.out.println("La sumatoria de los precios es: $"+suma);
        
        //*********  7   **********
        
          Producto objMayor=Ventas.ventaMayor();
           System.out.println("El precio mas caro es: "+objMayor.toString());
        //   ********  8   usted ************
        
        //********   9  ***********
        int pan=0;
        int arroz=0;
        for(Producto producto:Ventas.listar())
        {
          if( producto instanceof Arroz )
          {
             arroz++;
          }
          else
          {
             pan++;  
          }
          
        }
        System.out.println("Total de objetos Arroz="+arroz);
        System.out.println("Total de objetos Pan="+pan);
        
        //  ***********    10   *******
        int total=0;
        for(Producto producto:Ventas.listar())
        {
            producto.aplicarDescuento((byte)1);
            total=total+producto.getPrecio();
        }
        System.out.println("La sumatoria de los precios con descuento es: $"+total);
        
    }
    
    public static void listar()
    {
       for(Producto producto:Ventas.listar())
       {
          System.out.println(producto.toString());
       }
    }
}











