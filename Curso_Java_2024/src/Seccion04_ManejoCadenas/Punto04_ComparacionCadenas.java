/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 35: Comparación de cadenas.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion04_ManejoCadenas;

public class Punto04_ComparacionCadenas 
{
  public static void main(String[] args) 
  {
    // Comparador de cadenas por referencia "==".
    String cadena1 = "Java";
    String cadena2 = "Java";
    System.out.print("¿cadena1 es igual en referencia a cadena2?: ");
    System.out.println(cadena1 == cadena2);   // ¿cadena1 es igual en referencia a cadena2?: true
    
    String cadena3 = new String("Hola");
    System.out.print("¿cadena1 es igual en referencia a cadena3?: ");
    System.out.println(cadena1 == cadena3);   // ¿cadena1 es igual en referencia a cadena3?: false
    
    // Comparador de cadenas por contenido "método equals()".
    System.out.println("¿cadena1 es igual en contenido a cadena3?: " + cadena1.equals(cadena3));  // ¿cadena1 es igual en contenido a cadena3?: false
    System.out.println("¿cadena1 es igual en contenido a cadena2?: " + cadena1.equals(cadena2));  // ¿cadena1 es igual en contenido a cadena2?: true
  }
}
