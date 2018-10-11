
/**
 * Write a description of class TestPerro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestPerro
{
    public static void main(String[] args)
    {
       Fecha fechaNac=new Fecha( (byte)5, (byte)2, (short)1995) ;
        
       Perro perrin=new Perro(1000,"Cachupin",fechaNac,"kiltro",1.2,'M',true);
       
       p(perrin.toString());
       
       perrin.setChipId(2000);
       perrin.setNombre("Perruno");
       perrin.setFechaNac(new Fecha( (byte)15, (byte)1, (short)2010) );
       perrin.setRaza("Poodle");
       perrin.setEdad(2.4);
       perrin.setSexo('H');
       perrin.setVacunado(false);
       
       p(perrin.toString());
       
       p("chipid="+perrin.getChipId() );
       p("Nombre="+perrin.getNombre() );
       p("FechaNac="+perrin.getFechaNac() );
       p("Raza="+perrin.getRaza() );
       p("Edad="+perrin.getEdad() );
       p("Sexo="+perrin.getSexo() );
       p("Vacunado="+(perrin.isVacunado()==true?"Si":"NO") );
        
    
    }
    
    public static void p(Object texto)
    {
       System.out.println(texto);
    }
}
