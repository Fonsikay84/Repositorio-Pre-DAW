/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 180, 181, 182, 183, 184: Uso de JDBC en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion47_Transacciones_Laboratorio_Persona;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import Seccion46_UsoJDBC.Conexion_BBDD;

public class PruebaUsoPersonaDAO 
{
	
	public static void main(String[] args) 
	{
		
		// Declaración de las variables necesarias.
		
		Conexion_BBDD conexionOracle = null;
		Connection conexion = null;
		
		try 
		{
			// Se crea una conexión con la BBDD.
			conexionOracle = new Conexion_BBDD("Oracle");
			conexion = conexionOracle.crearConexionBBDD();
			
			// Se comprueba si está la función "autocommit" esta activada y si es así, se desactiva.
			if (conexion.getAutoCommit() == true)
			{
				conexion.setAutoCommit(false);
			}
			
			// 1. Se consultan todos los datos de la tabla Persona.
			consultar(conexion);
			
			// 2. Se inserta un nuevo registro en la tabla Persona.
			// Se utiliza el constructor con todos los atributos de clase menos el "idPersona".
			Persona nuevaPersona = new Persona("María Rosa", "Jiménez Gago", "jimenezgagorosa@gmail.com", "603254178");
			insertar(conexion, nuevaPersona);
			consultar(conexion);
			
			// 3. Se actualiza un registro de la tabla Persona.
			// Se utiliza el constructor con todos los atributos de clase.
			Persona personaActualizar = new Persona(1, "Alfonsito", "López Jiménez", "alfonso_lopezjimenez@hotmail.com", "666207804");
			actualizar(conexion, personaActualizar);
			consultar(conexion);
			
			// 4. Se elimina un registro de la tabla Persona. 
			// Se utiliza el constructor con el atributo de clase "idPersona".
			Persona personaEliminar = new Persona(4);
			eliminar(conexion, personaEliminar);
			consultar(conexion);
			
			// Se comita todos los cambios realizados.
			conexion.commit();
			
		}
		catch (SQLException w_error) 
		{
			System.out.println("ERROR: Error en sentencia SQL: " + w_error.getMessage());
			System.out.println("AVISO: Se va a realizar el Rollback de todos los cambios realizados.");
			
			// Se utiliza un bloque "try catch" para enmascarar el error "SQLException" que puede producirse por el Rollback.
			try 
			{
				conexion.rollback();
			} 
			catch (SQLException w_errorRollback) 
			{
				System.out.println("\nERROR: Error en el Rollback de los datos: " + w_errorRollback.getMessage());
			}
		}
	}

	// 1. Ejecución de consulta de datos (Video 180).
	public static void consultar(Connection conexion) throws SQLException
	{

		// Se crea un objeto de tipo PersonaDAO.
		PersonaDAO personaDAO = new PersonaDAO(conexion);
		// Se llama al método que lanza la consulta SELECT y se guardan los datos en una lista de tipo Persona.
		List<Persona> listaPersonas = personaDAO.consultarPersonas();
		
  	System.out.println("\n-----------------------------");
		System.out.println("| DATOS DE LA TABLA PERSONA |");
		System.out.println("-----------------------------\n");
		
		// Se recorre la lista y se muestra los datos por consola de cada uno de los campos.
		for (Persona personas : listaPersonas) 
		{
			System.out.println("- Persona: " + personas.getIdPersona());
			System.out.println("- Nombre: " + personas.getNombre());
			System.out.println("- Apellidos: " + personas.getApellidos());
			System.out.println("- Email: " + personas.getEmail());
			System.out.println("- Teléfono: " + personas.getTelefono() + "\n");
		}
		
		// Se recorre la lista y se muestra todos los datos por consola.
		for (Persona personas : listaPersonas) 
		{
			System.out.println(personas.toString());
		}
	}
	
	// 2. Ejecución de inserción de datos (Video 181).
	public static void insertar(Connection conexion, Persona nuevaPersona) throws SQLException
	{
		
		// Se crea un objeto de tipo PersonaDAO.
		PersonaDAO personaDAO = new PersonaDAO(conexion);
		// Se llama al método que lanza la consulta INSERT.
		personaDAO.insertarPersona(nuevaPersona);
		
	}
	
	// 3. Ejecución de actualización de datos (Video 183).
	public static void actualizar(Connection conexion, Persona nuevosDatosPersona) throws SQLException
	{

		// Se crea un objeto de tipo PersonaDAO.
		PersonaDAO personaDAO = new PersonaDAO(conexion);
		// Se llama al método que lanza la consulta UPDATE.
		personaDAO.actualizarPersona(nuevosDatosPersona);
		
	}
	
	// 4. Ejecución del borrado de datos (Video 184).
	public static void eliminar(Connection conexion, Persona personaEliminar) throws SQLException
	{

		// Se crea un objeto de tipo PersonaDAO.
		PersonaDAO personaDAO = new PersonaDAO(conexion);
		// Se llama al método que lanza la consulta DELETE.
		personaDAO.eliminarPersona(personaEliminar);
		
	}
}
