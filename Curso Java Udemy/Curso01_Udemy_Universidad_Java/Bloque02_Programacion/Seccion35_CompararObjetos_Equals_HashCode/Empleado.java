/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 126, 127: Comparación de objetos usando los método "equals()" y "hashCode()" en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion35_CompararObjetos_Equals_HashCode;

import java.util.Objects;

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
	
	// Declaración del método "toString()".
	@Override
	public String toString() 
	{
		return "Clase Empleado (Padre) [nombre = " + this.nombre + ", sueldo = " + this.sueldo + "]";
	}
	
	// Declaración del método "hashCode()" de forma automática.
	@Override
	public int hashCode() 
	{
		return Objects.hash(nombre, sueldo);
	}

	// Declaración del método "equals()" de forma automática.
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if (getClass() != obj.getClass())
		{
			return false;
		}
		Empleado other = (Empleado) obj;
		return Objects.equals(nombre, other.nombre) && Double.doubleToLongBits(sueldo) == Double.doubleToLongBits(other.sueldo);
	}
	
}
