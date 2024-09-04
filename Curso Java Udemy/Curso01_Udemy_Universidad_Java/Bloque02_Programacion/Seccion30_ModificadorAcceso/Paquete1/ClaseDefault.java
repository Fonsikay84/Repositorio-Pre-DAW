/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 116: Modificadores de acceso en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion30_ModificadorAcceso.Paquete1;

// Clase default.
class ClaseDefault 
{
	
	//Atributo de clase default.
	// Sólo se puede utilizar los atributos de tipo default desde las clases hijas pero no desde otras clases.
	String atributoDefault = "Atributo default.";
	
	// Constructor default. 
	// Sólo se puede utilizar un constructor de tipo default desde las clases hijas pero no desde otras clases.
	ClaseDefault()
	{
		System.out.println("- Constructor: Constructor default.");
	}
	
	// Métodos default.
	// Sólo se puede utilizar los métodos de tipo default desde las clases hijas pero no desde otras clases.
	void metodoDefault()
	{
		System.out.println("- Método: Método default.");
	}
	
	public String toString()
	{
		return "Clase default.";
	}
}
