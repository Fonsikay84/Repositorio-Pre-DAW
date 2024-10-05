/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 84: Ejercicio - La casa de los espejos
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Supón que estás en un parque de atracciones y quieres entrar a la casa de los espejos.
| Sin embargo, debes de cumplir con algunas condiciones:
|
|   - Debes tener más de 10 años.
|   - No debe darte miedo la oscuridad.
|
| Si se cumplen las condiciones anteriores puedes entrar.
| Para realizar este ejemplo, vamos a utilizar el operador "not" para aplicar una lógica inversa.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion07_SentenciasDeDecision;

import java.util.Scanner;

public class EJ03_CasaDeLosEspejos 
{
  public static void main(String[] args) 
  {
    // Declaración de variables.
    Scanner datosConsola = new Scanner(System.in);
    int edad;
    boolean tienesMiedoOscuridad;
    
    // Se solicita los datos al usuario por consola.
    System.out.println("*** LA CASA DE LOS ESPEJOS ***");
    System.out.print("Introduzca la edad: ");
    edad = Integer.parseInt(datosConsola.nextLine());
    System.out.print("¿Tienes miedo a la oscuridad?: ");
    tienesMiedoOscuridad = Boolean.parseBoolean(datosConsola.nextLine());
    
    // Se comprueban los datos.
    if (!tienesMiedoOscuridad && edad > 10)
    {
      System.out.println("Puedes entrar a La casa de los espejos.");
    }
    else
    {
      System.out.println("No puedes entrar a la casa de los espejos.");
    }
  }
}
