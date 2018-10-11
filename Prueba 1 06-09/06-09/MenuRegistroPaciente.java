
/**
 * Write a description of class MenuRegistroPaciente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class MenuRegistroPaciente
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //RegitroPaciente
        RegistroPaciente obj = null;
        String rut = "";  // largo 10
        String nombre = ""; // entre 3 y  15 
        Fecha fechaHoraAtencion = null; // distinto de null
        byte dia = 0;
        byte mes = 0;
        short anio = 0;

        byte edad = 0; // mayor igual a 5 y menor igual a 80
        char genero = 0x0000; //  solo  M ó F   0x0000 \u0000 0        
        double precioBono = 0; //solo 1500,2500,3800,4000

        int opcion = 0;

        do {
            System.out.println("\f"); // limpia pantalla
            System.out.println("       MENU Registro Paciente");
            System.out.println("       ================");
            System.out.println(" 1. Crear un Registro");
            System.out.println(" 2. Imprimir datos");
            System.out.println(" 3. Año de nacimiento");
            System.out.println(" 4. Determinar precio bono");
            System.out.println(" 5. Genero persona");
            System.out.println(" 6. Salir");
            System.out.println("");
            System.out.println("Ingrese su opción [1-6]:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1: { //Crear
                    System.out.println("\f CREAR PACIENTE \n\n\n");

                    System.out.println("Ingrese Rut:");
                    rut = leer.next();
                    System.out.println("Ingrese nombre:");
                    nombre = leer.next();
                    System.out.println("Ingrese fecha de atencion:");
                    System.out.println("Ingrese dia:");
                    dia = leer.nextByte();
                    System.out.println("Ingrese mes:");
                    mes = leer.nextByte();
                    System.out.println("Ingrese año:");
                    anio = leer.nextShort();
                    System.out.println("Ingrese edad:");
                    edad = leer.nextByte();
                    System.out.println("Ingrese genero (M o F:");
                    genero = leer.next().charAt(0);

                    fechaHoraAtencion = new Fecha(dia, mes, anio);
                    
                    obj = new RegistroPaciente(rut, nombre, fechaHoraAtencion, edad, genero, precioBono);

                    System.out.println("\n\n Registro Paciente creado.....\n\n");
                    break;
                }

                case 2: { //Listar
                    System.out.println("\f LISTAR DATOS \n\n\n");

                    if (obj != null) //  !=  distinto de
                    {
                        obj.listarDatos();
                    } else {
                        System.out.println("Error, debe crear Registro Paciente...");
                    }
                    break;
                }

                case 3: { //
                    System.out.println("\f LISTAR DATOS \n\n\n");

                    System.out.println("Ingrese año actual:");
                    int anioActual = leer.nextInt();
                    

                    System.out.println("Año nacimiento =" + obj.anioNacimiento(anioActual));

                    break;
                }
                case 4: { //
                    System.out.println("\f DETERMINAR PRECIO BONO \n\n\n");

                    System.out.println("");
                    obj.calcularBono();
                    //obj.p(obj.getPrecioBono() + "");
                    System.out.println("Precio bono $" + obj.getPrecioBono());
                    break;
                }

                case 5: {
                    System.out.println("Genero paciente " + obj.generoPaciente());
                    break;
                }
                case 6: {
                    break;
                }

                default: {
                    System.out.println("Error, opción está fuera del rango...");
                    break;
                }
            }
            System.out.println("\n\nPresione letra y enter para continuar...");
            leer.next();
        } while (opcion != 6);

        System.out.println(
                "Good bye...");

       
        
        
                    
    }
}
