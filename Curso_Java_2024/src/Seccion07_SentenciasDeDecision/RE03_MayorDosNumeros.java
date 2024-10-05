/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 89: Reto - Mayor de dos números
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Crear un programa para indicar cual es el mayor de los dos números.
| El programa debe pedir al usuario dos números enteros.
| Posteriormente, se deben de comparar y mandar a imprimir el número mayor.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion07_SentenciasDeDecision;

import java.util.Scanner;

public class RE03_MayorDosNumeros 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    int num1;
    int num2;
    Scanner datosConsola = new Scanner(System.in);
    
    // Se pide los datos al usuario por consola.
    System.out.println("*** MAYOR DE DOS NÚMEROS ***");
    System.out.print("Introduzca el primer número: ");
    num1 = Integer.parseInt(datosConsola.nextLine());
    System.out.print("Introduzca el segundo número: ");
    num2 = Integer.parseInt(datosConsola.nextLine());
    
    // Se compara los números y se imprime el resultado por consola.
    if (num1 > num2) 
    {
      System.out.printf("El número mayor entre %d y %d es: %d%n", num1, num2, num1);
    }
    else
    {
      System.out.printf("El número mayor entre %d y %d es: %d%n", num1, num2, num2);
    }
  }
}
