/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 134: JavaBeans en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion38_JavaBeans;

import java.io.Serializable;

// Declaración de una clase tipo JavaBeans.

@SuppressWarnings("serial") // Esto se ha tenido que incluir para que no de error la clase pero no tengo ni idea de el porqué.

//1. REQUERIDO: Declaración de la clase implementada con la interface Serializable.
public class Persona implements Serializable
{
	
	// 2. REQUERIDO: Declaración de atributos de clase privados.
	private String nombre;
	private String apellido;
	
	// 3. REQUERIDO: Declaración del constructor vacío.
	public Persona()
	{
	}
	
	// Declaración de un constructor para los dos atributos de clase.
	public Persona(String nombre, String apellido)
	{
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	// 4. REQUERIDO: Declaración de los métodos get() y set() de los atributos.
	public String getNombre() 
	{
		return this.nombre;
	}

	public String getApellido() 
	{
		return this.apellido;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public void setApellido(String apellido) 
	{
		this.apellido = apellido;
	}
	
	// Declaración del método toString().
	
	@Override
	public String toString()
	{
		return "Persona: [Nombre: " + this.nombre + ", Apellido: " + this.apellido + "]";
	}
}
