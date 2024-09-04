/*
|--------------------------------------------------------------------------------------------------------------------------------------------------|
| Videos 185, 186: Uso de JDBC en Java																																																						 |
|--------------------------------------------------------------------------------------------------------------------------------------------------|
|																																																																									 |
|	Se solicita crear un proyecto Java con las siguientes características:																																					 |
|																																																																									 |	
|		- Crear una tabla llamada "usuario" en MySQL en el esquema: test y con los siguientes campos:																									 |
|																																																																									 |
|			* idUsuario (int) PK autoincrementable.																																																			 |
|			* usuario (String).																																																													 |
|			* password (String).																																																												 |
|																																																																									 |
|		- Crear las clases similares al ejercicio JDBC para el manejo de las operaciones en la tabla "usuario":																				 |
|																																																																									 |
|			* Consultar los registros de usuarios.																																																			 |
|			* Insertar un nuevo usuario.																																																								 |
|			* Actualizar un usuario.																																																										 |
|			* Eliminar un usuario.																																																											 |
|																																																																									 |
|		- Utilizar para ello la creación de un ménu en el que pueda el usuario elegir la opción a realizar.																						 |
|																																																																									 |
|--------------------------------------------------------------------------------------------------------------------------------------------------|
*/

package Seccion46_UsoJDBC_Laboratorio_Usuarios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Seccion46_UsoJDBC.Conexion_BBDD;

// Declaración de la clase "UsuarioDAO" que es la implementación de la interface "IUsuarioDAO".

public class UsuarioDAO implements IUsuarioDAO
{
	
	// Declaración de las variables necesarias.
	
	Conexion_BBDD conexionOracle = null;
	Connection conexion = null;
	PreparedStatement instruccion = null;
	Usuario usuario = null;
	ResultSet registro = null;
	
	// Declaración de las variables con las sentencias a ejecutar en BBDD.
	
	public static final String SQL_SELECT = "SELECT idusuario, username, password FROM usuario ORDER BY idusuario";
	public static final String SQL_INSERT = "INSERT INTO usuario (username, password) VALUES (?, ?)";
	public static final String SQL_UPDATE = "UPDATE usuario SET username = ?, password = ? WHERE idusuario = ?";
	public static final String SQL_DELETE = "DELETE FROM usuario WHERE idusuario = ?";
	
	// Declaración del método "consultarUsuario()".
	
	public void consultarUsuarios() 
	{
		
		List<Usuario> listaUsuario = new ArrayList<Usuario>();
		
		// Se crea un bloque "try catch" para enmascarar el error "SQLException".
		try 
		{

			// Se crea la conexión, se lanza la sentencia SQL de consulta y todos los registros se añaden a la lista de Usuarios para luego imprimirlos 
			// por consola.
			
			conexionOracle = new Conexion_BBDD("Oracle");
			conexion = conexionOracle.crearConexionBBDD();
			instruccion = conexion.prepareStatement(SQL_SELECT);
			registro = instruccion.executeQuery();
			
			System.out.println("\n-----------------");
			System.out.println("LISTA DE USUARIOS");
			System.out.println("-----------------\n");
			
			while (registro.next() == true)
			{			
				int reg_idUsuario = registro.getInt("idUsuario");
				String reg_Usuario = registro.getString("username");
				String reg_Password = registro.getString("password");
				
				usuario = new Usuario(reg_idUsuario, reg_Usuario, reg_Password);				
				listaUsuario.add(usuario);				
			}
			
			for (Usuario regUsuario : listaUsuario) 
			{
				System.out.println(regUsuario.toString());
			}
			
		} 		
		// Error general de SQL.
		catch (SQLException w_error) 
		{
			System.out.println("\nERROR: Error general en la consulta de datos: " + w_error.getMessage());
		}
		// Se desconectan todos los elementos creados.
		finally
		{
			conexionOracle.cerrar(registro);
			conexionOracle.cerrar(instruccion);
			conexionOracle.desconexion();
		}
	}
	
	// Declaración del método "insertarUsuarios()".
	
	public void insertarUsuarios(Usuario usuario) 
	{
		
		int numRegistro = 0;
		
		// Se crea la conexión, se lanza la sentencia INSERT con los parámetros necesarios y se informa por consola.
		try 
		{
			conexionOracle = new Conexion_BBDD("Oracle");
			conexion = conexionOracle.crearConexionBBDD();
			instruccion = conexion.prepareStatement(SQL_INSERT);
			
			instruccion.setString(1, usuario.getUsername());
			instruccion.setString(2, usuario.getPassword());
			
			numRegistro = instruccion.executeUpdate();
			
			System.out.println("\nINFORMACIÓN: Se ha insertado " + numRegistro + " registro en la tabla Usuario.");

			// Se lanza de nuevo la consulta de datos.
			consultarUsuarios();
			
		} 
		// Error general de SQL.
		catch (SQLException w_error) 
		{
			System.out.println("\nERROR: Error general en la inserción de datos: " + w_error.getMessage());
		}
		// Se desconectan todos los elementos creados.
		finally
		{
			conexionOracle.cerrar(instruccion);
			conexionOracle.desconexion();
		}
	}
	
	// Declaración del método "actualizarUsuarios()".
	
	public void actualizarUsuarios(Usuario usuario) 
	{
		
		int numRegistro = 0;
		
		// Se crea la conexión, se lanza la sentencia UPDATE con los parámetros necesarios y se informa por consola.
		try 
		{
			conexionOracle = new Conexion_BBDD("Oracle");
			conexion = conexionOracle.crearConexionBBDD();			
			instruccion = conexion.prepareStatement(SQL_UPDATE);

			instruccion.setString(1, usuario.getUsername());
			instruccion.setString(2, usuario.getPassword());
			instruccion.setInt(3, usuario.getIdUsuario());
			
			numRegistro = instruccion.executeUpdate();
			
			System.out.println("\nINFORMACIÓN: Se ha actualizado " + numRegistro + " registro de la tabla Usuario.");
			
			// Se lanza de nuevo la consulta de datos.
			consultarUsuarios();
			
		} 
		// Error general de SQL.
		catch (SQLException w_error) 
		{
			System.out.println("\nERROR: Error general en la actualización de datos: " + w_error.getMessage());
		}
		// Se desconectan todos los elementos creados.
		finally
		{
			conexionOracle.cerrar(instruccion);
			conexionOracle.desconexion();
		}
	}

	// Declaración del método "eliminarUsuarios()".
	
	public void eliminarUsuarios(Usuario usuario) 
	{
		int numRegistro = 0;
		
		// Se crea la conexión, se lanza la sentencia DELETE con el parámetro necesario y se informa por consola.
		try 
		{
			conexionOracle = new Conexion_BBDD("Oracle");
			conexion = conexionOracle.crearConexionBBDD();
			instruccion = conexion.prepareStatement(SQL_DELETE);
			
			instruccion.setInt(1, usuario.getIdUsuario());
			
			numRegistro = instruccion.executeUpdate();
			
			System.out.println("\nINFORMACIÓN: Se ha eliminado " + numRegistro + " registro de la tabla Usuario.");
			
			consultarUsuarios();	
		} 
		// Error general de SQL.
		catch (SQLException w_error) 
		{
			System.out.println("\nERROR: Error general en el borrado de datos: " + w_error.getMessage());
		}		
		// Se desconectan todos los elementos creados.
		finally
		{
			conexionOracle.cerrar(instruccion);
			conexionOracle.desconexion();
		}		
	}

}
