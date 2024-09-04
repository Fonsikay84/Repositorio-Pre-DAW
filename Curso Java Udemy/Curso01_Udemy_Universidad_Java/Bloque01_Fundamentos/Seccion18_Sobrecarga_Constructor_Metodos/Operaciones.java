/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 77: Sobrecarga de métodos en Java.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion18_Sobrecarga_Constructor_Metodos;

public class Operaciones 
{
	
	// Declaración del método sumar con dos argumentos de tipo entero.
	public static int sumar(int a, int b)
	{
		System.out.println("Se ejecute el método sumar(int a, int b).");
		return a + b;
	}

	// Declaración del método sumar con dos argumentos de tipo double.
	public static double sumar(double a, double b)
	{
		System.out.println("Se ejecute el método sumar(double a, double b).");
		return a + b;
	}

}
