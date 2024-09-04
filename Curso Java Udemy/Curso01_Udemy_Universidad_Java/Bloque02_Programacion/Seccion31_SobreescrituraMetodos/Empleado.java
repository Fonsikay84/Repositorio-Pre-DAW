/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 118: Sobreescritura de métodos en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion31_SobreescrituraMetodos;

// Declaración de la clase padre "Empleado".

public class Empleado 
{
	// Declaración de atributos.
	
	protected String nombre;
	protected double sueldo;
	
	// Declaración del constructor.
	
	public Empleado(String nombre, double sueldo)
	{
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	// Declaración del método "obtenerDetalles()" a sobreescribir.
	
	public String obtenerDetalles()
	{
		return "Nombre: " + this.nombre + ", Sueldo: " + this.sueldo;
	}

	// Declaración del método get() y set().
	
	public String getNombre() 
	{
		return this.nombre;
	}

	public double getSueldo() 
	{
		return this.sueldo;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public void setSueldo(double sueldo) 
	{
		this.sueldo = sueldo;
	}
	
}
