/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 63: Ejercicio - Determinar si un valor está dentro de un rango.
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se solicita crear un programa para saber si el valor proporcionado se encuentra dentro de un rango definido.
|
|   - Valor inicial del rango: 0
|   - Valor final del rango: 5
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion06_Operadores;

import java.util.Scanner;

public class EJ01_DeterminarValorDentroRango 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    int valorInicial = 0;
    int valorFinal = 5;
    Scanner datosConsola = new Scanner(System.in);
    int numUsuario;
    boolean comparacion;
    
    System.out.print("Introduzca un número: ");
    numUsuario = Integer.parseInt(datosConsola.nextLine());
    
    comparacion = numUsuario >= valorInicial && numUsuario <= valorFinal;
    System.out.println("¿El número " + numUsuario + " introducido está dentro del rango entre 0 y 5?: " + comparacion);
    
  }
}
