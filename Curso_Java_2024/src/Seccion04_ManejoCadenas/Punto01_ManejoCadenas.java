/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 31, 32: Manejo de cadenas
---------------------------------------------------------------------------------------------------------------------------------------------------
 */

package Seccion04_ManejoCadenas;

public class Punto01_ManejoCadenas 
{
  public static void main(String[] args) 
  {
    System.out.println("*** MANEJO DE CADENAS ***");
    
    String cadena1 = "Hola";
    System.out.println("Cadena 1: " + cadena1);
    
    String cadena2 = new String("Mundo");
    System.out.println("Cadena 2: " + cadena2);
    
    String cadena3 = cadena1 + " " + cadena2;
    System.out.println("Cadena 3: " + cadena3);
    
    String cadena4 = """
                     Este es un texto 
                     multilinea.
                     """;
    System.out.println("Cadena 4: " + cadena4);
    
    System.out.println("Primera letra: " + cadena1.charAt(1));
    System.out.println("Tamaño cadena: " + cadena1.length());
  }
}
