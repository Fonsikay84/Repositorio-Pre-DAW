/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 114, 115: Modificadores de acceso en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion30_ModificadorAcceso.Paquete1;

// Clase public.
public class ClaseProtected 
{
	
	//Atributo de clase protected.
	// Sólo se puede utilizar los atributos de tipo protected desde las clases hijas pero no desde otras clases.
	protected String atributoProtected = "Atributo protected.";
	
	// Constructor protected. 
	// Sólo se puede utilizar un constructor de tipo protected desde las clases hijas pero no desde otras clases.
	protected ClaseProtected()
	{
		System.out.println("- Constructor: Constructor protected.");
	}
	
	// Métodos protected.
	// Sólo se puede utilizar los métodos de tipo protected desde las clases hijas pero no desde otras clases.
	protected void metodoProtected()
	{
		System.out.println("- Método: Método protected.");
	}
	
	public String toString()
	{
		return "- Clase protected.";
	}
}
