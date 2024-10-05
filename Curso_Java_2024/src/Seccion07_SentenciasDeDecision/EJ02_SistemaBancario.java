/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 83: Ejercicio - Sistema Bancario
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Considerando que estamos dentro de un sistema bancario, se solicita preguntar al usuario si desea continuar dentro del sistema.
| Utilizando el operador not (!) para aplicar una lógica inversa se debe programar las siguientes condiciones:
|  
|   - Si no deseamos salir del sistema, imprimir "Continuamos dentro del sistema".
|   - De lo contrario, imprimimos "Saliendo del sistema...".
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion07_SentenciasDeDecision;

import java.util.Scanner;

public class EJ02_SistemaBancario 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    Scanner datosConsola = new Scanner(System.in);
    boolean salirSistema;
    
    // Se pide el dato al usuario por consola.
    System.out.println("*** SISTEMA BANCARIO ***");
    System.out.print("¿Desea continuar dentro del sistema?: ");
    salirSistema = Boolean.parseBoolean(datosConsola.nextLine());
    
    // Se comprueba si se quiere salir del sistema o no.
    if (!salirSistema) 
    {
      System.out.println("Continuamos dentro del sistema.");
    }
    else
    {
      System.out.println("Saliendo del sistema...");
    }
  }
}
