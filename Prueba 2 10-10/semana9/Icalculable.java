
/**
 * Write a description of interface Icalculabre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Icalculable
{
    public final double IVA=1.19;
    public final double DESCUENTO_NOTEBOOK=0.10;
    public final double DESCUENTO_PC=0.05;
    
    public abstract double obtenerTotalCompra();
    public abstract double descuento();
    public abstract double totalFinal();
}
