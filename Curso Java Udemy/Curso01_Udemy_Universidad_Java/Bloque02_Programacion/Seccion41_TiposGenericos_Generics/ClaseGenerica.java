/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 146: Tipos genéricos en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion41_TiposGenericos_Generics;

// Se crea una clase que va a utilizar un tipo genérico de valor "T" Type (Representa una clase).
public class ClaseGenerica <T>
{
	
	// Declaración de un atributo de clase, que es de tipo "T" ya que no se sabe todavia que tipo va a ser finalmente.
	private T objetoTipoGenerico;
	
	// Declaración del constructor.
	public ClaseGenerica(T objetoTipoGenerico)
	{
		this.objetoTipoGenerico = objetoTipoGenerico;
	}
	
	// Declaración de un método que va a indicar que tipo tiene el objeto.
	public void obtenerTipo()
	{
		System.out.println("El tipo T es de tipo: " + this.objetoTipoGenerico.getClass().getSimpleName());
	}
}
