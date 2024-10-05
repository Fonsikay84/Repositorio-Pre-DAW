/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 69: Reto - Sistema de Autenticación
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se solicita crear un programa para validar el usuario y password proporcionados por el usuario.
| 
| Crea 2 constantes con los valores correctos y posteriormente compara que el usuario y password proporcionados por el usuario sean válidos.
| Debe solicitar el usuario y password al usuario y si son iguales que los valores correctos almacenados en las constantes debe imprimir True, de
| lo contrario, debe de imprimir False.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion06_Operadores;

import java.util.Scanner;

public class RE01_SistemaAutenticacion 
{  
  public static void main(String[] args) 
  {
    
    // Declaración de las constantes.
    final String USUARIO = "Fonsikay";
    final String PASSWORD = "Fonsikay1984";

    // Declaración de variables.
    Scanner datosConsola = new Scanner(System.in);
    String usuario;
    String password;
    boolean autenticacion;
    
    // Se solicita los datos al usuario por consola.
    System.out.println("*** SISTEMA DE AUTENTICACION ***\n");
    System.out.print("- Introduzca el usuario: ");
    usuario = datosConsola.nextLine();
    System.out.print("- Introduzca la password: ");
    password = datosConsola.nextLine();
    
    // Se compara el usuario y password correcto con el indicado por el usuario.    
    autenticacion = USUARIO.equals(usuario) && PASSWORD.equals(password);
    
    // Se imprime por pantalla si el usuario y password son correctos o no.
    System.out.println("¿El usuario y la password introducida es correcta?: " + autenticacion);
  }
}
