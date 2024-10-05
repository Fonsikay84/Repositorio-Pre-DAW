/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 99: Reto - Sistema de envío
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Crear un programa para determinar el precio de envío de un paquete según el destino (Nacional o Internacional) y el peso del paquete.
|
| Declarar dos constantes que son el Precio de las Tarifas:
|
|   - Envío Nacional: 10 € x kg.
|   - Envío Internacional: 20 € x kg.
|
| El programa debe de solicitar dos valores:
|  
|   - Destino: Nacional o Internacional.
|   - Peso del paquete en Kg.
|
| Al final debe de imprimir el precio de envío del paquete.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion07_SentenciasDeDecision;

import java.util.Scanner;

public class RE07_SistemaEnvios 
{
  public static void main(String[] args) 
  {
    
    // Declaración de constantes.
    final int PRECIO_ENVIO_NACIONAL = 10;
    final int PRECIO_ENVIO_INTERNACIONAL = 20;
    
    // Declaración de variables.
    String destinoPaquete;
    Double pesoPaquete;
    Scanner datosConsola = new Scanner (System.in);
    Double precioEnvioPaquete;
    
    // Se pide la información al usuario.
    System.out.println("*** SISTEMA DE ENVIOS ***");
    System.out.print("Introduzca el destino del paquete (nacional/internacional): ");
    destinoPaquete = datosConsola.nextLine();
    System.out.print("Introduzca el peso del paquete (Kg): ");
    pesoPaquete = Double.parseDouble(datosConsola.nextLine());
    
    // Se comprueba los datos y se calcula el precio del envío.
    if (destinoPaquete.equals("nacional")) 
    {
      precioEnvioPaquete = pesoPaquete * PRECIO_ENVIO_NACIONAL;
    }
    else if (destinoPaquete.equals("internacional")) 
    {
      precioEnvioPaquete = pesoPaquete * PRECIO_ENVIO_INTERNACIONAL;
    }
    else
    {
      precioEnvioPaquete = 0.00;
    }
    
    // Se imprime la información por consola.
    if (precioEnvioPaquete > 0) 
    {
      System.out.printf("El precio del envío del paquete es: %.2f €.%n", precioEnvioPaquete);
    }
    else
    {
      System.out.printf("Destino inválido. Ingresa nacional/internacional.%n");
    }
    
    /* Otra forma de solución utilizando la expresión switch:
    precioEnvioPaquete = switch (destino)
    {
      case "nacional" -> pesoPaquete * PRECIO_ENVIO_NACIONAL;
      case "internacional" -> pesoPaquete * PRECIO_ENVIO_INTERNACIONAL;
      default -> {
                    System.out.println("Destino inválido. Ingresa nacional/internacional");
                    yield null;
                  }
    };
    
    if (precioEnvioPaquete != null)
    {
      System.out.printf("El precio de envío del paquete es: %.2f €.", precioEnvioPaquete);
    }
    
    */
  }
}
