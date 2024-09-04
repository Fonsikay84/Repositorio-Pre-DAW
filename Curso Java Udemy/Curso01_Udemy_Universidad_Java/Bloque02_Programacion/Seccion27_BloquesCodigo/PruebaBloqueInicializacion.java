/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 110: Bloques de código de inicialización en Java.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion27_BloquesCodigo;

public class PruebaBloqueInicializacion 
{

	public static void main(String[] args) 
	{	
		// Se ejecuta los dos bloques de inicialización y el constructor.
		Persona persona1 = new Persona();
		System.out.println("ID Persona: " + persona1.toString());
		
		// Se ejecuta sólo el bloque de inicialización no estático y el constructor.
		Persona persona2 = new Persona();
		System.out.println("ID Persona: " + persona2.toString());		
	}
}
