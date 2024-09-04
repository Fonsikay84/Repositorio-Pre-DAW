/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 64, 65, 66: Encapsulamiento en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion15_Encapsulamiento;

public class Persona 
{
	
	// Declaración de los atributos de clase de forma privada.
	private String nombre;
	private double sueldo;
	private boolean eliminado;
	
	// Declaración del constructor vacío.
	public Persona() 
	{
		
	}
	
	// Declaración del constructor Persona con los 3 argumentos.
	public Persona(String nombre, double sueldo, boolean eliminado) 
	{
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.eliminado = eliminado;
	}
	
	// Declaración de los métodos get para recuperar la información del atributo.
	
	// 1. Método get del atributo "nombre".
	public String getNombre()
	{
		return this.nombre;
	}
	
	// 2. Método get del atributo "sueldo".
	public double getSueldo()
	{
		return this.sueldo;
	}
	
	// 3. Método get del atributo "eliminado". 
	// El método get para un boolean se indica con un "is" + nombreAtributo.
	public boolean isEliminado()
	{
		return this.eliminado;
	}
	
	// Declaración de los métodos set para modificar la información del atributo.
	
	// 1. Método set del atributo "nombre".
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	// 2. Método set del atributo "sueldo".
	public void setSueldo(double sueldo) 
	{
		this.sueldo = sueldo;
	}

	// 3. Método set del atributo "eliminado".
	public void setEliminado(boolean eliminado) 
	{
		this.eliminado = eliminado;
	}
	
	// Creación del método "toString" para mostrar toda la información de los atributos de la clase Persona. (Video 66).
	public String toString() 
	{
		return "Clase Persona [Nombre: " + this.nombre + ", Sueldo: " + this.sueldo + ", Eliminado: " + this.eliminado + "].";
	}
	
}
