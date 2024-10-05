/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 66: Ejercicio - Valor fuera de rango
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se pide crear un programa para revisar si un valor proporcionado se encuentra dentro de un rango de números.
|
|   - Valor inicial del rango: 1
|   - Valor final del rango: 10
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion06_Operadores;

import java.util.Scanner;

public class EJ04_ValorFueraRango 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    Scanner datosConsola = new Scanner(System.in);
    int valorInicial = 1;
    int valorFinal = 10;
    int numUsuario;
    boolean dentroRango;
    boolean fueraRango;
    
    // Se solicita por consola al usuario un número.
    System.out.print("Introduza un número: ");
    numUsuario = Integer.parseInt(datosConsola.nextLine());
    
    // Se revisa que el número esté dentro del rango.
    dentroRango = (numUsuario >= valorInicial && numUsuario <= valorFinal);
    
    // Se informa por la consola.
    System.out.println("¿El número " + numUsuario + " está dentro del rango entre 1 y 10?: " + dentroRango);
    
    // Se revisa si el número está fuera del rango.
    fueraRango = numUsuario < valorInicial || numUsuario > valorFinal;
    
    // Se informa por la consola.
    System.out.println("¿El número " + numUsuario + " está fuera del rango entre 1 y 10?: " + fueraRango);
  }
}
