/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 180, 181, 182, 183, 184: Uso de JDBC en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion46_UsoJDBC;

import java.util.List;

public class PruebaUsoPersonaDAO 
{

	public static void main(String[] args) 
	{
		
		// 1. Se consultan todos los datos de la tabla Persona.
		consultar();
		
		// 2. Se inserta un nuevo registro en la tabla Persona.
		// Se utiliza el constructor con todos los atributos de clase menos el "idPersona".
		Persona nuevaPersona = new Persona("María Rosa", "Jiménez Gago", "jimenezgagorosa@gmail.com", "603254178");
		insertar(nuevaPersona);
		consultar();
		
		// 3. Se actualiza un registro de la tabla Persona.
		// Se utiliza el constructor con todos los atributos de clase.
		Persona personaActualizar = new Persona(1, "Alfonso", "López Jiménez", "alfonso_lopezjimenez@hotmail.com", "666207804");
		actualizar(personaActualizar);
		consultar();
		
		// 4. Se elimina un registro de la tabla Persona. 
		// Se utiliza el constructor con el atributo de clase "idPersona".
		Persona personaEliminar = new Persona(4);
		eliminar(personaEliminar);
		consultar();
		
	}

	// 1. Ejecución de consulta de datos (Video 180).
	public static void consultar()
	{

		// Se crea un objeto de tipo PersonaDAO.
		PersonaDAO personaDAO = new PersonaDAO();
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
	public static void insertar(Persona nuevaPersona)
	{
		
		// Se crea un objeto de tipo PersonaDAO.
		PersonaDAO personaDAO = new PersonaDAO();
		// Se llama al método que lanza la consulta INSERT.
		personaDAO.insertarPersona(nuevaPersona);
		
	}
	
	// 3. Ejecución de actualización de datos (Video 183).
	public static void actualizar(Persona nuevosDatosPersona)
	{

		// Se crea un objeto de tipo PersonaDAO.
		PersonaDAO personaDAO = new PersonaDAO();
		// Se llama al método que lanza la consulta UPDATE.
		personaDAO.actualizarPersona(nuevosDatosPersona);
		
	}
	
	// 4. Ejecución del borrado de datos (Video 184).
	public static void eliminar(Persona personaEliminar)
	{

		// Se crea un objeto de tipo PersonaDAO.
		PersonaDAO personaDAO = new PersonaDAO();
		// Se llama al método que lanza la consulta DELETE.
		personaDAO.eliminarPersona(personaEliminar);
		
	}
}
