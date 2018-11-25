/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;
//import view.*;
/**
 *
 * @author Administrador
 */
public class Persona {

    private String rut;
    private String nombre;
    private boolean genero;
    private String carrera;
    private String fono;
    private String foto;

    public Persona(String rut, String nombre, boolean genero, String carrera, String fono, String foto) {
        this.rut = rut;
        this.nombre = nombre;
        this.genero = genero;
        this.carrera = carrera;
        this.fono = fono;
        this.foto = foto;
    }

   public Persona(){
   }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getFono() {
        return fono;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
              
        
        
        return "rut=" + rut + ", nombre=" + nombre + 
                ", genero=" + (genero==true? "Masculino":"Femenino") 
                + ", carrera=" + carrera + ", fono=" + fono + ", foto=" + foto;
    }

   
}
