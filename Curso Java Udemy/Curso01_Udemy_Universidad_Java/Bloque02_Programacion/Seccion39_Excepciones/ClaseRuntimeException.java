/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 140: Manejo de Excepciones en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion39_Excepciones;

// 1) Declaración de una clase para manejar las excepciones.
// Esta clase es hija de la clase Exception o de la clase ExceptionRuntime, según sea el caso.

@SuppressWarnings("serial")		// De nuevo he tenido que indicar esto para que no me marque un error Eclipse.
public class ClaseRuntimeException extends RuntimeException
{
	
	//2) Declaración de un constructor con un argumento que va a contener el mensaje de la Excepción.
	
	public ClaseRuntimeException(String mensaje)
	{
		// 3) Se manda el mensaje a la clase padre "Exception".
		super(mensaje);
	}
}
