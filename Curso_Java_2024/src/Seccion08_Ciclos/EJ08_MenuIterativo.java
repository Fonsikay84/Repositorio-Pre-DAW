/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 114: Ejercicio - Menú Iterativo
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se debe de crear un programa que muestre un menú de una aplicación con las siguientes opciones:
  
  Menú:

    - 1. Crear cuenta: En esta opción se debe de imprimir "Creando tu cuenta...".
    - 2. Eliminar cuenta: En esta opción se debe de imprimir "Eliminando tu cuenta...".
    - 3. Salir: En esta opción se debe de imprimir "Saliendo del sistema. Hasta pronto!". 

  El usuario debe de indicar una de las opciones por consola y no se termina hasta que se indique la opción de "Salir".
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion08_Ciclos;

import java.util.Scanner;

public class EJ08_MenuIterativo 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    int opcion;
    Scanner datosConsola = new Scanner(System.in);
    
    System.out.println("*** Sistema de Administración de Cuentas ***");
    
    // Se crea el menú iterativo con el ciclo do while.
    do
    {
      System.out.println("\nMenú:\n");
      System.out.println("1. Crear cuenta.");
      System.out.println("2. Eliminar cuenta.");
      System.out.println("3. Salir.");
      
      System.out.print("\nEscoje una opción: ");
      opcion = Integer.parseInt(datosConsola.nextLine());
      
      // Según sea la opción elegida, se muestra el texto por consola.
      switch(opcion)
      {
        case 1 -> System.out.println("\nCreando tu cuenta...");
        case 2 -> System.out.println("\nEliminando tu cuenta...");
        case 3 -> System.out.println("\nSaliendo del sistema. Hasta pronto!");
        default -> System.out.println("\nOpción incorrecta...");
      }
    }
    while (opcion != 3);
  }
}
