/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 111, 112: Uso del bucle forEach en Java.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion28_Uso_Bucle_forEach;

// Declaración de la clase Persona.
public class Persona 
{
	
	// Declaración de los atributos de clase.
	private String nombre;
	
	// Declaración del constructor.
	public Persona(String nombre)
	{
		this.nombre = nombre;
	}
	
	// Declaración del método "get()" del atributo de clase "nombre".
	public String getNombre()
	{
		return this.nombre;
	}

	// Declaración del método "set()" del atributo de clase "nombre".
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	// Declaración del método "toString()".
	public String toString()
	{
		return "Persona: [Nombre: " + this.nombre + "]";
	}
}
