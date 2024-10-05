/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 81: Reto - Tienda Online con descuentos
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se solicita crear un programa que ofrezca descuentos dependiendo del monto de la compra, o si es miembro de la tienda.
| 
| Se deben de revisar las siguientes condiciones:
|
|   - Si ha comprado al menos 1.000 €, y es miembro -> Descuento del 10%.
|   - Si sólo es miembro de la tienda -> Descuento del 5%.
|   - Si no es miembro ni compró al menos 1.000 € -> Descuento del 0%.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion07_SentenciasDeDecision;

import java.util.Scanner;

public class RE01_TiendaOnlineConDescuentos 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    double dineroCompras;
    Scanner datosConsola = new Scanner (System.in);
    boolean esMiembro = false;
    double descuento;
    int numDescuento;
    double precioTotalDescuento;
    double precioTotal;
    
    // Se solicita al usuario que indique cuanto se ha gastado en la compra.
    System.out.println("*** TIENDA ONLINE CON DESCUENTOS ***\n");
    System.out.print("Introduzca el dinero de la compra realizada: ");
    dineroCompras = Double.parseDouble(datosConsola.nextLine());
    System.out.print("Introduzca si es miembro de la tienda (true/false): ");
    esMiembro = Boolean.parseBoolean(datosConsola.nextLine());
    
    // Se comprueba el dinero gastado y si es miembro de la tienda.
    if (dineroCompras >= 1000 && esMiembro == true) 
    {
      descuento = 0.1;
      numDescuento = 10;
    }
    else if (esMiembro == true) 
    {
      descuento = 0.05;
      numDescuento = 5;
    }
    else
    {
      descuento = 0;
      numDescuento = 0;
    }
    
    // Si no existe descuento, se muestra un mensaje pero si existe descuento se muestra otro mensaje por consola al usuario.
    if (numDescuento == 0) 
    {
      // Se imprime por consola la información del ticket.
    System.out.printf("""
                      %nNo obtuviste ningún tipo de descuento
                      Te invitamos a hacerte miembro de la tienda
                      Monto final de la compra: %.2f euros%n%n""", dineroCompras);
    }
    else
    {
      // Se calcula el precio del descuento a aplicar.
      precioTotalDescuento = dineroCompras * descuento;

      // Se calcula el precio total aplicando el descuento.
      precioTotal = dineroCompras - precioTotalDescuento;

      // Se imprime por consola la información del ticket.
      System.out.printf("""
                        %nFelicidades, has obtenido un descuento del %d%%
                        Monto de la compra: %.2f euros
                        Monto del descuento: %.2f euros
                        Monto final de la compra con descuento: %.2f euros%n%n""", numDescuento, dineroCompras, precioTotalDescuento, precioTotal);
    }
  }
}