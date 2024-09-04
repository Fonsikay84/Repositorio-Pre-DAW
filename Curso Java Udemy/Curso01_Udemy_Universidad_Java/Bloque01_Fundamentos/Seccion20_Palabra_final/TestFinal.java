/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 79, 80: Uso de la palabra final en Java.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion20_Palabra_final;

public class TestFinal 
{
	public static void main(String[] args) 
	{
		
		final int miVariable = 10;
		System.out.println("Variable: " + miVariable);
		
		// Se produce un error en el momento de intentar modificar el valor de una variable siendo final.
		// miVariable = 15;
		
		// Se produce un error al intentar modificar un valor de una constante.
		// Persona.MI_CONSTANTE = 10;
		System.out.println("Constante: " + Persona.MI_CONSTANTE);
		
		// La palabra final en Objetos (Video 80).
		
		final Persona persona1 = new Persona();
		
		// Se produce un error al intentar de crear un nuevo objeto y asignarle la referencia del objeto a la variable siendo final.
		//persona1 = new Persona();
		
		// Aun siendo variable final, lo que si nos deja es poder modificar el valor del atributo de la clase utilizando el método "set" de la clase "Persona".
		persona1.setNombre("Alfonso");
		System.out.println("Persona Nombre: " + persona1.getNombre());
	}
}
