/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 40, 41, 42, 43: Ciclos o Bucles en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion07_Ciclos;

public class Punto01_Ciclos {

  public static void main(String[] args) 
  {
		// Tipos de ciclos.
  	
  	// 1. Ciclo While (Video 40).
  	var contador = 0;
  	
  	// Debido a que la condición del ciclo while se evalúa al inicio, el bloque de código a repetir no se ejecutará ni una sola vez, si es que esta condición no se cumple.
  	while(contador < 3)
  	{
  		System.out.println("Contador: " + contador);
  		contador++;
  	}
  	
  	// 2. Ciclo do While (Video 41).
  	var contador1 = 0;
  	
  	// Debido a que la condición del ciclo do while se evalúa al final, el bloque de código a repetir se ejecutará por lo menos una vez, aunque esta condición no sea verdadera.
  	do 
  	{
  		System.out.println("Contador1: " + contador1);
  		contador1++;
		} 
  	while (contador1 < 0);
  	
  	// 3. Ciclo for (Video 42).
  	for (var contador2 = 0; contador2 < 3; contador2++) 
  	{
  		System.out.println("Contador2: " + contador2);
  	}
  	
  	// Palabra reservada "Break" y "Continue" (Video 43).
  	
  	// Palabra reservada "Break".
  	for (var contador3 = 0; contador3 <= 10; contador3++) 
  	{
  		if (contador3 % 2 == 0)
  		{
  			System.out.println("Contador3: " + contador3);	
  			break;
  		}  		
  	}
  	
  	// Palabra reservada "Continue".
  	for (var contador4 = 0; contador4 <= 10; contador4++) 
  	{
  		if (contador4 % 2 != 0)
  		{
  				continue;
  		} 
  		System.out.println("Contador4: " + contador4);
  	}
  }
}
