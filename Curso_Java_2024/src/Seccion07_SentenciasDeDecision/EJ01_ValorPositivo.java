/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 80: Ejercicio - Valor Positivo
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se debe de solicitar un número al usuario y comprobar si es mayor a 0.
|            Si es mayor a 0, indicar por mensaje "Es positivo".
|            Si es menor o igual a 0, se debe de comprobar si el número es menor a 0.
|            Si es menor a 0, indicar por mensaje "Es negativo".
|            Si no es menor a 0, indicar por mensaje "Es cero".
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion07_SentenciasDeDecision;

import java.util.Scanner;

public class EJ01_ValorPositivo 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    int numero;
    Scanner datosConsola = new Scanner (System.in);
    
    // Se solicita el número al usuario por consola.
    System.out.println("*** Valor Positivo ***\n");
    System.out.print("Introduzca un número: ");
    numero = Integer.parseInt(datosConsola.nextLine());
    
    // Se realiza las comprobaciones necesarias sobre el número indicado.
    if (numero > 0) 
    {
      System.out.println("Es positivo.");
    }
    else if (numero < 0)
    {
      System.out.println("El número es negativo.");
    }
    else
    {
      System.out.println("El número es 0.");
    }
  }
}
