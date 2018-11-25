/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author benja
 */
public class AbrirBaseDeDatos {
      private Connection con = null; //crea objeto conexion nulo
    private String baseDeDatos;
    private String user;
    private String pass;
    private String url;

   
 public AbrirBaseDeDatos(){}




    public Connection conectar() throws Exception{
        try {
              String user = "root"; // el root de mysql
              baseDeDatos = "mascota";
              String pass = new String(""); //passwd del mysql

              String url = "jdbc:mysql://localhost:3306/"+baseDeDatos;

              Class.forName("com.mysql.jdbc.Driver").newInstance();//declaración del driver para conectarse

              con = DriverManager.getConnection(url,user,pass); //este conecta
            }
            catch (SQLException sqle)
                  {
                       System.out.println("Error SQL.....conexion" +sqle);
                  }

        if ( con != null )
            System.out.println("Se ha establecido una conexión a la base de datos ");

     return con;
    }

    public void cerrarConexion()
    {
        try
            {
                if(con != null)
                {
                    con.close();
                }
               
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Problemas con la conexión", JOptionPane.ERROR_MESSAGE);
            }
        }

}
