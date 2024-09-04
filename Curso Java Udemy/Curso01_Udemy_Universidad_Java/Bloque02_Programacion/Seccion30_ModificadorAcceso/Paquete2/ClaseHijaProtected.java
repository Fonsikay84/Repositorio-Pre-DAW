/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 115: Modificadores de acceso en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion30_ModificadorAcceso.Paquete2;

import Seccion30_ModificadorAcceso.Paquete1.ClaseProtected;

// Declaración de la clase hija "ClaseHija" que hereda de la clase padre "ClaseProtected".
public class ClaseHijaProtected extends ClaseProtected
{
	
	// Declaración del constructor.
	public ClaseHijaProtected()
	{
		
		// Uso de los atributos, constructores y métodos protected de la clase padre desde la clase hija.
		// Se tiene acceso tanto al constructor, atributo y método de forma correcta.
		
		super();																																// Constructor protected de la clase padre.
		this.atributoProtected = "Modificación atributo protected.";						// Atributo de clase protected de la clase padre.
		System.out.println("- Atributo protected: " + this.atributoProtected);
		this.metodoProtected();																									// Método protected de la clase padre.
	}
}
