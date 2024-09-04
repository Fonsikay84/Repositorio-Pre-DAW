/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 15, 16, 17, 18, 19, 20: Tipos primitivos en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
 */

package Seccion04_TiposPrimitivos;

public class Punto01_TiposPrimitivos_y_TipoEnumerado 
{
	public static void main(String[] args) 
	{
		
		// 1. Tipos primitivos enteros (Video 16).
		
		// 1.1. Tipo primitivo Byte.
		
		byte numeroByte = 10;
		System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
		System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);
		System.out.println("Variable byte: " + numeroByte);
		
		// 1.2. Tipo primitivo Short.
		
		short numeroShort = 15;
		System.out.println("Valor mínimo short: " + Short.MIN_VALUE);
		System.out.println("Valor máximo short: " + Short.MAX_VALUE);
		System.out.println("Valor short: " + numeroShort);
		
		// 1.3. Tipo primitivo Int.
		
		int numeroInt = 20;
		System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
		System.out.println("Valor máximo int: " + Integer.MAX_VALUE);
		System.out.println("Valor int: " + numeroInt);
		
		// 1.4. Tipo primitivo Long.
		
		long numeroLong = 25;
		System.out.println("Valor minimo long: " + Long.MIN_VALUE);
		System.out.println("Valor máximo long: " + Long.MAX_VALUE);
		System.out.println("Valor long: " + numeroLong);
			
		// 2. Tipos primitivos flotante (Video 17, 18).
		
		// 2.1. Tipo primitivo float.
		
		float numeroFloat = (float)10.45;		// Hay que añadir el (float) delante del número para que Java lo interprete como decimal.
		System.out.println("Valor mínimo float: " + Float.MIN_VALUE);
		System.out.println("Valor máximo float: " + Float.MAX_VALUE);
		System.out.println("Valor float: " + numeroFloat);
		
		// 2.2. Tipo primitivo double.
		
		double numeroDouble = 20.48; 
		System.out.println("Valor mínimo double: " + Double.MIN_VALUE);
		System.out.println("Valor máximo double: " + Double.MAX_VALUE);
		System.out.println("Valor double: " + numeroDouble);
		
		// 3. Tipos primitivos char (Video 19).
		
		char variableChar = '#';
		System.out.println("Valor carácter: " + variableChar);
		
		// Opción Valor Unicode.
		// URL Tabla valores Unicode: https://en.wikipedia.org/wiki/List_of_Unicode_characters		
		char variableCharUnicode = '\u0023';
		System.out.println("Valor carácter Unicode: " + variableCharUnicode);
		
		// Opción Valor Decimal.
		char variableCharDecimal = 35;
		System.out.println("Valor carácter decimal: " + variableCharDecimal);
			
		// 4. Tipos primitivos boolean (Video 20).
		boolean variableBoolean = true;
		System.out.println("Valor boolean: " + variableBoolean);
		
		// 5. Tipo primitivo enumerados (PDF o Internet).
		
		// Forma de declarar una variable con un conjunto restringido de valores y estos valores son considerado constantes.
		// Un tipo enumerado puede ser declarado dentro o fuera de una clase, pero no dentro de un método. Por tanto no podemos declarar un enum dentro de un método main (programa principal).
		// Por tanto el tipo enumerado lo declararemos o bien antes del public class… o bien después del public class… pero fuera de cualquier método.
		
		// Se crea la variable enum con los valores que va a tomar.
		enum Perros{MASTÍN, TERRIER, BULLDOG, PEKINES, CANICHE, GALGO};
		
		// Se crea una variable del tipo Perros y se asigna a la variable uno de los valores de la lista de valores que puede tomar del tipo "Perros".
		Perros perroBulldog = Perros.BULLDOG;

		// Se imprime el valor que contiene dicha variable, en este caso, el valor BULLDOG. Se debe de convertir la salida en un String para que lo tenga en cuenta como cadena.
		System.out.println("Perros: " + perroBulldog.name().toString());		
		
		// Saber la posición en la lista de valores que tiene la variable utilizada.
		var posicion = perroBulldog.ordinal();
		System.out.println("Posición Perro:" + posicion);
	}
}
