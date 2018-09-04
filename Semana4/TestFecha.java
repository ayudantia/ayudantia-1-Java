
/**
 * Write a description of class TestFecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestFecha
{
   public static void main (String[] args)
   {
       Fecha obj=new Fecha( (byte)3, (byte) 1, (short)2018 );
       p(obj.toString() );
       //usar los set
       //imprimir
       //usar los get
       //usar custom
       p(obj.fechaConPalabras() );
       
   }
   
    public static void p(Object texto)
    {
       System.out.println(texto);
    }
}
