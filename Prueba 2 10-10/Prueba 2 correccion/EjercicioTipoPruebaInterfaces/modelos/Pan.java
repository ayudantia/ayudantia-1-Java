package modelos;


/**
 * Write a description of class Pan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pan extends Producto
{
   private String nombreProducto;
   
   public Pan(String nombreProducto, String id, int precio, int stock)
   {
      super(id,precio,stock);
      setNombreProducto(nombreProducto);
   }
   
   public void setNombreProducto(String nombreProducto)
   {
      if(nombreProducto!=null)
      {
        this.nombreProducto=nombreProducto; 
      }
      else
      {
         System.out.println("Error, nombre del producto debe contener datos...");  
      }
      
   }
   
   public String getNombreProducto()
   {
      return nombreProducto; 
   }
    
    
    
   public void aplicarDescuento(byte tipoDescuento)
   {
        switch(tipoDescuento)
        {
           case 1:{
                    //setPrecio((int)(getPrecio()-(getPrecio()*DESCUENTO_VIP)));
                    precio=(int)(precio-(precio*DESCUENTO_VIP));
                    break; 
                  }
                  
                  
        
        }
        
   }
   
   public String toString()
   {
      return nombreProducto+", "+super.toString(); 
   }
}
