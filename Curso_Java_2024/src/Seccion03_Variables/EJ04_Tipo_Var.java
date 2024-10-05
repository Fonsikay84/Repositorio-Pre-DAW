/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 26: Ejemplo - Tipo var en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
 */

package Seccion03_Variables;

public class EJ04_Tipo_Var 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    String nombre = "Juán";
    System.out.println("Nombre: " + nombre);
    
    var nombre2 = "Carlos";
    System.out.println("Nombre 2: " + nombre2);
    
    var edad = 30;
    System.out.println("Edad: " + edad);
    
    var sueldo = 5000.5F;
    System.out.println("Sueldo: " + sueldo);
    
    var esCasado = false;
    System.out.println("Es casado?: " + esCasado);
  }
}
