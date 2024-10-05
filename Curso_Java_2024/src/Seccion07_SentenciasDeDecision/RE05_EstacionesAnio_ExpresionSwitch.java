/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 96: Reto - Estación del año utilizando expresion switch
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se solicita proporcionar el valor de un mes (valor numérico entre 1 y 12), e indicar la estación del año según la siguiente:
| 
|   - Meses 1, 2, 12: Invierno.
|   - Meses 3, 4, 5: Primavera.
|   - Meses 6, 7, 8: Verano.
|   - Meses 9, 10, 11: Otoño.
|   - Cualquier otro valor: Estación desconocida.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion07_SentenciasDeDecision;

import java.util.Scanner;

public class RE05_EstacionesAnio_ExpresionSwitch
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    int numMes;
    Scanner datosConsola = new Scanner (System.in);
    
    // Se solicita los datos al usuario por consola.
    System.out.println("*** Estaciones del año ***");
    System.out.print("Introduzca el número del mes (Entre 1 y 12): ");
    numMes = Integer.parseInt(datosConsola.nextLine());
    
    // Se comprueba los datos y se muestra la información por consola.
    switch (numMes)
    {
      case 12, 1, 2 -> System.out.printf("El mes %d corresponde a la estación de Invierno.%n", numMes);
      case 3, 4, 5 -> System.out.printf("El mes %d corresponde a la estación de Primavera.%n", numMes);
      case 6, 7, 8 -> System.out.printf("El mes %d corresponde a la estación de Verano.%n", numMes);
      case 9, 10, 11 -> System.out.printf("El mes %d corresponde a la estación de Otoño.%n", numMes);
      default -> System.out.printf("El mes %d no corresponde a ninguna estación del año.%n", numMes);
    }
  }
}