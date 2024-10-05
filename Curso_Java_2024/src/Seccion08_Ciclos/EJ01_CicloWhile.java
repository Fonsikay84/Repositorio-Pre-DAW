/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 104: Ejercicio - Ciclo While
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se debe de crear un programa que imprima por pantalla los números del 1 al 5 utilizando un ciclo while.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion08_Ciclos;

public class EJ01_CicloWhile 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    int contador = 1;
    
    // Se recorre el bucle mientras que contador sea menor o igual a cinco y se imprime el número por consola incrementando el contador.
    System.out.println("*** CICLO WHILE ***");
    while (contador <= 5)
    {
      System.out.println(contador);
      contador++;
    }
  }
}
