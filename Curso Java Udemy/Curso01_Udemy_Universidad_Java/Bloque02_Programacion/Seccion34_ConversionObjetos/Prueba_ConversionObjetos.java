/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 124, 125: Conversión de objetos en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion34_ConversionObjetos;

public class Prueba_ConversionObjetos 
{

	public static void main(String[] args) 
	{
		
		// Se crea un objeto de tipo padre Empleado pero se le asigna un objeto de tipo hijo Escritor.
		Empleado empleado = new Escritor("Alfonso", 5000, TipoEscritura.CLASICO);
		
		// resultado = empleado.getTipoEscritura(); -> Esto no es posible al ser una variable de tipo "Empleado" y no "Escritor".
		// Se llama al método "obtenerDetalles()" y utilizará el método sobreescrito que se encuentra en la clase hijo "Escritor" ya que la variable
		// "empleado" tiene los datos del objeto "Escritor" y no los datos del objeto "Empleado".
		System.out.println("Datos: " + empleado.obtenerDetalles());
		
		// Caso de Downcasting: Esta convirtiendo una variable objeto de tipo Empleado (Clase Padre) en una variable de tipo Escritor (Clase Hijo).
		Escritor escritor = (Escritor) empleado;
		System.out.println("Tipo escritura: " + escritor.getTipoEscritura());
		
		// Caso de Upcasting: Está convirtiendo una variable objeto de tipo Escritor (Clase Hija) en una variable de tipo Empleado (Clase Padre).
		Empleado empleado2 = (Empleado) escritor;
		System.out.println(empleado2.obtenerDetalles());

	}
}
