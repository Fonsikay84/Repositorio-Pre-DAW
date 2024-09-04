/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 13 : Pedir datos al usuario (Clase Scanner).
---------------------------------------------------------------------------------------------------------------------------------------------------
 */

package Seccion03_Variables;

// Se importa la librería necesaria para usar el método Scanner.
import java.util.Scanner;

public class Punto03_PedirDatosUsuario_ClaseScanner 
{
  public static void main (String args[])
  {
    System.out.println("Escribe tu usuario: ");
    // Se crea un objeto de tipo Scanner llamado "DatosConsola".
    Scanner DatosConsola = new Scanner(System.in);
    // Se usa el método "nextLine()" del objeto Scanner para almacenar el dato solicitado al usuario.
    var Usuario = DatosConsola.nextLine();
    
    System.out.println("Escribe tu contraseña: ");
    // Se reutiliza la variable objeto "DatosConsola" para pedir de nuevo los datos al usuario.
    var Contrasena = DatosConsola.nextLine();
    
    // Se muestra por pantalla el dato introducido por el usuario.
    System.out.println("Usuario: " + Usuario);
    System.out.println("Contraseña: " + Contrasena);
  }
}
