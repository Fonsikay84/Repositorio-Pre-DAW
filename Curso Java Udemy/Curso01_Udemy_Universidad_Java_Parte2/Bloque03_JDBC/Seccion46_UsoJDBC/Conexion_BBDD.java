/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 176: Uso de JDBC en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion46_UsoJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// Declaración de la clase para la conexión con las BBDD de MySQL y Oracle.
public class Conexion_BBDD 
{
  
  // Declaración de los atributos de la clase.
  
  // Tipo de BBDD a conectar.
  private String tipoBBDD;
  // Creación del objeto de conexión de BBDD.
  private Connection conexion;
  // Cadena de conexión a la BBDD.
  private String url;
  // Usuario de la BBDD.
  private String usuario; 
  // Contraseña de la BBDD.
  private String clave;
  // Valor de Class.forName().
  private String classforname;
  
  // Declaración del constructor para inicializar los atributos de clase utilizados para la conexión con la BBDD.
  public Conexion_BBDD(String tipoBBDD)
  {
    // Se carga el atributo de clase con el valor que le venga en la creación del objeto de la clase "Conexion_BBDD".
    this.tipoBBDD = tipoBBDD;
    
    // Segón sea la BBDD a conectar, pues se carga las variables necesarias para la conexión con dicha BBDD.
    switch (this.tipoBBDD) 
    {
      
      // Variables para la conexión con la BBDD de MySQL.
      case "MySQL":
        this.conexion = null;
        this.url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        this.usuario = "root";
        this.clave = "admin"; 
        this.classforname = "com.mysql.cj.jdbc.Driver";
        break; 
        
      // Variables para la conexión con la BBDD de Oracle.
      case "Oracle":
        this.conexion = null;
        this.url = "jdbc:oracle:thin:@localhost:1521:xe";
        this.usuario = "Curso_Java";
        this.clave = "1234"; 
        this.classforname = "oracle.jdbc.driver.OracleDriver";
        break; 
    }
  }
  
  // Se crea el método en el cual se realiza la conexión con la BBDD.
  public Connection crearConexionBBDD()
  {
    // Se mete el código en un bloque "try catch".
    try 
    {
      
      Class.forName(this.classforname);
      
      // Se crea un objeto de tipo Conexion donde se pasa la url, el usuario y la clave de la BBDD.
      this.conexion = DriverManager.getConnection(this.url, this.usuario, this.clave);  
      
      // Se informa si la conexión a la BBDD ha sido correcta o no.
      if (this.conexion != null) 
      {
      	System.out.println("\nINFORMACIÓN: BBDD " + this.tipoBBDD + " - Conexión exitosa.");
      }
      else
      {
        System.out.println("\nERROR: BBDD " + this.tipoBBDD + " - Conexión errónea.");
      }
    }
    // Si llega un mensaje de error, se muestra por consola.
    catch (ClassNotFoundException | SQLException w_error) 
    {
      System.out.println("\nERROR: BBDD " + this.tipoBBDD + " - Conexión errónea: " + w_error.getMessage());
    }    
    // Se retorna el objeto tipo conexión.
    return this.conexion;
  }

  // Creación del método para cerrar el registro de tipo "ResultSet".
  public void cerrar(ResultSet registro)
  {
  	// Se mete el código en un bloque "try catch".
  	try 
  	{
  		// Se cierra el registro de tipo "ResultSet".
  		registro.close();            
  	} 
  	// Si llega un mensaje de error, se muestra por consola.
  	catch (SQLException w_error) 
  	{
  		System.out.println("\nERROR: BBDD " + this.tipoBBDD + " - Error de desconexión ResultSet: " + w_error.getMessage());
  	}
  }

  // Creación del método para cerrar la instrucción de tipo "PreparedStatement".
  public void cerrar(PreparedStatement instruccion)
  {
    // Se mete el código en un bloque "try catch".
    try 
    {
      // Se cierra la instrucción de tipo "PreparedStatement".
    	instruccion.close();            
    } 
    // Si llega un mensaje de error, se muestra por consola.
    catch (SQLException w_error) 
    {
      System.out.println("\nERROR: BBDD " + this.tipoBBDD + " - Error de desconexión PreparedStatement: " + w_error.getMessage());
    }
  }
  
  // Creación del método para desconectar la conexión de BBDD.
  public void desconexion()
  {
    // Se mete el código en un bloque "try catch".
    try 
    {
      // Se cierra la conexión con la BBDD.
      this.conexion.close();      
    } 
    // Si llega un mensaje de error, se muestra por consola.
    catch (SQLException w_error) 
    {
      System.out.println("\nERROR: BBDD " + this.tipoBBDD + " - Error de desconexión: " + w_error.getMessage());
    }
  }
}
