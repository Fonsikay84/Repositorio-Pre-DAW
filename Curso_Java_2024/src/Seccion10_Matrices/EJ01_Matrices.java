/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 135: Ejercicio - Matrices
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se debe de crear un programa que utiliza una matriz 2x3 que va a contener los siguientes valores:
|
| 100 200 300
| 400 500 600
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion10_Matrices;

public class EJ01_Matrices 
{
  public static void main(String[] args) 
  {
    
    // Declaración de la matriz.
    int matriz[][] = new int[2][3];
    
    // Se cargan los valores en la matriz.
    
    // Opción 1.
    matriz[0][0] = 100;
    matriz[0][1] = 200;
    matriz[0][2] = 300;
    matriz[1][0] = 400;
    matriz[1][1] = 500;
    matriz[1][2] = 600;
    
    // Opción 2 - Declaración y carga de datos simplificada de una matriz.
    int[][] matriz2 = new int[][] {
                                    {101, 202, 303},
                                    {404, 505, 606},
                                  };
    
    // Se imprime los datos de la matriz desglosado por fila y columna.
    System.out.println("*** MATRIZ 2 x 3 ***\n");

    for (int fila = 0; fila < matriz.length; fila++) 
    {
      for (int columna = 0; columna < matriz[fila].length; columna++) 
      {
        System.out.printf("Valor [%d][%d]: %d%n", fila, columna, matriz[fila][columna]);
      }
    }
    
    // Se imprime los datos de la matriz como tabla.
    System.out.println("\n*** MATRIZ 2 x 3 ***\n");
    
    for (int fila = 0; fila < matriz2.length; fila++) 
    {
      if (fila != 0) 
      {
        System.out.print("\n");
      }
      for (int columna = 0; columna < matriz2[fila].length; columna++) 
      {
        System.out.print(matriz2[fila][columna] + " ");
      }
      
    }
    System.out.println("\n");
  }
}
