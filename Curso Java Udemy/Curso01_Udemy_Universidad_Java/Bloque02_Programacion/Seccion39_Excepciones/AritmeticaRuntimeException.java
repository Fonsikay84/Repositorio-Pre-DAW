/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 140: Manejo de Excepciones en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion39_Excepciones;

public class AritmeticaRuntimeException 
{
	
	// Se declara un método en el cual se va a realizar la división entre dos números.
	// En la declaración de este método al ser Runtime Exception ya no se debe de indicar que en éste método se puede producir una excepción.
	public static int division(int numerador, int denominador)
	{
		
		// Si se va a dividir entre 0, se va a producir un error.
		if (denominador == 0)
		{
			
			// Se crea un objeto de la clase creada de tipo RuntimeException pero para ello se utiliza la palabra reservada "throw new" y se le pasa el 
			// argumento del mensaje. 
			throw new ClaseRuntimeException("División entre cero.");
		}
		else
		{
			return numerador / denominador;
		}
	}
}
