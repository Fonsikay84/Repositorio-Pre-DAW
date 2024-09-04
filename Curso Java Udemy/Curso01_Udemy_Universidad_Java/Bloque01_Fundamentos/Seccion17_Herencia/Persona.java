/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 70: Herencia en Java.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion17_Herencia;

// Creación de la clase Padre "Persona".

public class Persona 
{
	
	// Declaración de atributos de la clase.
	
	// Se utiliza la palabra reservada "protected" para que las clases hijas puedan acceder a estos atributos pero no las demás clases.
	protected String nombre;
	protected char genero;
	protected int edad;
	protected String direccion;
	
	// Declaración del constructor vacío.
	
	public Persona() {}
	
	// Declaración del constructor para inicializar sólo el atributo de clase "nombre".
	
	public Persona(String nombre)
	{
		this.nombre = nombre;
	}
	
	// Declaración del constructor para los atributos de clase.
	
	public Persona(String nombre, char genero, int edad, String direccion) 
	{
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.direccion = direccion;
	}
	
	// Declaración de los métodos get para los atributos.
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public char getGenero()
	{
		return this.genero;
	}
	
	public int getEdad()
	{
		return this.edad;
	}
	
	public String getDireccion() 
	{
		return this.direccion;
	}
	
	// Declaración de los métodos get para los atributos.
	
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public void setGenero(char genero)
	{
		this.genero = genero;
	}
	
	public void setEdad(int edad)
	{
		this.edad = edad;
	}
	
	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}
	
	// Declaración del método "toString()" para la clase Persona.
	
	public String toString() 
	{
		return "- Clase Persona: [Nombre: " + this.nombre + ", Genero: " + this.genero + ", Edad: " + this.edad + ", Dirección: " + this.direccion + "]";
	}
	
}
