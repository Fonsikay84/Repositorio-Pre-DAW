/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 53: Reto - Generador ID Único.
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se solicita un programa para generar un valor de ID (Identificador) único para cada persona.
|
| El programa debe de solicitar al usuario:
|
|   - Nombre.
|   - Apellido.
|   - Año de nacimiento (YYYY).
| 
| El programa deberá generar un valor aleatorio de 4 digítos, entre 1 y 9999. 
| Si el número generado es menor a 4 dígitos se debe completar el valor con ceros a la izquierda.
| 
| Finalmente con los datos obtenidos se debe generar un valor de ID único, uniendo los valores de la siguiente
| forma:
|
|   - Nombre: Juán -> JU
|   - Apellido: Pérez -> PE
|   - Año: 1995 -> 95
|   - Aleatorio: 0736
|   - Resultado: JUPE950736
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion05_EntradaDatosXConsola;

import java.util.Random;
import java.util.Scanner;

public class RE02_Generador_IdUnico 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.    
    String nombre;
    String nombreCompleto;
    String apellido;
    String anioNacimiento;
    int numAleatorio;
    Scanner datosConsola = new Scanner(System.in);    
    Random numAleatorioRandom = new Random();
    
    // Se pide los datos al usuario por consola.
    System.out.println("*** SISTEMA GENERADOR DE ID ÚNICO ***");
    
    System.out.print("\nIntroduzca el nombre: ");
    nombreCompleto = datosConsola.nextLine();
    // Se obtienen los dos primeros caracteres y se pone en mayúscula.
    nombre = nombreCompleto.substring(0, 2).toUpperCase();
    
    System.out.print("Introduzca el apellido: ");
    apellido = datosConsola.nextLine();
    // Se obtienen los dos primeros caracteres y se pone en mayúscula.
    apellido = apellido.substring(0, 2).toUpperCase();
    
    System.out.print("Introduzca el año de nacimiento (YYYY): ");
    anioNacimiento = datosConsola.nextLine();
    // Se obtienen los dos últimos caracteres.
    anioNacimiento = anioNacimiento.substring(2, 4);
    
    // Número aleatorio del 1 al 9999.
    numAleatorio = numAleatorioRandom.nextInt(9999) + 1;
    
    // Se imprime por consola el ID único.
    System.out.printf("""
                      \nHola %s,
                      \tTu nuevo número de identificación (ID) generado por el sistema es:
                      \t%s%s%s%04d
                      \tFelicidades!%n
                      """, nombreCompleto, nombre, apellido, anioNacimiento, numAleatorio);
  }
}
