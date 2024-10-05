/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 106: Ejercicio - Números pares con el ciclo While
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se debe de crear un programa que imprima por pantalla los números pares del 0 al 20 utilizando un ciclo while.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion08_Ciclos;

public class EJ02_NumerosPares_While 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    int contador = 0;
    
    System.out.println("*** NUMEROS PARES DEL 0 AL 20 ***");
    
    // Se realiza la comprobación y se imprime el valor por consola cuando es par.
    while (contador <= 20)
    {
      // Número Par: Es cuando el resto de la división del número entre 2 da como resultado 0.
      if (contador % 2 == 0) 
      {
        System.out.println(contador);
      }
      contador++;
    }
  }
}
