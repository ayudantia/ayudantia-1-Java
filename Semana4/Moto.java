
/**
 * Write a description of class Moto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moto
{
    private String patente; //validar largo igual a 6 
    private String marca;   //validar largo 4 y 20
    private String color;   //validad solo rojo, negro, blanco
    private int precio;    //validar mayor igual 2500000 y menor igual
                            //  a 15000000
    private int estanque;  //capacidad en litros
                           //20 y 50 litros
                            
                            
    public Moto() {
    }

    public Moto(String patente, String marca,
                String color, int precio,int estanque) {
        setPatente(patente);
        setMarca(marca);
        setColor(color);
        setPrecio(precio);
        setEstanque(estanque);
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        
        //método length() de la clase String
        //entrega la cantidad de caracteres de la variable
        if(patente.length()==6)
        {
           this.patente = patente;
        }
        else
        {
           System.out.println("Error, patente no cumple con el largo");
        }
    }
    
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        
        if(marca.length()>=4 && marca.length()<=20 )
        {
           this.marca = marca;
        }
        else
        {
           System.out.println("Error, marca no cumple con el largo");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        //toLowerCase() convierte momentaneamente a minúscula
        //toUpperCase() convierte momentaneamente a mayúscuala
        if(color.toLowerCase().equals("negro") ||
           color.toLowerCase().equals("rojo") ||
            color.toLowerCase().equals("blanco")  )
        { 
           this.color = color.toLowerCase();
        }
        else
        {
            System.out.println("Error, no se acepta ese color");
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        if(precio>=2500000 && precio<=15000000)
        {
           this.precio = precio;
        }
        else
        {
          System.out.println("Error, precio fuera de rango");
        }
    }

    public int getEstanque()
    {
       return estanque;
    }
    
    public void setEstanque(int estanque)
    {
    
        if(estanque>=20 && estanque <=50)
        {
           this.estanque=estanque;
        }
        else
        {
           System.out.println("Error, capacidad del estanque fuera del rango...");
        }
    }
    
    
    
    //Método impresor
    public void printMoto()
    {
       System.out.println("patente="+getPatente());
       System.out.println("marca  ="+getMarca());
       System.out.println("color  ="+getColor());
       System.out.println("precio ="+getPrecio());  
       System.out.println("estanque="+getEstanque()+" litros");
    }
    
    
    @Override
    public String toString() {
        return "patente=" + patente + ", marca=" + marca + ", color=" +
               color + ", precio=" + precio + " estanque="+
               estanque;
    }
   

    // métodos CUSTOM
    public void listarDatos()
    {
       System.out.println( patente + " - " + marca + " - " +precio); 
    }
    
    public void aplicarDescuento(int descuento)//20
    {
        precio=precio -((precio*descuento)/100)  ;
    }
    
    public int calcularKilometrosPorEstanque()
    {
        //30 kilometros por litro
        int totalKilometros=0;
        
        totalKilometros=estanque*30;
        
        return totalKilometros;
    
    }   
}










