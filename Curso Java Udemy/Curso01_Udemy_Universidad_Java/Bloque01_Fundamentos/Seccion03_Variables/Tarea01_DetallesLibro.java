/*
---------------------------------------------------------------------------------------------------------------------------------------------------
Video 14 : Tarea Detalles Libro.

Descripción: Se solicita incluir la siguiente información acerca de un libro:

- titulo
- autor

Debes imprimir la información en el siguiente formato:

Proporciona el titulo:
Proporciona el autor:
<titulo> fue escrito por <autor>

Puedes utilizar el IDE de tu preferencia para desarrollar la solución y después pegar aquí tu respuesta, ya que este editor no contiene ningún tipo de ayuda.

---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion03_Variables;

import java.util.Scanner;

public class Tarea01_DetallesLibro 
{
  public static void main (String args[])
  {
    System.out.println("Proporciona el Título: ");
    Scanner DatosUsuario = new Scanner(System.in);
    var DatosTitulo = DatosUsuario.nextLine();
    System.out.println("Proporciona el Autor: ");
    var DatosAutor = DatosUsuario.nextLine();
    System.out.println(DatosTitulo + " fue escrito por " + DatosAutor);
  }
}
