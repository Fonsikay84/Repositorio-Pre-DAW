/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 112: Reto - Números pares con el ciclo For
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se debe de crear un programa que imprima por pantalla los números pares del 0 al 20 utilizando un ciclo For.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion08_Ciclos;

public class RE02_NumerosPares_For 
{
  public static void main(String[] args) 
  {
    
    System.out.println("*** NUMEROS PARES DEL 0 AL 20 ***");
    
    // Se realiza la comprobación y se imprime el valor por consola cuando es par.
    for (int contador = 0; contador <= 20; contador++) 
    {
      if (contador % 2 == 0) 
      {
        System.out.println(contador);
      }
    }
  }
}
