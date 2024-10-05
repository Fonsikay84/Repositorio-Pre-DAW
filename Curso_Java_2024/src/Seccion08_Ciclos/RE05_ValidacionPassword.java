/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 119: Reto - Creación y Validación de Password
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se debe de crear un programa para solicitar la validación al momento de crear un valor de un password o contraseña.
|
| - La contraseña debe tener al menos 6 caractéres.
| - En caso de no cumplir con esta condición, el programa debe volver a solicitar un nuevo valor hasta que cumpla con la condición.
| - Si el valor proporcionado es válido, se debe de imprimir "Password válido".
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion08_Ciclos;

import java.util.Scanner;

public class RE05_ValidacionPassword 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    String password;
    Scanner datosConsola = new Scanner (System.in);
    
    // Se crea el ciclo do while para que se lance mientras que el password no tenga los 6 caracteres.
    do
    {
      System.out.println("*** VALIDACION DE PASSWORD ***");
      System.out.print("\nIntroduzca el password (6 caracteres minimo): ");
      password = datosConsola.nextLine();
      
      if (password.length() >= 6) 
      {
        System.out.println("Password valido.\n");
      }
      else
      {
        System.out.println("Password invalido.\n");
      }
    }
    while(password.length() < 6);
  }
}