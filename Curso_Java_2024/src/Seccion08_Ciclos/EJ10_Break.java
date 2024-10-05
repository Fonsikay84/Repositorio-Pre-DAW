/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 124: Ejercicio - Palabra Break
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Crear un programa que sólo imprima el primer número par encontrado entre el 1 al 10 usando la palabra "break".
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion08_Ciclos;

public class EJ10_Break 
{
  public static void main(String[] args) 
  {
    for(int numero = 1; numero <= 10; numero++)
    {
      if (numero % 2 == 0) 
      {
        System.out.println("Primer numero par encontrado: " + numero);
        break;
      }
    }
  }
}
