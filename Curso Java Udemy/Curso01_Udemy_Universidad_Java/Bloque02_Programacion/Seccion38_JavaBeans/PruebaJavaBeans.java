/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 135: JavaBeans en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion38_JavaBeans;

public class PruebaJavaBeans 
{

	public static void main(String[] args) 
	{
		
		// 1) Se crea un objeto utilizando el constructor vacío.
		Persona persona1 = new Persona();
		
		// 2) Se inicializa los atributos de la clase "Persona" de tipo private con el método "set()".
		persona1.setNombre("Alfonso");
		persona1.setApellido("López Jiménez");
		
		// 3) Se imprime los valores de la clase por consola.
		System.out.println(persona1.toString());
		
		// 4) Se imprime los valores de los atributos de la clase de forma individual.
		System.out.println("\nNombre: " + persona1.getNombre());
		System.out.println("Apellidos: " + persona1.getApellido());
	}
}
