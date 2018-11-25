/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Persona;
import java.util.*;
/**
 *
 * @author palto
 */
public class PersonaDB {
    
    //private Persona persona;
    private static Persona persona;
    private static Connection con = null;
    private static Statement st;
    private static String query;
    private static ResultSet rs;
    private static String rut;
    private static int filasEliminadas;
    private static boolean estado;
    private static ArrayList<Persona> alPersonas=new ArrayList<Persona>();

    public static void agregar(Persona persona)throws Exception{
     
        con=new AbrirBaseDeDatos().conectar();

      try {
             st = con.createStatement(); //asocia objeto "con", con el objeto st para traer los datos de la bd
             query = "Insert into persona values ('"+persona.getRut()+
                                                   "','"+persona.getNombre()+
                                                   "',"+persona.isGenero()+
                                                   ",'"+persona.getCarrera()+
                                                    "','"+persona.getFono()+
                                                   "','"+persona.getFoto()+"')" ; //crea la consulta
             int insertarFila  = st.executeUpdate(query); //envìa ejecución de consulta a la bd

             if(insertarFila!=1)
             {
                 //System.out.println("Error");
                JOptionPane.showMessageDialog(null, "Error,  NO se insertó...");
             }  
             else
             {
              JOptionPane.showMessageDialog(null, "Los datos se han agregado correctamente...");
             }
          }
          catch (SQLException sqle)
                { 
                    //System.out.println("Error agergar SQL....." +sqle);
                    JOptionPane.showMessageDialog(null, "Registro ya existe...");
                }
          

        con.close();
    }
    
    
    //-*****************************************
   public static ArrayList<Persona> listar()throws Exception {
        int i;
        
        con=new AbrirBaseDeDatos().conectar();

       try {
            st = con.createStatement();

            query="select * from persona";

            rs = st.executeQuery(query);

            
            String rut="";
            String nombre="";
            boolean genero=false;
            String carrera="";
            String fono="";
            String rutaFoto="";
            alPersonas.removeAll(alPersonas);
            while(rs.next())
            {
                rut=rs.getString("rut");
                nombre=rs.getString("nombre");
                genero=rs.getBoolean("genero");
                carrera=rs.getString("carrera");
                fono=rs.getString("fono");
                rutaFoto=rs.getString("rutafoto");
                
                alPersonas.add(new Persona(rut,nombre,genero,carrera, 
                                        fono,rutaFoto));
            
            }
              
        } catch(SQLException sqle) { System.out.println("Error SQL....." +sqle); }
       con.close();
       
       
       return alPersonas;
       
    }      

    public static Persona buscar(String rut) throws Exception {
        int i;
        
        con=new AbrirBaseDeDatos().conectar();

       try {
            st = con.createStatement();

            query="select * from persona where rut = '"+rut+"';";

            rs = st.executeQuery(query);

             rs.last();
             System.out.println("Paso...rs"+rs.getRow());
                      
            rs.first();
            if(rs.getRow()==0)
            {
                JOptionPane.showMessageDialog(null,"No existe ese rut...");
                persona=new Persona();
            }
            else
            {
              rs.beforeFirst();
              while(rs.next()) {
               // String rut = rs.getString(1);
               persona=new Persona( rs.getString("rut"),
                                    rs.getString("nombre"),
                                    rs.getBoolean("genero"),
                                    rs.getString("carrera"),
                                    rs.getString("fono"),
                                    rs.getString("rutafoto"));
              }
             
               
            }
             
        } catch(SQLException sqle) { System.out.println("Error SQL....." +sqle); }
       con.close();
       
       
       return persona;
       
    }

    
    //**********************************
    
    public static boolean eliminar(String rut) throws Exception {
        

       estado=false; //no eliminado
       con=new AbrirBaseDeDatos().conectar();

       try {
            st = con.createStatement();

            query="delete from persona where rut= ('"+rut+"')";

            filasEliminadas = st.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Filas Eliminadas es "+filasEliminadas);

                     if(filasEliminadas != 1)
                     {
                         JOptionPane.showMessageDialog(null, "Error, rut no existe");
                     }
                     else
                     {
                         JOptionPane.showMessageDialog(null, "Los datos se han eliminado correctamente");
                        // limpiar();
                         estado=true;//eliminado
                     }
            }
            catch (SQLException sqle)
                {
                    JOptionPane.showMessageDialog(null,"Error SQL....." +sqle);

                    }

             if ( con == null )
             {
                  JOptionPane.showMessageDialog(null,"Error No se Ha podido Insertar los datos");
             }
    

                if ( con != null )
                {
		    try {
                           con.close();
                         }

                    catch( Exception e )
                    {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                 }
                      
       
        return estado;        

    }
    
    //*******************************************
    
     public static void modificar(Persona persona)throws Exception{
         
      con=new AbrirBaseDeDatos().conectar();

      try {
             st = con.createStatement(); //asocia objeto "con", con el objeto st para traer los datos de la bd
             query = "update persona set nombre='"+persona.getNombre()+
                                  "',genero="+persona.isGenero()+
                                  ",carrera='"+persona.getCarrera()+
                                  "',fono='"+persona.getFono()+
                                  "',rutafoto='"+persona.getFoto()+
                                  "' where rut='"+persona.getRut()+"'"; //crea la consulta
             int modificarFila  = st.executeUpdate(query);
             //envìa ejecución de consulta a la bd
             //JOptionPane.showMessageDialog(null,"modificarFila= "+modificarFila);


             if(modificarFila!=1)
                JOptionPane.showMessageDialog(null,"Error. Primero debe grabar los datos, luego puede modificar");
                //System.out.println("Error");
             else
             {
             JOptionPane.showMessageDialog(null, "Los datos se han modificado correctamente...");
             }
          }
          catch (SQLException sqle)
                { System.out.println("Error SQL....." +sqle); }

        con.close();
    }
    
}
