/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 14: Ejemplo - Variables en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
 */

package Seccion03_Variables;

public class EJ01_Variables 
{
  public static void main(String[] args) 
  {
    // Declaración de variables.
    int edad = 31;
    double precio = 300.40;
    boolean disponible = true;
    char genero;
    genero = 'M';
    
    // Imprimir todos los resultados.
    System.out.println("Edad: " + edad);
    edad = 35;
    System.out.println("Edad: " + edad);
    System.out.println("Precio: " + precio);
    System.out.println("Disponible: " + disponible);
    System.out.println("Género: " + genero);
    
  }
}
