/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 84: Arreglos en Java.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion21_Arreglos;

public class Persona 
{
	
	// Atributo de la clase.
	private String nombre;
	
	// Constructor vacío.
	public Persona(){}
	
	// Constructor con atributo de la clase.
	public Persona(String nombre)
	{
		this.nombre = nombre;
	}
	
	// Métodos get y set del atributo de clase "nombre".
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	// Declaración del método "toString()" para la clase Persona.
	
	public String toString() 
	{
		return "- Clase Persona: [Nombre: " + this.nombre + "]";
	}
}
