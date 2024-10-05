/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 143: Ejercicio - Método Suma
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se debe de crear un método llamado "suma()" que no retorne valor y que realiza la suma de dos números dados por el usuario. 
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion11_Metodos;

import java.util.Scanner;

public class EJ02_MetodoSuma 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    int num1;
    int num2;
    int suma;
    Scanner datosConsola = new Scanner(System.in);
    
    // Se solicita al usuario por consola la información necesaria.
    System.out.println("*** METODO SUMA ***\n");
    System.out.print("Introduzca el primer numero: ");
    num1 = Integer.parseInt(datosConsola.nextLine());
    System.out.print("Introduzca el segundo numero: ");
    num2 = Integer.parseInt(datosConsola.nextLine());
    
    // Se llama al método "sumar()".
    suma = sumar(num1, num2);
    
    // Se imprime por consola el resultado de la suma.
    System.out.printf("El resultado de la suma de %d y %d es: %d%n", num1, num2, suma);
    
    // Se cierra el objeto Scanner.
    datosConsola.close();
  }
  
  // Declaración del método "sumar()".
  static int sumar(int num1, int num2)
  {
    
    // Declaración de variables.
    int suma;
    
    // Se realiza la suma de los dos números.
    suma = num1 + num2;
    
    // Se retorna el valor de la suma.
    return suma;
  }
}