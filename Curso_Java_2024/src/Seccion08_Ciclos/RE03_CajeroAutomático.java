/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 115: Reto - Cajero Automático
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se debe de crear un programa de Cajero Automático.
|
| Las funciones principales de un cajero automático son:
|
|   - Ingresar: Se debe de solicitar el importe a ingresar y el importe se debe de sumar a tu saldo informando del nuevo saldo.
|   - Retirar: Se debe de solicitar el importe a retirar y el importe se debe de restar a tu saldo informando del nuevo saldo
|              Si retira mas del saldo disponible, se debe de informar "No se dispone de saldo suficiente. Saldo actual: x €".
|   - Consultar saldo: Se debe de imprimir "El saldo actual de su cuenta es: " con el saldo actual.
|   - Salir: Se debe de imprimir "Saliendo del Cajero Automático. Hasta pronto!".
|
| El saldo puede tener un valor inicial de 1.000 €.
|  
| Se debe de crear un menú con las siguientes opciones que se debe de mostrar hasta indicar la opción de "Salir":
|
| Operaciones que puedes realizar:
|      
|   1. Consultar el saldo.
|   2. Ingresar.
|   3. Retirar.
|   4. Salir.    
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion08_Ciclos;

import java.util.Scanner;

public class RE03_CajeroAutomático 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    int opcion;
    double saldo = 1000.00;
    double importeIngreso;
    double importeRetirada;
    double comprobacionSaldo;
    Scanner datosConsola = new Scanner(System.in);
    
    // Se crea el bucle do while para crear el menú iterativo y se solicita la opción al usuario por consola.
    do
    {
      System.out.printf("""
                         *** CAJERO AUTOMATICO ***
                         
                         Operaciones que puedes realizar:
                         
                         1. Consulta de saldo.
                         2. Ingreso en cuenta.
                         3. Retirada de efectivo.
                         4. Salir.
                         
                         Escoje una opcion:\s""");
      opcion = Integer.parseInt(datosConsola.nextLine());
      
      // Según la opción indicada, se realiza una de las acciones.
      switch (opcion)
      {
        // Caso 1: Consulta de saldo.
        case 1 -> System.out.printf("%nEl saldo actual de su cuenta es: %.2f euros.%n%n", saldo);
        
        // Caso 2: Ingreso en cuenta.
        case 2 -> {
                    System.out.print("\nIntroduzca el importe a ingresar en su cuenta: ");
                    importeIngreso = Double.parseDouble(datosConsola.nextLine());
                    saldo = saldo + importeIngreso;
                    System.out.printf("El nuevo saldo de su cuenta es: %.2f euros.%n%n", saldo);
                  }
        
        // Caso 3: Retirada de efectivo.
        case 3 -> {
                    System.out.print("\nIntroduzca el importe a retirar de su cuenta: ");
                    importeRetirada = Double.parseDouble(datosConsola.nextLine());
                    comprobacionSaldo = saldo - importeRetirada;
                    
                    // Se comprueba si el saldo queda negativo al retirar el importe indicado.
                    if (comprobacionSaldo < 0) 
                    {
                      System.out.printf("No se dispone de saldo suficiente. Saldo actual: %.2f euros.%n%n", saldo);
                    }
                    else
                    {
                      saldo = saldo - importeRetirada;
                      System.out.printf("El nuevo saldo de su cuenta es: %.2f euros.%n%n", saldo);
                    }
                  }
        
        // Caso 4: Salir.
        case 4 -> System.out.println("\nSaliendo del Cajero Automatico. Hasta pronto!.");
        
        // Default: Opción inválida.
        default -> System.out.println("\nLa opcion introducida no es valida.\n");
      }             
    }
    while (opcion != 4);
  }
}
