/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 107: Ejercicio - Ciclo Do While
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se debe de crear un programa que imprima por pantalla los números del 1 al 3 utilizando un ciclo do while.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion08_Ciclos;

public class EJ03_CicloDoWhile 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    int contador = 1;
    
    System.out.println("*** CICLO DO WHILE ***");
    
    // Se realiza el ciclo para imprimir por pantalla los números del 1 al 5.
    do
    {
      System.out.println(contador);
      contador++;
    }
    while (contador <= 5);
  }
}
