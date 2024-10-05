/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 124: Ejercicio - Palabra Continue
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Crear un programa que sólo imprima los números pares entre el 1 al 10 usando la palabra "continue".
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion08_Ciclos;

public class EJ11_Continue 
{
  public static void main(String[] args) 
  {
    System.out.println("*** PALABRA CONTINUE ***");
    for(int numero = 1; numero <= 10; numero++)
    {
      // Cuando un número es impar, lo salta con el "continue".
      if (numero % 2 == 1)
      {
        continue;
      }
      // Imprime los números que son pares.
      else
      {
        System.out.println(numero);
      }
    }
  }
}
