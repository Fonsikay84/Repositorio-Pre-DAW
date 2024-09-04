/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 81, 82, 83, 86: Arreglos en Java.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion21_Arreglos;

public class TestArreglos 
{
	public static void main(String[] args) 
	{
		
		// Declaración de una varible de tipo arreglo (Video 81).
		// Se debe de indicar siempre en la declaración, cuantos elementos va a contener el arreglo, en este caso, va a tener 3 elementos y no se puede
		// añadir mas elementos del nº máximo de elementos indicado en la declaración.
		int edades[] = new int[3];
		System.out.println("Edades: " + edades);
		
		// Modificar o inicializar los valores de un arreglo (Video 82).
		edades[0] = 1;
		edades[1] = 37;
		edades[2] = 39;
		System.out.println("Los elementos del arreglo 'Edades' son: " + edades[0] + ", " + edades[1] + ", " + edades[2]);
		
		// Obtener el nº máximo de elementos de un arreglo (Video 83).
		System.out.println("Nº máximo de elementos del arreglo: " + edades.length);
		
		// Recorremos el arreglo con un bucle For.
		for(int contador = 0; contador < edades.length; contador++) 
		{
			System.out.println("- Elemento " + (contador + 1) + " posición " + contador + ": " + edades[contador]);
		}
		
		// Inicialización de valores de un arreglo desde su definición llamado "Sintaxis resumida" (Video 86).
		String frutas[] = {"Naranja", "Platano", "Uva", "Pera", "Manzana"};
		
		// Recorremos el arreglo con un bucle For.
		for (int contador = 0; contador < frutas.length; contador++) 
		{
			System.out.println("- Elemento " + (contador + 1) + " posición " + contador + ": " + frutas[contador]);
		}
	}
}
