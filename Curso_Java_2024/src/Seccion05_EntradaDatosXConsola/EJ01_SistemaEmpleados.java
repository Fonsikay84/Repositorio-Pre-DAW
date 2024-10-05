/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 47: Ejercicio - Sistema de empleados.
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se solicita crear un programa para pedir la información de un empleado. 
| Los datos solicitados se deben de introducir por consola.
|
|   - Nombre del empleado.
|   - Edad (int).
|   - Salario (double).
|   - Es jefe de departamento (boolean).
| 
| Una vez que se han capturado los datos, se debe de mandar a imprimir por consola.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/
package Seccion05_EntradaDatosXConsola;

import java.util.Scanner;

public class EJ01_SistemaEmpleados 
{
  public static void main(String[] args) 
  {
    // Declaración de variables.
    String nombreEmpleado;
    int edadEmpleado;
    double salarioEmpleado;
    boolean esJefeDepartamento;
    
    // Se solicita los datos por consola.
    System.out.println("*** Petición de datos del Empleado ***");
    Scanner datosConsola = new Scanner(System.in);
    System.out.print("Introduzca el nombre del empleado: ");
    nombreEmpleado = datosConsola.nextLine();
    System.out.print("Introduzca la edad del empleado: ");
    edadEmpleado = Integer.parseInt(datosConsola.nextLine());
    System.out.print("Introduzca el salario del empleado: ");
    salarioEmpleado = Double.parseDouble(datosConsola.nextLine());
    System.out.print("Introduzca si el empleado es Jefe de departamento: ");
    esJefeDepartamento = Boolean.parseBoolean(datosConsola.nextLine());
    
    // Se muestran los datos por consola.
    System.out.println("\n*** Datos del Empleado ***");
    System.out.println("- Nombre: " + nombreEmpleado);
    System.out.println("- Edad: " + edadEmpleado);
    System.out.println("- Salario: " + salarioEmpleado);
    System.out.println("- ¿Es Jefe de departamento?: " + esJefeDepartamento);
  }
}
