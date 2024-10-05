/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 87: Reto - Sistema de reserva de hotel
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se solicita crear un sistema de reservas de un Hotel.
| Se debe pedir la siguiente información al usuario:
| 
|   - Nombre de cliente.
|   - Días de estancia en el Hotel.
|   - Habitación con vistas al mar.

  El Hotel tiene las siguintes tarifas:

    - Habitación sin vistas al mar: 150.50 € por día.
    - Habitación con vistas al mar: 190.50 € por día.

  El sistema debe de calcular el precio total de la estancia dependiendo si escoje una habitación con vistas al mar o no.
  Además de indicar si eligió una habitación con vistas al mar o no.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion07_SentenciasDeDecision;

import java.util.Scanner;

public class RE02_SistemaReservaHotel 
{
  public static void main(String[] args) 
  {
    
    // Declaración de constantes.
    final double PRECIO_HAB_SIN_VISTAS = 150.50;
    final double PRECIO_HAB_CON_VISTAS = 190.50;
    
    // Declaración de variables.
    String nombre;
    int diasEstancia;
    boolean tieneHabVistaMar;
    double precioEstancia;
    Scanner datosConsola = new Scanner (System.in);
    String cadenaVistasMar;
    
    // Se solicita al usuario los datos por consola.
    System.out.println("*** Sistema de Reserva de Hotel ***");
    System.out.print("Nombre del cliente: ");
    nombre = datosConsola.nextLine();
    System.out.print("Dias de estancia: ");
    diasEstancia = Integer.parseInt(datosConsola.nextLine());
    System.out.print("Habitación con vistas al mar (true/false): ");
    tieneHabVistaMar = Boolean.parseBoolean(datosConsola.nextLine());
    
    // Se comprueba los datos y se obtiene el precio de la estancia.
    if (tieneHabVistaMar) 
    {
      precioEstancia = diasEstancia * PRECIO_HAB_CON_VISTAS;
      cadenaVistasMar = "Si 8-)";
    }
    else
    {
      precioEstancia = diasEstancia * PRECIO_HAB_SIN_VISTAS;
      cadenaVistasMar = "No 8-(";
    }
    
    // Se imprime los datos por consola.
    System.out.println("\n---------- Detalle de la Reserva ----------");
    System.out.println("- Cliente: " + nombre);
    System.out.println("- Días de estancia: " + diasEstancia);
    System.out.printf("- Precio Total: %.2f euros%n", precioEstancia );
    System.out.println("- Habitación con vista al mar: " + cadenaVistasMar);
  }
}
