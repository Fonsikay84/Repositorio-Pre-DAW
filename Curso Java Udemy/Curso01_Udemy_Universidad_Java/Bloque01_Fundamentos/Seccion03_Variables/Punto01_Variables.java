/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 7, 8, 9, 10 : Declaración de variables según su tipo.
---------------------------------------------------------------------------------------------------------------------------------------------------
 */

package Seccion03_Variables;

public class Punto01_Variables {

  public static void main(String args[]) {
    // Variable de tipo entero.
    int miVariableEntera = 10;
    System.out.println("El valor de mi variables es: " + miVariableEntera);

    miVariableEntera = 5;
    System.out.println("El valor de mi variables es: " + miVariableEntera);

    // Variable de tipo cadena.
    String miVariableCadena = "Hola";
    System.out.println("El valor de mi variable de cadena es: " + miVariableCadena);

    miVariableCadena = "Adios";
    System.out.println("El valor de mi variable de cadena es: " + miVariableCadena);

    // Variable de tipo "Var" que coje automaticamente el tipo de valor según sea el valor que contenga. Necesario JDK >= Versión 10.
    // Variable var de tipo entero.
    var miVariableVarEntera = 10;
    System.out.println("El valor de mi variable tipo general es: " + miVariableVarEntera);

    // Variable var de tipo cadena.
    var miVariableVarCadena = "Fonsi";
    System.out.println("El valor de mi variable tipo general de cadena es: " + miVariableVarCadena);
  }
}
