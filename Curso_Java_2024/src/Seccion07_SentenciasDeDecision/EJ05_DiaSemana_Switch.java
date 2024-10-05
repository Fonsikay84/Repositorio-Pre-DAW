/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 94: Ejercicio - Dia de la semana con Switch
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se solicita crear una aplicación que pida al usuario el número del día de la semana y se indique por consola el nombre del día.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion07_SentenciasDeDecision;

import java.util.Scanner;

public class EJ05_DiaSemana_Switch 
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
    switch (numDiaSemana) 
    {
      case 1:
        nombreDiaSemana = "Lunes";  
        break;
      case 2:
        nombreDiaSemana = "Martes";
        break;
      case 3:
        nombreDiaSemana = "Miércoles";
        break;
      case 4:
        nombreDiaSemana = "Jueves";
        break;
      case 5:
        nombreDiaSemana = "Viernes";
        break;
      case 6:
        nombreDiaSemana = "Sábado";
        break;
      case 7:
        nombreDiaSemana = "Domingo";
        break;
      default:
        nombreDiaSemana = "Desconocido";
    }

    // Se imprime el resultado por consola.
    System.out.printf("El nombre del día %d es: %s%n", numDiaSemana, nombreDiaSemana);
  }
}