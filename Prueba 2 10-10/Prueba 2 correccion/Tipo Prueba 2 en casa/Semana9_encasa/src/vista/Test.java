/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import BaseDeDatos.Ventas;
import modelo.Arroz;
import modelo.Pan;
import modelo.Producto;

/**
 *
 * @author benja
 */
public class Test {  
    public static void main(String[] args) {
        
        //Crear 5 OBJETOS ARROZ Y PAN
        Arroz arroz1 = new Arroz("Arroz tucapel","aa1",800,500 );//nombre producto, id, precio y stock
        Arroz arroz2 = new Arroz("Arroz Aruba","xa1",600,140 );//nombre producto, id, precio y stock
        Arroz arroz3 = new Arroz("Arroz Nike","ca1",500,130 );//nombre producto, id, precio y stock
        Arroz arroz4 = new Arroz("Arroz Coliseo","ba1",700,200 );//nombre producto, id, precio y stock
        Arroz arroz5 = new Arroz("Arroz Chino","ab1",670,220 );//nombre producto, id, precio y stock
    
        Pan pan1 = new Pan("Pan Dulce","pnD",100,1000);
        Pan pan2 = new Pan("Pan Amasado","pnA",200,5000);
        Pan pan3 = new Pan("Pan Huevo","pnH",500,10);
        Pan pan4 = new Pan("Pan sin Sal","pnS",500,3000);
        Pan pan5 = new Pan("Pan Integral","pnI",600,500);
        
        //AGREGAR LOS OBJETOS
        Ventas.Agregar(arroz1);
        Ventas.Agregar(arroz2);
        Ventas.Agregar(arroz3);
        Ventas.Agregar(arroz4);
        Ventas.Agregar(arroz5);
        Ventas.Agregar(pan1);
        Ventas.Agregar(pan2);
        Ventas.Agregar(pan3);
        Ventas.Agregar(pan4);
        Ventas.Agregar(pan5);        
        
        //3Elimnar un producto por su id
        Producto eliminarId= Ventas.buscar("pnH");
        
        // ahora recorro la lista y pregunto si el producto exite
        if(eliminarId !=null){
            System.out.println("Se elimino " + eliminarId);
        }
        else{
            System.out.println("Error, el producto no se ha encontrado");
        }
        
        
        //Eliminar un dato del producto
        if (Ventas.eliminar("ca1")==true){
            System.out.println("Se ha eliminado");
        }
        else{
            System.out.println("Error, el producto no se ha encontrado para eliminarse");
        }
        
        //Modificar los datos de un producto
        
        Arroz modificar1= new Arroz("Arroz Chino Categoria 2","ab1",670,220 ); 
        Pan modificar2 = new Pan("Pan Huevo con pasas","pnH",500,10);
            
        Ventas.modificar(modificar1);
        Ventas.modificar(modificar2);
        Ventas.listar();
        
        
        //Sumatorias de los precios
        
        int total=0;
        
        for(Producto xx: Ventas.listar()){
            System.out.println(xx.toString());
            total = total+xx.getPrecio();
        }
        System.out.println("La sumatoria de los precios es de " + total);
        
        
        
        //Imprimir el producto mas caro
        Producto ventaMayor =  Ventas.ventaMayor();
        System.out.println("El precio mas caro es: " + ventaMayor.toString());
        
        //Imprimir el producto mas barato
        Producto barato = Ventas.ventaMenor();
        System.out.println("El precio mas barato es: " + barato.toString());
    
        //Imprimir cuantos productos Pan y Arroz hay almacenados
        int pan=0;
        int arroz=0;
        for(Producto xx: Ventas.listar())
        {
            if(xx instanceof Arroz) //Existe un arroz o un pan
            {
                arroz++;
            }
            else
            {
                pan++;
            }
        }
        
        System.out.println("Cantidad de pan: " + pan);
        System.out.println("Cantidad de arroz: " + arroz);
        
        //Aplicar descuento
        int totalFinal=0;
        for (Producto xx: Ventas.listar()){
            
            xx.aplicarDescuento((byte)1);
            totalFinal=totalFinal+ xx.getPrecio();
        }
        System.out.println("la sumatoria de los precios es: $" + totalFinal);
        
 
    }
      
        //Listar todos los productos e imprimir la sumatoria de todos los  precios.
    public static void listar()
    {
        for(Producto xx: Ventas.listar()){
            System.out.println(xx.toString());
        }
    
    }
    
    
}
