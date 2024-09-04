/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 172, 173, 174, 175: Uso de JDBC en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion45_IntroduccionJDBC;

import java.sql.*;

public class PruebaConexionMySQL 
{
  public static void main(String[] args) 
  {
  	
    // Se crea un objeto de tipo "Conexion_MySQL" que se va a utilizar para la conexión con la BBDD indicando que la BBDD va a ser MySQL.
    Conexion_BBDD conexionMySQL = new Conexion_BBDD("MySQL");
        
    // Se mete el código en un bloque "try catch".
    try 
    {
    	
    	// Se llama al método que realiza la conexión con la BBDD de MySql.
      Connection conexion = conexionMySQL.crearConexionBBDD();
      
    	// Declaración de variables que van a contener cada una de las sentencias a ejecutar.
      String sql = "SELECT idpersona, nombre, apellidos, email, telefono FROM persona ORDER BY idpersona";
      
      // Se crea la sentencia que se va a lanzar en la BBDD.
      PreparedStatement instruccion = conexion.prepareStatement(sql);
      
      // Se lanza la sentencia en BBDD y se guarda el resultado.
      ResultSet resultado = instruccion.executeQuery(sql);
      
      System.out.println("\nDATOS DE LA PERSONA\n");
      
      // Se recorre todos los registros recuperados, se muestran por consola y se muestra por pantalla.
      while(resultado.next())
      {
        System.out.println("- ID Persona: " + resultado.getInt("idpersona"));
        System.out.println("- Nombre: " + resultado.getString("nombre"));
        System.out.println("- Apellidos: " + resultado.getString("apellidos"));
        System.out.println("- Email: " + resultado.getString("email"));
        System.out.println("- Teléfono: " + resultado.getString("telefono") + "\n");
      }
      
      // Se cierran las conexiones.
      conexionMySQL.cerrar(resultado);
      conexionMySQL.cerrar(instruccion);
      conexionMySQL.desconexion();

    } 
    // Si llega un mensaje de error, se muestra por consola.
    catch (SQLException ex) 
    {
      System.out.println("ERROR SQL: " + ex.getMessage());
    }
  } 
}
