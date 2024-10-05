/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 33: Manejo de índices en cadenas
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion04_ManejoCadenas;

public class Punto02_IndicesCadenas 
{
  public static void main(String[] args) 
  {
    // Declaración de variables.
    String cadena1 = "Hola Mundo";
    char caracter;
    
    // Recuperamos el primer y último carácter de la cadena.
    caracter = cadena1.charAt(0);
    System.out.println("Caracter inicial: " + caracter);
    
    caracter = cadena1.charAt(cadena1.length() - 1);
    System.out.println("Carácter final: " + caracter);
    
    caracter = cadena1.charAt(5);
    System.out.println("El carácter que está en la posición 5 es: " + caracter);
  }
}
