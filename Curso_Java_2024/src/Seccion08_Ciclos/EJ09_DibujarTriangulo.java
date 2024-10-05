/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 123: Ejercicio - Dibujar un Triángulo.
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se debe de crear una aplicación para dibujar un triángulo.
|  
| Se debe de indicar el número de filas que va a tener el triángulo y se debe de imprimir el triángulo usando espacios en blanco y asteríscos.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion08_Ciclos;

import java.util.Scanner;

public class EJ09_DibujarTriangulo 
{
  public static void main(String[] args) 
  {
    // Declaración de variables.
    int numFilas;
    String espacioBlanco;
    String asteriscos;
    Scanner datosConsola = new Scanner (System.in);
    
    // Se solicita la información al usuario por consola.
    System.out.println("*** DIBUJAR UN TRIANGULO ***");
    System.out.print("Introduzca el número de filas: ");
    numFilas = Integer.parseInt(datosConsola.nextLine());
    
    // Se dibuja el triángulo con un ciclo for.
    for(int fila = 1; fila <= numFilas; fila++)
    {
      espacioBlanco = " ".repeat(numFilas - fila);
      asteriscos = "*".repeat(2 * fila - 1);
      System.out.println(espacioBlanco + asteriscos);
    }
  }
}