/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 142: Ejercicio - Métodos
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se debe de crear un método llamado "saludar()" que no retorne valor y que imprima por consola la cadena que se le pasa como argumento.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion11_Metodos;

public class EJ01_Metodos 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    String mensaje = "Hola desde Java.";
    
    // Se llama al método "saludar()".
    saludar(mensaje);
    saludar("Adios");
  }
  
  // Se define el nuevo método "saludar()".
  static void saludar(String mensaje)
  {
    System.out.println("Mensaje: " + mensaje);
  }
}
