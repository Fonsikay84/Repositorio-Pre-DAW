/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 124, 125: Conversión de objetos en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion34_ConversionObjetos;

// Creación de una clase tipo Enum llamada "TipoEscritura".

public enum TipoEscritura 
{
	CLASICO("Escritura a mano."),		// Atributo descripcion.
	MODERNO("Escitura digital");
	
	// Declaración de atributo de la clase.
	
	private final String descripcion;
	
	// Declaración del constructor.
	
	private TipoEscritura(String descripcion)
	{
		this.descripcion = descripcion;
	}
	
	// Declaración del método "get()" del atributo de clase "descripcion".
	
	public String getDescripcion()
	{
		return this.descripcion;
	}
}
