/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 11, 12 : Concatenación de variables y uso de caracteres especiales para cadenas.
---------------------------------------------------------------------------------------------------------------------------------------------------
 */

package Seccion03_Variables;

public class Punto02_Concatenar_y_caracteres_especiales 
{
  public static void main (String args[])
  {
    // Concatenación de variables de cadena (Video 11).
    var usuario = "Alfonso";
    var titulo = "Técnico Superior";
    var union = titulo + " " + usuario;
    System.out.println("union = " + union);
    
    // Si se utiliza el operador "+" con dos variables numéricas, realiza la operación de suma.
    var Num1 = 3;
    var Num2 = 4;
    System.out.println(Num1 + Num2);
    
    // Si se utiliza el operador "+" con variables numéricas y de cadena, primero realiza la suma y luego se concatena el número con la cadena.
    // Las expresiones se evaluan de izquierda a derecha, por lo que si encuentra antes una suma a una cadena, primero realiza la suma y luego al resultado se concatena con la cadena.
    System.out.println(Num1 + Num2 + usuario);
    // En cambio, si se encuentra primero una cadena, no se realiza la suma y se concatena la cadena con los dos números, sin realizar la suma.
    System.out.println(usuario + Num1 + Num2);
    // Si se desea realizar la suma y que se concatene con la cadena, se indica los paréntesis a la operación matemática.
    System.out.println(usuario + (Num1 + Num2));  
    
    // Uso de operadores especiales para cadenas (Video 12).
    var Nombre = "Carlos";
    // Añadir un salto de línea a nuestra cadena por pantalla (Operador \n).
    System.out.println("Nueva linea: \n" + Nombre);
    // Añadir un tabulador a nuestra cadena por pantalla (Operador \t).
    System.out.println("Tabulador: \t" + Nombre);
    // Añade un retroceso a nuestra cadena por pantalla (Elimina un carácter de la cadena) (Operador \b).
    System.out.println("1 Retroceso: \b" + Nombre);
    // Añade un retroceso a nuestra cadena por pantalla (Elimina dos caracteres de la cadena) (Operador \b\b).
    System.out.println("2 Retrocesos: \b\b" + Nombre);
    // Añade comillas simples a una cadena (Operador \').
    System.out.println("Comillas simpres: \'" + Nombre + "\'");
    // Añade comillas dobles a una cadena (Operador \").
    System.out.println("Comillas dobles: \"" + Nombre + "\"");
  }
}
