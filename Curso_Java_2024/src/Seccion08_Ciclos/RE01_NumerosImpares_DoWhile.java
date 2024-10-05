/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 109: Reto - Números impares
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se solicita crear un programa que imprima los números impares del 0 al 20 utilizando el ciclo do while.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion08_Ciclos;

public class RE01_NumerosImpares_DoWhile 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    int contador = 0;
    
    System.out.println("*** NÚMEROS IMPARES DEL 0 AL 20 ***");
    
    // Se recorre el bucle mientras que el contador llegue al 20.
    do
    {
      // Números Impares: Son los números en los que el resto de la división entre 2 es distinto a 0.
      if (contador % 2 != 0) 
      {
        System.out.println(contador);
      }
      contador++;
    }
    while (contador <= 20);
  }
}
