/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 29: Reto - Reserva de Hoteles.
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se solicita capturar el detalle de las reservas de hoteles.
|
| El detalle que se debe capturar es:
| 
|   - Nombre del cliente.
|   - Días de estancia.
|   - Tarifa diaria.
|   - Indicar si la habitación cuenta con vistas al mar.
| 
| Deben asignar valores iniciales y mandar a imprimir el valor de cada variable.
|
| Por último, se les pide modificar algunas variables de la reserva y mandar a imprimir nuevamente cada variable para
| observar los cambios.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion03_Variables;

public class RE03_Reserva_Hoteles 
{
  public static void main(String[] args) 
  {
    // Declaración de variables.
    String nombreCliente = "Alfonso López Jiménez";
    int diasEstancia = 4;
    final double TARIFA_DIARIA = 45.50D;
    boolean tieneVistas = true;
    
    // Imprimir los valores por consola.
    System.out.println("Nombre cliente: " + nombreCliente);
    System.out.println("Dias de estancia: " + diasEstancia);
    System.out.println("Tarifa diaria: " + TARIFA_DIARIA);
    System.out.println("¿Tiene vistas al mar?: " + tieneVistas);
    
    // Se modifica los valores posibles.
    nombreCliente = "Isabel Ferral";
    diasEstancia = 3;
    tieneVistas = false;
    
    // Se imprime de nuevo los valores por consola.
    System.out.println("\nNombre cliente: " + nombreCliente);
    System.out.println("Dias de estancia: " + diasEstancia);
    System.out.println("Tarifa diaria: " + TARIFA_DIARIA);
    System.out.println("¿Tiene vistas al mar?: " + tieneVistas);
  }
}