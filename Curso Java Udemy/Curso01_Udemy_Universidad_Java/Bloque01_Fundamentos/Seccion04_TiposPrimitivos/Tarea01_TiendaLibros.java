/*
---------------------------------------------------------------------------------------------------------------------------------------------------
Video 23: Tarea Detalles Libro.

Se solicita capturar la siguiente información de una tienda de libros:

- nombre (String)
- id (int)
- precio (double)
- envioGratuito (boolean)

Tu tarea es imprimir un mensaje en el siguiente formato:

Proporciona el nombre:
Proporciona el id:
Proporciona el precio:
Proporciona el envio gratuito:

<nombre> #<id>
Precio: <simbolo><precio>
Envio Gratuito: <envioGratuito>

Por ejemplo:

Proporciona el nombre: Programacion con Java
Proporciona el id: 1520
Proporciona el precio: 899
Proporciona el envio gratuito: true

Programacion con Java #1520
Precio: $899.00
Envio Gratuito: true

Puedes utilizar el IDE de tu preferencia para codificar la solución y después pegar tu solución en esta herramienta.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion04_TiposPrimitivos;

import java.util.Scanner;

public class Tarea01_TiendaLibros {

	public static void main(String[] args) {
		
		Scanner DatosConsola = new Scanner(System.in);
		
		System.out.println("Proporciona el nombre:");		
	  var nombre = DatosConsola.nextLine();
	  
	  System.out.println("Proporciona el ID:");
	  var id = Integer.parseInt(DatosConsola.nextLine());
	  
		System.out.println("Proporciona el precio:");
		var precio = Double.valueOf(DatosConsola.nextLine());
		
		System.out.println("Proporciona el envío gratuito:");
		var envio = Boolean.parseBoolean(DatosConsola.nextLine());
		
		System.out.println("\n- Nombre: " + nombre + "\n- ID: " + id + "\n- Precio: $" + precio + "\n- Envío gratuito: " + envio);
	}

}
