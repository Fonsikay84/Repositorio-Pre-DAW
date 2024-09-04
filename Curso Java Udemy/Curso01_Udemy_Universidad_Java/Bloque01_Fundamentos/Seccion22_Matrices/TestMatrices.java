/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 87, 88, 89, 90, 91: Matrices en Java.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion22_Matrices;

public class TestMatrices 
{

	public static void main(String[] args) 
	{
		
		// Declaración de una varible de tipo matriz (Video 87).
		// Se debe de indicar siempre en la declaración, cuantos elementos va a contener la matriz, tanto en filas como columnas, en este caso, va a 
		// tener 3 elementos de fila y 2 elementos de columna. No se puede añadir mas elementos del nº máximo de elementos indicado en la declaración.
		int edades[][] = new int [3][2];
		
		/*	
		Esquema de la matriz "edades".
		 
		 		-------------------------
		 		| F/C |   C0   |   C1   |
		    -------------------------
	 			| F0  | [0][0] | [0][1] |
	 			-------------------------
	 			| F1  | [1][0] | [1][1] |
	 			-------------------------
	 			| F2  | [2][0] | [2][1] |
	 			-------------------------
		*/
		
		// Modificar o inicializar los valores de una matriz (Video 88).
		edades[0][0] = 5;
		edades[0][1] = 7;
		edades[1][0] = 8;
		edades[1][1] = 4;
		edades[2][0] = 6;
		edades[2][1] = 1;
		
		/*	
		Esquema de la matriz "edades" con los valores.
		 
		 		-----------------
		 		| F/C | C0 | C1 |
		    -----------------
	 			| F0  | 5  | 7  |
	 			-----------------
	 			| F1  | 8  | 4  |
	 			-----------------
	 			| F2  | 6  | 1  |
	 			-----------------
		*/		
		
		// Se obtiene los valores por consola.
		System.out.println("Los elementos de la matriz 'Edades' fila 0 son: " + edades[0][0] + ", " + edades[0][1]);
		System.out.println("Los elementos de la matriz 'Edades' fila 1 son: " + edades[1][0] + ", " + edades[1][1]);
		System.out.println("Los elementos de la matriz 'Edades' fila 2 son: " + edades[2][0] + ", " + edades[2][1]);
		
		// Recorremos la matriz con un bucle For (Video 89).
		
		System.out.println("Nº total de filas de la matriz: " + edades.length);
		System.out.println("Nº total de columnas de la fila 0 de la matriz: " + edades[0].length);
		System.out.println("Nº total de columnas de la fila 1 de la matriz: " + edades[0].length);
		System.out.println("Nº total de columnas de la fila 2 de la matriz: " + edades[0].length);
		
		for (int fila = 0; fila < edades.length; fila++) 
		{
			for (int columna = 0; columna < edades[fila].length; columna++) 
			{
				System.out.println("Los elementos de la matriz 'Edades' posición [" + fila + "][" + columna + "] es: " + edades[fila][columna]);
			}
		}

		/*	
		Esquema 1 de la matriz "frutas" con los valores.
		 
		 		------------------------------
		 		| F/C |   C0    |      C1    |
		    ------------------------------
	 			| F0  | Naranja |    Limón   |
	 			------------------------------
	 			| F1  |  Fresa  | Zarzamora  |
	 			------------------------------
		*/		
		
		// Inicialización de valores de una matriz cuadrada desde su definición llamado "Sintaxis resumida" (Video 90).
		String frutas1[][] = {{"Narajan", "Limón"}, {"Fresa", "Zarzamora"}};
		
		System.out.println("\nMATRIZ CUADRADA.");
		// Recorremos la matriz con un bucle For.
		for(int fila = 0; fila < frutas1.length; fila++)
		{
			for(int columna = 0; columna < frutas1[fila].length; columna++)
			{
				System.out.println("Los elementos de la matriz 'Frutas' posición [" + fila + "][" + columna + "] es: " + frutas1[fila][columna]);
			}
		}

		/*	
		Esquema 2 de la matriz no cuadrada "frutas2" con los valores.
		 
		 		-------------------------------------
		 		| F/C |   C0    |      C1    |  C2  |
		    -------------------------------------
	 			| F0  | Naranja |    Limón   |      |
	 			-------------------------------------
	 			| F1  |  Fresa  | Zarzamora  | Mora |
	 			-------------------------------------
		*/		
		
		// Inicialización de valores de una matriz no cuadrada desde su definición llamado "Sintaxis resumida" (Video 90).
		String frutas2[][] = {{"Narajan", "Limón"}, {"Fresa", "Zarzamora", "Mora"}};
		
		System.out.println("\nMATRIZ NO CUADRADA.");
		// Recorremos la matriz con un bucle For.
		for(int fila = 0; fila < frutas2.length; fila++)
		{
			for(int columna = 0; columna < frutas2[fila].length; columna++)
			{
				System.out.println("Los elementos de la matriz 'Frutas' posición [" + fila + "][" + columna + "] es: " + frutas2[fila][columna]);
			}
		}
		
		// Llamada al método "imprimir()" que hace lo mismo que el bucle anterior.
		System.out.println("\nMétodo Imprimir() -> Matríz 'frutas2': ");
		imprimir(frutas2);
		
		// Declaración y uso de una varible objeto de tipo matriz (Video 91).
		
		/*	
		Esquema de la matriz no cuadrada "personas" con los valores.
		 
		 		-------------------------------------
		 		| F/C |   C0    |      C1    |  C2  |
		    -------------------------------------
	 			| F0  | Alfonso |   Isabel   | Álex |
	 			-------------------------------------
	 			| F1  |   Rosa  | Mª Angeles | Javi |
	 			-------------------------------------
		*/		
		
		Persona personas[][] = new Persona[2][3];
		personas[0][0] = new Persona("Alfonso");
		personas[0][1] = new Persona("Isabel");
		personas[0][2] = new Persona("Álex");
		personas[1][0] = new Persona("Rosa");
		personas[1][1] = new Persona("Mª Ángeles");
		personas[1][2] = new Persona("Javi");
		
		
		// Recorremos la matriz con un bucle For.
		for(int fila = 0; fila < personas.length; fila++)
		{
			for(int columna = 0; columna < personas[fila].length; columna++)
			{
				System.out.println("Los elementos de la matriz 'Personas' posición [" + fila + "][" + columna + "] es: " + personas[fila][columna]);
			}
		}
		
		// Llamada al método "imprimir()" que hace lo mismo que el bucle anterior.
		System.out.println("\nMétodo Imprimir() -> Matríz 'personas': ");
		imprimir(personas);
	}
	
	// Declaración de un método que imprime por pantalla todos los elementos de una matriz de objetos (Video 91).
	public static void imprimir(Object matriz[][])
	{
		
		// Recorremos la matriz con un bucle For.
		for(int fila = 0; fila < matriz.length; fila++)
		{
			for(int columna = 0; columna < matriz[fila].length; columna++)
			{
				System.out.println("Los elementos de la matriz posición [" + fila + "][" + columna + "] es: " + matriz[fila][columna]);
			}
		}
	}
}
