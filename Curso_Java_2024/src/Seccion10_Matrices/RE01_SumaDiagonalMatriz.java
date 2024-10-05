/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 139: Reto - Suma diagonal de una Matriz
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se debe de crear un programa que realice la suma diagonal de una matriz cuadrada de forma dinámica:
|
| Por ejemplo: Matriz 3 x 3
|
|   100 200 300
|   400 500 600
|   700 800 900
|
| Suma Diagonal: 100 + 500 + 900 = 1500 
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion10_Matrices;

import java.util.Scanner;

public class RE01_SumaDiagonalMatriz 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    int tamanioMatriz;
    int valorCelda;
    int suma = 0;
    Scanner datosConsola = new Scanner(System.in);
    
    // Se solicita al usuario que introduzca el tamaño de la matríz.
    System.out.println("*** SUMA DIAGONAL MATRIZ ***\n");
    System.out.print("Introduzca el numero de filas y columnas que va a tener la matriz: ");
    tamanioMatriz = Integer.parseInt(datosConsola.nextLine());
    
    // Declaración de la matríz.
    int[][] matriz = new int[tamanioMatriz][tamanioMatriz];
    
    // Se solicita al usuario que introduzca los datos de la matriz.
    System.out.println("\n*** DATOS MATRIZ ***\n");
    
    for (int fila = 0; fila < matriz.length; fila++) 
    {
      for (int columna = 0; columna < matriz[fila].length; columna++) 
      {
        System.out.printf("Introduzca el valor de la matriz[%d][%d]: ", fila, columna);
        valorCelda = Integer.parseInt(datosConsola.nextLine());
        matriz[fila][columna] = valorCelda;
      }
    }

    // Se imprime por consola la información de la matriz creada.
    System.out.println("\n*** MATRIZ CREADA ***\n");
    
    for (int fila = 0; fila < matriz.length; fila++) 
    {
      if (fila != 0) 
      {
        System.out.print("\n");
      }
      for (int columna = 0; columna < matriz[fila].length; columna++) 
      {
        System.out.print(matriz[fila][columna] + " ");
      }
    }
    
    // Se debe de obtener los datos de la diagonal de la matriz y sumarlos.
    for (int fila = 0; fila < matriz.length; fila++) 
    {
      for (int columna = 0; columna < matriz[fila].length; columna++) 
      {
        // Para que sea una suma diagonal, el valor que debe de tener el índice tanto de la fila como de la columna, debe de ser igual.
        if (fila == columna) 
        {
          suma = suma + matriz[fila][columna];
        }
      }
    }
    
    // Se informa por consola al usuario del resultado de la suma diagonal de la matríz.
    System.out.printf("%n%nLa suma diagonal de la matriz %d x %d es: %d%n%n", tamanioMatriz, tamanioMatriz, suma);
  }
}