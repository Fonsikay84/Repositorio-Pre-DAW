/*
|--------------------------------------------------------------------------------------------------------------------------------------------------|
| Videos 188, 189: Uso de Transacciones de JDBC en Java																																																						 |
|--------------------------------------------------------------------------------------------------------------------------------------------------|
*/

package Seccion47_Transacciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Seccion46_UsoJDBC.Conexion_BBDD;
import Seccion46_UsoJDBC_Laboratorio_Usuarios.Usuario;

// Declaración de la clase "UsuarioDAO" que es la implementación de la interface "IUsuarioDAO".

public class UsuarioDAO implements IUsuarioDAO
{
	
	// Declaración de las variables necesarias.
	
	Conexion_BBDD conexionOracle = null;
	Connection conexion = null;
	PreparedStatement instruccion = null;
	Usuario usuario = null;
	ResultSet registro = null;
	Connection conexionTransaccion = null;
	
	// Declaración de las variables con las sentencias a ejecutar en BBDD.
	
	public static final String SQL_SELECT = "SELECT idusuario, username, password FROM usuario ORDER BY idusuario";
	public static final String SQL_INSERT = "INSERT INTO usuario (username, password) VALUES (?, ?)";
	public static final String SQL_UPDATE = "UPDATE usuario SET username = ?, password = ? WHERE idusuario = ?";
	public static final String SQL_DELETE = "DELETE FROM usuario WHERE idusuario = ?";
	
	public UsuarioDAO()
	{}
	
	// Declaración de un constructor para poder recibir el valor de la conexión de transacción.
	public UsuarioDAO(Connection conexionTransaccion)
	{
		this.conexionTransaccion = conexionTransaccion;
	}
	
	// Declaración del método "consultarUsuario()".
	
	public void consultarUsuarios() throws SQLException 
	{
		
		List<Usuario> listaUsuario = new ArrayList<Usuario>();
		
		// Se crea un bloque "try catch" para enmascarar el error "SQLException".
		try 
		{

			// Se crea la conexión, se lanza la sentencia SQL de consulta y todos los registros se añaden a la lista de Usuarios para luego imprimirlos 
			// por consola.
			
			conexionOracle = new Conexion_BBDD("Oracle");
			
			// Si ya existe una conexión a la BBDD se mantiene dicha conexión, sino, pues se crea una nueva conexión a la BBDD.
			if (this.conexionTransaccion != null)
			{
				conexion = this.conexionTransaccion;
			}
			else
			{
				conexion = conexionOracle.crearConexionBBDD();	
			}
			
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
		// Se desconectan los elementos creados y la conexión, si ha sido creada en éste método.
		finally
		{
			conexionOracle.cerrar(registro);
			conexionOracle.cerrar(instruccion);
			
			if (this.conexionTransaccion == null)
			{
				conexionOracle.desconexion();
			}
		}
	}
	
	// Declaración del método "insertarUsuarios()".
	
	public void insertarUsuarios(Usuario usuario) throws SQLException 
	{
		
		int numRegistro = 0;
		
		// Se crea la conexión, se lanza la sentencia INSERT con los parámetros necesarios y se informa por consola.
		try 
		{
			conexionOracle = new Conexion_BBDD("Oracle");

			// Si ya existe una conexión a la BBDD se mantiene dicha conexión, sino, pues se crea una nueva conexión a la BBDD.
			if (this.conexionTransaccion != null)
			{
				conexion = this.conexionTransaccion;
			}
			else
			{
				conexion = conexionOracle.crearConexionBBDD();	
			}
					
			instruccion = conexion.prepareStatement(SQL_INSERT);
			
			instruccion.setString(1, usuario.getUsername());
			instruccion.setString(2, usuario.getPassword());
			
			numRegistro = instruccion.executeUpdate();
			
			System.out.println("\nINFORMACIÓN: Se ha insertado " + numRegistro + " registro en la tabla Usuario.");

			// Se lanza de nuevo la consulta de datos.
			consultarUsuarios();
			
		} 
		// Se desconectan los elementos creados y la conexión, si ha sido creada en éste método.
		finally
		{
			conexionOracle.cerrar(instruccion);
			
			if (this.conexionTransaccion == null)
			{
				conexionOracle.desconexion();
			}
		}	
	}
	
	// Declaración del método "actualizarUsuarios()".
	
	public void actualizarUsuarios(Usuario usuario) throws SQLException 
	{
		
		int numRegistro = 0;
		
		// Se crea la conexión, se lanza la sentencia UPDATE con los parámetros necesarios y se informa por consola.
		try 
		{
			conexionOracle = new Conexion_BBDD("Oracle");

			// Si ya existe una conexión a la BBDD se mantiene dicha conexión, sino, pues se crea una nueva conexión a la BBDD.
			if (this.conexionTransaccion != null)
			{
				conexion = this.conexionTransaccion;
			}
			else
			{
				conexion = conexionOracle.crearConexionBBDD();	
			}
					
			instruccion = conexion.prepareStatement(SQL_UPDATE);

			instruccion.setString(1, usuario.getUsername());
			instruccion.setString(2, usuario.getPassword());
			instruccion.setInt(3, usuario.getIdUsuario());
			
			numRegistro = instruccion.executeUpdate();
			
			System.out.println("\nINFORMACIÓN: Se ha actualizado " + numRegistro + " registro de la tabla Usuario.");
			
			// Se lanza de nuevo la consulta de datos.
			consultarUsuarios();
			
		} 
		// Se desconectan los elementos creados y la conexión, si ha sido creada en éste método.
		finally
		{
			conexionOracle.cerrar(instruccion);
			
			if (this.conexionTransaccion == null)
			{
				conexionOracle.desconexion();
			}
		}
	}

	// Declaración del método "eliminarUsuarios()".
	
	public void eliminarUsuarios(Usuario usuario) throws SQLException 
	{
		int numRegistro = 0;
		
		// Se crea la conexión, se lanza la sentencia DELETE con el parámetro necesario y se informa por consola.
		try 
		{
			conexionOracle = new Conexion_BBDD("Oracle");

			// Si ya existe una conexión a la BBDD se mantiene dicha conexión, sino, pues se crea una nueva conexión a la BBDD.
			if (this.conexionTransaccion != null)
			{
				conexion = this.conexionTransaccion;
			}
			else
			{
				conexion = conexionOracle.crearConexionBBDD();	
			}
					
			instruccion = conexion.prepareStatement(SQL_DELETE);
			
			instruccion.setInt(1, usuario.getIdUsuario());
			
			numRegistro = instruccion.executeUpdate();
			
			System.out.println("\nINFORMACIÓN: Se ha eliminado " + numRegistro + " registro de la tabla Usuario.");
			
			consultarUsuarios();	
		} 	
		// Se desconectan los elementos creados y la conexión, si ha sido creada en éste método.
		finally
		{
			conexionOracle.cerrar(instruccion);
			
			if (this.conexionTransaccion == null)
			{
				conexionOracle.desconexion();
			}
		}		
	}
}
