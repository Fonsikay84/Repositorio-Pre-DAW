/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 34, 35, 36, 37, 38: Sentencias de control en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion06_SentenciasControl;

import java.util.Scanner;

public class Punto01_SentenciaControl_If_Else {

	public static void main(String[] args) 
	{
		// 1. Condición If Else (Video 34).
		var condicion = false;
		
		if (condicion) 
		{
			System.out.println("Condición verdadera.");
		} 
		else 
		{
			System.out.println("Condición falsa.");
		}
		
		// 2. Condición If Else If (Video 35).
		var numero = 4;
		var numeroTexto = "Valor desconocido.";
		
		if (numero == 1) 
		{
			numeroTexto = "Número uno.";
		} 
		else if (numero == 2)
		{
			numeroTexto = "Número dos.";
		}
		else if (numero == 3)
		{
			numeroTexto = "Número tres.";
		}
		else if (numero == 4)
		{
			numeroTexto = "Número cuatro.";
		}
		else 
		{
			numeroTexto = "Caso no encontrado.";
		}
		System.out.println("Número texto: " + numeroTexto);
		
		// Ejercicio 1: Se indica un mes del año y hay que indicar que estación del año pertenece dicho mes utilizando If Else (Video 36).
		Scanner DatosConsola = new Scanner(System.in);
		System.out.print("Introducir el número del mes a buscar: ");
		
		var mes = Integer.parseInt(DatosConsola.nextLine());
		var estacion = "";
		
		if (mes == 12 || mes == 1 || mes == 2) 
		{
			estacion = "Invierno.";
		} 
		else if (mes == 3 || mes == 4 || mes == 5)
		{
			estacion = "Primavera.";
		}
		else if (mes == 6 || mes == 7 || mes == 8)
		{
			estacion = "Verano.";
		}
		else if (mes == 9 || mes == 10 || mes == 11)
		{
			estacion = "Otoño.";
		}
		else 
		{
			estacion = "Estación desconocida.";
		}
		System.out.println("El mes " + mes + " está en la estación de " + estacion);
		
		// 3. Condición Switch (Video 37).
		var numero1 = 2;
		var numeroTexto1 = "Valor desconocido.";
		
		switch(numero1)
		{
			case 1:
				numeroTexto1 = "Número uno.";
				break;
			case 2:
				numeroTexto1 = "Número dos.";
				break;
			case 3:
				numeroTexto1 = "Número tres.";
				break;
			case 4:
				numeroTexto1 = "Número cuatro.";
				break;
			default:
				numeroTexto1 = "Caso no encontrado.";
		}
		System.out.println("Número texto: " + numeroTexto1);
		
		// Ejercicio 2: Se indica un mes del año y hay que indicar que estación del año pertenece dicho mes utilizando Switch (Video 38).
		System.out.print("Introducir el número del mes a buscar: ");
		var mes1 = Integer.parseInt(DatosConsola.nextLine());
		var estacion1 = "";
		
		switch (mes1)
		{
			case 12: case 1: case 2:
				estacion1 = "Invierno";
				break;
			case 3: case 4: case 5:
				estacion1 = "Primavera";
				break;
			case 6: case 7: case 8:
				estacion1 = "Verano";
				break;
			case 9: case 10: case 11:
				estacion1 = "Otoño";
				break;
			default:
				estacion1 = "Estación desconocida.";
		}
		System.out.println("El mes " + mes1 + " está en la estación de " + estacion1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
 