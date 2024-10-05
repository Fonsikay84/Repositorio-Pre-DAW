/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 38: Búsqueda de subcadenas
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion04_ManejoCadenas;

public class Punto07_BusquedaSubcadenas 
{
  public static void main(String[] args) 
  {
    // Declaración de variables.
    
    // Búsqueda primera aparición.
    String cadena1 = "Hola Mundo";
    int indiceCadena1 = cadena1.indexOf("Hola");
    System.out.println("El indice donde comienza la palabra Hola es: " + indiceCadena1);   
    
    // Búsqueda última aparición.
    int indiceCadena2 = cadena1.lastIndexOf("Mundo");
    System.out.println("El índice donde comienza la última aparición de la palabra Mundo es: " + indiceCadena2);
    
    // Subcadena no encontrada.
    int indiceCadena3 = cadena1.indexOf("Java");
    int indiceCadena4 = cadena1.lastIndexOf("Java");
    System.out.println("El indice de la primera aparición de una subcadena no encontrada es: " + indiceCadena3);    
    System.out.println("El indice de la última aparición de una subcadena no encontrada es: " + indiceCadena4);    
    
  }
}
