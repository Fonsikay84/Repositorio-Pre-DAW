/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 95: Ejercicio - Dia de la semana con expresión Switch
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se solicita crear una aplicación que pida al usuario el número del día de la semana y se indique por consola el nombre del día.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion07_SentenciasDeDecision;

import java.util.Scanner;

public class EJ06_DiaSemana_SwitchMejorado
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    Scanner datosConsola = new Scanner (System.in);
    int numDiaSemana;
    String nombreDiaSemana;
    
    // Se solicita el número del día de la semana al usuario por consola.
    System.out.println("*** DIA DE LA SEMANA ***");
    System.out.print("Introduzca el número del día de la semana: ");
    numDiaSemana = Integer.parseInt(datosConsola.nextLine());
    
    // Se comprueba los datos.
    nombreDiaSemana = switch (numDiaSemana) 
    {
      case 1 -> "Lunes";          
      case 2 -> "Martes";
      case 3 -> "Miércoles";
      case 4 -> "Jueves";
      case 5 -> "Viernes";
      case 6 -> "Sábado";
      case 7 -> "Domingo";
      default -> "Día inválido: " + numDiaSemana;
    };

    // Se imprime el resultado por consola.
    System.out.printf("El nombre del día %d es: %s%n", numDiaSemana, nombreDiaSemana);
  }
}