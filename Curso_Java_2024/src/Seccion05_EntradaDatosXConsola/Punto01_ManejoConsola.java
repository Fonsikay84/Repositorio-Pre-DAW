/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 44: Clase Scanner y entrada de datos
---------------------------------------------------------------------------------------------------------------------------------------------------
 */

package Seccion05_EntradaDatosXConsola;

import java.util.Scanner;

public class Punto01_ManejoConsola 
{
  public static void main(String[] args) 
  {
    Scanner datosConsola = new Scanner(System.in);
    System.out.print("Escribe tu nombre: ");
    String nombre = datosConsola.nextLine();
    System.out.println("Nombre: " + nombre);
  }
}
