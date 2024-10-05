/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 34: Inmutabilidad de cadenas.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion04_ManejoCadenas;

public class Punto03_InmutabilidadCadenas 
{
  public static void main(String[] args) 
  {
    String cadena1 = "Hola";
    System.out.println("cadena1 = " + cadena1);
    String cadena2 = "Adios";
    System.out.println("cadena2 = " + cadena2);
    cadena1 = cadena2;
    System.out.println("cadena1 modificada = " + cadena1);
    System.out.println("cadena2 = " + cadena2);
  }
}
