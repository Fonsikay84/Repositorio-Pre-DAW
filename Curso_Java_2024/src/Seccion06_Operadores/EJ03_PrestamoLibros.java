/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 65: Ejercicio - Préstamo de Libros
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se pide crear un sistema para una biblioteca, la cual desea prestar libros si cumple con cualquiera de las siguientes condiciones:
|
|   - El usuario tiene credencial de estudiante.
|   - El usuario vive a no más de 3 km a la redonda.
|  
| Si cumple con cualquiera de estas condiciones se le puede prestar el libro.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion06_Operadores;

import java.util.Scanner;

public class EJ03_PrestamoLibros 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    boolean tieneCredencialEstudiante;
    int distanciaBiblioteca;
    boolean prestarLibro;
    Scanner datosConsola = new Scanner(System.in);
    
    // Petición de datos al usuario por consola.
    System.out.print("¿El usuario tiene credencial de estudiante (true/false)?: ");
    tieneCredencialEstudiante = Boolean.parseBoolean(datosConsola.nextLine());
    System.out.print("¿A cuantos km vives de la Biblioteca?: ");
    distanciaBiblioteca = Integer.parseInt(datosConsola.nextLine());
    
    // Se comprueba si se le puede prestar un libro o no y se imprime por consola.
    prestarLibro = tieneCredencialEstudiante == true || distanciaBiblioteca <= 3;
    System.out.println("¿Se puede prestar el libro al estudiante?: " + prestarLibro);
    
  }
}
