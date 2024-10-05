/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 40: Más de concatenación de cadenas en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion04_ManejoCadenas;

public class Punto09_Mas_formas_concatenacionCadena 
{
  public static void main(String[] args) 
  {
    // Declaración de variables.
    String cadena1 = "Hola";
    String cadena2 = "Mundo";
    
    // Uso del método "concat()":
    String cadena3 = cadena1.concat(" ").concat("Mundo");
    System.out.println("La cadena 3 con todo el texto concatenado es: " + cadena3);
    
    // Uso del método "StringBuilder()".
    var constructorCadenas = new StringBuilder();
    constructorCadenas.append(cadena1);
    constructorCadenas.append(" ");
    constructorCadenas.append(cadena2);
    String resultadoCadena = constructorCadenas.toString();
    System.out.println("Resultado StringBuilder: " + resultadoCadena);
    
    // Uso del método "StringBuffer()".
    var bufferCadenas = new StringBuffer();
    bufferCadenas.append(cadena1).append(" ").append(cadena2);
    String resultadoBufferCadena = bufferCadenas.toString();
    System.out.println("Resultado StringBuffer: " + resultadoBufferCadena);
    
    // Uso del método "join()".
    var cadenaJoin = String.join(" ", cadena1, cadena2, "Adiós!.");
    System.out.println("Resultado join: " + cadenaJoin);
  }
}
