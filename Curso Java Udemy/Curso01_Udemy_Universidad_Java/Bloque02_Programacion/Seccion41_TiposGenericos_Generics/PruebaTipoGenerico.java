/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 147: Tipos genéricos en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion41_TiposGenericos_Generics;

public class PruebaTipoGenerico 
{
	public static void main(String[] args) 
	{
		
		// Declaración del objeto indicando que el tipo va a ser "Integer" -> Valor int.
		ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15); 	// Se realiza Autoboxing: Se esta convirtiendo un tipo primitivo int al 
																																// ser un número entero (15) a un tipo Integer, por lo que el tipo del 
																																// atributo de la clase, va a tener el tipo integer.

		// Se manda a imprimir el tipo que posee al final el objeto creado.
		objetoInt.obtenerTipo();
		
		// Declaración del objeto indicando que el tipo va a ser "String"
		ClaseGenerica<String> objetoString = new ClaseGenerica("Alfonso");
		
		// Se manda a imprimir el tipo que posee al final el objeto creado.
		objetoString.obtenerTipo();
		
	}
}
