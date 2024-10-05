/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 64: Ejercicio - Tienda con Descuento VIP
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Una tienda de supermercado ofrece un descuento especial a clientes que compren 10 o más articulos por día y que ademas sean miembros
|            de la tienda.
|
| El sistema debe solicitar al cliente que indique cuantos artículos ha comprado en el día y preguntarle si cuenta con la membresía de la tienda.
| En caso de haber comprado 10 o más productos y ser miembro de la tienda, entonces tendrá acceso al descuento VIP.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion06_Operadores;

import java.util.Scanner;

public class EJ02_TiendaDescuentosVIP 
{
  public static void main(String[] args) 
  {
    // Declaración de variables.
    Scanner datosConsola = new Scanner(System.in);
    int numArticulos;
    boolean tieneMembresia;
    boolean aplicaDescuento;
    
    // Se pide los datos al usuario por consola.
    System.out.print("Introduzca el número de artículos comprados: ");
    numArticulos = Integer.parseInt(datosConsola.nextLine());
    System.out.print("¿Tiene usted la membresía VIP? (true/false): ");
    tieneMembresia = Boolean.parseBoolean(datosConsola.nextLine());
    
    // Se comprueba si se aplica el descuento VIP.
    aplicaDescuento = (numArticulos >= 10 && tieneMembresia == true);
    
    // Se informa por pantalla si se aplica el descuento.
    System.out.println("¿Se aplica el descuento VIP al cliente?: " + aplicaDescuento);
  }
}
