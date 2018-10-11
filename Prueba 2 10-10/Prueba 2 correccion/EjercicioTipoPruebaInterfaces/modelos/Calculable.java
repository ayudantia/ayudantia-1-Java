package modelos;


/**
 * Write a description of interface Calculable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Calculable
{
    //variables finales
     double IVA =0.19;
     double DESCUENTO_VIP=0.2;
     double DESCUENTO_NORMAL=0.1;

    public  void  aplicarDescuento(byte tipoDescuento); // 1 es VIP, 2 
}
