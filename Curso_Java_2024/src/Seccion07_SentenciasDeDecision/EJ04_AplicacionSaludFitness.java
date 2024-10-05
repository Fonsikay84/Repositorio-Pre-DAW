/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 85: Ejercicio - Aplicación de Salud y Fitness
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se solicita crear una aplicación de salud y fitness que solicite lo siguiente:
|
|   - Nombre del usuario.
|   - Pasos caminados en el día.
|
| Además definiremos las siguientes constantes:
|
|   - META_PASOS_DIARIO = 10.000.
|   - CALORIAS_POR_PASO = 0.04 Kcal.
|
| Con los valores anteriores, debemos calcular las calorias quemadas según los pasos caminados.
|
|   calorias_quemadas = pasos_diarios * CALORIAS_POR_PASO;
|
| Se debe de verificar si se cumplió la meta de pasos diarios:
|
|   meta_alcanzada = pasos_diarios >= META_PASOS_DIARIO;
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion07_SentenciasDeDecision;

import java.util.Scanner;

public class EJ04_AplicacionSaludFitness 
{
  public static void main(String[] args) 
  {
    
    // Declaración de constantes.
    final int META_PASOS_DIARIO = 10000;
    final double CALORIAS_POR_PASO = 0.04;
    
    // Declaración de variables.
    Scanner datosConsola = new Scanner(System.in);
    String nombreUsuario;
    double caloriasQuemadas;
    int pasosDiarios;
    
    // Se solicita la información necesaria al usuario por consola.
    System.out.println("*** APLICACIÓN SALUD Y FITNESS ***\n");
    System.out.print("Introduzca el nombre de usuario: ");
    nombreUsuario = datosConsola.nextLine();
    System.out.print("Introduzca el número de pasos realizados en el día: ");
    pasosDiarios = Integer.parseInt(datosConsola.nextLine());
    
    // Se calcula las calorias quemadas en el día indicado.
    caloriasQuemadas = pasosDiarios * CALORIAS_POR_PASO;
    System.out.printf("%nHas quemado en el día de hoy %.02f Kcal.%n%n", caloriasQuemadas);
    
    // Se comprueba los datos y se informa por consola al usuario.
    if (pasosDiarios >= META_PASOS_DIARIO) 
    {
      System.out.printf("Felicidades %s!, has alcanzado la meta de pasos para el día de hoy.%n%n", nombreUsuario);
    }
    else
    {
      System.out.printf("Lo siento %s pero no has alcanzado todavía la meta de pasos diarios.%n%n", nombreUsuario);
    }
  }
}
