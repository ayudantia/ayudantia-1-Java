package modelos;


/**
 * Abstract class Producto - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Producto implements Calculable
{
    private String id;
    protected int precio;
    private int stock;
    
    public Producto(String id, int precio, int stock)
    {
       setId(id);
       setPrecio(precio);
       setStock(stock);
        
    }
    
    public void setId(String id)
    {
       if(id.length()==3)
       {
          this.id=id;
       }
       else
       {
          System.out.println("Error, Id no cumple con el largo..."); 
       }
    }
    public String getId()
    {
       return id;
    }
    
    public void setPrecio(int precio)
    {
        if(precio>=100 && precio<=20000)
        {
           this.precio=precio;
        }
        else
        {
           System.out.println("Error, precio fuera de rango...");
        }
    }
    public int getPrecio()
    {
       return precio;
    }
    
    public void setStock(int stock)
    {
        if(stock>0)
        {
           this.stock=stock;
        }
        else
        {
           System.out.println("Error, stock debe ser mayor que cero...");
        }
    }
    public int getStock()
    {
        return stock;
    }
    
    public String toString()
    {
       return id+", "+precio+", "+stock;
    }
    
}
