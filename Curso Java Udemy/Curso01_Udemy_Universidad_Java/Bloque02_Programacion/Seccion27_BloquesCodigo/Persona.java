/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 109: Bloques de código de inicialización en Java.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion27_BloquesCodigo;

// Declaración de la clase "Persona".
public class Persona 
{
	
	// Declaración de atributos de la clase.
	private final int idPersona;
	private static int contadorPersonas;
	
	// Declaración del bloque de inicialización de código de tipo estático.
	static
	{
		System.out.println("Ejecución del bloque de inicialización estático.");
		Persona.contadorPersonas = 1;
	}
	
	// Declaración del bloque de inicialización de código de tipo no estático.
	{
		System.out.println("Ejecución del bloque de inicialización no estático.");
		this.idPersona = Persona.contadorPersonas++;
	}
	
	// Declaración del constructor de la clase.
	public Persona()
	{
		System.out.println("Ejecución del constructor Persona().");
	}
	
	// Declaración del método "get" del atributo de clase "idPersona".
	public int getIdPersona() 
	{
		return idPersona;
	}
	
	// Declaración del método "toString()".
	public String toString()
	{
		return "Persona:[ID Persona: " + this.idPersona + "]";
	}
}
