
/**
 * Write a description of interface Calculable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Calculable
{
    public final double IVA=0.19;
    public final double DESCUENTO_BEBIDA=0.2;
    public final double DESCUENTO_MASA=0.1;
    
    public abstract double descuento();
    public abstract double obtenerTotalCompra();
    public abstract double totalFinal();
}
