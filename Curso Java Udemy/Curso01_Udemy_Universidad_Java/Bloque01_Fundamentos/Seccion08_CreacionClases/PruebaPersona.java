/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 47, 48: Clases, métodos y objetos en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion08_CreacionClases;

// Clase para ejecutar las operaciones de uso de la clase Persona.
public class PruebaPersona 
{

	public static void main(String[] args) 
	{
		// Creación de un objeto o instancia de tipo Persona llamada persona1.
		Persona persona1 = new Persona();
		
		// Asignamos valor a los atributos del objeto persona1.
		persona1.nombre = "Alfonso";
		persona1.apellido = "López Jiménez";
		
		// Se llama al método para mostrar la información de la Persona1.
		persona1.desplegarInformacion();
		
		Persona persona2 = new Persona();
		System.out.println("Persona1: " + persona1);
		System.out.println("Persona2: " + persona2);
		
		persona2.desplegarInformacion();
		persona2.nombre = "Isabel";
		persona2.apellido = "Ferral Cabrera";
		persona2.desplegarInformacion();
	}

}
