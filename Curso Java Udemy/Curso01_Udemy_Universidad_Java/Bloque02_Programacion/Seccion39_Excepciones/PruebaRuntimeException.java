/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 140: Manejo de Excepciones en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion39_Excepciones;

public class PruebaRuntimeException 
{

	public static void main(String[] args) 
	{
	
		// Declaración de variables.
		int dividendo = 10;
		int divisor = 0;
		int resultado = 0;
		
		// Línea donde se va a producir el error por dividir entre 0.
		resultado = AritmeticaRuntimeException.division(dividendo, divisor);		
		
		// Si la división no es por 0, pues se muestra el resultado de la división.
		if (divisor != 0)
		{
			System.out.println("Resultado de la división: " + resultado);
		}

	}

}
