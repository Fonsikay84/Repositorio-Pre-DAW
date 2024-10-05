/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 39: Reemplazar subcadenas en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion04_ManejoCadenas;

public class Punto08_ReemplazarSubcadenas 
{
  public static void main(String[] args) 
  {
    String cadena = "Hola Mundo";
    System.out.println("Cadena original: " + cadena);
    
    // Reemplazar la cadena "Mundo" por la cadena "a todos".
    String nuevaCadena = cadena.replace("Mundo", "a todos");
    System.out.println("Nueva cadena: " + nuevaCadena);
  }
}
