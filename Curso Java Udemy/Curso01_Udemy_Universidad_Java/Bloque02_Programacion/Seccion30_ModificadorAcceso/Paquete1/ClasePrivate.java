/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 117: Modificadores de acceso en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion30_ModificadorAcceso.Paquete1;

// Clase private.
class ClasePrivate 
{
	
	//Atributo de clase private.
	// Sólo se puede utilizar los atributos de tipo private desde otras clases sólo se puede usar los métodos get() y set() de la clase.
	private String atributoPrivado = "Atributo private.";
	
	// Constructor private. 
	// Sólo se puede utilizar un constructor de tipo private desde las clases hijas pero no desde otras clases.
	private ClasePrivate()
	{
		System.out.println("- Constructor: Constructor private.");
	}
	
	// Se crea un constructor publico para que se pueda crear un objeto de tipo ClasePrivate.
	public ClasePrivate(String argumento)
	{
		// Se llama al constructor privado.
		this();
		System.out.println("- Constructor: " + argumento);
	}
	
	// Métodos private.
	// Sólo se puede utilizar los métodos de tipo private desde las clases hijas pero no desde otras clases.
	private void metodoPrivado()
	{
		System.out.println("- Método: Método private.");
	}
	
	// Se declaran los métodos get() y set() para que puedan acceder y modificar los valores de los atributos privados desde otras clases.
	public String getAtributoPrivado()
	{
		this.metodoPrivado();
		return this.atributoPrivado;
	}
	
	public void setAtributoPrivado(String atributoPrivado)
	{
		this.atributoPrivado = atributoPrivado;
	}
	
	public String toString()
	{
		return "Clase private.";
	}
}
