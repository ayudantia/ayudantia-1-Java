/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayudantia111018;

/**
 *
 * @author benja
 */
public class Ayudantia111018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pan obj1 = new Pan(1,"Marraqueta",3000,3,3);
        Pan obj2 = new Pan(2, "Hallulla", 1000,3,2);

        System.out.println("");
        
        System.out.println("");
        System.out.println("Descuento= " + obj1.descuento());
        System.out.println("Total final= " + obj1.totalFinal());
        
        System.out.println("");
        System.out.println("");
        //**************************

        //Agregar objetos a la colección
        RegistroProducto.agregar(obj1);
        RegistroProducto.agregar(obj2);
        RegistroProducto.agregar(obj2);
        System.out.println(RegistroProducto.agregar(obj2));
        RegistroProducto.agregar(obj2);
        RegistroProducto.agregar(obj1);

        //Foreach
        for (Producto xx : RegistroProducto.obtenerDatos()) {
            System.out.println(xx.toString());
        }

        //foreach
        int pce = 0;
        for (Producto xx : RegistroProducto.obtenerDatos()) {
            // System.out.println(xx.toString());

            if (xx instanceof Pan) {
                System.out.println(xx.toString());
            }

        }
        System.out.println("La cantidad de Productos de Bebida son " + pce);

        System.out.println("");
        System.out.println("");
        //***********************
        Producto produ = RegistroProducto.buscar(1);
        if (produ != null) {
            System.out.println("Existe---" + produ.toString());
        } else {
            System.out.println("Error, produc no existe");
        }

        System.out.println("");
        System.out.println("");
        //**********Eliminar
        if (RegistroProducto.eliminar(2) == true) {
            System.out.println("Eliminado...");
        } else {
            System.out.println("Id no existe...");
        }
        
        obj1.setNombre("dobladita");
        
        if (RegistroProducto.modificar(obj1) == true) {
            System.out.println("Ok, datos modificados...");
            //Foreach
            for (Producto xx : RegistroProducto.obtenerDatos()) {
                System.out.println(xx.toString());
            }
        } else {
            System.out.println("Id no existe...");
        }
        
        
        System.out.println("");
        System.out.println("");
        
        
     if(obj2 instanceof Pan)
     {
        System.out.println("si, es un Pan");
     }
     else
     {
         System.out.println("NO, no un Pan");
     }

    }

}
