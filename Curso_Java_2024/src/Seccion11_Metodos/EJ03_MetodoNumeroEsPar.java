/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 143: Ejercicio - Método esPar
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se debe de crear un método llamado "esPar()" que retorne indicando si un número que se le pasa por argumento es par o no.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion11_Metodos;

import java.util.Scanner;

public class EJ03_MetodoNumeroEsPar 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    int numero;
    boolean numEsPar;
    Scanner datosConsola = new Scanner (System.in);
    
    // Se solicita al usuario que indique un número.
    System.out.print("Introduza el numero a comprobar: ");
    numero = Integer.parseInt(datosConsola.nextLine());
    
    // Llamada al método "esPar()".
    numEsPar = esPar(numero);
    
    // Se comprueba si el numero es par o no.
    if (numEsPar) 
    {
      System.out.printf("El numero %d es par.%n", numero);
    }
    else
    {
      System.out.printf("El numero %d no es par.%n", numero);
    }
  }
  
  // Declaración del método "esPar()".
  static boolean esPar(int num)
  {
    // Declaración de variables.
    boolean numEsPar = false;
    
    // Se calcula si el número es par o no.
    if (num % 2 == 0) 
    {
      numEsPar = true;
    }
    return numEsPar;
  }
}