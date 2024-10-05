/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 138: Ejercicio - Introducir datos en una matriz dinámicamente
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se debe de crear un programa que cree una matriz de forma dínamica:
|
|   - Debe de solicitar al usuario el número de filas y columnas de la matriz.
|   - Debe de solicitar al usuario los datos que va a tener cada celda de la matriz.
|   - Se debe de imprimir por pantalla la información de la matriz creada.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion10_Matrices;

import java.util.Scanner;

public class EJ02_IntroducirValoresMatrizDinamico 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    int numFilas;
    int numColumnas;
    int datoMatriz;
    Scanner datosConsola = new Scanner(System.in);
    
    // Se solicita los datos al usuario por consola.
    System.out.println("*** MATRIZ DINAMICA ***");
    System.out.println("\n*** PETICION DE DATOS ***\n");
    System.out.print("Introduzca el numero de filas de la matriz: ");
    numFilas = Integer.parseInt(datosConsola.nextLine());
    System.out.print("Introduzca el numero de columnas de la matriz: ");
    numColumnas = Integer.parseInt(datosConsola.nextLine());
   
    // Se declara la variable tipo matriz.
    int[][] matriz = new int[numFilas][numColumnas];
    
    System.out.println("\n*** DATOS DE LA MATRIZ ***\n");
    // Se solicita al usuario los valores que va a tener la matríz.
    for (int fila = 0; fila < matriz.length; fila++) 
    {
      for (int columna = 0; columna < matriz[fila].length; columna++) 
      {
        System.out.printf("Introduzca el valor de la matriz[%d][%d]: ", fila, columna);
        datoMatriz = Integer.parseInt(datosConsola.nextLine());
        matriz[fila][columna] = datoMatriz;
      }
    }
    
    // Se imprime la matriz por consola.
    System.out.println("\n*** INFORMACIÓN DE LA MATRIZ ***\n");
    
    for (int fila = 0; fila < matriz.length; fila++) 
    {
      for (int columna = 0; columna < matriz[fila].length; columna++) 
      {
        System.out.printf("El valor de la matriz[%d][%d] es: %d%n%n", fila, columna, matriz[fila][columna]);
      }
    }
  }
}
