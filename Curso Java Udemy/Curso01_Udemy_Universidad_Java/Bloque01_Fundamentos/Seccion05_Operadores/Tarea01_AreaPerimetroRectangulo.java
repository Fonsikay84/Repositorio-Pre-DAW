/*
---------------------------------------------------------------------------------------------------------------------------------------------------
Video 32: Rectángulo.

En el siguiente ejercicio se solicita calcular el área y el perímetro de un Rectángulo, para ello deberemos crear las siguientes variables:

alto (int)
ancho (int)

El usuario debe proporcionar los valores de largo y ancho, y después se debe imprimir el resultado en el siguiente formato(no usar acentos y respetar los espacios, mayúsculas, minúsculas y saltos de línea):

Proporciona el alto:
Proporciona el ancho:
Area: <area>
Perimetro: <perimetro>

Las fórmulas para calcular el área y el perímetro de un Rectángulo son:

Área: alto * ancho
Perímetro: (alto + ancho) * 2

Puedes utilizar el IDE de tu preferencia para codificar la solución y después pegar tu solución en esta herramienta.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion05_Operadores;

import java.util.Scanner;

public class Tarea01_AreaPerimetroRectangulo 
{
	public static void main(String args[]) 
	{
		Scanner DatosConsola = new Scanner(System.in);
		
		System.out.print("Proporciona el alto: ");
		int alto = Integer.parseInt(DatosConsola.nextLine());
		
		System.out.print("Proporciona el ancho: ");
		int ancho = Integer.parseInt(DatosConsola.nextLine());
		
		int area = alto * ancho;
		System.out.println("Area: " + area);
		
		int perimetro = (alto + ancho) * 2;
		System.out.println("Perimetro: " + perimetro);
	}
}
