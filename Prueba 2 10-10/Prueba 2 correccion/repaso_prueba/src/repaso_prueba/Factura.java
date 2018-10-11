/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso_prueba;

/**
 *
 * @author LC600
 */
public class Factura {
    private int folio;
    private String fecha;
    private int monto;

    public Factura() {
    }

    public Factura(int folio, String fecha, int monto) {
        this.folio = folio;
        this.fecha = fecha;
        this.monto = monto;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getFolio() {
        return folio;
    }

    public String getFecha() {
        return fecha;
    }

    public int getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return "Factura{" + "folio=" + folio + ", fecha=" + fecha + ", monto=" + monto + '}';
    }
    
    
    
}
