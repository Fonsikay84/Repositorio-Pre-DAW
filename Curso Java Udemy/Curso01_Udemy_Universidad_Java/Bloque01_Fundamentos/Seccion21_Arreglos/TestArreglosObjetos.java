/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 84, 85: Arreglos en Java.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion21_Arreglos;

public class TestArreglosObjetos 
{

	public static void main(String[] args) 
	{
		
		// Declaración de una varible objeto de tipo arreglo (Video 84).
		Persona personas[] = new Persona[2];
		
		// Modificar o inicializar los valores de un arreglo (Video 84).
		personas[0] = new Persona("Alfonso");
		personas[1] = new Persona("Isabel");
		
		System.out.println("Los elementos del arreglo 'Personas' son:\n\n- Persona 1:" + personas[0].toString());
		System.out.println("- Persona 2:" + personas[1].toString());
		
		// Recorremos el array con un bucle For (Video 85).
		for(int contador = 0; contador < personas.length; contador++) 
		{
			System.out.println("- Elemento " + (contador + 1) + " posición " + contador + ": " + personas[contador].toString());
		}
	}

}
