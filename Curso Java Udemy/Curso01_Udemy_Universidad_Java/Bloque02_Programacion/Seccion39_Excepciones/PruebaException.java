/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 136, 137, 141: Manejo de Excepciones en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion39_Excepciones;

public class PruebaException 
{
	public static void main(String[] args) 
	{

		// Declaración de variables.
		int dividendo = 10;
		int divisor = 0;
		int resultado = 0;
		
		// Se crea un bloque donde se produce el error para enmascarar y que no salte como error sino que informe del error producido y lo muestre por
		// la consola.
		try
		{
			resultado = AritmeticaException.division(dividendo, divisor);		// Línea donde se va a producir el error por dividir entre 0.
		}
		// Se pueden añadir tantos catch como tipos de clases de excepciones tengamos, por lo que se crea un bloque "catch" para cada una de ellas.
		// Excepción de la clase creada "ClaseException".
		catch(ClaseException w_error)	// Se guarda el error en la variable "w_error".
		{
			
			// Si se quiere mostrar sólo el mensaje del error que se ha creado en la clase "Aritmetica", se utiliza el método "getMessage()" de la 
			// la variable "w_error".
			System.out.println("ERROR - Se ha producido el siguiente error (ClaseException): " + w_error.getMessage());
		
		}
		// Excepción de la clase "Exception", ésta clase siempre debe de ir como último "catch".
		catch(Exception w_error)	// Se guarda el error en la variable "w_error".
		{
			
			// Si se quiere mostrar sólo el mensaje del error que se ha creado en la clase "Aritmetica", se utiliza el método "getMessage()" de la 
			// la variable "w_error".
			System.out.print("ERROR - Se ha producido el siguiente error (Exception): " + w_error.getMessage());
			
			// Si se quiere mostrar toda la pila de errores y que se imprima el error guardado en la variable "w_error" por consola se utiliza el método 
			// "printStackTrace(System.out)" de la variable "w_error".
			w_error.printStackTrace(System.out);		
			
		}
		// Este bloque se ejecuta siempre se haya producido el error o no.
		// Se suele utilizar para cerrar una conexión a la BBDD o cerrar un archivo que ha sido abierto.
		finally
		{
			System.out.println("Se revisó la división entre 0.");
		}
		
		// Si la división no es por 0, pues se muestra el resultado de la división.
		if (divisor != 0)
		{
			System.out.println("Resultado de la división: " + resultado);
		}
	}
}
