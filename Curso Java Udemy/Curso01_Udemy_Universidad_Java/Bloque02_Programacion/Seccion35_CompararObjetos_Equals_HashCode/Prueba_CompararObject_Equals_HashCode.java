/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 126, 127: Comparación de objetos usando los método "equals()" y "hashCode()" en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion35_CompararObjetos_Equals_HashCode;

public class Prueba_CompararObject_Equals_HashCode 
{

	public static void main(String[] args) 
	{
		
		// Declaración de dos objetos de tipo Empleado.
		Empleado empleado1 = new Empleado("Juan", 5000);
		Empleado empleado2 = new Empleado("juan", 5000);
		
		// Se comprueba si los dos objetos tienen la misma referencia en mémoria y no es así, al ser dos declaraciones de objetos distintas aunque su
		// contenido sea exactamente igual.
		if (empleado1 == empleado2)
		{
			System.out.println("Tienen la misma referencia en memória.");
		}
		else
		{
			System.out.println("Tienen distinta referencia en memória.");
		}
		
		// Se comprueba si los dos objetos son iguales en contenido con el método "equals()" (Video 127).
		if (empleado1.equals(empleado2))
		{
			System.out.println("Equals: Los objetos son iguales en contenido.");
		}
		else
		{
			System.out.println("Equals: Los objetos son distintos en contenido.");
		}
		
		// Se comprueba si los dos objetos son iguales en contenido con el método "hashCode()" (Video 127).
		if (empleado1.hashCode() == empleado2.hashCode())
		{
			System.out.println("HashCode: Los objetos son iguales en contenido.");
		}
		else
		{
			System.out.println("HashCode: Los objetos son distintos en contenido.");
		}

	}
}
