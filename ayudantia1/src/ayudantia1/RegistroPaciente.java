/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayudantia1;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author benja
 */
public class RegistroPaciente {

    private String rut;  // largo 10
    private String nombre; // entre 3 y  15 
    private Fecha fechaHoraAtencion; // distinto de null
    private byte edad; // mayor igual a 5 y menor igual a 80
    private char genero; //  solo  M ó F
    private double precioBono; //solo 1500,2500,3800,4000

    /* - Crer el método ListarDatos que retorne: nombre, fecha
    *   y precioBono. 
    * 
    * 
    * - método custom que permita realizar
    *   un descuento en base a la siguiente tabla:
    *   
    *       edad < 18  bono $2500
    *       edad < 30  bono $3800
    *       edad < 60  bono $4000
    *       >=60       bono $1500
    *       
    *  - método custom que permita determinar y retornar el 
    *     año de nacimiento. 
    
    *  - método custom que permita retornar el género
    *     con palabras. Ejemplo Masculino...
    *     
    *  Crear la clase MenuRegistroPaciente
     */
    public RegistroPaciente(String rut, String nombre, Fecha fechaHoraAtencion, byte edad, char genero, double precioBono) {
        setRut(rut);
        setNombre(nombre);
        setFechaHoraAtencion(fechaHoraAtencion);
        setEdad(edad);
        setGenero(genero);
        setPrecioBono(precioBono);
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        if(rut.length()==10){
            this.rut=rut;
        }else{
            p("error, Largo rut no valido");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length()>5 && nombre.length()<15){
        }
        this.nombre = nombre;
    }

    public Fecha getFechaHoraAtencion() {
        return fechaHoraAtencion;
    }

    public void setFechaHoraAtencion(Fecha fechaHoraAtencion) {
        if (fechaHoraAtencion!=null) {
            this.fechaHoraAtencion = fechaHoraAtencion;
        }else{
            p("error, No existe fecha de atencion");
        }
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        if (edad>=5 && edad<=85) {
            this.edad = edad;
        }else{
            p("error, edad fuera de rango");
        }     
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        //FORMA 1
        switch(genero){
            case 'F' :
                this.genero = genero;
                break;
            case 'M':
                this.genero = genero;
                break;
            default:
                p("Error, Genero mal ingresado");
        }
        
        //FORMA 2
        if(genero=='F' || genero=='M' || genero=='m' || genero=='f'){
            this.genero = genero;
        }else{
            p("Error, Genero mal ingresado");
        }
    }

    public double getPrecioBono() {
        return precioBono;
    }

    public void setPrecioBono(double precioBono) {
        if (precioBono==1500 || precioBono==2500 || precioBono==3800 || precioBono==4000) {
             this.precioBono = precioBono;
        }else{
            p("error, Precio mal ingresado");
        }
    }

    @Override
    public String toString() {
        return "RegistroPaciente{" + "rut=" + rut + ", nombre=" + nombre + ", fechaHoraAtencion=" + fechaHoraAtencion + ", edad=" + edad + ", genero=" + genero + ", precioBono=" + precioBono + '}';
    }
    
    public  void listarDatos(){
        p("Registo parciente " + nombre + " " + fechaHoraAtencion + " precio bono : "+ precioBono);
    }
    
    
    public void p(String texto){
        System.out.println(texto);
    }
    
    public void calcularBono(){
        if(edad<18){
            precioBono=2500;
        }        
        if(edad>=18 && edad<30){
            precioBono=3800;
        }
        if(edad>=30 &&  edad<=60){
            precioBono=4000;
        }
        if (edad>60) {
            precioBono = 1500;
        }        
    }
    
    //Metodo año de nacimiento
    public int anioNacimiento(){
        int anio = 0;
        //Calendar calendario = Calendar.getInstance();
        //int anioActual = calendario.get(Calendar.YEAR);
        int anioActual = Calendar.YEAR;
        
        anio = anioActual - edad;
        
        return anio;
    }
    
     
    public int anioNacimiento(int anioActual)
    {
        int nacimiento=0;
        
        nacimiento=anioActual-(int)edad;
        
        return nacimiento;
    }
    
    //     método custom que permita retornar el género
    //     con palabras. Ejemplo Masculino...
    public String generoPaciente(){
        String g="";
        if (genero=='f' || genero=='F') {
            g = "Feminino";
        }else{
            g="Masculino";
        }
        return g;
    }
}
