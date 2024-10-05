/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 108: Ejercicio - Números inversos usando el ciclo Do While
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se debe de crear un programa que imprima por pantalla los números del 1 al 10 de forma inversa utilizando un ciclo do while.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion08_Ciclos;

public class EJ04_NumerosInversos_DoWhile 
{
  public static void main(String[] args) 
  {
    // Declaración de variables.
    int contador = 10;
    
    System.out.println("*** NUMEROS INVERSOS DEL 10 AL 1 CON CICLO DO WHILE ***");
    
    // Se recorre el ciclo mientras que el contador no llegue a 0 y se imprime el número por consola.
    do
    {
      System.out.println(contador);
      contador--;
    }
    while (contador > 0);
  }
}
