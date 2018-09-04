
/**
 * Write a description of class TestMoto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestMoto
{
    public static void main(String[] args)
    {
        Moto obj=new Moto("aahh45","Kawasaki",
                           "negro",2800000,35);
    
        obj.printMoto();
        obj.aplicarDescuento(20);
        System.out.println("Total kilometros= "+
                      obj.calcularKilometrosPorEstanque() );
        obj.printMoto();
        
    }
 
}
