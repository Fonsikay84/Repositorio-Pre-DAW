/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 21, 22: Conversión de Tipos primitivos en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
 */

package Seccion04_TiposPrimitivos;

import java.util.Scanner;

public class Punto02_ConversionTiposPrimitivos {

	public static void main(String[] args) 
	{
		// Convertir variable de tipo String a un tipo Int.
		var w_edad = Integer.parseInt("39");
		System.out.println("Edad: " + w_edad);
		System.out.println("Edad: " + (w_edad + 1));
		
		// Convertir variable de tipo String a un tipo Double.
		var w_valorPI = Double.parseDouble("3.1416");
		System.out.println("Valor Double: " + w_valorPI);
		
		// Pedimos un valor por consola y convertimos el valor de tipo String a un tipo Int.
		var consola = new Scanner(System.in);
		System.out.println("Indica la edad: ");
		w_edad = Integer.parseInt(consola.nextLine());
		System.out.println("La nueva edad es: " + w_edad);
		
		// Convertir variable de tipo Int a un tipo String.
		var w_edadTexto = String.valueOf(10);
		System.out.println("La edad en texto es: " + w_edadTexto);
		
		// Convertir variable de tipo String a Boolean.
		var envio = Boolean.parseBoolean(consola.nextLine());
		System.out.println("Indica si tiene envío: " + envio);
		
		// Convertir variable de tipo String a un tipo Char.
		// Obtener la letra que está en la posición 0 (letra H) de una cadena (Hola).
		var w_letra = "Hola".charAt(0);
		System.out.println("La letra que está en el indice 0 de la palabra Hola es: " + w_letra);
		
	}

}
