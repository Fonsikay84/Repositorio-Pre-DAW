/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 105: Argumentos variables en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion25_ArgumentosVariables;

public class ArgumentosVariables 
{
	public static void main(String[] args) 
	{	
		// Llamada al método "imprimirNumeros()" con 3 argumentos variables.
		imprimirNumeros(3, 4, 5);

		// Llamada al método "imprimirNumeros()" con 1 argumento variable.		
		imprimirNumeros(1, 2);
		
		// Llamada al método "variosParametros()" con 1 argumento de tipo String y 2 argumentos variables de tipo int.		
		variosParametros("Alfonso", 6, 4, 10);
				
	}
	
	// Declaración del método "imprimirNumeros()" con un argumento variable de tipo entero.
	private static void imprimirNumeros(int... numeros)
	{
		for (int i = 0; i < numeros.length; i++) 
		{
			System.out.println("Elemento: " + numeros[i]);
		}
	}

	// Declaración del método "variosParametros()" con un argumento de tipo cadena y un argumento variable de tipo entero.
	private static void variosParametros(String nombre, int...numeros)
	{
		System.out.println("Nombre:" + nombre);
		imprimirNumeros(numeros);
	}
}
