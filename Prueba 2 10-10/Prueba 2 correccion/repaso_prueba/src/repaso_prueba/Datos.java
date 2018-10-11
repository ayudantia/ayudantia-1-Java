/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso_prueba;

/**
 *
 * @author LC600
 */
import java.util.ArrayList;

public class Datos {
    public static ArrayList<Factura> alfactura = new ArrayList<>();
    
    //Agregar
    public static boolean agregar(Factura factura){
        boolean estado=false;
        if (factura!=null){
            alfactura.add(factura);
            estado=true;
        }
        return estado;
    }
    
    //buscar
    public static Factura buscar(int folio){
        Factura obj = null;
        
        for(Factura xx: alfactura){
            if (xx.getFolio() == folio ){
                obj=xx;
                break;
            }
        }
        return obj;
    }
    //Eliminar
    public static boolean eliminar(int folio){
        boolean estado = false;
        int cont =0 ;
        
        for (Factura xx : alfactura){
            if (xx.getFolio()==folio){
                alfactura.remove(cont);
                break;
            }
             cont++;   
        }
        return estado;
    }
    //Listar 
    public static ArrayList<Factura> listar(){
        return alfactura;
    }
    //modificar
    public static boolean modificar(Factura factura){
        boolean estado=false;
        int cont = 0;
        for (Factura xx: alfactura){
            if (xx.getFolio()==factura.getFolio()){
                alfactura.set(cont, factura);
                estado=true;
                break;
            }
            cont++;
        }        
        return estado;
    } 
}
