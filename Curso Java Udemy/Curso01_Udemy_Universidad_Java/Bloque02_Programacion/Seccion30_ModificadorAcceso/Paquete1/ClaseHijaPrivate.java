/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 117: Modificadores de acceso en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion30_ModificadorAcceso.Paquete1;

// Declaración de la clase hija "ClaseHijaPrivate" que hereda de la clase padre "ClasePrivate".
public class ClaseHijaPrivate extends ClasePrivate
{
	
	// Declaración del constructor.
	public ClaseHijaPrivate()
	{
		
		// Uso de los atributos, constructores y métodos default de la clase padre desde la clase hija.
		// Se tiene acceso tanto al constructor, atributo y método de forma correcta debido a que la clase padre y la clase hija están en el mismo 
		// paquete.
		
		super("Publico");																												// Constructor publico de la clase padre ya que el constructor privado
																																						// no es posible acceder.
		
		//this.atributoDefault = "Modificación atributo default.";							// No es posible acceder a un atributo de clase private de la clase
																																						// padre.
		//System.out.println("- Atributo protected: " + this.atributoDefault);
		//this.metodoDefault();																									// No es posible acceder a un método private de la clase padre.
	}
}
