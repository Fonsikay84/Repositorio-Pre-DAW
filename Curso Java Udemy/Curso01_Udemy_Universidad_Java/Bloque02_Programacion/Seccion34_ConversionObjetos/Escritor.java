/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 124, 125: Conversión de objetos en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion34_ConversionObjetos;

// Declaración de la clase Escritor que es hijo de la clase Empleado.

public class Escritor extends Empleado
{
	
	// Declaración de atributos de clase.
	
	final TipoEscritura tipoEscritura;
	
	// Declaración del constructor con los atributos de clase del padre y de la clase propia.
	
	public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura)
	{
		super(nombre, sueldo);
		this.tipoEscritura = tipoEscritura;
	}
	
	// Declaración del método "get()" para el atributo "tipoEscritura".
	public TipoEscritura getTipoEscritura()
	{
		return this.tipoEscritura;
	}
	
	// Sobreescritura del método de la clase padre "obtenerDetalles()".
	
	@Override
	public String obtenerDetalles()
	{
		return "Clase Escritor (obtenerDetalles()): " + super.obtenerDetalles() + ", Tipo escritura: " + tipoEscritura.getDescripcion();
	}
	
	// Declaración del método "toString()".

	@Override
	public String toString()
	{
		return "Clase Escritor (Hijo) [Tipo escritura: " + this.tipoEscritura + "], " + super.toString();
	}
}
