/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 37: Subcadenas en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion04_ManejoCadenas;

public class Punto06_Subcadenas 
{
  public static void main(String[] args) 
  {
    String cadena1 = "Hola Mundo";
    System.out.println("La cadena original es: " + cadena1);
    String cadena2 = cadena1.substring(0, 4);
    System.out.println("La subcadena2 es: " + cadena2);
    String cadena3 = cadena1.substring(5, 10);
    System.out.println("La subcadena3 es: " + cadena3);
    
  }
}
