/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 191: Patrones de diseño en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion48_PatronesDisenio.personas.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Seccion48_PatronesDisenio.personas.dto.PersonaDto;

public class PersonaDaoJDBC implements IPersonaDao 
{
	
	//Se crea una variable para las conexión de transacción.
	Connection conexionTransaccion = null;
		
	// Declaración del constructor vacío.
	public PersonaDaoJDBC()
	{}
	
	// Declaración del constructor para inicializar la conexión de transacción.
	public PersonaDaoJDBC(Connection conexionTransaccion)
	{
		this.conexionTransaccion = conexionTransaccion;
	}
	
	// Declaración de variables que van a contener cada una de las sentencias a ejecutar.
	
	private static final String SQL_SELECT = "SELECT idPersona, nombre, apellidos, email, telefono FROM persona ORDER BY idPersona";
	
	// El valor de cada uno de los campos se indica en la sentencia con el carácter "?" y luego cuando se use esta variable, es cuando a cada uno
	// de ellos se carga el valor que va a tener.
	private static final String SQL_INSERT = "INSERT INTO persona (nombre, apellidos, email, telefono) VALUES (?, ?, ?, ?)";
	
	private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellidos = ?, email = ?, telefono = ? WHERE idPersona = ?";
	
	private static final String SQL_DELETE = "DELETE persona WHERE idPersona = ?";
	
