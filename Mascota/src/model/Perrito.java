/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author benja
 */
public class Perrito {
    private String id;
    private String nombre;
    private boolean genero;
    private String dueno;
    private String fono;
    private String rutaFoto;

    public Perrito() {
    }

    public Perrito(String id, String nombre, boolean genero, String dueno, String fono, String rutaFoto) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.dueno = dueno;
        this.fono = fono;
        this.rutaFoto = rutaFoto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public String getFono() {
        return fono;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    public String getRutaFoto() {
        return rutaFoto;
    }

    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }

   
    
}
