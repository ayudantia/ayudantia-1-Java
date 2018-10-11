
/**
 * Write a description of class Escritorio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escritorio extends Computador
{
   private boolean tipoEscritorio;
     
   public Escritorio(int id, String marca, byte ram,
                   int precio, int cantidad, boolean tipoEscritorio)
    {
       super(id,marca,ram,precio,cantidad);
       this.tipoEscritorio=tipoEscritorio;
    }
    
    @Override
    public String toString()
    {
       return super.toString()+", "+tipoEscritorio;
    }
    
   public  double descuento()
    {
       double total=0;
   
         total=obtenerTotalCompra()*DESCUENTO_PC;
      
       return total;       
    }
    
    
}
