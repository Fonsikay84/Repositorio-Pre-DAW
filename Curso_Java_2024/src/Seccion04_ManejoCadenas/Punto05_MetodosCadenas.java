/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 36: Métodos de cadenas
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion04_ManejoCadenas;

public class Punto05_MetodosCadenas 
{
  public static void main(String[] args) 
  {
    // Métodos de cadenas.
    String cadena1 = "Hola Mundo";
    
    // Obtener el longitud de una cadena.
    int longitudCadena = cadena1.length();
    System.out.println("Longitud: " + longitudCadena);  // Longitud: 10
    
    // Reemplazar todos los caracteres del carácter indicado en la cadena por otro carácter.
    String nuevaCadena = cadena1.replace('o', 'a');
    System.out.println("Nueva cadena: " + nuevaCadena); // Nueva cadena: Hala Munda
    
    // Convertir una cadena a mayúsculas.
    String cadenaMayuscula = cadena1.toUpperCase();
    System.out.println("La nueva cadena en mayúscula es: " + cadenaMayuscula);

    // Convertir una cadena a minúscula.
    String cadenaMinuscula = cadena1.toLowerCase();
    System.out.println("La nueva cadena en minúscula es: " + cadenaMinuscula);
    
    // Eliminar espacios al inicio y al final de una cadena.
    String cadena2 = " Leo Reyes   ";
    System.out.println("cadena original: " + cadena2);
    System.out.println("cadena original: " + cadena2.trim());
  }
}
