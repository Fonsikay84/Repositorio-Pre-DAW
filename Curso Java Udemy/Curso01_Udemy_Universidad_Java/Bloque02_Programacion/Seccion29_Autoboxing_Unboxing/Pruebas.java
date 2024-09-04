/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 113: Uso del Autoboxing y Unboxing en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion29_Autoboxing_Unboxing;

public class Pruebas 
{

	public static void main(String[] args) 
	{
		
		// Autoboxing.
		
		int entero = 10;																			// Variable tipo int primitivo
		Integer entero1 = 10;																	// Variable tipo int objeto
		
		System.out.println("Entero primitivo: " + entero);						// Literal tipo int
		System.out.println("Entero objeto: " + entero1.toString());		// Literal tipo String
		
		// Conversión de tipo int a otros tipos.
		System.out.println("int a int: " + entero1.intValue());
		System.out.println("int a long: " + entero1.longValue());
		System.out.println("int a float: " + entero1.floatValue());
		System.out.println("int a double: " + entero1.doubleValue());
		System.out.println("int a short: " + entero1.shortValue());
		System.out.println("int a byte: " + entero1.byteValue());
		
		// Unboxing.
		
		Integer enteroInt = 5;
		
		// Se obtiene el valor de la variable de tipo Clase Integer y se asigna a una variable de tipo primitivo int.
		int entero2 = enteroInt;
		System.out.println("Entero primitivo: " + entero2);
	}

}
