/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Perrito;

/**
 *
 * @author benja
 */
public class PerritoDB {

    private static Perrito perrito;
    private static Connection con = null;
    private static Statement st;
    private static String query;
    private static ResultSet rs;
    private static String rut;
    private static int filasEliminadas;
    private static boolean estado;
    private static ArrayList<Perrito> alPerrito = new ArrayList<Perrito>();

    public static void agregar(Perrito perrito) throws Exception {

        con = new AbrirBaseDeDatos().conectar();
        try {
            st = con.createStatement();
            query = "Insert into perrito values ('" + perrito.getId()
                    + "','" + perrito.getNombre()
                    + "'," + perrito.isGenero()
                    + ",'" + perrito.getDueno()
                    + "','" + perrito.getFono()
                    + "','" + perrito.getRutaFoto() + "')";
            int insertarFila = st.executeUpdate(query);

            if (insertarFila != 1) {
                JOptionPane.showMessageDialog(null, "Error,  NO se insertó...");
            } else {
                JOptionPane.showMessageDialog(null, "Los datos se han agregado correctamente...");
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Registro ya existe...");
        }

        con.close();
    }

    //-*****************************************
    public static ArrayList<Perrito> listar() throws Exception {
        int i;

        con = new AbrirBaseDeDatos().conectar();

        try {
            st = con.createStatement();

            query = "select * from perrito";

            rs = st.executeQuery(query);

            String id = "";
            String nombre = "";
            boolean genero = false;
            String dueno = "";
            String fono = "";
            String rutaFoto = "";
            alPerrito.removeAll(alPerrito);
            while (rs.next()) {
                id = rs.getString("id");
                nombre = rs.getString("nombre");
                genero = rs.getBoolean("genero");
                dueno = rs.getString("dueno");
                fono = rs.getString("fono");
                rutaFoto = rs.getString("rutafoto");

                alPerrito.add(new Perrito(id, nombre, genero, dueno,fono, rutaFoto));

            }

        } catch (SQLException sqle) {
            System.out.println("Error SQL....." + sqle);
        }
        con.close();

        return alPerrito;

    }

    public static Perrito buscar(String id) throws Exception {
        int i;

        con = new AbrirBaseDeDatos().conectar();

        try {
            st = con.createStatement();

            query = "select * from perrito where id = '" + id + "';";

            rs = st.executeQuery(query);

            rs.last();
            System.out.println("Paso...rs" + rs.getRow());

            rs.first();
            if (rs.getRow() == 0) {
                JOptionPane.showMessageDialog(null, "No existe ese id...");
                perrito = new Perrito();
            } else {
                rs.beforeFirst();
                while (rs.next()) {
                    // String rut = rs.getString(1);
                    perrito = new Perrito(rs.getString("idt"),
                            rs.getString("nombre"),
                            rs.getBoolean("genero"),
                            rs.getString("dueno"),
                            rs.getString("fono"),
                            rs.getString("rutafoto"));
                }

            }

        } catch (SQLException sqle) {
            System.out.println("Error SQL....." + sqle);
        }
        con.close();

        return perrito;

    }

    //**********************************
    public static boolean eliminar(String id) throws Exception {

        estado = false;
        con = new AbrirBaseDeDatos().conectar();

        try {
            st = con.createStatement();

            query = "delete from perrito where id= '" + id + "'";

            filasEliminadas = st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Filas Eliminadas es " + filasEliminadas);

            if (filasEliminadas != 1) {
                JOptionPane.showMessageDialog(null, "Error, id no existe");
            } else {
                JOptionPane.showMessageDialog(null, "Los datos se han eliminado correctamente");
                // limpiar();
                estado = true;//eliminado
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error SQL....." + sqle);

        }

        if (con == null) {
            JOptionPane.showMessageDialog(null, "Error No se Ha podido Insertar los datos");
        }

        if (con != null) {
            try {
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        return estado;
    }

    //*******************************************
    public static void modificar(Perrito perrito) throws Exception {

        con = new AbrirBaseDeDatos().conectar();

        try {
            st = con.createStatement(); 
            query = "update persona set nombre='" + perrito.getNombre()
                    + "',genero=" + perrito.isGenero()
                    + ",dueno='" + perrito.getDueno()
                    + "',fono='" + perrito.getFono()
                    + "',rutafoto='" + perrito.getRutaFoto()
                    + "' where id='" + perrito.getId()+ "'"; 
            int modificarFila = st.executeUpdate(query);

            if (modificarFila != 1) {
                JOptionPane.showMessageDialog(null, "Error. Primero debe grabar los datos, luego puede modificar");
            } //System.out.println("Error");
            else {
                JOptionPane.showMessageDialog(null, "Los datos se han modificado correctamente...");
            }
        } catch (SQLException sqle) {
            System.out.println("Error SQL....." + sqle);
        }
        con.close();
    }

}
