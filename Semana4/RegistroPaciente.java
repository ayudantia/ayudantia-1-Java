
/**
 * Write a description of class Paciente here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RegistroPaciente
{
   private String rut;  // largo 10
   private String nombre; // entre 3 y  15 
   private Fecha fechaHoraAtencion; // distinto de null
   private byte edad; // mayor igual a 5 y menor igual a 80
   private char genero; //  solo  M � F
   private double precioBono; //solo 1500,2500,3800,4000
   
   /* - Crer el m�todo ListarDatos que retorne: nombre, fecha
    *   y precioBono.
    * 
    * 
    * - m�todo custom que permita realizar
    *   un descuento en base a la siguiente tabla:
    *   
    *       edad < 18  bono $2500
    *       edad < 30  bono $3800
    *       edad < 60  bono $4000
    *       >=60       bono $1500
    *       
    *  - m�todo custom que permita determinar y retornar el 
    *     a�o de nacimiento. 
    *  - m�todo custom que permita retornar el g�nero
    *     con palabras. Ejemp?o Masculino...
    *     
    *  Crear la clase MenuRegistroPaciente
    */
   
   public RegistroPaciente(String rut, String nombre, Fecha fechaHoraAtencion, byte edad,char genero, double precioBono){
       setRut(rut);
    
    }
    public void setRut(String rut){
        this.rut = rut;
    }
}
