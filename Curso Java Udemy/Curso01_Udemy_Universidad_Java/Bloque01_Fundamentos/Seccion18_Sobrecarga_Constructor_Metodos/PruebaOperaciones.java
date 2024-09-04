/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 77: Sobrecarga de métodos en Java.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion18_Sobrecarga_Constructor_Metodos;

public class PruebaOperaciones 
{

	public static void main(String[] args) 
	{

		var resultadoInt = Operaciones.sumar(5, 3);
		System.out.println("Resultado int: " + resultadoInt);
		
		var resultadoDouble = Operaciones.sumar(2.0, 3);
		System.out.println("Resultado double: " + resultadoDouble);
	}

}
