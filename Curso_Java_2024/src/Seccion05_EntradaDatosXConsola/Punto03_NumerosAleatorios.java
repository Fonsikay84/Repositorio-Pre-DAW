/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 50: Números aleatorios - Clase Random en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion05_EntradaDatosXConsola;

import java.util.Random;

public class Punto03_NumerosAleatorios 
{
  public static void main(String[] args) 
  {
    System.out.println("*** Números Aleatorios ***");
    Random aleatorio = new Random();
    
    // Generar un número entero aleatorio entre 0 y 9.
    int numIntAleatorio = aleatorio.nextInt(10);
    System.out.println("El número entero aleatorio entre 0 y 9 es: " + numIntAleatorio);
    
    // Generar un número entero aleatorio entre 1 y 10.
    numIntAleatorio = aleatorio.nextInt(10) + 1;
    System.out.println("El número entero aleatorio entre 1 y 10 es: " + numIntAleatorio);
    
    // Generar un número flotante aleatorio entre 0.0 y 1.0.
    float numFloatAleatorio = aleatorio.nextFloat();
    System.out.println("El número flotante aleatorio entre 0.0 y 1.0 es: " + numFloatAleatorio);
    
    // Simular el lanzamiento de un dado entre 1 y 6.
    int numDado = aleatorio.nextInt(6) + 1;
    System.out.println("El valor de la cara del dado es: " + numDado);
  }
}
