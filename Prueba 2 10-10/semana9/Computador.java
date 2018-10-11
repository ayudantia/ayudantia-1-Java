
/**
 * Abstract class Computador - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class  Computador implements Icalculable
{
    private int id;
    private String marca;
    private byte ram;
    private int precio;
    private int cantidad;
    
    public Computador(){};
    
    public Computador(int id, String marca, byte ram,
                        int precio, int cantidad)
    {
       this.id=id;
       this.marca=marca;
       this.ram=ram;
       this.precio=precio;
       this.cantidad=cantidad;
    }                   
    
    public int getId()
    {
      return id;
    }
    
    @Override
    public String toString()
    {
       return id+", "+marca+", "+ram+", "+precio+", "+cantidad;       
    }
    
    public  double obtenerTotalCompra()
    {  
       double total=0;       
       total=precio*cantidad;
        
       return total;    }
       
       
    public double totalFinal()
    {
        double total=0;       
        total=(obtenerTotalCompra()-descuento())*IVA;        
       return total;
    }
    
   
}
