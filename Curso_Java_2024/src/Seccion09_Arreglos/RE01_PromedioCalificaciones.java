/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 132: Reto - Promedio de Calificaciones
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se debe de crear un programa para imprimir el promedio de calificaciones.
|
| Para ello hay que tener en cuenta los siguientes puntos:
|
|   - Se debe de solicitar al usuario cuantas calificaciones desean agregar al arreglo.
|   - Se va a solicitar al usuario cada una de las calificaciones de tipo numérico.
|   - Una vez introducido todas las calificaciones, se debe de calcular la media de dichas calificaciones e imprimirla por consola.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion09_Arreglos;

import java.util.Scanner;

public class RE01_PromedioCalificaciones 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    Scanner datosConsola = new Scanner (System.in);
    int numCalificaciones;
    double totalCalificaciones = 0.00;
    double promedioCalificaciones;
    
    // Se solicita al usuario que indique la información necesaria por consola.
    System.out.println("*** PROMEDIO DE CALIFICACIONES ***");
    System.out.print("\nIntroduzca cuantas calificaciones se van a añadir al arreglo: ");
    numCalificaciones = Integer.parseInt(datosConsola.nextLine());
    
    // Declaración del arreglo.
    double[] arregloCalificaciones = new double[numCalificaciones];
    
    // Se solicita que indique las notas a añadir.
    for (int i = 0; i < arregloCalificaciones.length; i++) 
    {
      System.out.print("Introduzca la calificacion " + (i + 1) + ": ");
      arregloCalificaciones[i] = Double.parseDouble(datosConsola.nextLine());
      totalCalificaciones = totalCalificaciones + arregloCalificaciones[i];
    }
    
    // Se calcula el promedio de las calificaciones indicadas.
    promedioCalificaciones = totalCalificaciones / numCalificaciones;
    
    // Se imprime el resultado por consola.
    System.out.println("\nPromedio de las calificaciones: " + promedioCalificaciones);
  }
}