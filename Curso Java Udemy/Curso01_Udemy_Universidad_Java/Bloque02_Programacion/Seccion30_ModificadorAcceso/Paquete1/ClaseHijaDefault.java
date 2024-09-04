/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 116: Modificadores de acceso en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion30_ModificadorAcceso.Paquete1;

// Declaración de la clase hija "ClaseHija" que hereda de la clase padre "ClaseProtected".
public class ClaseHijaDefault extends ClaseDefault
{
	
	// Declaración del constructor.
	public ClaseHijaDefault()
	{
		
		// Uso de los atributos, constructores y métodos default de la clase padre desde la clase hija.
		// Se tiene acceso tanto al constructor, atributo y método de forma correcta debido a que la clase padre y la clase hija están en el mismo 
		// paquete.
		
		super();																																// Constructor default de la clase padre.
		this.atributoDefault = "Modificación atributo default.";								// Atributo de clase default de la clase padre.
		System.out.println("- Atributo protected: " + this.atributoDefault);
		this.metodoDefault();																										// Método default de la clase padre.
	}
}
