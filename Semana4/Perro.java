
/**
 * Write a description of class Perro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
                       
                               
    //Crear método custom listarDatos con chipId, nombre y sexo.
    //Crear método anioNacimiento(int anioActual): int retorna  el 
    //                                         año de nacimiento
    
    //DATO:  el accesador de un boolean comienza con is.
    //       ejemplo:  public boolean isVacunado()

public class Perro {
    private int chipId;    // mayor que 0 y menor que 2000000
    private String nombre; // mayor igual 2 y menor igual 20
    private Fecha fechaNac;  // <-COLABORACION    // distinto de null
    private String raza;   // solo poodle,kiltro,labrador
    private double edad;   // mayor igual 0 y menor igual a 30
    private char   sexo;   // solor 'm'  y 'h'
                            //convertir a true o false
    private boolean vacunado;
    
    public Perro() {
    }
    
    public Perro(int chipId, String nombre, String raza, double edad, char sexo, boolean vacunado) {
        setChipId(chipId);
        setNombre(nombre);       
        setRaza(raza);
        setEdad(edad);
        setSexo(sexo);
        setVacunado(vacunado);
    }
    
     public Perro(int chipId, String nombre, Fecha fechaNac, String raza, double edad, char sexo, boolean vacunado) {
        setChipId(chipId);
        setNombre(nombre);
        setFechaNac(fechaNac);
        setRaza(raza);
        setEdad(edad);
        setSexo(sexo);
        setVacunado(vacunado);
    }


    public int getChipId() {
        return chipId;
    }

    public void setChipId(int chipId) {
        if(chipId>0 && chipId<2000000)
        {
           this.chipId = chipId;
        }else
        {
           p("Error, chipId fuera de rango"); 
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.length()>=2 && nombre.length()<=20)
        {
            this.nombre = nombre;
        }
        else
        {
            p("Error, largo del nombre fuera de rango");
        }
    }

    public  Fecha getFechaNac()
    {
        return fechaNac;
    }
    
    public void setFechaNac(Fecha fechaNac)
    {
        if(fechaNac != null)
        {
            this.fechaNac=fechaNac;
        }
        else
        {
           p("Error, la fecha no puede estar vacia.");
        }
    
    }
    
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        
        if(raza.toLowerCase().equals("poodle") || raza.toLowerCase().equals("kiltro") ||
            raza.toLowerCase().equals("labrador")  )
        {
           this.raza = raza.toLowerCase();
        }   
        else
        {
           p("Error, razo no corresponde");
        }
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        if(edad>=0 && edad<=30)
        {
           this.edad = edad;
        }
        else
        {
           p("Error, edad fuera de rango");
        }
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        
        if(sexo == 'm' || sexo=='h' || sexo == 'M' || sexo=='H'  )
        {
           this.sexo = sexo;
        }
        else
        {
           p("Error, sexo no cumple con el requerido");
        }
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

 
    
    @Override
    public String toString() {
        return "chipId=" + chipId + ", nombre=" + nombre +
               "fecha nacimiento="+fechaNac +
               ", raza=" + raza +
               ", edad=" + edad + ", sexo=" + sexo + ", vacunado=" +
                (vacunado==true?"Si":"NO") ;
               //operador ternario
    }
    
    
    public void listarDatos()
    {
       p("       LISTAR DATOS            ");
       p(" =============================");
       p("");
       p(chipId+ " - " +nombre +"  -  "+ sexo);
    }
    
    
    public int anioNacimiento(int anioActual)
    {
        int nacimiento=0;
        
        nacimiento=anioActual-(int)edad;
        
        return nacimiento;
    }
    
    
    public static void p(Object texto)
    {
       System.out.println(texto);
    }
}
