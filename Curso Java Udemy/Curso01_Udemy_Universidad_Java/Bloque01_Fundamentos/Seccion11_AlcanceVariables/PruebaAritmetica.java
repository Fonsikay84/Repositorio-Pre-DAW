/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 54, 55: Constructores en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion11_AlcanceVariables;

//Clase para ejecutar las operaciones de uso de la clase Aritmética.
public class PruebaAritmetica 
{

	public static void main(String[] args) 
	{
		
		// Declaración de variables locales.
		// int a = 10;
		// int b = 2;
		
		// Creación del objeto Aritmetica usando constructor vacío.
		Aritmetica aritmetica1 = new Aritmetica();
		
		System.out.println("Aritmetica1 num1: " + aritmetica1.a_num1);
		System.out.println("Aritmetica1 num2: " + aritmetica1.a_num2);
		
		// Creación del objeto Aritmetica usando constructor con parámetros.
		Aritmetica aritmetica2 = new Aritmetica(5, 8);
		
		System.out.println("Aritmetica1 num1: " + aritmetica2.a_num1);
		System.out.println("Aritmetica1 num2: " + aritmetica2.a_num2);
	}

}
