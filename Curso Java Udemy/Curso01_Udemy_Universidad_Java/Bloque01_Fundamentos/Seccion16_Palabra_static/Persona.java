/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 67: Contexto estático en Java (Uso de la palabra "static").
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion16_Palabra_static;

// Declaración de la clase Persona.
public class Persona 
{
	
	// Declaración de los atributos de la clase.
	private int idPersona;
	private String nombre;
	
	// Declaración del atributo de la clase de forma estática. 
	// Se hace de esta manera siendo estático el atributo contador, porque si dicho atributo no fuera de tipo estática no serviría la función de contador,
	// ya que el valor del atributo se reiniciaría cada vez que se crea un objeto y no se incrementaría.
	private static int contadorPersonas;
	
	// Declaración del constructor vacío.
	public Persona() 
	{
	}
	
	// Declaración del constructor con un argumento.
	public Persona(String nombre)
	{
		
		this.nombre = nombre;
		
		// Se incrementa la variable estática con un contador por cada objeto nuevo creado.
		Persona.contadorPersonas++;
		
		// Se asigna el nuevo valor creado por el contador al atributo de clase "idPersona".
		this.idPersona = Persona.contadorPersonas;
	}
	
	// Declaración de los métodos get y set para cada uno de los atributos de la clase.
	
	public int getIdPersona() 
	{
		return this.idPersona;
	}
	
	public String getNombre() 
	{
		return this.nombre;
	}
	
	// Al ser un atributo estático, el método get debe de ser también estático.
	public static int getContadorPersonas()
	{
		// Al ser un atributo de clase de tipo estatico, no se puede utilizar la palabra "this" sino el nombre de la clase.
		return Persona.contadorPersonas;
	}
	
	public void setIdPersona(int idPersona)
	{
		this.idPersona = idPersona;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	// Al ser un atributo estático, el método set debe de ser también estático.
	public static void setContadorPersonas(int contadorPersonas)
	{
		// Al ser un atributo de clase de tipo estatico, no se puede utilizar la palabra "this" sino el nombre de la clase.
		Persona.contadorPersonas = contadorPersonas;
	}
	
	// Declaración del método "toString()".
	public String toString() 
	{
		return "Clase Persona [ID Persona: " + this.idPersona + ", Nombre: " + this.nombre + ", Contador: " + Persona.contadorPersonas + "].";
	}
}
