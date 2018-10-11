
/**
 * Write a description of class NoteBook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NoteBook extends Computador
{
   private boolean estadoBateria;
   
   public NoteBook(int id, String marca, byte ram,
                   int precio, int cantidad, boolean estadoBateria)
    {
       super(id,marca,ram,precio,cantidad);
       this.estadoBateria=estadoBateria;
    }
    
    
    public boolean isEstadoBateria()
    {
       return estadoBateria;
    }
    
    @Override
    public String toString()
    {
       return super.toString()+", "+estadoBateria;
    }
    
    public  double descuento()
    {
       double total=0;
   
         total=obtenerTotalCompra()*DESCUENTO_NOTEBOOK;
      
       return total;
       
    }
    
 
    
}