	// Declaración de los métodos de consulta, inserción, actualización y borrado de datos en la tabla Persona.
	
// 1. Declaración del método que va a realizar la consulta completa a la tabla de Persona y la va a guardar en una lista de tipo "Persona".
	public List<PersonaDto> consultarPersonas() throws SQLException
	{
		
	// Definición de las variables.
		
		// Se crea un objeto de tipo "Conexion_Oracle" que se va a utilizar para la conexión con la BBDD indicando que la BBDD va a ser Oracle.
		Conexion_BBDD conexionOracle = new Conexion_BBDD("Oracle");
		// Se crea un objeto de tipo "Connection" para almacenar la conexión con la BBDD.
		Connection conexion = null;
		// Almacena la sentencia que se va a ejecutar en la BBDD.
		PreparedStatement instruccion = null;
		// Almacena un registro de la tabla Persona.
		ResultSet registro = null;		
		// Se crea un objeto de tipo Persona para almacenar cada registro recuperado de la tabla Persona.
		PersonaDto registroPersona = null;
		// Se crea una lista de tipo Persona para almacenar todos los registros recuperados de la tabla Persona.
		List<PersonaDto> listaPersonas = new ArrayList<PersonaDto>();
		
    // Se mete el código en un bloque "try catch" para contemplar el error "SQLException".
    try 
		{
    	
    	// Si ya existe una conexión a la BBDD se mantiene dicha conexión, sino, pues se crea una nueva conexión a la BBDD.    	
    	if (this.conexionTransaccion != null)
    	{
    		conexion = this.conexionTransaccion;
    	}
    	else
    	{
    		// Se llama al método que realiza la conexión con la BBDD de Oracle y se devuelve el objeto de tipo Connection a la variable "conexión". 
        conexion = conexionOracle.crearConexionBBDD();	
    	}
      
    	// Se crea la sentencia que se va a lanzar en la BBDD.
    	instruccion = conexion.prepareStatement(SQL_SELECT);
			
    	// Se lanza la sentencia en BBDD y se guarda el resultado.
    	registro = instruccion.executeQuery();
			
			// Se recorre todos los registros recuperados y se añade cada registro en la lista de Persona.
			while(registro.next() == true)
			{
				
				// Se guarda cada campo en una variable para luego usarla.
				int 	 reg_idPersona 	= registro.getInt("idpersona");
				String reg_nombre 		= registro.getString("nombre");
				String reg_apellidos 	= registro.getString("apellidos");
				String reg_email 			= registro.getString("email");
				String reg_telefono 	= registro.getString("telefono");
        
        // Se crea un objeto de tipo Persona utilizando el constructor completo.
        registroPersona = new PersonaDto(reg_idPersona, 
														        		 reg_nombre, 
														        		 reg_apellidos, 
														        		 reg_email, 
														        		 reg_telefono);
        
        // Se añade cada registro de la tabla Persona en la lista "listaPersonas".
        listaPersonas.add(registroPersona);
			}			
		} 
    // Se cierra todas las conexiones.
		finally
		{			
			// Se cierra el registro, la instrucción y se desconecta de la BBDD.
			conexionOracle.cerrar(registro);
			conexionOracle.cerrar(instruccion);
			
			// Se comprueba si se ha creado la conexión en el inicio del método en el que se encuentra, ya que si es así, pues
			// cierra la conexión con la BBDD, pero sino, pues continua con la conexión.
			if (this.conexionTransaccion == null)
			{
				conexionOracle.desconexion();
			}
		}
    
    // Se retorna la lista de registros de la tabla Persona.
		return listaPersonas;
	}
	
// 2. Declaración del método que va a realizar la inserción de un registro en la tabla de Persona y devuelve el nº de registros insertados 
// (Video 181).
	public void insertarPersona(PersonaDto persona) throws SQLException
	{
		
	// Definición de las variables.
		
		// Se crea un objeto de tipo "Conexion_Oracle" que se va a utilizar para la conexión con la BBDD indicando que la BBDD va a ser Oracle.
		Conexion_BBDD conexionOracle = new Conexion_BBDD("Oracle");
		// Se crea un objeto de tipo "Connection" para almacenar la conexión con la BBDD.
		Connection conexion = null;
		// Almacena la sentencia que se va a ejecutar en la BBDD.
		PreparedStatement instruccion = null;
		// Almacena el nº de registros a insertar.
		int numRegistro = 0;
		
    // Se mete el código en un bloque "try catch" para contemplar el error "SQLException".
    try 
		{
    	
    	// Si ya existe una conexión a la BBDD se mantiene dicha conexión, sino, pues se crea una nueva conexión a la BBDD.    	
    	if (this.conexionTransaccion != null)
    	{
    		conexion = this.conexionTransaccion;
    	}
    	else
    	{
    		// Se llama al método que realiza la conexión con la BBDD de Oracle y se devuelve el objeto de tipo Connection a la variable "conexión". 
        conexion = conexionOracle.crearConexionBBDD();	
    	}
      
    	// Se crea la sentencia que se va a lanzar en la BBDD.
    	instruccion = conexion.prepareStatement(SQL_INSERT);
    	
    	// Se llena los parámetros de la sentencia INSERT en la parte de "VALUES".
    	// El valor de cada uno de los campos se indica en la sentencia con el carácter "?" y ahora es cuando a cada uno de ellos se carga el 
    	// valor que va a tener.
    	// Se utiliza el método "set" de la variable "PreparedStatement" y para cada tipo de variable existe un método "set".
    	// El primer dato corresponde a la posición del campo dentro del VALUES y luego se asigna el valor correspondiente con el uso del método
    	// "get()" del campo.
    	instruccion.setString(1, persona.getNombre());
    	instruccion.setString(2, persona.getApellidos());
    	instruccion.setString(3, persona.getEmail());
    	instruccion.setString(4, persona.getTelefono());
      
    	// Se ejecuta el método "executeUpdate()" que no es que estemos haciendo un update sino que va a actualizar el estado de la BBDD.
    	// Devuelve el nº de registros insertados y se almacena en la variable "numRegistro".
    	numRegistro = instruccion.executeUpdate();
    	
			System.out.println("\nINFORMACIÓN: Se ha insertado " + numRegistro + " registro en la tabla Persona.\n");

		} 
    // Se cierra todas las conexiones.
		finally
		{			
			// Se cierra la instrucción y se desconecta de la BBDD.
			conexionOracle.cerrar(instruccion);
			
			// Se comprueba si se ha creado la conexión en el inicio del método en el que se encuentra, ya que si es así, pues
			// cierra la conexión con la BBDD, pero sino, pues continua con la conexión.
			if (this.conexionTransaccion == null)
			{
				conexionOracle.desconexion();
			}
		}
		
	}
	
// 3. Declaración del método que va a realizar la actualización de los datos de un registro indicado en la tabla de Persona y devuelve el nº 
// de registros actualizados (Video 183).
	public void actualizarPersona(PersonaDto persona) throws SQLException
	{
		// Definición de las variables.
		
		// Se crea un objeto de tipo "Conexion_Oracle" que se va a utilizar para la conexión con la BBDD indicando que la BBDD va a ser Oracle.
		Conexion_BBDD conexionOracle = new Conexion_BBDD("Oracle");
		// Se crea un objeto de tipo "Connection" para almacenar la conexión con la BBDD.
		Connection conexion = null;
		// Almacena la sentencia que se va a ejecutar en la BBDD.
		PreparedStatement instruccion = null;
		// Almacena el nº de registros a insertar.
		int numRegistro = 0;		
		
		// Se mete el código en un bloque "try catch" para contemplar el error "SQLException".
    try 
		{

    	// Si ya existe una conexión a la BBDD se mantiene dicha conexión, sino, pues se crea una nueva conexión a la BBDD.
    	if (this.conexionTransaccion != null)
    	{
    		conexion = this.conexionTransaccion;
    	}
    	else
    	{
    		// Se llama al método que realiza la conexión con la BBDD de Oracle y se devuelve el objeto de tipo Connection a la variable "conexión". 
        conexion = conexionOracle.crearConexionBBDD();	
    	}
			
			// Se crea la sentencia que se va a lanzar en la BBDD.
    	instruccion = conexion.prepareStatement(SQL_UPDATE);
			
    	// Se pasan los valores de los atributos a los campos del SET del UPDATE y por ultimo se le pasa el "idPersona" para el WHERE.
			instruccion.setString(1, persona.getNombre());
			instruccion.setString(2, persona.getApellidos());
			instruccion.setString(3, persona.getEmail());
			instruccion.setString(4, persona.getTelefono());
			instruccion.setInt(5, persona.getIdPersona());
			
    	// Se ejecuta el método "executeUpdate()" que no es que estemos haciendo un update sino que va a actualizar el estado de la BBDD.
    	// Devuelve el nº de registros actualizados y se almacena en la variable "numRegistro".			
			numRegistro = instruccion.executeUpdate();
			
			System.out.println("\nINFORMACIÓN: Se ha actualizado " + numRegistro + " registro de la tabla Persona.\n");
		
		}
    // Se cierra todas las conexiones.
		finally
		{			
			// Se cierra la instrucción y se desconecta de la BBDD.
			conexionOracle.cerrar(instruccion);
			
			// Se comprueba si se ha creado la conexión en el inicio del método en el que se encuentra, ya que si es así, pues
			// cierra la conexión con la BBDD, pero sino, pues continua con la conexión.
			if (this.conexionTransaccion == null)
			{
				conexionOracle.desconexion();
			}
		}

	}
	
// 4. Declaración del método que va a realizar el borrado de un registro indicado de la tabla de Persona y devuelve el nº 
//de registros borrados (Video 184).
	public void eliminarPersona(PersonaDto persona) throws SQLException
	{
		
		// Definición de las variables.
		
		// Se crea un objeto de tipo "Conexion_Oracle" que se va a utilizar para la conexión con la BBDD indicando que la BBDD va a ser Oracle.
		Conexion_BBDD conexionOracle = new Conexion_BBDD("Oracle");
		// Se crea un objeto de tipo "Connection" para almacenar la conexión con la BBDD.
		Connection conexion = null;
		// Almacena la sentencia que se va a ejecutar en la BBDD.
		PreparedStatement instruccion = null;
		// Almacena el nº de registros a insertar.
		int numRegistro = 0;		
		
		// Se mete el código en un bloque "try catch" para contemplar el error "SQLException".
    try 
		{

    	// Si ya existe una conexión a la BBDD se mantiene dicha conexión, sino, pues se crea una nueva conexión a la BBDD.    	
    	if (this.conexionTransaccion != null)
    	{
    		conexion = this.conexionTransaccion;
    	}
    	else
    	{
    		// Se llama al método que realiza la conexión con la BBDD de Oracle y se devuelve el objeto de tipo Connection a la variable "conexión". 
        conexion = conexionOracle.crearConexionBBDD();	
    	}
			
			// Se crea la sentencia que se va a lanzar en la BBDD.
    	instruccion = conexion.prepareStatement(SQL_DELETE);
			
    	// Se pasa el parámetro "idPersona" para utilizarlo en el WHERE del DELETE.
    	instruccion.setInt(1, persona.getIdPersona());
    	
    	// Se ejecuta el método "executeUpdate()" que no es que estemos haciendo un update sino que va a actualizar el estado de la BBDD.
    	// Devuelve el nº de registros eliminados y se almacena en la variable "numRegistro".			
			numRegistro = instruccion.executeUpdate();
			
			System.out.println("\nINFORMACIÓN: Se ha eliminado " + numRegistro + " registro de la tabla Persona.\n");
			
		} 
    finally
		{
			// Se cierra la instrucción y se desconecta de la BBDD.
			conexionOracle.cerrar(instruccion);
			// Se comprueba si se ha creado la conexión en el inicio del método en el que se encuentra, ya que si es así, pues
			// cierra la conexión con la BBDD, pero sino, pues continua con la conexión.
			if (this.conexionTransaccion == null)
			{
				conexionOracle.desconexion();
			}
		}
	}
}

