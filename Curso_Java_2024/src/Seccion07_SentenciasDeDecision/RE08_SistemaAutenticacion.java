/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 101: Reto - Sistema de autenticación
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Crear un sistema para validar los valores de usuario y password proporcionados.
|
| Se debe de definir dos constantes con los valores válidos de usuario y password.
| El sistema debe comprobar los valores válidos contra los valores proporcionados.
| Se debe de considerar cuatro casos:
|
|   - Usuario y password válidos: Debe imprimir "Bienvenido al sistema".
|   - Usuario inválido.
|   - Password inválido.
|   - Usuario y password inválido.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion07_SentenciasDeDecision;

import java.util.Scanner;

public class RE08_SistemaAutenticacion 
{
  public static void main(String[] args) 
  {
    
    // Definición de constantes.
    final String USUARIO_VALIDO = "Fonsi";
    final String PASSWORD_VALIDO = "Fonsi#1984";
    
    // Definición de variables.
    String usuario;
    String password;
    Scanner datosConsola = new Scanner (System.in);
    
    // Se solicita la información al usuario por consola.
    System.out.println("*** SISTEMA DE AUTENTICACIÓN ***");
    System.out.print("Introduzca el usuario: ");
    usuario = datosConsola.nextLine();
    System.out.print("Introduzca la contraseña: ");
    password = datosConsola.nextLine();
    
    // Se comprueba los datos y se imprime el resultado por consola.
    if (USUARIO_VALIDO.equals(usuario) && PASSWORD_VALIDO.equals(password)) 
    {
      System.out.println("Bienvenidos al Sistema");
    }
    else if (USUARIO_VALIDO.equals(usuario) == false && PASSWORD_VALIDO.equals(password))
    {
      System.out.println("ERROR: El usuario introducido es incorrecto.");
    }
    else if (USUARIO_VALIDO.equals(usuario) && PASSWORD_VALIDO.equals(password) == false)
    {
      System.out.println("ERROR: La contraseña introducida es incorrecta.");      
    }
    else
    {
      System.out.println("ERROR: El usuario y la contraseña introducida son incorrectos.");      
    }
    
    /*
    Otra solución con el uso de la expresión del switch.
    
    String mensajeAutenticacion = switch (usuario)
    {
      case USUARIO_VALIDO -> {
                                if (PASSWORD_VALIDO.equals(password))
                                {
                                  yield "Bienvenido al Sistema.";
                                }
                                else
                                {
                                  yield "ERROR: La contraseña introducida es incorrecta.";
                                }
                             }
      default -> {
                    if (PASSWORD_VALIDO.equals(password))
                    {
                      yield "ERROR: El usuario introducido es incorrecto."; 
                    }
                    else
                    {
                      yield "ERROR: El usuario y la contraseña introducida son incorrectos.";
                    }
                 }
    };
    
    System.out.println(mensajeAutenticacion);          
    */
  }
}
