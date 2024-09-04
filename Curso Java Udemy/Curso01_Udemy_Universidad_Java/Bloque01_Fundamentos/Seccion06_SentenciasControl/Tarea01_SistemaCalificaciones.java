/*
---------------------------------------------------------------------------------------------------------------------------------------------------
Video 39: Sistema de Calificaciones.

El objetivo del ejercicio es crear un sistema de calificaciones, como sigue:

El usuario proporcionará un valor entre 0 y 10.

- Si está entre 9 y 10: imprimir una A
- Si está entre 8 y menor a 9: imprimir una B
- Si está entre 7 y menor a 8: imprimir una C
- Si está entre 6 y menor a 7: imprimir una D
- Si está entre 0 y menor a 6: imprimir una F
- Cualquier otro valor debe imprimir: Valor desconocido

Por ejemplo: Proporciona un valor entre 0 y 10: A

Puedes utilizar el IDE de tu preferencia para codificar la solución y después pegar tu solución en esta herramienta.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion06_SentenciasControl;

import java.util.Scanner;

public class Tarea01_SistemaCalificaciones 
{

	public static void main(String[] args) 
	{
		Scanner DatosConsola = new Scanner(System.in);
		System.out.print("Proporciona un valor entre 0 y 10: ");
		var nota = Integer.parseInt(DatosConsola.nextLine());
		var notaTexto = "";
		
		if (nota >= 9 && nota <= 10) 
		{
			notaTexto = "A";
		} 
		else if (nota >= 8 && nota < 9)
		{
			notaTexto = "B";
		}
		else if (nota >= 7 && nota < 8)
		{
			notaTexto = "C";
		}
		else if (nota >= 6 && nota < 7)
		{
			notaTexto = "D";
		}
		else if (nota >= 0 && nota < 6)
		{
			notaTexto = "F";
		}
		else
		{
			notaTexto = "Valor desconocido.";
		}
		System.out.println(notaTexto);
	}

}
