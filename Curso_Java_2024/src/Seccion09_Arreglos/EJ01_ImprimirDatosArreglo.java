/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 129: Ejercicio - Arreglos
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se debe de crear un programa que imprima por pantalla los valores de un arreglo de 5 elementos.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion09_Arreglos;

public class EJ01_ImprimirDatosArreglo 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    int[] enteros = {100, 200, 300, 400, 500};
    
    // Se imprimen los valores por consola.
    System.out.println("Elemento 1: " + enteros[0]);
    System.out.println("Elemento 2: " + enteros[1]);
    System.out.println("Elemento 3: " + enteros[2]);
    System.out.println("Elemento 4: " + enteros[3]);
    System.out.println("Elemento 5: " + enteros[4]);
  }
}
