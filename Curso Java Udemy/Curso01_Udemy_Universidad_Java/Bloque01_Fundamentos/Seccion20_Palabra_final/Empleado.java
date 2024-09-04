/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 79: Uso de la palabra final en Java.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion20_Palabra_final;

/* Se intenta crear una clase hija de la clase Persona y da un error al no poder crear una clase hija de una clase padre que tiene final en su declaración.
public class Empleado extends Persona
{
	
	// Se intenta crear un método en la clase hija que se llama igual que el método en la clase padre, pero en la padre esta la palabra final, da un error en
	// la declaración del método en la clase hija.
	public void imprimir()
	{
		System.out.println("Método imprimir desde clase hija.");
	}
}
*/