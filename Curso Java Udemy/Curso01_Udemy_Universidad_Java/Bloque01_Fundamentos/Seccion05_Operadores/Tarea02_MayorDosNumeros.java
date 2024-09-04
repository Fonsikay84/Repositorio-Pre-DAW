/*
---------------------------------------------------------------------------------------------------------------------------------------------------
Video 33: El mayor de dos números.

Solicitar al usuario dos valores:

numero1 (int)
numero2 (int)

Se debe imprimir el mayor de los dos números (la salida debe ser identica a la que sigue):

Proporciona el numero1:
Proporciona el numero2:
El numero mayor es:
<numeroMayor>

Puedes utilizar el IDE de tu preferencia para codificar la solución y después pegar tu solución en esta herramienta.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion05_Operadores;

import java.util.Scanner;

public class Tarea02_MayorDosNumeros 
{

	public static void main(String[] args) 
	{
		Scanner DatosConsola = new Scanner(System.in);
		
		System.out.print("Proporciona el numero1: ");
		int numero1 = Integer.parseInt(DatosConsola.nextLine());
		
		System.out.print("Proporciona el numero2: ");
		int numero2 = Integer.parseInt(DatosConsola.nextLine());
		
		String resultado = (numero1 > numero2) ? "El número mayor es: " + numero1 : "El numero mayor es: " + numero2;
		System.out.println(resultado);
	}
}
