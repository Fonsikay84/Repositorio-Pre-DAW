/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 117: Reto - Calculadora
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se debe de crear un programa de calculadora con las opciones de:
| 
| El programa debe de mostrar un menú:
|
|   1. Suma.
|   2. Resta.
|   3. Multiplicación.
|   4. División: Se comprueba si la división es por 0 y si es así, se muestra mensaje de error.
|   5. Salir.
| 
| Se debe de facilitar los valores de operando1 y operando2 para realizar la operación seleccionada.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion08_Ciclos;

import java.util.Scanner;

public class RE04_Calculadora 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    int opcion;
    double numero1;
    double numero2;
    double resultado;
    Scanner datosConsola = new Scanner (System.in);
    
    // Se crea el ciclo do while para realizar el menú iterativo.
    do
    {
      System.out.println("""
                         *** CALCULADORA JAVA ***
                         
                         Menu:
                         
                         1. Suma.
                         2. Resta.
                         3. Multiplicacion.
                         4. Division.
                         5. Salir.
                         """);
      
      // Se solicita al usuario la elección de una de las opciones.
      System.out.print("Introduzca la opcion elegida: ");
      opcion = Integer.parseInt(datosConsola.nextLine());
      
      // Según sea la opción elegida, realiza un cálculo u otro.
      switch(opcion)
      {
        
        // Opción 1: Suma.
        case 1 -> {
                    System.out.println("\nOperacion: Suma.");
                    System.out.print("Introduzca el primer operando: ");
                    numero1 = Double.parseDouble(datosConsola.nextLine());
                    System.out.print("Introduzca el segundo operando: ");
                    numero2 = Double.parseDouble(datosConsola.nextLine());
                    resultado = numero1 + numero2;
                    System.out.printf("Resultado: %.2f%n%n", resultado);
                  }
        
        // Opción 2: Resta.
        case 2 -> {
                    System.out.println("\nOperacion: Resta.");
                    System.out.print("Introduzca el primer operando: ");
                    numero1 = Double.parseDouble(datosConsola.nextLine());
                    System.out.print("Introduzca el segundo operando: ");
                    numero2 = Double.parseDouble(datosConsola.nextLine());
                    resultado = numero1 - numero2;
                    System.out.printf("Resultado: %.2f%n%n", resultado);
                  }
        
        // Opción 3: Multiplicación.
        case 3 -> {
                    System.out.println("\nOperacion: Multiplicacion.");
                    System.out.print("Introduzca el primer operando: ");
                    numero1 = Double.parseDouble(datosConsola.nextLine());
                    System.out.print("Introduzca el segundo operando: ");
                    numero2 = Double.parseDouble(datosConsola.nextLine());
                    resultado = numero1 * numero2;
                    System.out.printf("Resultado: %.2f%n%n", resultado);
                  }
        
        // Opción 4: División.
        case 4 -> {
                    System.out.println("\nOperacion: Division.");
                    System.out.print("Introduzca el primer operando: ");
                    numero1 = Double.parseDouble(datosConsola.nextLine());
                    System.out.print("Introduzca el segundo operando: ");
                    numero2 = Double.parseDouble(datosConsola.nextLine());
                    
                    // Se comprueba que la división no sea entre 0.
                    if (numero2 == 0) 
                    {
                      System.out.println("ERROR: No es posible la division de un numero entre 0.\n");
                    }
                    else
                    {
                      resultado = numero1 / numero2;
                      System.out.printf("Resultado: %.2f%n%n", resultado);
                    }
                  }
        
        // Opción 5: Salir.
        case 5 -> System.out.println("\nCerrando la calculadora...\n");
        
        // Opción default: Opción inválida.
        default -> System.out.println("\nERROR: Opcion invalida.\n");
      }
    }
    while (opcion != 5);
  }
}