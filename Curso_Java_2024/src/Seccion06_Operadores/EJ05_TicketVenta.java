/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 67, 68: Ejercicio - Generación de Ticket de venta
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Supongamos que compramos varios artículos en el supermercado y queremos obtener el ticket de venta total incluyendo impuestos.
|            El sistema solicitará el precio de cada producto a comprar y el usuario deberá indicar su precio (valor de tipo con punto decimal).
|            El sistema debe realizar la suma de cada producto, calcular el impuesto y finalmente imprimir el total de la compra.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion06_Operadores;

import java.util.Scanner;

public class EJ05_TicketVenta 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    Scanner datosConsola = new Scanner(System.in);
    int porcentajeIVA = 16;
    double descuento;
    double descuentoPorcentaje;
    double subTotalDescuento;
    double precioLeche;
    double precioPan;
    double precioLechuga;
    double precioPlatanos;
    double subTotal;
    double subTotalConImpuestos;
    double precioTotal;
    
    // Solicita al usuario los precios de los productos.
    System.out.println("*** GENERADOR DE TICKET DE VENTA ***");
    System.out.print("\n- Precio de la Leche: ");
    precioLeche = Double.parseDouble(datosConsola.nextLine());
    System.out.print("- Precio del Pan: ");
    precioPan = Double.parseDouble(datosConsola.nextLine());
    System.out.print("- Precio de la Lechuga: ");
    precioLechuga = Double.parseDouble(datosConsola.nextLine());
    System.out.print("- Precio del Platanos: ");
    precioPlatanos = Double.parseDouble(datosConsola.nextLine());
    System.out.print("- ¿Desea aplicar algún descuento (%)?: ");
    descuentoPorcentaje = Integer.parseInt(datosConsola.nextLine());
    
    // Se calcula el subtotal de la compra.
    subTotal = precioLeche + precioPan + precioLechuga + precioPlatanos;
    
    // Se aplica el descuento indicado por el usuario.
    descuento = subTotal * (descuentoPorcentaje / 100);
    
    // Se obtiene el subtotal con el descuento.
    subTotalDescuento = subTotal - descuento;
    
    // Se calcula el importe con impuestos.
    subTotalConImpuestos = subTotalDescuento * 0.16;
    
    // Se calcula el precio total del ticket.
    precioTotal = subTotalDescuento + subTotalConImpuestos; 
    
    // Se imprime por consola la información del ticket de venta.
    System.out.printf("""
                      \nTICKET DE COMPRA\n
                      - Subtotal: %.2f euros
                      - Descuento (%.0f %%): %.2f euros 
                      - Impuestos (%d %%): %.2f euros
                      - Total: %.2f euros
                      %n""", subTotal, descuentoPorcentaje, descuento, porcentajeIVA, subTotalConImpuestos, precioTotal);
  }
}
